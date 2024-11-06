//
//Реализуйте публичный статический метод isContinuousSequence(), который проверяет, является ли
// последовательность целых чисел в переданном массиве возрастающей непрерывно (не имеющей пропусков чисел).
// Например, последовательность {4, 5, 6, 7} — непрерывная, а {0, 1, 3} — нет.
// Последовательность может начинаться с любого числа, главное условие — отсутствие пропусков чисел.
// Последовательность из одного числа не может считаться возрастающей.

package Hexlet.Module1.Massivy.Ispytaniya;

class App3 {
    // BEGIN
    public static boolean isContinuousSequence(int[] numbers) {
        var length = numbers.length;
        if (length <= 1) {
            return false;
        }
        var first = numbers[0];
        for (var i = 1; i < length; i++) {
            if (first + i != numbers[i]) {
                return false;
            }
        }
        return true;
    }
    // END
}

public class VozrastayuschayaPosledovatelnost {
    public static void main(String[] args) {
        int[] numbers1 = {10, 11, 12, 13};
        App3.isContinuousSequence(numbers1); // true
        int[] numbers2 = {-5, -4, -3};
        App3.isContinuousSequence(numbers2); // true
        int[] numbers3 = {10, 11, 12, 14};
        App3.isContinuousSequence(numbers3); // false
        int[] numbers4 = {1, 2, 2, 3};
        App3.isContinuousSequence(numbers4); // false
        int[] numbers5 = {5};
        App3.isContinuousSequence(numbers5); // false
        int[] numbers6 = {};
        App3.isContinuousSequence(numbers6); // false
    }
}
