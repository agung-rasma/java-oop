package contoh.folder.aplikasi;

import contoh.folder.data.Customer;
import contoh.folder.data.Level;

public class EnumApp {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.setName("Agung");
        customer.setLevel(Level.PREMIUM);

        System.out.println(customer.getName());
        System.out.println(customer.getLevel());
        System.out.println(customer.getLevel().getDescription());

//        String levelName = Level.VIP.name();
//        System.out.println(levelName);
//
//        Level level = Level.valueOf("PREMIUM"); //Must True Value
//        System.out.println(level);
//
//        Level[] levels=Level.values();
//        System.out.println(levels);
    }
}
