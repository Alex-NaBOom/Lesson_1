package TaskOne;

import java.util.HashMap;
import java.util.Map;

public class UniqueWords {
    public static void main(String[] args) {
        String[] wordsArray = {"яблоко", "банан", "апельсин", "apple", "груша", "банан", "киви", "orange", "pear", "apple", "пескик", "лимон",
                "мандарин", "слива", "вишня", "виноград", "дыня", "арбуз", "папйя", "яблоко", "банан", "апельсин", "apple", "груша", "банан", "киви"};
        Map<String, Integer> wordCountMap = new HashMap<>();

        // Подсчитываем количество повторений каждого слова
        for (String word : wordsArray) {
            if (wordCountMap.containsKey(word)) {
                wordCountMap.put(word, wordCountMap.get(word) + 1);
            } else {
                wordCountMap.put(word, 1);
            }
        }

        // Выводим уникальные слова и их количество повторений
        System.out.println("Уникальные слова и количество повторений:");
        for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}
