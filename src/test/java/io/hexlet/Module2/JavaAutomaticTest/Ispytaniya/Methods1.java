package io.hexlet.Module2.JavaAutomaticTest.Ispytaniya;

import java.util.List;
import io.hexlet.Module2.JavaAutomaticTest.Ispytaniya.implementations1.FindRight;
import io.hexlet.Module2.JavaAutomaticTest.Ispytaniya.implementations1.FindWrong1;
import io.hexlet.Module2.JavaAutomaticTest.Ispytaniya.implementations1.FindWrong2;

import io.hexlet.Module2.JavaAutomaticTest.Ispytaniya.model.User;


public class Methods1 {
    private static String implementation = "right";

    public static void setImplementation(String implementationName) {
        implementation = implementationName;
    }

    public static List<User> findByName(List<User> users, String name) {
        return switch (implementation) {
            case "wrong1" -> FindWrong1.findByName(users, name);
            case "wrong2" -> FindWrong2.findByName(users, name);
            default -> FindRight.findByName(users, name);
        };
    }
}