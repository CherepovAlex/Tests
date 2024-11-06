package home.code.Hexlet.Module1.VvedenieVOOP.Kurs;

class Circle{
    int x;
    int y;
    int radius;

    public Circle(int x, int y, int radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }
}

class App3 {
    public static double getCircumference(Circle circle) {
        // BEGIN (write your solution here)
        return 2*Math.PI*circle.radius;
        // END
    }
}

public class _3Circle {
    public static void main(String[] args) {
        var circle = new Circle(1, 2, 5);
        circle.x = 1;
        System.out.println(App3.getCircumference(circle)); // Приблизительно 31.4
    }
}
