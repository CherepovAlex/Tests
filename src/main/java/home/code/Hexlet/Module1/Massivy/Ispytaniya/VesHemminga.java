package home.code.Hexlet.Module1.Massivy.Ispytaniya;

class App4 {
    // BEGIN
    public static int getHammingWeight(int number) {

        var weight = 0;
        var digits = Integer.toBinaryString(number);

        for (var digit: digits.toCharArray()) {
            weight += Character.getNumericValue(digit);
        }

        return weight;
    }
    // END
}

public class VesHemminga {
    public static void main(String[] args) {
        System.out.println(App4.getHammingWeight(0)); // 0
        App4.getHammingWeight(4); // 1
        App4.getHammingWeight(101); // 4
    }
}
