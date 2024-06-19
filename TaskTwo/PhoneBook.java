package TaskTwo;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    private Map<String, String[]> phoneBook;

    public PhoneBook() {
        phoneBook = new HashMap<>();
    }

    public void add(String lastName, String phoneNumber) {
        if (phoneBook.containsKey(lastName)) {
            String[] existingNumbers = phoneBook.get(lastName);
            String[] newNumbers = Arrays.copyOf(existingNumbers, existingNumbers.length + 1);
            newNumbers[existingNumbers.length] = phoneNumber;
            phoneBook.put(lastName, newNumbers);
        } else {
            phoneBook.put(lastName, new String[]{phoneNumber});
        }
    }

    public String[] get(String lastName) {
        if (phoneBook.containsKey(lastName)) {
            return phoneBook.get(lastName);
        } else {
            return new String[0]; // Возвращаем пустой массив, если фамилии нет в справочнике
        }
    }

    public static void main(String[] args) {
        PhoneBook book = new PhoneBook();

        book.add("Иванов", "123-456-7890");
        book.add("Петров", "987-654-3210");
        book.add("Иванов", "555-123-4567");

        String[] ivanovNumbers = book.get("Иванов");
        System.out.println("Телефоны для Иванов:");
        for (String number : ivanovNumbers) {
            System.out.println(number);
        }

        String[] petrovNumbers = book.get("Петров");
        System.out.println("Телефоны для Петров:");
        for (String number : petrovNumbers) {
            System.out.println(number);
        }

        String[] nonexistentNumbers = book.get("Сидоров");
        System.out.println("Телефоны для Сидоров:");
        for (String number : nonexistentNumbers) {
            System.out.println(number);
        }
    }
}
