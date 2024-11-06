//Реализуйте публичный статический метод fib(), находящий положительные числа Фибоначчи. Метод принимает
// в качестве параметра порядковый номер числа и возвращает число из последовательности с этим номером
//Формула для вычисления n-ного числа последовательности:
//f(0) = 0
//f(1) = 1
//f(n) = f(n-1) + f(n-2)
package Hexlet.Module1.OsnovyJava.Ispytaniya;

class App3 {
    // BEGIN
    public static int fib(int number) {
        if (number <= 0) {
            return 0;
        }

        var first = 0;
        var second = 1;
        var result = first + second;
        var index = 2;

        while (index <= number) {
            result = first + second;
            first = second;
            second = result;

            index += 1;
        }

        return result;
    }
    // END
}

public class Fibonacci {
    public static void main(String[] args) {
        App3.fib(3);  // 2
        App3.fib(5);  // 5
        App3.fib(10); // 55
    }
}
