package TaskOne;

public class Dog extends Animal {
    static int dogCount;

    public Dog(String name) {
        super(name);
        maxRunDistance = 500;
        maxSwimDistance = 10;
        dogCount++;
    }
}
