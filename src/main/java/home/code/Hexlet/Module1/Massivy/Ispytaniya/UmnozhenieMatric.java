//Операция умножения двух матриц А и В представляет собой вычисление результирующей матрицы С,
// где каждый элемент C(ij) равен сумме произведений элементов в соответствующей строке первой
// матрицы A(ik) и элементов в столбце второй матрицы B(kj).
//
//Две матрицы можно перемножать только в том случае, если количество столбцов в первой матрице
// совпадает с количеством строк во второй матрице. Это значит, что первая матрица обязательно
// должна быть согласованной со второй матрицей. В результате операции умножения матрицы
// размера M×N на матрицу размером N×K является матрица размером M×K.
//Реализуйте публичный статический метод multiply(), который принимает на вход две матрицы c
//целыми числами, и возвращает новую матрицу — результат их произведения.
//Подсказки
//Описание алгоритма перемножения матриц
//Демонстрация операций перемножения матриц
package home.code.Hexlet.Module1.Massivy.Ispytaniya;

import java.util.Arrays;

class App8 {
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

public class UmnozhenieMatric {
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
        var multipliedMatrix = App8.multiply(matrixA, matrixB);
        System.out.println(Arrays.deepToString(multipliedMatrix)); // =>
    }
}