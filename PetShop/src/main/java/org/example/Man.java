package org.example;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Man {
    private final String name;
    private int age;
    private Animal pet;
    private double money;

    public Man(String name, int age, double money) {
        this.name = name;
        this.age = age;
        this.money = money;
    }

    public void buyPet(Animal animal) {
        this.pet = animal;
        System.out.println(name + " buy " + pet.toString() + '\'');
    }
}
