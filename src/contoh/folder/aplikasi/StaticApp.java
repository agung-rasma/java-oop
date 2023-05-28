package contoh.folder.aplikasi;

import contoh.folder.data.Constant;
import contoh.folder.data.Country;
import contoh.folder.util.MathUtil;

public class StaticApp {
    public static void main(String[] args) {
        System.out.println(Constant.APPLICATION);
        System.out.println(Constant.VERSION);

        System.out.println(MathUtil.sum(1, 1, 1, 1, 1));

        Country.City city = new Country.City();
        city.setName("Marga");

        System.out.println(city.getName());
    }
}
