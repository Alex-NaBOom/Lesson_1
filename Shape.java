public interface Shape {
    double getPerimeter();

    double getArea();

    String getFillColor();

    String getBorderColor();

    default String getInfo() {
        return "Периметр: " + getPerimeter() + ", Площадь: " + getArea() +
                ", Цвет заливки: " + getFillColor() + ", Цвет границы: " + getBorderColor();
    }
}
