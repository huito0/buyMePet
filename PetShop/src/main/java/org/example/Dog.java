package org.example;

public class Dog extends Animal{

    public Dog(String name, int age, double price) {
        super(name, age, price);
    }

    public void voice() {
        System.out.println("Gaw gaw!");
    }

    public void voice(byte countGodFood) {
        if (countGodFood < 5) {
            voice();
        } else {
            System.out.println("zzzzzzzzzzz");
        }
    }

    @Override
    public String toString() {
        return "Dog {" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", price=" + price +
                '}';
    }
}
