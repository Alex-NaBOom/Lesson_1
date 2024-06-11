package TaskOne;

public class MainTaskOne {
    public static void main(String[] args) {
        Dog dog = new Dog ("Бобик");
        dog.swim(11);
        dog.run(501);
        Dog dog2 = new Dog ("Робик");
        dog2.swim(7);
        dog2.run(401);


        Cat.addFoodToBowl(40); // Добавляем еду в миску

        Cat[] cats = {new Cat("Барсик"), new Cat("Мурзик"), new Cat("Васька")};
        for (Cat cat : cats) {
            cat.eatFromBowl(10); // Каждый кот ест из миски
            System.out.println(cat.name + " сытость: " + cat.isSatiety());
        }

        System.out.println("Всего животных: " + Animal.animalCount);
        System.out.println("Всего собак: " + Dog.dogCount);
        System.out.println("Всего котов: " + Cat.catCount);
    }
}
