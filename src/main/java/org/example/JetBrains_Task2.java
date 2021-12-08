/**
 * Fizz Buzz - классическая проблема программирования. Вот его немного измененная версия.
 * Напишите программу, которая принимает на вход два целых числа:
 * начало и конец интервала (оба числа принадлежат интервалу).
 * Программа должна вывести числа из этого интервала, но если число делится на 3, вы должны вывести Fizz вместо него;
 * если число делится на 5, выведите Buzz; и если он делится и на 3, и на 5, выведите FizzBuzz.
 * Каждое число или слово выведите в отдельной строке.
 *
 * Пример ввода 1:
 * 8 16
 *
 * Пример вывода 1:
 * 8
 * Fizz
 * Buzz
 * 11
 * Fizz
 * 13
 * 14
 * FizzBuzz
 * 16
 */

package org.example;

import java.util.Scanner;

public class JetBrains_Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            for (int i = a; i <= b; i++) {
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println("FizzBuzz");
                } else if (i % 3 == 0) {
                    System.out.println("Fizz");
                } else if (i % 5 == 0) {
                    System.out.println("Buzz");
                } else {
                    System.out.println(i);
                }
            }
        }
    }
}
