package home.code.Hexlet.Module1.Massivy.Ispytaniya;

import java.util.Arrays;

class App8_1 {
    // BEGIN (write your solution here)
    public static int[][] multiply(int[][] matrixA, int[][] matrixB) {
        int[][] multyMatrix = new int[matrixA.length][matrixB[0].length];

        for (int i = 0; i < multyMatrix.length; i++) {
            for (int j = 0; j < multyMatrix[0].length; j++) {
                multyMatrix[i][j] = 0;
                for (int k = 0; k < matrixA[0].length; k++) {
                    multyMatrix[i][j] += matrixA[i][k] * matrixB[k][j];
                }
            }
        }
        return multyMatrix;
    }
    // END
}

public class UmnozhenieMatric_Uch {
    public static void main(String[] args) {
        int[][] matrixA = {
                {1, 2, 1},
                {0, 1, 0},
                {2, 3, 4},
        };
        int[][] matrixB = {
                {2, 5},
                {6, 7},
                {1, 8},
        };
        var multipliedMatrix = App8_1.multiply(matrixA, matrixB);
        System.out.println(Arrays.deepToString(multipliedMatrix)); // =>
        // [
//            {15, 27},
//            {6, 7},
//            {26, 63},
        // ]
    }
}