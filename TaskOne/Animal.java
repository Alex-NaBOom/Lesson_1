package TaskOne;

public class Animal {
    protected String name;
    protected int maxRunDistance;
    protected int maxSwimDistance;
    static int animalCount;

    public Animal(String name) {
        this.name = name;
        animalCount++;
    }

    public void run(int distance) {
        if (distance <= maxRunDistance) {
            System.out.println(name + " пробежал " + distance + " м.");
        } else {
            System.out.println(name + " не может пробежать " + distance + " м.");
        }
    }

    public void swim(int distance) {
        if (distance <= maxSwimDistance) {
            System.out.println(name + " проплыл " + distance + " м.");
        } else {
            System.out.println(name + " не может проплыть " + distance + " м.");
        }
    }
}
