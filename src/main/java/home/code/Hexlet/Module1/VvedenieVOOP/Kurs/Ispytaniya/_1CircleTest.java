package home.code.Hexlet.Module1.VvedenieVOOP.Kurs.Ispytaniya;

class Circle {
    int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * this.radius * this.radius;
    }

    public double getCircumference() {
        return 2 * Math.PI * this.radius;
    }

}
public class _1CircleTest {
    public static void main(String[] args) {
        var circle = new Circle(10);

        System.out.println(circle.getArea()); // Приблизительно 314.1

        System.out.println(circle.getCircumference()); // Приблизительно 62.8
    }
}
