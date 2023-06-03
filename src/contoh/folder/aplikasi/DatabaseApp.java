package contoh.folder.aplikasi;

import contoh.folder.error.DatabaseError;

public class DatabaseApp {
    public static void main(String[] args) {
        connectDatabase("agung", null);
        System.out.println("sukses");
    }

    public static void connectDatabase(String username, String password) {
        if (username == null || password == null) {
            throw new DatabaseError("Tidak bisa konek ke database");
        }
    }
}
