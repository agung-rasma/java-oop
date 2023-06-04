package contoh.folder.aplikasi;

import contoh.folder.annotation.Fancy;
import contoh.folder.data.Animal;
import contoh.folder.data.Cat;

@Fancy(name = "AnimalApp", tags = {"Application", "Java"})
public class AnimalApp {
    public static void main(String[] args) {
        Animal animal = new Cat();
        animal.name = "Meong";
        animal.run();
    }
}
