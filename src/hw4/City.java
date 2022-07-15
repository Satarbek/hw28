package hw4;

import java.util.Random;

public enum City {
    MILAN ("�����"),
    TURIN ("�����"),
    ROME ("���"),
    NAPLES ("�������"),
    PALERMO ("�������"),
    GENOA ("�����"),
    BOLOGNA ("�������"),
    FLORENCE ("���������");

    private String name;
    private int distance;

    City(String name) {
        this.name = name;
    }

    void chooseCity(){
        Random rnd = new Random();
        int cityRnd = rnd.nextInt(8);
    }

    void distanceToCity(){
        Random rnd = new Random();
        int cityDistance = rnd.nextInt(51, 101);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }
}
