package com.company.test.task1;

import java.util.Scanner;


/*Создать программу, которая будет сообщать, является ли целое число,
введенное пользователем, чётным или нечётным, простым или составным.
Если пользователь введёт не целое число, то сообщать ему об ошибке.
*/

public class Number {
    public static void main(String[] args) {
        System.out.println("Enter your number:  ");
        try {
            Scanner scanner = new Scanner(System.in);
            int number = scanner.nextInt();

            if (number % 2 == 0) {
                System.out.println("Your number is even");
            } else {
                System.out.println("Your number is odd");
            }
            for (int i = 2; i * i <= number; ++i) {
                if (number % i == 0) {
                    System.out.println("Your number is composite ");
                } else {
                    System.out.println("Your number is prime");
                }
            }
        } catch (Exception e) {
            System.out.println("You intered not integer number!!!");
        }
    }
}
