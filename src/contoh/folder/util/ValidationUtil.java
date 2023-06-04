package contoh.folder.util;

import contoh.folder.annotation.NotEmpty;
import contoh.folder.data.LoginRequest;
import contoh.folder.error.EmptyException;
import contoh.folder.error.ValidationException;

import java.lang.reflect.Field;

public class ValidationUtil {
    public static void validate(LoginRequest loginRequest) throws ValidationException, NullPointerException {
        if (loginRequest.getUsername() == null) {
            throw new NullPointerException("Username is null");
        } else if (loginRequest.getUsername().isEmpty()) {
            throw new ValidationException("Username is Empty");
        } else if (loginRequest.getPassword() == null) {
            throw new NullPointerException("Password is null");
        } else if (loginRequest.getPassword().isEmpty()) {
            throw new ValidationException("Password is Empty");
        }
    }

    public static void validateRuntime(LoginRequest loginRequest) {
        if (loginRequest.getUsername() == null) {
            throw new NullPointerException("Username is null");
        } else if (loginRequest.getUsername().isEmpty()) {
            throw new EmptyException("Username is Empty");
        } else if (loginRequest.getPassword() == null) {
            throw new NullPointerException("Password is null");
        } else if (loginRequest.getPassword().isEmpty()) {
            throw new EmptyException("Password is Empty");
        }
    }

    public static void validationReflection(Object o) {
        Class aClass = o.getClass();
        Field[] fields = aClass.getDeclaredFields();

        for (Field field : fields) {
            field.setAccessible(true);

            if (field.getAnnotation(NotEmpty.class) != null) {
                //validated
                try {
                    String value = (String) field.get(o);

                    if (value == null || value.isEmpty()) {
                        throw new EmptyException("Field " + field.getName() + " is empty");
                    }
                } catch (IllegalAccessException e) {
                    System.out.println("Tidak bisa akses field " + field.getName());
//                    throw new RuntimeException(e);
                }

            }
        }
    }
}
