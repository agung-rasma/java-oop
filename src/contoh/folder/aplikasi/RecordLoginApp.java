package contoh.folder.aplikasi;

import contoh.folder.data.LoginRequest;

public class RecordLoginApp {
    public static void main(String[] args) {
        LoginRequest loginRequest = new LoginRequest("Agung", "123");
        System.out.println(loginRequest.getUsername());
        System.out.println(loginRequest.getPassword());
        System.out.println(loginRequest);
    }
}
