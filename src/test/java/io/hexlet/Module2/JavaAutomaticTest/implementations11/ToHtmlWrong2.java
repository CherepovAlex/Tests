package io.hexlet.Module2.JavaAutomaticTest.implementations11;

import java.util.List;
import java.util.ArrayList;
import org.apache.commons.io.FilenameUtils;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.type.TypeReference;
import java.util.stream.Collectors;
import java.nio.file.Paths;
import java.nio.file.Files;

public class ToHtmlWrong2 {
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
        switch (type) {
            case "json":
                ObjectMapper jsonMapper = new ObjectMapper();
                return jsonMapper.readValue(content, new TypeReference<List<String>>() { });
            case "yaml":
                ObjectMapper yamlMapper = new ObjectMapper(new YAMLFactory());
                return yamlMapper.readValue(content, new TypeReference<List<String>>() { });
            case "yml":
                return new ArrayList<String>();
            default:
                throw new UnsupportedOperationException();
        }
    }

    private static String readFile(String filepath) throws Exception {
        var path = Paths.get(filepath).toAbsolutePath().normalize();
        return Files.readString(path).trim();
    }
}