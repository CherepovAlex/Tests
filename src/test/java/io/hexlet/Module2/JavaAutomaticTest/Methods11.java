package io.hexlet.Module2.JavaAutomaticTest;

import io.hexlet.Module2.JavaAutomaticTest.implementations11.ToHtmlRight;
import io.hexlet.Module2.JavaAutomaticTest.implementations11.ToHtmlWrong1;
import io.hexlet.Module2.JavaAutomaticTest.implementations11.ToHtmlWrong2;
import io.hexlet.Module2.JavaAutomaticTest.implementations11.ToHtmlWrong3;

public class Methods11 {
    private static String implementation = "right";

    public static void setImplementation(String implementationName) {
        implementation = implementationName;
    }

    public static String toHtmlList(String filepath) throws Exception {
        return switch (implementation) {
            case "wrong1" -> ToHtmlWrong1.toHtmlList(filepath);
            case "wrong2" -> ToHtmlWrong2.toHtmlList(filepath);
            case "wrong3" -> ToHtmlWrong3.toHtmlList(filepath);
            default -> ToHtmlRight.toHtmlList(filepath);
        };
    }
}