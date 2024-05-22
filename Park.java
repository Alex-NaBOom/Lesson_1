/**
 * 3. Создать класс Park с внутренним классом, с помощью объектов которого
 * можно хранить информацию об аттракционах, времени их работы и стоимости.
 */

public class Park {
    private String name;

    public Park(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Park amusementPark = new Park("Веселый парк");

        // Создаем объекты аттракционов
        Park.Attraction rollerCoaster = amusementPark.new Attraction("Американские горки", "10:00 - 22:00", 500.00);
        Park.Attraction carousel = amusementPark.new Attraction("Карусель", "11:00 - 21:00", 300.00);
        Park.Attraction FerrisWheel = amusementPark.new Attraction("Колесо обозрения", "10:00 - 22:00", 400.00);

        // Вывод информации об аттракционах
        System.out.println("Парк: " + amusementPark.getName());
        System.out.println("Аттракцион: " + rollerCoaster.getName() + ", Время работы: " + rollerCoaster.getWorkingHours() + ", Стоимость: " + rollerCoaster.getPrice());
        System.out.println("Аттракцион: " + carousel.getName() + ", Время работы: " + carousel.getWorkingHours() + ", Стоимость: " + carousel.getPrice());
        System.out.println("Аттракцион: " + FerrisWheel.getName() + ", Время работы: " + FerrisWheel.getWorkingHours() + ", Стоимость: " + FerrisWheel.getPrice());
    }

    public String getName() {
        return name;
    }

    // Внутренний класс для хранения информации об аттракционах
    public class Attraction {
        private String name;
        private String workingHours;
        private double price;

        public Attraction(String name, String workingHours, double price) {
            this.name = name;
            this.workingHours = workingHours;
            this.price = price;
        }

        public String getName() {
            return name;
        }

        public String getWorkingHours() {
            return workingHours;
        }

        public double getPrice() {
            return price;
        }
    }


}
