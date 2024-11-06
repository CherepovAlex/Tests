// Реализуйте метод fizzBuzz(), который выводит на экран числа в диапазоне от begin до end. При этом:
//
//Если число делится без остатка на 3, то вместо него выводится слово Fizz
//Если число делится без остатка на 5, то вместо него выводится слово Buzz
//Если число делится без остатка и на 3, и на 5, то вместо числа выводится слово FizzBuzz
//В остальных случаях выводится само число
//Метод принимает два параметра (begin и end), определяющих начало и конец диапазона (включительно). Если диапазон пуст (в случае, когда begin > end), то метод просто ничего не печатает.

package Hexlet.Module1.OsnovyJava.Ispytaniya;

class App1 {
    public static void fizzBuzz(int begin, int end) {
        // BEGIN
        for (var i = begin; i <= end; i++) {
            var hasFizz = i % 3 == 0;
            var hasBuzz = i % 5 == 0;
            var fizzPart = hasFizz ? "Fizz" : "";
            var buzzPart = hasBuzz ? "Buzz" : "";
            System.out.println(hasFizz || hasBuzz ? fizzPart + buzzPart : i);
        }
        // END
    }
}

public class FizzBuzz {
    public static void main(String[] args) {
        App1.fizzBuzz(11, 20);
    }

}
