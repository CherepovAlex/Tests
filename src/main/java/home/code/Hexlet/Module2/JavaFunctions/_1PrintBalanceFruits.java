package home.code.Hexlet.Module2.JavaFunctions;

import java.util.Map;

class App1 {
    public static void printBalance(Map<String, Integer> map, int count) {
        map.forEach((key, value) -> { if ((value < count)) { System.out.println(key);}});
    }
}

public class _1PrintBalanceFruits {
    public static void main(String[] args) {
        var products = Map.of(
                "Apple", 5,
                "Lemon", 9,
                "Pear", 15
        );

        App1.printBalance(products, 10); // =>
            // Apple
            // Lemon
    }
}
