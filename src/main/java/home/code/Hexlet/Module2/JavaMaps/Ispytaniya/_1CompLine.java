package home.code.Hexlet.Module2.JavaMaps.Ispytaniya;

import java.util.LinkedHashMap;

class App {
    public static String bqs(LinkedHashMap<String, String> linkedHashMap) {
        if (linkedHashMap.size() == 0){
            return "";
        }
        var entries = linkedHashMap.entrySet();
        StringBuilder str = new StringBuilder();
        for (var entry: entries){
            str.append(entry.getKey()).append("=").append(entry.getValue()).append("&");
        }
        return str.substring(0, str.length() - 1);
    }
}

public class _1CompLine {
    public static void main(String[] args) {
        var params = new LinkedHashMap<String, String>();
        params.put("page", "1");
        params.put("per", "10");

        System.out.println(App.bqs(params)); // "page=1&per=10"
    }
}
