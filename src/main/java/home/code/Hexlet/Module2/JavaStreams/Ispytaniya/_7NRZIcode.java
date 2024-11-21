package home.code.Hexlet.Module2.JavaStreams.Ispytaniya;

import java.util.*;

class App7 {
    public static String nrzi(String str) {
        String[] signs = {"¯", "|", "_"};
        if (str.isEmpty() || str.equals("|") || str.equals("_") || str.equals("¯")) {
            return "";
        }

        String temp;
        String tempStr = "" + str.charAt(0);
        if (signs[1].equals(tempStr)) {
            temp = "1";
        } else if (signs[0].equals(tempStr)) {
            temp = "0";
        } else temp = "0";

        List<Integer> tempInt = str.chars()
                            .mapToObj(c -> (char)c)
                            .mapToInt(c -> c == '|'? 1 : 0)
                            .boxed().toList();
        StringBuilder sum = new StringBuilder(temp);
        for (int i = 1; i < tempInt.size(); i++) {
            if (tempInt.get(i) == 0 && tempInt.get(i - 1) == 1) {
            } else sum.append(tempInt.get(i));
        }
        return sum.toString();
    }
//    return IntStream.range(0, signal.length())
//            .mapToObj(index -> {
//                if (signal.charAt(index) == '|') {
//                    return "";
//                }
//                return (index != 0 && signal.charAt(index - 1) == '|') ? "1" : "0";
//            })
//            .collect(Collectors.joining(""));
}

public class _7NRZIcode {
    public static void main(String[] args) {
        var signal1 = "_|?|____|?|__|???";
        System.out.println(App7.nrzi(signal1)); // "011000110100"

        var signal2 = "|?|___|?????|___|?|_|?";
        System.out.println(App7.nrzi(signal2)); // "110010000100111"

        var signal3 = "?|___|?????|___|?|_|?";
        System.out.println(App7.nrzi(signal3)); // "010010000100111"

        var signal6 = "¯|__|¯|___|¯¯";
        System.out.println(App7.nrzi(signal6)); // "010110010"

        var signal4 = "";
        System.out.println(App7.nrzi(signal4)); // ""

        var signal5 = "|";
        System.out.println(App7.nrzi(signal5)); // ""
    }
}
