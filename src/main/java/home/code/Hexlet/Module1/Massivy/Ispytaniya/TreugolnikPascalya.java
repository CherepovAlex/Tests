//Треугольник Паскаля — бесконечная таблица биномиальных коэффициентов, имеющая треугольную
// форму. В этом треугольнике на вершине и по бокам стоят единицы. Каждое число равно сумме
// двух расположенных над ним чисел. Строки треугольника симметричны относительно вертикальной оси.
//
//0:      1
//1:     1 1
//2:    1 2 1
//3:   1 3 3 1
//4:  1 4 6 4 1
//Реализуйте публичный статический метод generate(), который возвращает указанную строку треугольника
// Паскаля в виде массива целых чисел.
//Подсказки
//Треугольник Паскаля
//Эту задачу можно решить разными способами. Возможно, для решения задачи вам понадобится вычислять
// факториал числа. В этом случае реализуйте в классе отдельный метод для вычисления факториала
package Hexlet.Module1.Massivy.Ispytaniya;
import java.util.Arrays;

class App7 {
    // BEGIN
    public static int factorial(int number) {
        var factorial = 1;

        for (var i = 2; i <= number; i++) {
            factorial *= i;
        }
        return factorial;
    }

    public static int[] generate(int row) {
        var numbersCount = row + 1;
        var result = new int[numbersCount];

        for (var i = 0; i < numbersCount; i++) {
            result[i] = factorial(row) / (factorial(i) * factorial(row - i));
        }
        return result;
    }
    // END
}
public class TreugolnikPascalya {
    public static void main(String[] args) {
        var result = App7.generate(4);
        System.out.println(Arrays.toString(result)); // => [1, 4, 6, 4, 1]
    }
}
