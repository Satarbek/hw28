package hw4;

public enum ProductType {
    MEAT ("����"),
    DRIEDFRUITS ("����������"),
    GRAIN ("�����"),
    FLOUR("����"),
    FABRICS("�����"),
    PAINT("������");

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
