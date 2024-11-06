package home.code.Hexlet.Module1.Massivy.Ispytaniya;
import java.util.Arrays;
class App6 {
    // BEGIN
    public static int[][] rotate(int[][] matrix, String direction) {
        var rowsCount = matrix.length;
        var columnsCount = matrix[0].length;
        var rotatedMatrix = new int[columnsCount][rowsCount];

        for (var row = 0; row < columnsCount; row++) {

            rotatedMatrix[row] = new int[rowsCount];

            for (var coll = 0; coll < rowsCount; coll++) {
                rotatedMatrix[row][coll] = direction.equals("left")
                    ? matrix[coll][columnsCount - row - 1]
                    : matrix[rowsCount - coll - 1][row];
            }
        }
        return rotatedMatrix;
    }

    public static int[][] rotateLeft(int[][] matrix) {
        return rotate(matrix, "left");
    }

    public static int[][] rotateRight(int[][] matrix) {
        return rotate(matrix, "right");
    }
    // END
}

public class VraschenieMatricy {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 0, 1, 2},
        };

        var rotatedLeft = App6.rotateLeft(matrix);
        System.out.println(Arrays.deepToString(rotatedLeft)); // =>
        var rotatedRight = App6.rotateRight(matrix);
        System.out.println(Arrays.deepToString(rotatedRight)); // =>
    }
}
