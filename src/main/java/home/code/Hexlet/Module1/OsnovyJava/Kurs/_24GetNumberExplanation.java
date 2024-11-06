//Реализуйте метод getNumberExplanation(), который принимает на вход число и возвращает
// строку – объяснение этого числа. Если для числа нет объяснения, то возвращается just
// a number. Объяснения есть только для следующих чисел:
//
//* 666 - devil number
//* 42 - answer for everything
//* 7 - prime number

package Hexlet.Module1.OsnovyJava.Kurs;

class App24 {
    // BEGIN (write your solution here)
    public static String getNumberExplanation(int number) {
        switch (number) {
            case 666:
                return "devil number";
            case 42:
                return "answer for everything";
            case 7:
                return "prime number";
            default:
                return "just a number";
        }
    }
    // END
}


public class _24GetNumberExplanation {
    public static void main(String[] args) {
        App24.getNumberExplanation(8);   // just a number
        App24.getNumberExplanation(666); // devil number
        App24.getNumberExplanation(42);  // answer for everything
        App24.getNumberExplanation(7);   // prime number
    }
}
