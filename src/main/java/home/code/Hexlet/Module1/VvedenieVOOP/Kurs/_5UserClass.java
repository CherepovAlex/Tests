package home.code.Hexlet.Module1.VvedenieVOOP.Kurs;

class User {
    int id;
    String nick;

    public User(int id, String nick) {
        this.id = id;
        this.nick = nick;
    }

    public boolean isEqual(User user) {
        return (this.id == user.id) ? true : false;
    }
}

public class _5UserClass {
    public static void main(String[] args) {
        var user1 = new User(1, "Nick12");

// Другой пользователь с такими же id
        var user2 = new User(1, "Nick");

// Сравниваем пользователя user1 с другим пользователем user2
// Так как идентификаторы совпадают, это один и тот же пользователь
        System.out.println(user1.isEqual(user2)); // true

// У пользователя другой id
        var user3 = new User(14, "Nick12");

        System.out.println(user1.isEqual(user3)); // false
    }
}
