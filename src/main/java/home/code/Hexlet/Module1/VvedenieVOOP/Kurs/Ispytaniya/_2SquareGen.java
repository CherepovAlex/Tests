package home.code.Hexlet.Module1.VvedenieVOOP.Kurs.Ispytaniya;

import org.apache.commons.lang3.ArrayUtils;

import java.util.Arrays;

class Square {
    double side;

    public Square(double side) {
        this.side = side;
    }

    public int getSide() {
        return (int)side;
    }

    @Override
    public String toString() {
        return "new Square(" +
                (int)side +
                ')';
    }
}

class SquareGenerator {
    public static Square[] generate(double side, int count) {
        Square[] square = new Square[0];
        for (int i = 0; i < count; i++) {
            square = ArrayUtils.add(square, new Square(side));
        }
        return square;
    }

}

public class _2SquareGen {
    public static void main(String[] args) {
        var square = new Square(16);
        System.out.println(square.getSide()); // 16

        // Создаем массив из трех квадратов со стороной 5
        Square[] squares = SquareGenerator.generate(5, 3);
        // [new Square(5), new Square(5), new Square(5)]
        System.out.println(Arrays.toString(squares));

    }
}
