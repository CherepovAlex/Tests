package home.code.Hexlet.Module2.JavaFunctions;

import home.code.Hexlet.Module2.JavaFunctions.model.User;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

class App2 {
    public static List<User> getOldest(List<User> list, int number) {
        ArrayList<User> newList = new ArrayList<>();
        ArrayList<User> newList1 = new ArrayList<>(list);
        if (list.size() == 0) {
            return newList;
        }
        newList1.sort((v1, v2) -> Integer.compare(v1.getBirthday().getYear(), v2.getBirthday().getYear()));
        for (int i = 0; i < number; i++) {
            newList.add(newList1.get(i));
        }
        return newList;
    }

    public static List<User> getOldest(List<User> list) {
        ArrayList<User> newList = new ArrayList<>();
        ArrayList<User> newList1 = new ArrayList<>(list);
        newList1.sort((v1, v2) -> Integer.compare(v1.getBirthday().getYear(), v2.getBirthday().getYear()));
        newList.add(newList1.get(0));
        return newList;
    }
}

public class _2SortLists {
    public static void main(String[] args) {
        var users = new ArrayList<>(List.of(
                new User("Salli", LocalDate.of(1990, 12, 15)),
                new User("Gawen", LocalDate.of(2002, 10, 23)),
                new User("Emmalee", LocalDate.of(1992, 9, 16))
        ));

        var oldestUsers1 = App2.getOldest(users);
        System.out.println(oldestUsers1); // => [Salli 1990-12-15]

        var oldestUsers2 = App2.getOldest(users, 2);
        System.out.println(oldestUsers2); // => [Salli 1990-12-15, Emmalee 1992-9-16]
    }
}
