package Hexlet.Module1.VvedenieVOOP.Kurs.Ispytaniya;

class Random  {
    int seed;
    int next = 1;

    public Random(int seed) {
        this.seed = seed;
    }

    public int getNext() {
        next = next * 1103515245 + 12345;
        return (next/65536) / (seed + 1);
    }

    public int reset() {
        next = 1;
        return 0;
    }
}

public class _4RandomGenerate {
    public static void main(String[] args) {
        var seq = new Random(100);
        var result1 = seq.getNext();
        System.out.println(result1);
        var result2 = seq.getNext();
        System.out.println(result2);

        System.out.println(result1 != result2); // true

        System.out.println(seq.reset());

        var result21 = seq.getNext();
        var result22 = seq.getNext();

        System.out.println(result1 == result21); // true
        System.out.println(result2 == result22); // true
    }
}
