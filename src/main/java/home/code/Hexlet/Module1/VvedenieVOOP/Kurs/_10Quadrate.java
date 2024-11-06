package Hexlet.Module1.VvedenieVOOP.Kurs;

// BEGIN (write your solution here)
import Hexlet.Module1.VvedenieVOOP.Kurs.geometry.Quadrate;

class App10 {
    public static Quadrate enlargeQuadrate(Quadrate quadrate) {
        var quadrateNew = new Quadrate(quadrate.getSide() * 2);
        return quadrateNew;
    }
}
// END


public class _10Quadrate {
    public static void main(String[] args) {
        var quadrate = new Quadrate(3);
        var enlargedQuadrate = App10.enlargeQuadrate(quadrate);
        System.out.println(enlargedQuadrate.getSide()); // 6
    }
}
