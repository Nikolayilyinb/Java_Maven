/**
 * Реализуйте метод, который возвращает букву, стоящую в таблице UNICODE после символа "\" (обратный слэш) на расстоянии a.
 *
 * Sample Input 1:
 * 32
 *
 * Sample Output 1:
 * |
 *
 * Sample Input 2:
 * 29
 *
 * Sample Output 2:
 * y
 */

package org.example;

public class Stepik_Task6 {
    public static char charExpression(int a) {
        int s = (int) '\\';
        int sum = s + a;
        char res = (char) sum;
        return res;
    }
}
