// Реализуйте публичный статический метод getMirrorMatrix(), который принимает двумерный массив
// (матрицу) целых чисел. Метод должен возвращать двумерный массив, изменённый таким образом,
// что правая половина матрицы становится зеркальной копией левой половины, симметричной
// относительно вертикальной оси матрицы. Для простоты условимся, что матрица всегда имеет
// чётное количество столбцов и количество столбцов всегда равно количеству строк.

package Hexlet.Module1.Massivy.Ispytaniya;

import java.util.Arrays;

class App5 {
    // BEGIN
    public static int[] getMirrorRow(int[] row) {
        var size = row.length;
        var mirroredRow = new int[size];

        for (var i = 0; i < size / 2; i++) {
            mirroredRow[i] = row[i];
            mirroredRow[size - i - 1] = row[i];
        }

        return mirroredRow;
    }

    public static int[][] getMirrorMatrix(int[][] matrix) {
        var size = matrix.length;
        var mirroredMatrix = new int[size][size];

        var index = 0;
        for (var row : matrix) {
            var mirroredRow = getMirrorRow(row);
            mirroredMatrix[index] = mirroredRow;
            index++;
        }

        return mirroredMatrix;
    }
    // END
}

public class ZerkalirovanieMatricy {
    public static void main(String[] args) {
        int[][] matrix = {
                {11, 12, 13, 14},
                {21, 22, 23, 24},
                {31, 32, 33, 34},
                {41, 42, 43, 44},
        };

        var mirroredMatrix = App5.getMirrorMatrix(matrix);
        System.out.println(Arrays.deepToString(mirroredMatrix)); //=>
// [
//     [11, 12, 12, 11],
//     [21, 22, 22, 21],
//     [31, 32, 32, 31],
//     [41, 42, 42, 41],
//  ]
    }
}
