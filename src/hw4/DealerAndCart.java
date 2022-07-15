package hw4;

import java.util.List;

public class DealerAndCart {

    private double loadCapacity;
    private int speed;
    private double money;
    private List<ProductProperties> properties;
    private boolean stopTravel = true;

    public boolean isStopTravel() {
        return stopTravel;
    }

    public void setStopTravel(boolean stopTravel) {
        this.stopTravel = stopTravel;
    }

    public List<ProductProperties> getProperties() {
        return properties;
    }

    public void setProperties(List<ProductProperties> properties) {
        this.properties = properties;
    }

    public DealerAndCart(double loadCapacity, int speed, double money) {
        this.loadCapacity = loadCapacity;
        this.speed = speed;
        this.money = money;
    }

    public double getloadCapacity() {
        return loadCapacity;
    }

    public void setloadCapacity(double loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public void speedDowning(int speed){
        setSpeed(Math.max(getSpeed() - speed, 1));
    }

    public void speedUping(int speed){
        setSpeed(Math.min(getSpeed() - speed, 5));
    }
}
