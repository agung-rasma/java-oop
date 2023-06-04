package contoh.folder.data;

import contoh.folder.annotation.Fancy;

@Fancy(name = "AnimalApp", tags = {"Application", "Java"})
public enum Level {
    STANDAR("Standard Level"),
    PREMIUM("Premium Level"),
    VIP("VIP Level");

    private String description;

    Level(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

}
