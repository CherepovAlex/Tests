package io.hexlet.Module2.JavaAutomaticTest;

import org.junit.jupiter.api.Test;

import java.nio.file.Files;
import java.nio.file.Path;

import static io.hexlet.Module2.JavaAutomaticTest.Methods11.toHtmlList;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Test11MethodsTest {

    // BEGIN (write your solution here)
//    @BeforeAll
//    public static void beforeAll() {
//
//    }

    @Test
    public void testYAML() throws Exception {
        assertEquals(toHtmlList("../Tests/src/test/resources/fixtures/path/to/yaml/list.yaml"), Files.readString(Path.of("../Tests/src/test/resources/fixtures/result.html")));
    }
    @Test
    public void testYML() throws Exception {
        assertEquals(toHtmlList("../Tests/src/test/resources/fixtures/path/to/yaml/list.yml"), Files.readString(Path.of("../Tests/src/test/resources/fixtures/result.html")));
    }
    @Test
    public void testJSON () throws Exception {
        assertEquals(toHtmlList("../Tests/src/test/resources/fixtures/path/to/json/list.json"), Files.readString(Path.of("../Tests/src/test/resources/fixtures/result.html")));
    }
    // END

    public static void main(String[] args) throws Exception {
        var html1 = toHtmlList("/path/to/yaml/list");
        var html2 = toHtmlList("/path/to/json/list");
    }
}
