package Hexlet.Module1.Massivy.Ispytaniya;

class App {
    public static int calcShipsCount(int[][] matrix) {
        var countShips = 0;
        var sizeMatrix = matrix.length;
        for (int i = 0; i < sizeMatrix; i++) {
            for (int j = 0; j < sizeMatrix; j++) {
                if (matrix[i][j] == 1) {
                    boolean isEndShip = isNewShip(matrix, i, j);
                    if (isEndShip) {
                        countShips++;
                    }
                }
            }
        }
        return countShips;
    }

    public static boolean isNewShip(int[][] matrix, int i, int j) {
        if ((j > 0 && matrix[i][j - 1] == 1 || i > 0 && matrix[i - 1][j] == 1)) {
            return false;
        }
        return true;
    }

    public static boolean isValidField(int[][] matrix) {
        var sizeMatrix = matrix.length;
        for (int i = 0; i < sizeMatrix - 1; i++) {
            for (int j = 0; j < sizeMatrix - 1; j++) {
                if (matrix[i][j] == 1) {
                    if (matrix[i + 1][j + 1] == 1) {
                        return false;
                    }
                }
            }
        }
        for (int i = 0; i < sizeMatrix - 1; i++) {
            for (int j = 0; j < sizeMatrix; j++) {
                if (matrix[i][j] == 1) {
                    if (j > 0 && matrix[i + 1][j - 1] == 1) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

}

public class MorskoyBoy {
    public static void main(String[] args) {
        int[][] battleField1 = {
                {1, 1, 0, 0, 0, 0},
                {0, 0, 0, 1, 1, 1},
                {0, 0, 0, 0, 0, 0},
                {0, 1, 1, 1, 0, 1},
                {0, 0, 0, 0, 0, 1},
                {1, 1, 0, 1, 0, 0},
        };
        System.out.println(App.calcShipsCount(battleField1)); // 6

        int[][] battleField2 = {
                {0, 1, 0, 0},
                {1, 0, 0, 1},
                {0, 0, 0, 0},
                {0, 1, 1, 1},
        };

        System.out.println(App.isValidField(battleField1)); // false
    }
}