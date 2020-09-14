package org.example;

public class Cat extends Animal {

    public Cat(String name, int age, double price) {
        super(name, age, price);
    }

    public void voice() {
        System.out.println("Meow");
    }

    public void voice(byte countCatFood) {
        if (countCatFood < 2) {
            voice();
        } else {
            System.out.println("zzzzzzzzzzz");
        }
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", price=" + price +
                '}';
    }
}
