/**
 * Реализуйте метод, возвращающий ответ на вопрос: правда ли, что a + b = c?
 * Допустимая погрешность – 0.0001 (1E-4)
 * Можно использовать класс Math и его методы. Класс Math доступен всегда, импортировать его не надо.
 *
 * Sample Input:
 * 0.1 0.2 0.3
 *
 * Sample Output:
 * true
 */

package org.example;

public class Stepik_Task4 {
    public static boolean doubleExpression(double a, double b, double c) {
        return Math.abs((a+b)-c)<1e-4;
    }
}
