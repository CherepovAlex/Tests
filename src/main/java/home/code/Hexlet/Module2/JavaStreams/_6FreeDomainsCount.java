package home.code.Hexlet.Module2.JavaStreams;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

class App6 {
    private static final List<String> FREE_DOMAINS = List.of(
            "gmail.com",
            "yandex.ru",
            "hotmail.com",
            "yahoo.com"
    );

    public static Map<String, Long> getFreeDomainsCount(List<String> emails) {
        return emails.stream()
                .map(strings -> strings.split("@")[1])
                .filter(FREE_DOMAINS::contains)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting() ));
    }
}

public class _6FreeDomainsCount {
    public static void main(String[] args) {
        var emails = List.of(
                "info@yandex.ru",
                "mk@host.com",
                "support@hexlet.io",
                "sergey@gmail.com",
                "vovan@gmail.com",
                "vovan@hotmail.com"
        );

        var result = App6.getFreeDomainsCount(emails);
        System.out.println(result); // => {gmail.com=2, yandex.ru=1, hotmail.com=1}
    }
}
