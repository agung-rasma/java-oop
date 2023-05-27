package contoh.folder.data;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import java.util.Objects;

public class Product {
    public String name;
    public int price;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }


    public String toString() {
        Locale locale = new Locale("id", "ID");
        DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(locale);
        DecimalFormat decimalFormat = new DecimalFormat("#,###.00", decimalFormatSymbols);
        return "Product Name : " + name + ", Price : " + decimalFormat.format(price);
    }

    //intellij
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//
//        Product product = (Product) o;
//
//        if (price != product.price) return false;
//        return Objects.equals(name, product.name);
//    }

    //java 7+
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return price == product.price && Objects.equals(name, product.name);
    }


}
