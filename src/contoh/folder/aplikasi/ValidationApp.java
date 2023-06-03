package contoh.folder.aplikasi;

import contoh.folder.data.LoginRequest;
import contoh.folder.error.ValidationException;
import contoh.folder.util.ValidationUtil;

public class ValidationApp {
    public static void main(String[] args) {
        LoginRequest loginRequest = new LoginRequest("Agung", "rahasia");

        try {
            ValidationUtil.validate(loginRequest);
            System.out.println("Data Valid");
        } catch (ValidationException | NullPointerException e) {
            System.out.println("Terjadi Error " + e.getMessage());
        } finally {
            System.out.println("Allways Execute");
        }
//        catch (NullPointerException e) {
//            System.out.println("Null Error " + e.getMessage());
//        }

        LoginRequest loginRequest1 = new LoginRequest(null, null);
        ValidationUtil.validateRuntime(loginRequest1);
        System.out.println("Sukses");
    }
}
