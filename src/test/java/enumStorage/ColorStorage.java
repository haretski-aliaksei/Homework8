package enumStorage;

public enum ColorStorage {
    RED("rgba(239, 79, 78, 1)"),
    GRAY("rgba(108, 117, 125, 1)"),
    GREEN("rgba(23, 169, 142, 1)");

    private String color;

    ColorStorage(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
