package contoh.folder.aplikasi;

import contoh.folder.data.City;
import contoh.folder.data.Location;

public class LocationApp {
    public static void main(String[] args) {
//        Location location=new Location();
        City city = new City();
        city.name = "Tabanan";

        System.out.println(city.name);
    }
}
