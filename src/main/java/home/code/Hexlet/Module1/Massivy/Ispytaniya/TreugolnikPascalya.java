package home.code.Hexlet.Module1.Massivy.Ispytaniya;
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
