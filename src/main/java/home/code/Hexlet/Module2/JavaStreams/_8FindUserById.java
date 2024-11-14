package home.code.Hexlet.Module2.JavaStreams;

import java.util.ArrayList;
import java.util.List;

import home.code.Hexlet.Module2.JavaStreams.model.User;

class App8 {
    public static User findUserById(List<User> users, long id) {
        var maybeUser = users
                        .stream()
                        .filter(User -> User.getId() == id)
                        .findFirst();
        return maybeUser.orElseThrow(() -> new RuntimeException("User not found"));
    }
}

public class _8FindUserById {
    public static void main(String[] args) {
        var users = new ArrayList(
                List.of(
                        new User(1, "John"),
                        new User(2, "Anna"),
                        new User(3, "Alex")
                )
        );

        var user = App8.findUserById(users, 1);
        System.out.println(user.getName()); // John

        // Пользователя с таким id нет
        System.out.println(App8.findUserById(users, 10)); // Error
    }
}
