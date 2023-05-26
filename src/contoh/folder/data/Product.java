package contoh.folder.data;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class Product {
    public String name;
    public int price;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    Locale locale = new Locale("id", "ID");
    DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(locale);
    DecimalFormat decimalFormat = new DecimalFormat("#,###.00", decimalFormatSymbols);

    public String toString() {
        return "Product Name : " + name + ", Price : " + decimalFormat.format(price);
    }
}
