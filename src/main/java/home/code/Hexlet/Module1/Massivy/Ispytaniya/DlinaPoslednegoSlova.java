package home.code.Hexlet.Module1.Massivy.Ispytaniya;

class App1 {
    // BEGIN
    public static int getLastWordLength(String text) {
        var words = text.trim().split(" ");
        var lastWord = words[words.length - 1];
        return lastWord.length();
    }
    // END
}

public class DlinaPoslednegoSlova {
    public static void main(String[] args) {

        System.out.println(App1.getLastWordLength("")); // 0

        App1.getLastWordLength("man in BlacK"); // 5

        App1.getLastWordLength("hello, world!  "); // 6
    }
}
