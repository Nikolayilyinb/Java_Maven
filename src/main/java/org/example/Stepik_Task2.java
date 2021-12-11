/**
 * Реализуйте метод, возвращающий true, если среди четырех его аргументов ровно два истинны (любые).
 * Во всех остальных случаях метод должен возвращать false.
 *
 * Sample Input 1:
 * false false false false
 *
 * Sample Output 1:
 * false
 *
 * Sample Input 2:
 * true true true true
 *
 * Sample Output 2:
 * false
 *
 * Sample Input 3:
 * false false true true
 *
 * Sample Output 3:
 * true
 */

package org.example;

public class Stepik_Task2 {
    public static boolean booleanExpression(boolean a, boolean b, boolean c, boolean d) {
        return (!a & !b & c & d) | (!a & b & !c & d) | (!a & b & c & !d) | (a & !b & !c & d) | (a & !b & c & !d) | (a & b & !c & !d);
    }
}
