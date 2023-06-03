package contoh.folder.util;

import contoh.folder.data.LoginRequest;
import contoh.folder.error.ValidationException;

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
}
