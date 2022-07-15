package hw4;

public class ProductProperties {

    private double weght;
    private ProductType type;
    private Quality quality;
    private double cost;

    public ProductProperties(double weght, ProductType type, Quality quality, double cost) {
        this.weght = weght;
        this.type = type;
        this.quality = quality;
        this.cost = cost;
    }

    public double getWeght() {
        return weght;
    }

    public void setWeght(double weght) {
        this.weght = weght;
    }

    public ProductType getType() {
        return type;
    }

    public void setType(ProductType type) {
        this.type = type;
    }

    public Quality getQuality() {
        return quality;
    }

    public void setQuality(Quality quality) {
        this.quality = quality;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }
}
