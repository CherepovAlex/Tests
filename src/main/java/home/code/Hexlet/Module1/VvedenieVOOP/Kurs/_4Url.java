package Hexlet.Module1.VvedenieVOOP.Kurs;

class Url {
    String url;

    public Url(String url) {
        this.url = url;
    }

    public String getProtocol() {
        int number = url.indexOf(':');
        return url.substring(0, number);
    }

    public String getHost() {
        int number = url.lastIndexOf("//");
        return url.substring(number + 2);
    }
}

class App4 {
    public static String checkSecurity(Url url) {
        // BEGIN (write your solution here)
        if (url.getProtocol().equals("https")){
            return  "Connection to " + url.getHost() + " is secure";
        }
        if (url.getProtocol().equals("http")){
            return "Connection to " + url.getHost() + " is not secure";
        }
        else return "";
        // END
    }
}

public class _4Url {
    public static void main(String[] args) {

        var url1 = new Url("https://google.com");
        // Получаем протокол
        System.out.println(url1.getProtocol()); // "https"
        // Получаем хост
        System.out.println(url1.getHost()); // "google.com"
        System.out.println(App4.checkSecurity(url1));

        var url2 = new Url("http://example.com");
        // Получаем протокол
        System.out.println(url2.getProtocol()); // "https"
        // Получаем хост
        System.out.println(url2.getHost()); // "google.com"
        System.out.println(App4.checkSecurity(url2));
    }
}
