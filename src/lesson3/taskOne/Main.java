package lesson3.taskOne;

import java.util.*;

public class Main {


    public static void main(String[] args) {
        List<String> setOfWords = Arrays.asList(
                "Машина", "Дом", "Дом", "Самолет", "Пенсильвания", "Страус", "Штраус", "Грейпфрухт", "Грейпфрухт",
                "Грейпфрухт", "Синь", "Пикабу", "Трансильвания", "Птеродактиль", "Гикбрэйнс", "Гикбрэйнс", "АК-47", "Буй",
                "Машина", "Буй", "Гладиолус", "Дом", "Птеродактиль");

        Set<String> uniqueWords = new HashSet<String>(setOfWords);


        System.out.println("Массив слов: ");
        Collections.sort(setOfWords);                                       // Сортировка по алфавиту
        System.out.println(setOfWords.toString() + "\n");

        System.out.println("Уникальные слова: ");
        System.out.println(uniqueWords.toString() + "\n");

        System.out.println("Как часто встречается каждое слово: " + "\n");

        for (String s : uniqueWords) {
            System.out.println(s + ": " + Collections.frequency(setOfWords, s));
        }

    }
}
