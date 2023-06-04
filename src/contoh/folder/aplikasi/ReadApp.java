package contoh.folder.aplikasi;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadApp {
    public static void main(String[] args) {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader("RE1ADME.md"));

            while (true) {
                String line = reader.readLine();
                if (line == null) {
                    break;
                }
                System.out.println(line);
            }
        } catch (Throwable throwable) {
            System.out.println("Error membaca file " + throwable.getMessage());
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                    System.out.println("tutup");
                }
            } catch (IOException exception) {
                System.out.println("Error menutup resource " + exception.getMessage());
            }
        }
    }
}
