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
    }
}
