package com.company.test.task3;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/*Создать программу, которая будет:
  - подсчитывать количество слов в предложении
  - выводить их в отсортированном виде
  - делать первую букву каждого слова заглавной.
  - Предложение вводится вручную. (Разделитель пробел (“ ”)).
*/
public class Sentence {
    public static void main(String[] args) {
        System.out.println("Enter your sentence: ");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        List<String> words = Arrays.asList(str.split("\\s+"));
        System.out.println("Quantity of words is " + words.size());
        Arrays.sort(new List[]{words});
        for (String word : words) {
            System.out.println("Sorted words:  " + word);
            String word2 = word.substring(0, 1).toUpperCase(); //первый символ делаем заглавным
            for (int i = 1; i < word.length(); i++) {
                // смотрим, был ли слева пробел:
                if (" ".equals(word.substring(i - 1, i)))
                    word2 = word2 + word.substring(i, i + 1).toUpperCase();
                else
                    word2 = word2 + word.substring(i, i + 1);
            }
            System.out.println("Word with capital letter: " + word2);
        }
    }
}
