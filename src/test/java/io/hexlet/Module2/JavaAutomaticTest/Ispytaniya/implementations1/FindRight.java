package io.hexlet.Module2.JavaAutomaticTest.Ispytaniya.implementations1;

import java.util.List;

import io.hexlet.Module2.JavaAutomaticTest.Ispytaniya.model.User;

public class FindRight {
    public static List<User> findByName(List<User> users, String name) {
        return users.stream()
            .filter(user -> user.getFirstName().equals(name))
            .toList();
    }
}