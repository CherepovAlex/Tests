//Модифицируйте метод printNumbers() так, чтобы он выводил числа в обратном порядке.
// Для этого нужно идти от верхней границы к нижней. То есть счётчик должен быть
// инициализирован максимальным значением, а в теле цикла его нужно уменьшать до нижней границы,
// которая равна 1. В конце нужно вывести строку finished!:
package Hexlet.Module1.OsnovyJava.Kurs;

class App25 {
    public static void printNumbers(int firstNumber) {
        // BEGIN (write your solution here)
        var i = firstNumber;
        while (i > 0){
            System.out.println(i);
            i-=1;
        }
        System.out.println("finished!");
        // END
    }
}
public class _25PrintNumbers {
    public static void main(String[] args) {
        App25.printNumbers(4);
    }
}
