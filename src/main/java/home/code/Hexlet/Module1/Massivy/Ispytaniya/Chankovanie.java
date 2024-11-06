//Реализуйте публичный статический метод chunk(), который принимает на вход массив строк и
// число, задающее размер чанка (куска). Метод должен вернуть двумерный массив, состоящий из чанков
// указанной размерности.
package Hexlet.Module1.Massivy.Ispytaniya;

import org.apache.commons.lang3.ArrayUtils;

import java.util.Arrays;

class App9 {
    public static String[][] chunk(String[] stroki, int number) {
        var n = 0;
        if (stroki.length % number == 0) {
            n = stroki.length / number;
        } else {
            n = stroki.length / number + 1;
        }
        String[][] result = new String[n][0];
        var k = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < number; j++, k++) {
                if (k != stroki.length) {
                    result[i] = ArrayUtils.add(result[i], stroki[k]);
                } else break;
            }
        }
        return result;
    }
}

public class Chankovanie {
    public static void main(String[] args) {
        String[] words = {"one", "two", "three", "four"};

        var chunks1 = App9.chunk(words, 2);
        System.out.println(Arrays.deepToString(chunks1));
// => [["one", "two"], ["three", "four"]]

        var chunks2 = App9.chunk(words, 3);
        System.out.println(Arrays.deepToString(chunks2));
// => [["one", "two", "three"], ["four"]]

    }
}
