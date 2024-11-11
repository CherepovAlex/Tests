package home.code.Hexlet.Module2.JavaFunctions.Ispytaniya;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

class Fibonacci {
    public static Map cHM = new ConcurrentHashMap<Integer, Integer>();
    public static long fib(long n) {
        if (n == 1) {
            return 0L;
        } else if (n == 2) {
            return 1L;
        }
        return (long) cHM.computeIfAbsent((int)n, (k) -> {return fib(n - 2) + fib(n - 1);});
    }
}

public class _5Memoisation {
    public static void main(String[] args) {
        System.out.println(Fibonacci.fib(1)); // 0
        System.out.println(Fibonacci.fib(2)); // 1
        System.out.println(Fibonacci.fib(3)); // 1
        System.out.println(Fibonacci.fib(7)); // 8

        // При повторном вызове цепочки рекурсивных вызовов не происходит
        // Результат сразу, берётся из кеша
        System.out.println(Fibonacci.fib(7)); // 8
    }
}