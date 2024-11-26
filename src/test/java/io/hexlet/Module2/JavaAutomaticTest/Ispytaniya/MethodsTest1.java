package io.hexlet.Module2.JavaAutomaticTest.Ispytaniya;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import java.util.ArrayList;

import static io.hexlet.Module2.JavaAutomaticTest.Ispytaniya.Methods1.findByName;

import io.hexlet.Module2.JavaAutomaticTest.Ispytaniya.model.User;

// BEGIN (write your solution here)
import net.datafaker.Faker;
// END

class MethodsTes1 {

    private static List<User> users = new ArrayList<>();

    // BEGIN (write your solution here)

    @BeforeAll
    public static void beforeAll() {
        Faker faker = new Faker();
        int i = 0;
        while (i < 10) {
            users.add(new User(faker.name().firstName(), faker.name().lastName(), faker.name().firstName() + "." + faker.name().lastName() + "@mail.com"));
            i++;
        }
    }
    // END

    @Test
    public void testCommonCase1() {
        var name = users.getFirst().getFirstName();
        var expected = users.stream().filter(u -> u.getFirstName().equals(name)).toList();
        var actual = findByName(users, name);
        assertEquals(expected, actual);
    }

    @Test
    public void testCommonCase2() {
        var name = users.getLast().getFirstName();
        var expected = users.stream().filter(u -> u.getFirstName().equals(name)).toList();
        var actual = findByName(users, name);
        assertEquals(expected, actual);
    }

    @Test
    public void testEmptyList() {
        var expected = List.<User>of();
        var actual = findByName(List.<User>of(), "John");
        assertEquals(expected, actual);
    }
}
