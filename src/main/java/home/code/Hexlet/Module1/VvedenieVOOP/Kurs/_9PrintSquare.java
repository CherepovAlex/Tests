package Hexlet.Module1.VvedenieVOOP.Kurs;
class Rectangle extends Exception {
    private int dlina;
    private int shirina;

    Rectangle(int dlina, int shirina) {
        this.dlina = dlina;
        this.shirina = shirina;
    }

    public int getDlina() {
        return dlina;
    }

    public int getShirina() {
        return shirina;
    }

    public int getSquare() throws Exception {
        if (dlina <= 0) throw new Exception();
        if (shirina <= 0) throw new Exception();
        if (dlina > 0 && shirina > 0) {
            return dlina * shirina;
        }
        return dlina * shirina;
    }
}

class App9 {
    // BEGIN (write your solution here)
    public static void printSquare(Rectangle rectangle) throws Exception {
        if (rectangle.getDlina() < 0 || rectangle.getShirina() < 0) {
            System.out.println("Не удалось посчитать площадь");
        } else {
            System.out.println(rectangle.getDlina() * rectangle.getShirina());
        }
    }
    // END
}

public class _9PrintSquare {
    public static void main(String[] args) throws Exception {
        var figure1 = new Rectangle(4, 5);
        var square = figure1.getSquare(); // 20

        var figure2 = new Rectangle(4, -5); // Тут должно выбрасываться исключение
//        var square1 = figure2.getSquare();

//        figure1 = new Rectangle(4, 5);
//        App9.printSquare(figure1); // => 20

        figure2 = new Rectangle(3, -2);
        App9.printSquare(figure2); // => Не удалось посчитать площадь
    }
}
