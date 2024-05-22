/**
 *   1. Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.
 *   Конструктор класса должен заполнять эти поля при создании объекта.
 *   Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль.
 *   2. Создать массив из 5 сотрудников.
 *   Пример:
 *   // вначале объявляем массив объектов
 *   Person[] persArray = new Person[5];
 *   // потом для каждой ячейки массива задаем объект
 *   persArray[0] = new Person("Ivanov Ivan", "Engineer",
 *                "ivivan@mailbox.com", "892312312", 30000, 30);
 *   persArray[1] = new Person(...);
 *   ...persArray[4] = new Person(...);
 */
public class Employee {
    public static void main(String[] args) {
        Employee[] employeesArray = new Employee[5];
        employeesArray[0] = new Employee("Иванов Иван Иванович", "Тестировщик ПО", "food-man@gmail.com", "+7312-560-1111", 27527.01, 26);
        employeesArray[1] = new Employee("Марковна Ольга Викторовна", "Аналитик", "mark-too@gmail.com", "+7323-576-7890", 35527.80, 29);
        employeesArray[2] = new Employee("Крутов Говорик Степович", "Блогер", "dood-dodo@gmail.com", "+7773-469-7890", 47723.06, 30);
        employeesArray[3] = new Employee("Топчик Карат Вакарович", "Директор", "top777@gmail.com", "+7123-456-7890", 69527.20, 45);
        employeesArray[4] = new Employee("Сивкина Лилия Кировна", "Специалист по кадрам", "ili-oka@gmail.com", "+7777-111-7887", 40527.0, 37);

        Employee empl = new Employee("Иванов Иван Иванович", "Тестировщик ПО", "food-man@gmail.com", "+7123-456-7890", 27527.00, 26);
        empl.displayInfo();
        employeesArray[1].displayInfo();
    }

        String fio;
        String post;
        String email;
        String phone;
        double salary;
        int age;

    public Employee(String fio, String post, String email, String phone, double salfry, int age){
            this.fio = fio;
            this.post = post;
            this.email = email;
            this.phone = phone;
            this.salary = salfry;
            this.age = age;
        }

        public void displayInfo() {
            System.out.println("ФИО: " + fio);
            System.out.println("Должность: " + post);
            System.out.println("e-mail: " + email);
            System.out.println("Телефон: " + phone);
            System.out.println("Зарплата: " + salary);
            System.out.println("Возраст: " + age);
            System.out.println();
        }
    }
