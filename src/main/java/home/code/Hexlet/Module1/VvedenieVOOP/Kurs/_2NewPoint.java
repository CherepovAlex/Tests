//Точка – графический примитив на плоскости, положение которой определяется двумя координатами: по оси X и по оси Y
//В этом упражнении уже реализован класс Point, который представляет точку. Работать с точкой нужно следующим образом:
//// Создание новой точки - объекта класса Point
//// Первый параметр - координата точки по оси X
//// Второй - координата по оси Y
//var point = new Point(3, 4);
//В классе App допишите публичный статический метод getNewPoint(), который возвращает новую точку (объект класса Point)
// с координатами X = 5 и Y = 10
//var point = App.getNewPoint(); // Переменная point содержит объект класса Point
package Hexlet.Module1.VvedenieVOOP.Kurs;

class App{
    public static Point getNewPoint(){
        return new Point(5, 10);
    }
}

public class _2NewPoint {
    public static void main(String[] args) {
        var point = App.getNewPoint();
        System.out.println(point.getX());
        System.out.println(point.getY());
    }
}
