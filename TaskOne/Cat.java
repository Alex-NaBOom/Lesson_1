package TaskOne;

public class Cat extends Animal{
    static int catCount;
    private boolean satiety;
    private static int foodInBowl;

    public Cat(String name) {
        super(name);
        maxRunDistance = 200;
        maxSwimDistance = 0; // Коты не умеют плавать
        satiety = false;
        catCount++;
    }

    @Override
    public void swim(int distance) {
        System.out.println(name + " не умеет плавать.");
    }

    public void eatFromBowl(int foodAmount) {
        if (foodAmount <= foodInBowl) {
            foodInBowl -= foodAmount;
            satiety = true;
            System.out.println(name + " поел и теперь сыт.");
        } else {
            System.out.println(name + " не хватило еды, остался голодным.");
        }
    }
    public static void addFoodToBowl(int food) {
        foodInBowl += food;
        System.out.println("В миску добавлено " + food + " еды. Теперь в миске " + foodInBowl + " еды.");
    }

    public boolean isSatiety() {
        return satiety;
    }
}
