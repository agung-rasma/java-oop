package contoh.folder.aplikasi;

import contoh.folder.data.Animal;
import contoh.folder.data.Cat;

public class AnimalApp {
    public static void main(String[] args) {
        Animal animal = new Cat();
        animal.name = "Meong";
        animal.run();
    }
}
