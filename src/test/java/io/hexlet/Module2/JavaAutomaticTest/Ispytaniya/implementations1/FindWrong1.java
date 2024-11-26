package io.hexlet.Module2.JavaAutomaticTest.Ispytaniya.implementations1;

import java.util.List;

import io.hexlet.Module2.JavaAutomaticTest.Ispytaniya.model.User;

public class FindWrong1 {
    public static List<User> findByName(List<User> users, String name) {
        if (users.isEmpty()) {
            return List.<User>of();
        }

        return List.of(users.getFirst());
    }
}