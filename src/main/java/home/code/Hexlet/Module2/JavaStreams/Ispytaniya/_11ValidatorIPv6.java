package home.code.Hexlet.Module2.JavaStreams.Ispytaniya;

class App11 {
    public static Boolean isValidIPv6(String ipv6) {
        if (!ipv6.matches("[0-9a-fA-F:]+")) {
            return false;
        }
        String[] groups = ipv6.split(":");
        int marker = 0;
        int places = 0;
        for (int i = 0; i < groups.length; i++) {
            int lengthReal = 4 - groups[i].length();
            if (lengthReal != 0) {
                for (int j = 0; j < lengthReal; j++) {
                    groups[i] = "0" + groups[i];
                    if (j == 3){marker++;places = places + i;}
                }
            }
        }
        if (marker==1 && groups.length == 8) return false;
        
        for (String group : groups) {
            try {
                Integer temp = Integer.parseInt(group, 16);
            } catch (NumberFormatException e) {
                return false;
            }
        }
        return true;
    }
}

public class _11ValidatorIPv6 {
    public static void main(String[] args) {
        System.out.println(App11.isValidIPv6("10:d3:2d06:24:400c:5ee0:be:3d")); // true
        System.out.println(App11.isValidIPv6("0B0:0F09:7f05:e2F3:0D:0:e0:7000")); // true
        System.out.println(App11.isValidIPv6("000::B36:3C:00F0:7:937")); // true
        System.out.println(App11.isValidIPv6("::1")); // true
        System.out.println(App11.isValidIPv6("2607:G8B0:4010:801::1004")); // false
        System.out.println(App11.isValidIPv6("1001:208:67:4f00:e3::2c6:0")); // false V
        System.out.println(App11.isValidIPv6("2.001::")); // false
        System.out.println(App11.isValidIPv6("9f8:0:69S0:9:9:d9a:672:f90d")); // false
    }
}
