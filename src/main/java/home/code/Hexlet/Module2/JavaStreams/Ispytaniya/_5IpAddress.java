package home.code.Hexlet.Module2.JavaStreams.Ispytaniya;

import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.Collectors;

import org.apache.commons.lang3.StringUtils;

class App5 {
    public static long ipToDec(String ip) {
        return Arrays.stream(ip.split("\\."))
                .mapToLong(Long::parseLong)
                .reduce((a, b) -> a << 8 | b)
                .orElse(-1L);
    }

//        public static String decToIp(long dec) {
//        return Arrays.stream(new String[4])
//                .map(s -> Long.toString(dec & 0xff))
//                .collect(Collectors.joining("."));
//    }

    public static String decToIp(long ip) {
        StringBuilder sb = new StringBuilder(15);
        for (int i = 0; i < 4; i++) {
            sb.insert(0, Long.toString(ip & 0xff));
            if (i < 3) {
                sb.insert(0, '.');
            }
            ip >>= 8;
        }
        return sb.toString();
    }
}

public class _5IpAddress {
    public static void main(String[] args) {
        System.out.println(App5.ipToDec("128.32.10.1")); // 2149583361
        System.out.println(App5.ipToDec("0.0.0.0")); // 0
        System.out.println(App5.ipToDec("255.255.255.255")); // 4294967295

        System.out.println(App5.decToIp(2149583361L)); // "128.32.10.1"
        System.out.println(App5.decToIp(0L)); // "0.0.0.0"
        System.out.println(App5.decToIp(4294967295L)); // "255.255.255.255"
    }
}
