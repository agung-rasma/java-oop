package contoh.folder.aplikasi;

import contoh.folder.data.Product;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class Application {
    public static void main(String[] args) {
        Product product=new Product("Tesla Model 3", 1_000_000_000);
        System.out.println(product.name);

        Locale locale=new Locale("id", "ID");
        DecimalFormatSymbols decimalFormatSymbols=new DecimalFormatSymbols(locale);
        DecimalFormat decimalFormat=new DecimalFormat("#,###.00", decimalFormatSymbols);
        System.out.println(decimalFormat.format(product.price));
    }
}
