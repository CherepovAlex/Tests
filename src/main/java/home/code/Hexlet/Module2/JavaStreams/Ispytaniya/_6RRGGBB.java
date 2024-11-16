package home.code.Hexlet.Module2.JavaStreams.Ispytaniya;

import java.util.HashMap;
import java.util.stream.Collectors;
import org.apache.commons.lang3.StringUtils;
import java.util.stream.Stream;
import java.util.Map;
import java.util.List;

class App6 {
//    public static

    public static String rgbToHex(int number1, int number2, int number3) {
        var mathodRGBtoHex = Stream.of(number1, number2, number3)
                            .map(number -> Integer.toString(number, 16))
                            .map(number -> StringUtils.leftPad(number, 2, "0"))
                            .collect(Collectors.joining(""));
        return "#" + mathodRGBtoHex;
    }

    public static Map<String, Integer> hexToRgb(String color) {
        var colorToHex = color.split("\\#");
        var temp = Stream.of(Util.chunk(colorToHex[1], 2))
                .map(number -> Integer.parseInt(number, 16))
                .toList();
        Map<String, Integer> map = new HashMap<>();
        map.put("r", temp.get(0));
        map.put("g", temp.get(1));
        map.put("b", temp.get(2));
        return map;
    }
}

public class _6RRGGBB {
    public static void main(String[] args) {

        Map<String, Integer> rgb = App6.hexToRgb("#24ab00");
        System.out.println(rgb); // {b=0, g=171, r=36}

        System.out.println(App6.rgbToHex(36, 171, 0)); // "#24ab00"

//        Integer.parseInt()

//        Integer.toString(7);

//        StringUtils.leftPad()

//        String[] result = Util.chunk("abcdef", 2);
//        System.out.println(Arrays.toString(result)); // ["ab", "cd", "ef"];

    }
}
