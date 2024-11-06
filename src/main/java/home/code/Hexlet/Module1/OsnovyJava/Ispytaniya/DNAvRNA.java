package home.code.Hexlet.Module1.OsnovyJava.Ispytaniya;

class App2 {
    // BEGIN
    public static String dnaToRna(String chain) {
        var rna = "";
        for (var i = 0; i < chain.length(); i++) {
            switch (chain.charAt(i)) {
                case 'G':
                    rna += "C";
                    break;
                case 'C':
                    rna += "G";
                    break;
                case 'T':
                    rna += "A";
                    break;
                case 'A':
                    rna += "U";
                    break;
                default:
                    return null;
            }
        }

        return rna;
    }
    // END
}
public class DNAvRNA {
    public static void main(String[] args) {
        App2.dnaToRna("ACGTGGTCTTAA"); // "UGCACCAGAAUU"
        App2.dnaToRna("CCGTA"); // "GGCAU"
        App2.dnaToRna(""); // ""
        App2.dnaToRna("ACNTG"); // null
    }
}
