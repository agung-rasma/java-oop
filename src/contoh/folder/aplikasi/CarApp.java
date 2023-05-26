package contoh.folder.aplikasi;

import contoh.folder.data.Avanza;
import contoh.folder.data.Car;

public class CarApp {
    public static void main(String[] args) {
        Car car = new Avanza();
        System.out.println(car.getTier());
        car.drive();
    }
}
