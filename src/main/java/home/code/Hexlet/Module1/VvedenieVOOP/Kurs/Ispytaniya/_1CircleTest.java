//Реализуйте класс Circle для описания кругов. У круга есть только одно свойство - его радиус.
// Реализуйте методы getArea() и getCircumference(), которые возвращают площадь круга и длину
// окружности соответственно.
//Площадь круга: πr^2
//Длина окружности: 2*πR

package Hexlet.Module1.VvedenieVOOP.Kurs.Ispytaniya;

// BEGIN (write your solution here)
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
// END


public class _1CircleTest {
    public static void main(String[] args) {
        var circle = new Circle(10);

        System.out.println(circle.getArea()); // Приблизительно 314.1

        System.out.println(circle.getCircumference()); // Приблизительно 62.8
    }
}
