package io.hexlet.Module2.JavaAutomaticTest.Ispytaniya.implementations1;

import java.util.List;

import io.hexlet.Module2.JavaAutomaticTest.Ispytaniya.model.User;

public class FindWrong2 {
    public static List<User> findByName(List<User> users, String name) {
        if (users.isEmpty()) {
            return null;
        }

        return users.stream()
            .filter(user -> user.getFirstName().equals(name))
            .toList();
    }
}