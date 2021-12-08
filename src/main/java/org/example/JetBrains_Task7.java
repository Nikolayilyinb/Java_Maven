/**
 * Описание
 * Наша программа должна уметь отображать сетку на всех этапах игры.
 * Теперь мы собираемся написать программу, которая позволяет пользователю вводить строку, представляющую состояние игры, и правильно печатать игровую сетку 3x3 на основе этого ввода.
 * Мы также добавим некоторые границы вокруг игровой сетки.
 *
 * Цели
 * На этом этапе вы напишете программу, которая:
 * Считывает строку из 9 символов из ввода и отображает их пользователю в сетке 3x3.
 * Сетка может содержать только X, O и _ символы.
 * Выводит линию штрихов --------- над и под сеткой, добавляет | символ вертикальной черты в начало и конец каждой строки сетки и добавляет пробел между всеми символами в сетке.
 *
 * Примеры
 * Примеры ниже показывают, как должен выглядеть ваш результат.
 * Обратите внимание, что после Enter cells:идет пользовательский ввод.
 *
 * Пример 1:
 * Enter cells: O_OXXO_XX
 * ---------
 * | O _ O |
 * | X X O |
 * | _ X X |
 * ---------
 *
 * Пример 2:
 * Enter cells: OXO__X_OX
 * ---------
 * | O X O |
 * | _ _ X |
 * | _ O X |
 * ---------
 *
 * Пример 3:
 * Enter cells: _XO__X___
 * ---------
 * | _ X O |
 * | _ _ X |
 * | _ _ _ |
 * ---------
 */

package org.example;

import java.util.Scanner;

public class JetBrains_Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        //верхнее подчеркивание
        System.out.println("---------");
        //первая строка
        System.out.print("| ");
        System.out.print(str.charAt(0) + " ");
        System.out.print(str.charAt(1) + " ");
        System.out.print(str.charAt(2));
        System.out.println(" |");
        //вторая строка
        System.out.print("| ");
        System.out.print(str.charAt(3) + " ");
        System.out.print(str.charAt(4) + " ");
        System.out.print(str.charAt(5));
        System.out.println(" |");
        //третья строка
        System.out.print("| ");
        System.out.print(str.charAt(6) + " ");
        System.out.print(str.charAt(7) + " ");
        System.out.print(str.charAt(8));
        System.out.println(" |");
        //нижнее подчеркивание
        System.out.println("---------");
    }
}