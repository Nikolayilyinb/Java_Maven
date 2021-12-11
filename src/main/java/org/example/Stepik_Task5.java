/**
 * Реализуйте метод flipBit, изменяющий значение одного бита заданного целого числа на противоположное.
 * Данная задача актуальна, например, при работе с битовыми полями.
 * Договоримся, что биты нумеруются от младшего (индекс 1) к старшему (индекс 32).
 *
 * Sample Input:
 * 0 1
 *
 * Sample Output:
 * 1
 */

/**
 * Flips one bit of the given <code>value</code>.
 *
 * @param value     any number
 * @param bitIndex  index of the bit to flip, 1 <= bitIndex <= 32
 * @return new value with one bit flipped
 */

package org.example;

public class Stepik_Task5 {
    public static int flipBit(int value, int bitIndex) {
        return value ^ (1 << (bitIndex - 1));
    }
}
