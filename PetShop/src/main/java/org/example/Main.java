package org.example;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random randomMoney = new Random();
        double mansMoney = randomMoney.nextDouble() * 500;
        PetShop shop = new PetShop();

        Man man = new Man("German", 24,mansMoney);

        shop.sellDog(man, shop.getAnimal(AnimalType.DOG));
    }
}
