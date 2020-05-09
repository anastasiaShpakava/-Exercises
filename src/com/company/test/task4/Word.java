package com.company.test.task4;

import java.util.Scanner;

/*Создать программу, которая подсчитывает сколько раз употребляется слово в
тексте (без учета регистра). Текст и слово вводится вручную.
*/
public class Word {
    public static void main(String[] args) {
        System.out.println("Enter your sentence:");
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();
        System.out.println("Enter the word to be counted:  ");
        String word = scanner.nextLine();
        System.out.println("Quantity of word " + word + " is " + searchWord(sentence, word));
    }

    public static int searchWord(String sentence, String word) {
        sentence = sentence.toLowerCase();
        word = word.toLowerCase();
        int i = sentence.indexOf(word);
        int count = 0;
        while (i >= 0) {
            count++;
            i = sentence.indexOf(word, i + 1);
        }
        return count;
    }
}
