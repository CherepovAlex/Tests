package home.code.Hexlet.Module2.JavaFunctions;

class App4 {
    public static Integer calculate(int chislo1, int chislo2, BinaryOperation bo) {
        return bo.addition(chislo1, chislo2);
    }
}

public class _4BinaryOperation {
    public static void main(String[] args) {
        // Сложение двух чисел
        BinaryOperation add = (a, b) -> a + b;
        System.out.println(App4.calculate(6, 5, add)); // 11

        // Вычитание
        BinaryOperation sub = (a, b) -> a - b;
        System.out.println(App4.calculate(6, 5, sub)); // 1

        //Умножение
        BinaryOperation mult = (a, b) -> a * b;
        System.out.println(App4.calculate(6, 5, mult)); // 30
    }
}
