/**
 * Напишите программу, читающую текст из System.in и выводящую в System.out сумму всех встреченных в тексте вещественных чисел
 * с точностью до шестого знака после запятой. Числом считается последовательность символов, отделенная от окружающего текста
 * пробелами или переводами строк и успешно разбираемая методом Double.parseDouble.
 *
 * На этот раз вам надо написать программу полностью, т.е. объявить класс (с именем Main — таково ограничение проверяющей системы),
 * метод main, прописать все import'ы.
 *
 * Sample Input 1:
 * 1 2 3
 *
 * Sample Output 1:
 * 6.000000
 *
 * Sample Input 2:
 * a1 b2 c3
 *
 * Sample Output 2:
 * 0.000000
 *
 * Sample Input 3:
 * -1e3
 * 18 .111 11bbb
 *
 * Sample Output 3:
 * -981.889000
 */

package org.example;

import java.io.*;
import java.util.Locale;
import java.util.Scanner;

public class Stepik_Task25 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.ENGLISH);
        double d;
        double sum = 0.0;
        while (scanner.hasNext()) {
            if (scanner.hasNextDouble()) {
                d = scanner.nextDouble();
                sum += d;
            } else {
                scanner.next();
            }
        }
        System.out.printf(Locale.ENGLISH, "%.6f", sum);
    }
}
