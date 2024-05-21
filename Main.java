import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите последовательность чисел через пробел: ");
        String input = scanner.nextLine();

        // Разделить строку на отдельные числа
        String[] numbers = input.split(" ");

        // Создать словарь для подсчета количества появлений каждого числа
        Map<Integer, Integer> counts = new HashMap<>();
        for (String number : numbers) {
            int num = Integer.parseInt(number);
            counts.put(num, counts.getOrDefault(num, 0) + 1);
        }

        // Вывести количество появлений каждого числа
        for (Integer number : counts.keySet()) {
            System.out.printf("Число %d встречалось %d раз(а) \n", number, counts.get(number));
        }
    }
}
