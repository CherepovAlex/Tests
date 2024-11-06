package home.code.Hexlet.Module1.VvedenieVOOP.Kurs;

class Quadrate implements Geometric {
    int str;

    public Quadrate(int str) {
        this.str = str;
    }
    @Override
    public String getName() {
        return "quadrate";
    }
    @Override
    public double getSquare() {
        return this.str * this.str;
    }
}

//class Circle implements Geometric {
//    int str;
//
//    public Circle(int str) {
//        this.str = str;
//    }
//    @Override
//    public String getName() {
//        return "circle";
//    }
//    @Override
//    public double getSquare() {
//        double d = 2 * Math.PI * this.str * this.str;
//        return d;
//    }
//}

class App8 {
    // BEGIN (write your solution here)
    public static String getFigureSquare(Geometric figure) {
        return "Square of " + figure.getName() + " is " + figure.getSquare();
    }
    // END
}

// BEGIN (write your solution here)
interface Geometric {
    String getName();

    double getSquare();
}
// END


public class _8FigureSquare {
    public static void main(String[] args) {
        Geometric quadrate = new Quadrate(5);
//        Geometric circle = new Circle(10);
        System.out.println(App8.getFigureSquare(quadrate)); // "Square of quadrate is 25.0"
//        System.out.println(App8.getFigureSquare(circle)); // "Square of circle is 314.15..."
        // Класс Circle тоже реализует интерфейс Geometric
        // Этот класс уже определён в упражнении
        // Метод может работать с любым классом, реализующим интерфейс Geometric
    }
}
