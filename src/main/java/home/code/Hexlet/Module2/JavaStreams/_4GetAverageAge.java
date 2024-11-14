package home.code.Hexlet.Module2.JavaStreams;

import home.code.Hexlet.Module2.JavaStreams.model.Person;

import java.util.ArrayList;
import java.util.List;

class App4 {
    public static Double getAverageAge(List<Person> list) {
        var n = list.size();
        if (list.isEmpty()) {
            return null;
        }
        Double summa = list.stream().
                reduce(0.0,
                        (sum, user) -> {
                            var age = Double.valueOf(user.getAge());
                            return sum + age;
                        },
                        Double::sum);
        return summa / n;
    }
}

public class _4GetAverageAge {
    public static void main(String[] args) {
        var people = new ArrayList(
                List.of(
                        new Person("John", 17),
                        new Person("Anna", 24),
                        new Person("Alex", 57),
                        new Person("Jun", 32)
                )
        );
        System.out.println(App4.getAverageAge(people)); // 32.5
    }
}
