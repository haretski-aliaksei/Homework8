package enums;

public enum MenuItems {
    SUMMARY("Summary"),
    GRID("Grid & chart"),
    HISTOGRAM("Histogram"),
    SCATTER_PLOT("Scatter-plot"),
    REPORTS("Reports");

    private String menuItem;

    MenuItems(String item) {
        this.menuItem = item;
    }

    public String getMenuItem() {
        return menuItem;
    }
}
