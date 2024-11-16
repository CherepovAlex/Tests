package home.code.Hexlet.Module2.JavaStreams.Ispytaniya;

class Util {
    public static String[] chunk(String text, int chunkSize) {
        return text.split("(?<=\\G.{" + chunkSize + "})");
    }
}
