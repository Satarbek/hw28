package hw4;

public enum ProductType {
    MEAT ("Мясо"),
    DRIEDFRUITS ("Сухофрукты"),
    GRAIN ("Зерно"),
    FLOUR("Мука"),
    FABRICS("Ткани"),
    PAINT("Краска");

    private String name;

    ProductType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
