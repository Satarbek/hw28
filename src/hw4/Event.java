package hw4;

import java.util.Comparator;
import java.util.Random;

public class Event {

    public void normalDay(){
        System.out.println("Nothing happened");
    }

    public void Rain(DealerAndCart mutator, Quality[] qualities){
        Random rndProp = new Random();
        int productNum = rndProp.nextInt(mutator.getProperties().size());
        System.out.println("Movement speed reduced by 2 units");

        mutator.speedDowning(2);
        if (mutator.getProperties().size() > 0){
            if (rndProp.nextInt(3) < 1){
                if (mutator.getProperties().get(productNum).getQuality() == Quality.NORMAL){
                    mutator.getProperties().get(productNum).setQuality(Quality.SLIGHTLYSPOILED);
                }
                if (mutator.getProperties().get(productNum).getQuality() == Quality.SLIGHTLYSPOILED){
                    mutator.getProperties().get(productNum).setQuality(Quality.HALFSPOILED);
                }
                if (mutator.getProperties().get(productNum).getQuality() == Quality.HALFSPOILED){
                    mutator.getProperties().get(productNum).setQuality(Quality.ALMOSTALLDISAPPEARED);
                }
                if (mutator.getProperties().get(productNum).getQuality() == Quality.ALMOSTALLDISAPPEARED){
                    mutator.getProperties().get(productNum).setQuality(Quality.SPOILEDINTHETRASH);
                }
                System.out.println("Product quality has gone down. Product is: " + mutator.getProperties().get(productNum).getType().getName());
            }
            else {
                System.out.println("You don't have a product yet.");
            }
        }
    }

    public void smoothRoad(DealerAndCart mutator){
        mutator.speedUping(2);
        System.out.println("The road is flat. Speed increases by 2 leagues.");
    }

    public void theWheelBroke(DealerAndCart mutator){
        mutator.setStopTravel(true);
        System.out.println("Breaking. We're not going anywhere.");
    }

    public void River(DealerAndCart mutator){
        mutator.setStopTravel(true);
        System.out.println("Spent the whole day looking for a ford.");

    }

    public int metALocal(){
        Random rndLuck = new Random();
        System.out.println("Managed to cut part of the way (on this day we drove more from 3 to 6 leagues)");
        return rndLuck.nextInt(3, 7);
    }

    public void metARobbers(DealerAndCart mutator){
        if (mutator.getMoney() > 0){
            mutator.setMoney(0);
            System.out.println("Gave everything to the last penny.");
        } else {
            mutator.getProperties().sort(Comparator.comparing(ProductProperties::getCost).reversed());
            for (ProductProperties properties : mutator.getProperties()){
                if (properties.getQuality().equals(Quality.NORMAL)){
                    mutator.getProperties().remove(properties);
                    System.out.println("Gave the best product.");
                    break;
                }
            }
        }
    }

    public void roadSideInn(){
        //есть веро€тность продать/купить товар. ≈сли останавливаемс€, то можем торговать. “ратим часть денег на еду/ночлег.
    }

    public void productSpoiled(DealerAndCart mutator){
        Random rndProp = new Random();
        int productNum = rndProp.nextInt(mutator.getProperties().size());
        System.out.println("The product has deteriorated. It is sad");

        if (mutator.getProperties().size() > 0) {
            if (mutator.getProperties().get(productNum).getQuality() == Quality.NORMAL) {
                mutator.getProperties().get(productNum).setQuality(Quality.SPOILEDINTHETRASH);
            }
            if (mutator.getProperties().get(productNum).getQuality() == Quality.SLIGHTLYSPOILED) {
                mutator.getProperties().get(productNum).setQuality(Quality.SPOILEDINTHETRASH);
            }
            if (mutator.getProperties().get(productNum).getQuality() == Quality.HALFSPOILED) {
                mutator.getProperties().get(productNum).setQuality(Quality.SPOILEDINTHETRASH);
            }
            if (mutator.getProperties().get(productNum).getQuality() == Quality.ALMOSTALLDISAPPEARED) {
                mutator.getProperties().get(productNum).setQuality(Quality.SPOILEDINTHETRASH);
            }
            System.out.println("Product quality has gone down. Product is: " + mutator.getProperties().get(productNum).getType().getName());

        } else {
                System.out.println("You don't have a product yet.");
        }
    }
}
