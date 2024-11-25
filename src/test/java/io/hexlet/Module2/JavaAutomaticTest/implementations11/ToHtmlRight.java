package io.hexlet.Module2.JavaAutomaticTest.implementations11;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import org.apache.commons.io.FilenameUtils;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class ToHtmlRight {
    public static String toHtmlList(String filepath) throws Exception {
        var content = readFile(filepath);
        var type = FilenameUtils.getExtension(filepath);
        var data = parse(content, type);
        return toHtml(data);
    }

    private static String toHtml(List<String> items) {
        var list = items.stream().map(item -> "<li>" + item + "</li>").collect(Collectors.joining("\n"));
        return "<ul>\n" + list + "\n</ul>";
    }

    private static List<String> parse(String content, String type) throws Exception {
        ObjectMapper mapper = switch (type) {
            case "json" -> new ObjectMapper();
            case "yaml", "yml" ->  new ObjectMapper(new YAMLFactory());
            default -> throw new UnsupportedOperationException();
        };

        return mapper.readValue(content, new TypeReference<List<String>>() { });
    }

    private static String readFile(String filepath) throws Exception {
        var path = Paths.get(filepath).toAbsolutePath().normalize();
        return Files.readString(path).trim();
    }
}