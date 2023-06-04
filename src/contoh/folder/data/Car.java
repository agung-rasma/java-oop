package contoh.folder.data;

import contoh.folder.annotation.Fancy;

@Fancy(name = "Car", tags = {"Application", "Java"})
public interface Car extends HasBrand {
    void drive();

    int getTier();

    default boolean isBig() {
        return false;
    }
}
