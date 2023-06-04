package contoh.folder.aplikasi;

import contoh.folder.data.CreateUserRequest;
import contoh.folder.util.ValidationUtil;

public class ReflectionApp {
    public static void main(String[] args) {

        CreateUserRequest request = new CreateUserRequest();
        request.setUsername("agung");
        request.setPassword("agung");
        request.setAddress("Tabanan");

        ValidationUtil.validationReflection(request);
    }
}
