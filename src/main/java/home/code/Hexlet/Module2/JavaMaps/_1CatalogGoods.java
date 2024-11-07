package home.code.Hexlet.Module2.JavaMaps;

import java.util.Map;

class App1 {
    private static final Map<String, Double> products = Map.of(
            "Coffee", 30.0,
            "Bread", 10.0,
            "Milk", 20.0
    );

    public static Double getPriceWithDiscount(Map<String, Double> discounts, String nameGood) {

        if (products.containsKey(nameGood)) {
            if (discounts.containsKey(nameGood)) {
                return products.get(nameGood) - products.get(nameGood) * discounts.get(nameGood) / 100;
            } else {
                return products.get(nameGood);
            }
        } else {
            return null;
        }
    }
}

public class _1CatalogGoods {
    public static void main(String[] args) {

        var discounts = Map.of(
                "Bread", 10.0,
                "Salmon", 20.0
        );

        // Скидка на хлеб 10 процентов
        System.out.println(App1.getPriceWithDiscount(discounts, "Bread")); // 9.0

        // На молоко сегодня скидок нет
        System.out.println(App1.getPriceWithDiscount(discounts, "Milk")); // 20.0

        System.out.println(App1.getPriceWithDiscount(discounts, "Olives")); // null

    }
}
