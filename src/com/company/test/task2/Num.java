package com.company.test.task2;

import java.util.InputMismatchException;
import java.util.Scanner;
/*
Создать программу, которая будет вычислять и выводить на экран НОК (наименьшее общее кратное)
 и НОД (наибольший общий делитель) двух целых чисел, введенных пользователем.
 Если пользователь некорректно введёт хотя бы одно из чисел, то сообщать об ошибке.
*/
public class Num {
    public static void main(String[] args) {
        System.out.println("Enter the first number: ");
        try {
            Scanner scanner1 = new Scanner(System.in);
            int number1 = scanner1.nextInt();
            System.out.println("Enter the second number: ");
            Scanner scanner2 = new Scanner(System.in);
            int number2 = scanner2.nextInt();
            System.out.println("Greatest Common Divisor of " + number1 + " and " + number2 + " is " + gcd(number1, number2));
            System.out.println("Least Common Multiple of " + number1 + " and " + number2 + " is " + lcm(number1, number2));

        } catch (InputMismatchException e) {
            System.out.println("You intered not valid number!!!");
        }
    }

    static int gcd(int number1, int number2) {
        return number2 == 0 ? number1 : gcd(number2, number1 % number2);
    }

    static int lcm(int number1, int number2) {
        return number1 / gcd(number1, number2) * number2;

    }
}
