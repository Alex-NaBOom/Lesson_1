package src.main.java.org.olenskii;

public class Factorial {
    public static long calculateFactorial(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Число не может быть отрицательным.");
        }
        if (number == 0) {
            return 1;
        }
        long factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        return factorial;
    }
    public static void main(String[] args) {
        int number = 5;
        long result = calculateFactorial(number);
        System.out.println("Факториал " + number + " равен: " + result);
    }
}