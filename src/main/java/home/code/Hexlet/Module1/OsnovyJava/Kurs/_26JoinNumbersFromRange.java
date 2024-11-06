//Реализуйте метод joinNumbersFromRange(), который объединяет все числа из диапазона в строку:

package Hexlet.Module1.OsnovyJava.Kurs;

class App26 {
    public static String joinNumbersFromRange(int start, int finish) {
        // BEGIN (write your solution here)
        var i = start;
        String result = "";
        while (i <= finish) {
            result += i;
            i += 1;
        }
        return result;
        // END
    }
}


public class _26JoinNumbersFromRange {
    public static void main(String[] args) {
        App26.joinNumbersFromRange(1, 1); // "1"
        App26.joinNumbersFromRange(2, 3); // "23"
        App26.joinNumbersFromRange(5, 10); // "5678910"
    }
}
