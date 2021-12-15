/**
 * Реализуйте метод, который зачитает данные из InputStream и преобразует их в строку, используя заданную кодировку.
 *
 * Пример
 * InputStream последовательно возвращает четыре байта: 48 49 50 51.
 *
 * Метод, вызванный для такого InputStream и кодировки ASCII, должен вернуть строку "0123".
 */

package org.example;

public class Stepik_Task24 {
    public static String readAsString(InputStream inputStream, Charset charset) throws IOException {
        String retval;
        Reader reader = new InputStreamReader(inputStream, charset);
        StringWriter r = new StringWriter();
        int b;
        while ((b = reader.read()) != -1) {
            r.write(b);
        }
        retval = r.toString();
        return retval;
    }
}
