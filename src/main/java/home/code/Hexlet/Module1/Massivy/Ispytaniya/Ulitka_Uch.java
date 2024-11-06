package Hexlet.Module1.Massivy.Ispytaniya;
import org.apache.commons.lang3.ArrayUtils;

import java.util.Arrays;
import static Hexlet.Module1.Massivy.Ispytaniya.Utils.flatten;

class App10_1 {

    // BEGIN
    public static int[][] rotate(int[][] matrix) {
        var rowsCount = matrix.length;

        if (rowsCount == 0) {
            return new int[0][0];
        }

        var columnsCount = matrix[0].length;
        var rotatedMatrix = new int[columnsCount][rowsCount];

        for (var row = 0; row < columnsCount; row++) {
            rotatedMatrix[row] = new int[rowsCount];
            for (var column = 0; column < rowsCount; column++) {
                rotatedMatrix[row][column] = matrix[column][columnsCount - row - 1];
            }
        }
        return rotatedMatrix;
    }

    public static int[] buildSnailPath(int[][] matrix) {
        if (matrix.length == 0) {
            return new int[0];
        }

        var head = matrix[0];
        var tail = Arrays.copyOfRange(matrix, 1, matrix.length);
        int[][] result = {
            head,
            buildSnailPath(rotate(tail)),
        };

        return flatten(result);
    }
    // END
}

public class Ulitka_Uch {
    public static void main(String[] args) {
//        int[][] nested = {
//                {1, 2},
//                {3, 4},
//        };
//        var flattened = flatten(nested);
//        System.out.println(Arrays.toString(flattened)); // => [1, 2, 3, 4]

        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };
        var result = App10_1.buildSnailPath(matrix);
        System.out.println(Arrays.toString(result));
// => [1, 2, 3, 4, 8, 12, 11, 10, 9, 5, 6, 7]

    }
}
