package home.code.Hexlet.Module2.JavaMaps.Ispytaniya;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.ArrayList;

class App1_1 {

    public static String bqs(Map<String, String> params) {

        var result = new ArrayList<String>();

        params.forEach((k, v) -> {
            result.add(k + "=" + v);
        });

        return String.join("&", result);
    }
    // Alternative solution without forEach

    // public static String bqs(Map<String, String> params) {

    //     var result = new ArrayList<String>();

    //     for (var param : params.entrySet()) {
    //         result.add(param.getKey() + "=" + param.getValue());
    //     }

    //     return String.join("&", result);
    // }
}

public class _1CompLineV2 {
    public static void main(String[] args) {
        var params = new LinkedHashMap<String, String>();
        params.put("page", "1");
        params.put("per", "10");

        App1_1.bqs(params); // "page=1&per=10"
    }

}
