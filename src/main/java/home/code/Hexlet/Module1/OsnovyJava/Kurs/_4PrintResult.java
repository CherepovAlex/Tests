//Напишите программу, которая считает и последовательно выводит на экран
// значения следующих математических выражений:
//-8 разделить на -4
//остаток от деления 100 на 3
//сумму двух предыдущих операций
//Для каждого выражения используйте свой собственный вызов System.out.println().
package Hexlet.Module1.OsnovyJava.Kurs;

class App3 {
    public static void printResult(String[] args) {
        // BEGIN (write your solution here)
        System.out.println(-8/-4);
        System.out.println(100%3);
        System.out.println(-8/-4 + 100%3);
        // END
    }
}

public class _4PrintResult {
}
