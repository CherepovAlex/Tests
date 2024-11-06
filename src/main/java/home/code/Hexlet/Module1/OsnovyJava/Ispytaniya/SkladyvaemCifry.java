package home.code.Hexlet.Module1.OsnovyJava.Ispytaniya;
class App6 {
    // BEGIN
    public static int sumDigits(int number) {
        var str = Integer.toString(number);
        var result = 0;
        for (var i = 0; i < str.length(); i++) {
            result += Integer.parseInt(Character.toString(str.charAt(i)));
        }

        return result;
    }

    public static Boolean isOneDigitNumber(int number) {
        return number < 10;
    }

    public static int addDigits(int number) {
        var result = number;
        while (!isOneDigitNumber(result)) {
            result = sumDigits(result);
        }

        return result;
    }
    // END
}
public class SkladyvaemCifry {
    public static void main(String[] args) {
        App6.addDigits(0);  // 0
        App6.addDigits(1);  // 1
        App6.addDigits(9);  // 9
        App6.addDigits(10); // 1
        App6.addDigits(38); // 2
    }
}
