package home.code.Hexlet.Module2.JavaStreams;

import java.util.List;

class App2 {
    public static List<String> normalize(List<String> list) {
        return list.stream().map(String::trim).map(String::toLowerCase).toList();
    }
}

public class _2Normalize {
    public static void main(String[] args) {
        var emails = List.of("Mark@Gmail.com", "  AnnA@mail.io  ", "john@GMAIL.com");
        var result = App2.normalize(emails);
        System.out.println(result); // => [mark@gmail.com, anna@mail.io, john@gmail.com]
    }
}
