package home.code.Hexlet.Module1.Massivy.Ispytaniya;

import org.apache.commons.lang3.ArrayUtils;
import java.util.Arrays;

class App10 {

    public static int[] buildSnailPath(int[][] matrix) {
        if (matrix.length == 0) return new int[]{};
        var capacity = matrix[0].length * matrix.length; // 4 * 3 = 12
        int[][] newMatrix = new int[matrix.length][matrix[0].length];
        int[] newMatrix1 = new int[0];
        var number = 1;
        var rowMin = 0;
        var colMin = 0;
        var rowMax = matrix.length - 1; //3
        var colMax = matrix[0].length - 1; //2

        while (number <= capacity){
            for (int i = colMin; number <= capacity && i <= colMax ; i++) {
                newMatrix[rowMin][i] = matrix[rowMin][i];
                newMatrix1 = ArrayUtils.add(newMatrix1, newMatrix[rowMin][i]);
                number++;
            }
            rowMin++;

            for (int i = rowMin; number <= capacity && i <= rowMax; i++){
                newMatrix[i][colMax] = matrix[i][colMax];
                newMatrix1 = ArrayUtils.add(newMatrix1, newMatrix[i][colMax]);
                number++;
            }
            colMax--;
            for (int i = colMax; number <= capacity && i >= colMin; i--){
                newMatrix[rowMax][i] = matrix[rowMax][i];
                newMatrix1 = ArrayUtils.add(newMatrix1, newMatrix[rowMax][i]);
                number++;
            }
            rowMax--;
            for(int i = rowMax; number <= capacity && i >= rowMin; i--){
                newMatrix[i][colMin] = matrix[i][colMin];
                newMatrix1 = ArrayUtils.add(newMatrix1, newMatrix[i][colMin]);
                number++;
            }
            colMin++;
        }
        return newMatrix1;
    }
}

public class Ulitka {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };
        var result = App10.buildSnailPath(matrix);
        System.out.println(Arrays.toString(result));
    }
}
