/**
 * В Григорианском календаре год является високосным в двух случаях: либо он кратен 4, но при этом не кратен 100, либо кратен 400.
 * Реализуйте метод, вычисляющий количество високосных лет с начала нашей эры (первого года) до заданного года включительно.
 * На самом деле Григорианский календарь был введен значительно позже, но здесь для упрощения мы распространяем его действие на всю нашу эру.
 *
 * Ввод-вывод обеспечивает проверяющая система. Вам надо только проанализировать переданное в метод значение и вернуть результат.
 * В программу всегда подается положительный номер года. Предполагается решение без циклов.
 * Вам надо придумать и записать несложную формулу, использующую только арифметические операторы.
 *
 * Sample Input 1:
 * 1
 *
 * Sample Output 1:
 * 0
 *
 * Sample Input 2:
 * 4
 *
 * Sample Output 2:
 * 1
 *
 * Sample Input 3:
 * 100
 *
 * Sample Output 3:
 * 24
 */

package org.example;

public class Stepik_Task3 {
    public static int leapYearCount(int year) {
        return (year - (year % 4)) / 4 - ((year - (year % 100)) / 100 - (year - (year % 400)) / 400);
    }
}
