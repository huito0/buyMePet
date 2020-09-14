package org.example;

public class PetShop {
    private Animal dog = new Dog("Rex", 4, 200);
    private Animal cat = new Cat("Bob", 2, 100);

    public PetShop() {
        System.out.println("Добро пожаловать в наш магазин");
        System.out.println("У нас в наличии 1 кот и 1 собака");
    }

    public Animal getAnimal(AnimalType type) {
        switch (type) {
            case CAT:
                return cat;
            case DOG:
                return dog;
            default:
                throw new RuntimeException("wrong type of animal");
        }
    }

    public void sellDog(Man man, Animal pet) {
        man.setPet(pet);
        if (man.getMoney() < pet.getPrice()) {
            System.out.println("У вас не хватает денег на покупку животного");
            System.out.println("На вашем счету " + man.getMoney());
            System.out.println("Цена щенка " + getAnimal(AnimalType.DOG).getPrice());
        } else {
            System.out.println("Вы успешно купили щенка");
            dog = null;
            System.out.println("В магазине осталось " + getAnimal(AnimalType.DOG) + " собак");
        }
    }
}
