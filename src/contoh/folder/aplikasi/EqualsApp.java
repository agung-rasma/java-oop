package contoh.folder.aplikasi;

public class EqualsApp {
    public static void main(String[] args) {
        String first = "Agung";
        first += " " + "Wijaya" + " " + "Rasma";

        System.out.println(first);

        String second = "Agung Wijaya Rasma";

        System.out.println(second);

        System.out.println(first == second);
        System.out.println(first.equals(second));

        String third = "Agung Wijaya Rasma";

        System.out.println(second == third);
        System.out.println(second.equals(third));

    }
}
