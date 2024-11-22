package home.code.Hexlet.Module2.JavaStreams.Ispytaniya;

import org.apache.commons.lang3.StringUtils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class App8 {
    public static String getForwardedVariables(String str) {
        String temp = Stream.of(str.trim().split("\\s+"))
                .filter(line -> line.startsWith("environment=\""))
                .map(line -> line.substring(13, line.length() - 1))
                .collect(Collectors.joining(","));
        return Arrays.stream(temp.split(","))
                .filter(v -> v.startsWith("X_FORWARDED_"))
                .map(v -> v.substring(12))
                .collect(Collectors.joining(","));

//        return temp;
    }
}

public class _8GetForwardedVariables {
    public static void main(String[] args) throws IOException {
        // Читаем содержимое файла и записываем его в переменную content
        // реализовывать это в домашней работе не нужно.
        var content = "environment=\"X_FORWARDED_var1=111\" \n" +
                "environment=\"key2=true,X_FORWARDED_var2=123\"";

        // Передаем содержимое файла в метод
        var result = App8.getForwardedVariables(content);
        System.out.println(result); // => MAIL=tirion@google.com,HOME=/home/tirion,var3=value
    }
}
