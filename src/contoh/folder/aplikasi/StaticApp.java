package contoh.folder.aplikasi;

import static contoh.folder.data.Application.*;
import static contoh.folder.data.Constant.*;

import contoh.folder.data.Country;

import static contoh.folder.util.MathUtil.sum;

public class StaticApp {
    public static void main(String[] args) {
        System.out.println(APPLICATION);
        System.out.println(VERSION);

        System.out.println(sum(1, 1, 1, 1, 1));

        Country.City city = new Country.City();
        city.setName("Marga");

        System.out.println(city.getName());

        System.out.println(PROCESSORS);
    }
}
