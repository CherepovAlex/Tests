package Hexlet.Module2.JavaClasses.Ispytaniya;

class Triangle {
    private double katet1;
    private double katet2;
    private double gipotinuza;

    Triangle(double katet1, double katet2, double gipotinuza) throws IllegalArgumentException{
        this.katet1 = katet1;
        this.katet2 = katet2;
        this.gipotinuza = gipotinuza;
        if ((katet2 + gipotinuza <= katet1) || (katet1 + gipotinuza <= katet2) || (katet1 + katet2 <= gipotinuza) ){
            System.out.println("зашел");
            throw new IllegalArgumentException();
        }
    }

    public double getSideA()  {
        if (katet2 + gipotinuza > katet1) {
            return katet1;
        } else {
            throw new IllegalArgumentException();
        }
    }

    public double getSideB() {
        if (katet1 + gipotinuza > katet2) {
            return katet2;
        } else {
            throw new IllegalArgumentException();
        }
    }

    public double getSideC() {
        if (katet1 + katet2 > gipotinuza) {
            return gipotinuza;
        } else {
            throw new IllegalArgumentException();
        }
    }
}

public class _1Triangle {
    public static void main(String[] args) throws IllegalArgumentException {
        var figure = new Triangle(2, 3, 4);
        System.out.println(figure.getSideA()); // 2
        System.out.println(figure.getSideB()); // 3
        System.out.println(figure.getSideC()); // 4

        var figure1 = new Triangle(1, 2, 3); // Ошибка!

    }
}
