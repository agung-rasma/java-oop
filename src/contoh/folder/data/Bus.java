package contoh.folder.data;

public class Bus implements Car {

    public void drive() {
        System.out.println("Bus Drive");
    }

    public int getTier() {
        return 8;
    }

    public String getBrand() {
        return "Hino";
    }

    public boolean isBig() {
        return true;
    }
}
