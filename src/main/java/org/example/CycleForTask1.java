    /*Ваша задача - найти корни кубического уравнения.

    Вход содержит четыре числа: а, б, c, d.

    Выведите все целые корни от 0 до 1000 (включительно) для уравнения ах ^ 3 + bx ^ 2 + cx + d = 0 в порядке возрастания.

    Если указанный интервал не содержит корней уравнения, ничего не выводить.

    Помните, что кубическое уравнение всегда имеет 3 корня, то есть у него не может быть более 3 целых корней.
    Помните об этом, чтобы оптимизировать код.

    Пример ввода 1:
    -1
    1
    -1
    1

    Пример вывода 1:
    1

    Пример ввода 2:
    0
    1
    -6
    5

    Пример вывода 2:
    1
    5

    Пример ввода 3:
    1
    1
    1
    1

    Пример вывода 3:*/

package org.example;

import java.util.Scanner;

class CycleForTask1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            int d = scanner.nextInt();
            for (int x = 0; x <= 1000; x++) {
                if (a * x * x * x + b * x * x + c * x + d == 0) {
                    System.out.println(x);
                }
            }
        }
    }
}