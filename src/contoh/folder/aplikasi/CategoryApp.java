package contoh.folder.aplikasi;

import contoh.folder.data.Category;

public class CategoryApp {
    public static void main(String[] args) {

        Category category=new Category();
        category.setId("ID");
        category.setId(null); //doesn't work because validation not null
        System.out.println(category.getId());
//        System.out.println(category.isExpensive());


    }
}
