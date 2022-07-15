package hw4;

import java.util.Random;

public class Main {

    static final ProductType[] types = ProductType.values();

    static final City[] cities = City.values();

    static final Quality[] qualities = Quality.values();

    static Random rndSpeed = new Random();
    static Random rndMoney = new Random();
    static DealerAndCart mutator = new DealerAndCart(300, rndSpeed.nextInt(6), rndMoney.nextInt(101, 401));
}
