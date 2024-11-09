package home.code.Hexlet.Module2.JavaMaps.Ispytaniya;

import java.util.LinkedHashMap;

class Cache {
    private static int contain;
    private static int counter;
    static final LinkedHashMap<String, String> THE_MAP = new LinkedHashMap<>();

    public Cache(int contain) {
        this.contain = contain;
    }

    public static void put(String strPut1, String strPut2) {
        int tempSize = THE_MAP.size();
        THE_MAP.put(strPut1, strPut2);
        if (THE_MAP.size() != tempSize) {
            counter++;
        }
        if (counter > Cache.contain) {
            var entry = THE_MAP.entrySet().iterator().next();
            THE_MAP.remove(entry.getKey());
            counter--;
        }
    }

    public static String get(String strGet) {
        return THE_MAP.get(strGet);
    }
}

public class _3Caching {
    public static void main(String[] args) {
        var cache = new Cache(2);

        // Добавляем туда два запроса
        cache.put("praesent", "imperdiet et commodo vulputate");
        cache.put("amet erat", "in tempus sit amet");

        // Обращаемся к кэшу и получаем из него ответы на запросы
        System.out.println(cache.get("praesent")); // imperdiet et commodo vulputate
        System.out.println(cache.get("amet erat")); // in tempus sit amet

        cache.put("justo sit", "auctor sed tristique in");

        System.out.println(cache.get("justo sit")); //auctor sed tristique in
        System.out.println(cache.get("amet erat")); // in tempus sit amet
        System.out.println(cache.get("praesent")); // null

        cache.put("sed", "vel ipsum praesent blandit");

        System.out.println(cache.get("sed")); // vel ipsum praesent blandit
        System.out.println(cache.get("justo sit")); //auctor sed tristique in
        System.out.println(cache.get("amet erat")); // null

        cache.put("sed", "another value");

        System.out.println(cache.get("sed")); // another value
        System.out.println(cache.get("justo sit")); // auctor sed tristique in

        System.out.println(cache.get("not exists")); // null
    }
}
