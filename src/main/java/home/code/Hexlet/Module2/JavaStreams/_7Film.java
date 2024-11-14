package home.code.Hexlet.Module2.JavaStreams;

import home.code.Hexlet.Module2.JavaStreams.model.Film;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class App7 {
    public static Map<String, Long> getGenres(List<Film> list) {
        return list.stream()
                .flatMap(Film -> Film.getGenres().stream())
                .map(String::toLowerCase)
                .collect(Collectors.groupingBy(word -> word, Collectors.counting()));
    }
}

public class _7Film {
    public static void main(String[] args) {
        var films = List.of(
                new Film("Liquid Sky", List.of("thriller", "Action")),
                new Film("Superman", List.of("Action", "fantasy", "thriller")),
                new Film("Norwegian Ninja", List.of("THRILLER"))
        );

        var result = App7.getGenres(films);
        System.out.println(result); // => {"action"=2,"thriller"=3,"fantasy"=1}
    }
}
