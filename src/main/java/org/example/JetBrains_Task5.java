/**
 * Напишите программу, которая считывает a, b, n и выводит количество чисел,
 * делящихся на n, в диапазоне от a до b (a < b) включительно.
 *
 * Примечание: эту программу можно написать более эффективно без каких-либо циклов.
 *
 * Пример ввода 1:
 * 10 20 10
 *
 * Пример вывода 1:
 * 2
 *
 * Пример ввода 2:
 * 15 25 5
 *
 * Пример вывода 2:
 * 3
 */

package org.example;

import java.util.Scanner;

class JetBrains_Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int n = scanner.nextInt();
        int c = 0;
        System.out.print(c = b / n - (a - 1) / n);
    }
}