/**
 * Реализуйте метод, вычисляющий факториал заданного натурального числа.
 * Факториал NN вычисляется как 1 \cdot 2 \cdot ... \cdot N1⋅2⋅...⋅N.
 * Поскольку это очень быстро растущая функция, то даже для небольших NN вместимости типов int и long очень скоро не хватит.
 * Поэтому будем использовать BigInteger.
 *
 * Sample Input 1:
 * 1
 *
 * Sample Output 1:
 * 1
 *
 * Sample Input 2:
 * 3
 *
 * Sample Output 2:
 * 6
 */

/**
 * Calculates factorial of given <code>value</code>.
 *
 * @param value positive number
 * @return factorial of <code>value</code>
 */

package org.example;

public class Stepik_Task9 {
    public static BigInteger factorial(int value) {
        if (BigInteger.valueOf(value) == BigInteger.ZERO) {
            return BigInteger.ONE;
        }
        BigInteger result = BigInteger.ONE;
        for (int i = 1; i <= value; ++i) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }
}
