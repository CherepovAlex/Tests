package home.code.Hexlet.Module2.JavaStreams.Ispytaniya;

import java.util.List;
import java.time.*;
import java.util.Map;
import java.util.stream.Collectors;

class App2 {
    public static Map<Integer, Long> getMenCountByYear(List<Map<String, String>> peoples) {
        return peoples.stream()
                .filter(people -> people.get("gender").equals("male"))
                .collect(Collectors.groupingBy(people -> Integer.parseInt(people.get("birthday").substring(0, 4)),
                        Collectors.counting()));
    }
}

public class _2MenCountByYear {
    public static void main(String[] args) {
        // Список пользователей
        // Каждый пользователь представлен словарем Map
        List<Map<String, String>> users = List.of(
                Map.of("name", "Bronn", "gender", "male", "birthday", "1973-03-23"),
                Map.of("name", "Reigar", "gender", "male", "birthday", "1973-11-03"),
                Map.of("name", "Eiegon", "gender", "male", "birthday", "1963-11-03"),
                Map.of("name", "Sansa", "gender", "female", "birthday", "2012-11-03"),
                Map.of("name", "Jon", "gender", "male", "birthday", "1980-11-03"),
                Map.of("name", "Robb", "gender", "male", "birthday", "1980-05-14"),
                Map.of("name", "Tisha", "gender", "female", "birthday", "2012-11-03"),
                Map.of("name", "Rick", "gender", "male", "birthday", "2012-11-03"),
                Map.of("name", "Joffrey", "gender", "male", "birthday", "1999-11-03"),
                Map.of("name", "Edd", "gender", "male", "birthday", "1973-11-03")
        );

        Map<Integer, Long> result = App2.getMenCountByYear(users);
        System.out.println(result); // {1980=2, 1999=1, 1963=1, 1973=3, 2012=1}
    }
}