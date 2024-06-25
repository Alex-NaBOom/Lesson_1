package TaskThree;

import TaskOne.MyArraySizeException;
import TaskTwo.MyArrayDataException;


public class Main {
    private static String[][] array = {
            {"1", "2", "3", "4"},
            {"5", "6", "7", "8"},
            {"9", "10", "11", "12"},
            {"13", "14", "15", "16"}
    };
    private static String[][] array1 = {
            {"1", "2", "3", "4"},
            {"5", "6", "7", "8"},
            {"9", "10", "11", "12"},
            {"13", "14", "15", "Ш"}
    };
    private static String[][] array2 = {
            {"1", "2", "3"},
            {"4", "5", "6"},
            {"4", "5", "6"},
            {"7", "8", "9"}
    };

    public static void main(String[] args) {

        System.out.println("\n Oбрабатываем массив array: тестовый массив правильный 4x4");
        try {
            System.out.println("Сумма всех элементов массива array = " + checkArraySizeAndSumArray(array));
        } catch (MyArrayDataException | MyArraySizeException e) {
            System.out.println(e);
            System.out.println("Достоверный результат расчета суммы получен быть не может!");
        }
        System.out.println("\n Oбрабатываем массив array1: тестовый массив с неконвертируемым значением");
        try {
            System.out.println("Сумма всех элементов массива str3 = " + checkArraySizeAndSumArray(array1));
        } catch (MyArrayDataException | MyArraySizeException e) {
            System.out.println(e);
            System.out.println("Достоверный результат расчета суммы получен быть не может!");
        }
        System.out.println("\n Обрабатываем массив array2: Тестовый массив с неверным размером");
        try {
            System.out.println("Сумма всех элементов массива str3 = " + checkArraySizeAndSumArray(array2));
        } catch (MyArrayDataException | MyArraySizeException e) {
            System.out.println(e);
        }
    }

    public static int checkArraySizeAndSumArray(String[][] array) throws RuntimeException {
        int sum = 0;
        if (array.length != 4) {
            throw new MyArraySizeException("Неверное количество строк, массив не соответствует размерности 4х4!");
        }
        for (String[] row : array) {
            if (row.length != 4) {
                throw new MyArraySizeException("Неверное количество столбцов в строке, массив не соответствует размерности 4х4!");
            }
        }
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    try {
                        sum += Integer.parseInt(array[i][j]);
                    } catch (NumberFormatException e) {
                        throw new MyArrayDataException("В переданном массиве элемент с Array[" + i + "][" + j + "] НЕ может быть конвертирован в число!!!");
                    }
                }
            }
            return sum;

        }
    }







