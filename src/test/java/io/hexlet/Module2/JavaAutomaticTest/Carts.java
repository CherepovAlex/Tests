package io.hexlet.Module2.JavaAutomaticTest;


import io.hexlet.Module2.JavaAutomaticTest.implementations8.Cart;
import io.hexlet.Module2.JavaAutomaticTest.implementations8.CartRight;
import io.hexlet.Module2.JavaAutomaticTest.implementations8.CartWrong1;
import io.hexlet.Module2.JavaAutomaticTest.implementations8.CartWrong2;
import io.hexlet.Module2.JavaAutomaticTest.implementations8.CartWrong3;

public class Carts {
    private static String implementation = "right";

    public static void setImplementation(String implementationName) {
        implementation = implementationName;
    }

    public static Cart makeCart() {
        return switch (implementation) {
            case "wrong1" -> new CartWrong1();
            case "wrong2" -> new CartWrong2();
            case "wrong3" -> new CartWrong3();
            default -> new CartRight();
        };
    }
}
