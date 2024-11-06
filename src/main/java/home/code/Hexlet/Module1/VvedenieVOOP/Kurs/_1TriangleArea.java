//В классе App реализуйте публичный статический метод getSquare(), который принимает в качестве аргументов
// две стороны треугольника и угол между ними в градусах (целые числа), а возвращает площадь этого треугольника
// в виде числа типа double. Площадь треугольника вычисляется, как половина произведения этих сторон,
// множенная на синус угла между ними.
//
//App.getSquare(10, 10, 60); // Приблизительно 43.3
//Подсказки
//Для вычисления синуса угла используйте статический метод sin() встроенного в Java класса Math.
// Так как этот метод принимает угол в радианах, вам потребуется перевести градусы в радианы. Чтобы сделать это,
// нужно количество градусов умножить на число Пи и разделить на 180.

package home.code.Hexlet.Module1.VvedenieVOOP.Kurs;

class App1{
    // BEGIN (write your solution here)
    public static double getSquare(double storA, double storB, double angle){
        return ((storA*storB)/2)*Math.sin((angle * Math.PI)/180);
    }
    // END
}

public class _1TriangleArea {
    public static void main(String[] args) {
        System.out.println(App1.getSquare(10, 10, 60));
    }

}
