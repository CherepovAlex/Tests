package home.code.Hexlet.Module2.JavaLists;

import Hexlet.Module2.JavaLists.model.User;
//import org.apache.commons.collections4.CollectionUtils;

import java.util.ArrayList;
import java.util.List;

class App5 {
    public static List<User> getCommonFriends(User user1, User user2) {
        var list= new ArrayList<>();
        user1.getFriends().retainAll(user2.getFriends());
        return user1.getFriends();
    }
}

public class _5Commons {
    public static void main(String[] args) {
        var user1 = new User("John");
        user1.addFriend(new User("Ellery"));

        var user2 = new User("Anna");
        user2.addFriend(new User("Abey"));

        // Общий друг двух пользователей
        var friend = new User("Jacky");
        user1.addFriend(friend);
        user2.addFriend(friend);

        List<User> commonFriends = App5.getCommonFriends(user1, user2);
        System.out.println(commonFriends); // => ["Jacky"]
    }
}
