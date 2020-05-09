package com.company.test.task5;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/*Создать программу, которая в последовательности от 0 до N, находит все числа-палиндромы
 (зеркальное значение равно оригинальному). Длина последовательности N вводится
 вручную и не должна превышать 100.
*/
public class Palindrom {
    public static void main(String[] args) {
        System.out.println("Enter N (N can't be more than 100): ");
        try {
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            if (n <= 100 && n > 0) {
                System.out.println("Palindromes: " + palindromes(n));
            } else {
                System.out.println("You enter not valid number!  Enter number from 0 to 100");
            }
        } catch (InputMismatchException e) {
            System.out.println("You enter not valid number! ");

        }
    }

    public static boolean isPal(int a) {
        int b = 0;
        for (int i = a, j = i % 10; i > 0; i = i / 10, j = i % 10) {
            b = b * 10 + j;
        }
        return a == b;
    }

    public static ArrayList<Integer> palindromes(int number) {
        ArrayList<Integer> num = new ArrayList<>();
        for (int i = 0; i <= number; i++) {
            if (isPal(i)) {
                num.add(i);
            }
        }
        return num;
    }
}
