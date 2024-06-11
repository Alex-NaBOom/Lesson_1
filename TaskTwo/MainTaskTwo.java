package TaskTwo;

public class MainTaskTwo {
    public static void main(String[] args) {
        Shape circle = new Circle(5, "Red", "Black");
        Shape rectangle = new Rectangle(4, 6, "Blue", "Green");
        Shape triangle = new Triangle(3, 4, 5, "Yellow", "Purple");

        System.out.println("Информация о круге: " + circle.getInfo());
        System.out.println("Информация о прямоугольнике: " + rectangle.getInfo());
        System.out.println("Информация о треугольнике: " + triangle.getInfo());
    }
}
