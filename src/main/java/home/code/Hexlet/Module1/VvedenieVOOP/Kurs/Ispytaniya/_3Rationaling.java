package home.code.Hexlet.Module1.VvedenieVOOP.Kurs.Ispytaniya;

class Rational {
    int chislitel;
    int znamenatel;

    public Rational(int chislitel, int znamenatel) {
        this.chislitel = chislitel;
        this.znamenatel = znamenatel;
    }

    public int getNumer() { // нормализованный числитель
        return chislitel / gcd(chislitel, znamenatel);
    }

    public int getDenom() { // нормализованный знаменатель
        return znamenatel / gcd(chislitel, znamenatel);
    }

    public Rational add(Rational rat2) { // сложение двух дробей
        int znam = nok(this.getDenom(), rat2.getDenom());
        int chisl = this.getNumer() * (znam / this.getDenom()) + rat2.getNumer() * (znam / rat2.getDenom());
        if (chisl % znam == 0) {
            chisl = chisl / znam;
            znam = 1;
        }
        if (znam % chisl == 0) {
            znam = znam / chisl;
            chisl = 1;
        }
        return new Rational(chisl, znam);
    }

    public Rational sub(Rational rat2) { // вычитание двух дробей
        int znam = nok(this.getDenom(), rat2.getDenom());
        int chisl = (this.getNumer() * (znam / this.getDenom()) - rat2.getNumer() * (znam / rat2.getDenom()));
        if (chisl % znam == 0) {
            chisl = chisl / znam;
            znam = 1;
        }
        if (znam % chisl == 0) {
            znam = znam / chisl;
            chisl = 1;
        }
        return new Rational(chisl, znam);
    }

    public int gcd(int chislitel, int znamenatel) { // НОД - наибольший общий делитель знаменателей
        chislitel = Math.abs(chislitel);
        znamenatel = Math.abs(znamenatel);
        int nod = 1;
        int min = Math.min(chislitel, znamenatel);
        for (int i = min; i >= 2; i--) {
            if (chislitel % i == 0 && znamenatel % i == 0) {
                nod = i;
                break;
            }
        }
        return nod;
    }

    public int nok(int znam1, int znam2) { // НОК наименьшее общее кратное знаменателей
        int nok = 1;
        znam1 = Math.abs(znam1);
        znam2 = Math.abs(znam2);
        int max = Math.max(znam2, znam1);
        if (znam2 == znam1) return znam2;
        for (int i = max + 1; i <= znam1 * znam2; i++) {
            if (i % znam1 == 0 && i % znam2 == 0) {
                nok = i;
                break;
            }
        }
        return nok;
    }

    @Override
    public String toString() {
        return this.getNumer() + "/" + this.getDenom();
    }
}

public class _3Rationaling {
    public static void main(String[] args) {
        var rat1 = new Rational(3, 9);
        System.out.println(rat1.getNumer()); // 1
        System.out.println(rat1.getDenom()); // 3
//        System.out.println(rat1.toString()); // "1/3"
        System.out.println();

        var rat2 = new Rational(10, 3);
        System.out.println(rat2.getNumer()); // 10
        System.out.println(rat2.getDenom()); // 3
        var sum1 = rat1.add(rat2);
        System.out.println(sum1.toString()); // "11/3"
        System.out.println();

        var sub1 = rat1.sub(rat2);
        System.out.println(sub1.getNumer());
        System.out.println(sub1.getDenom());
//        System.out.println(sub1.toString()); // "-3/1"
        System.out.println();

        var rat3 = new Rational(-4, 16);
        System.out.println(rat3.getNumer()); // -1
        System.out.println(rat3.getDenom()); // 4
//        System.out.println(rat3.toString()); // "-1/4"
        System.out.println();

        var rat4 = new Rational(12, 5);
        System.out.println(rat3.add(rat4));
        var rat5 = rat3.add(rat4);
        System.out.println(rat5.getNumer()); // 43
        System.out.println(rat5.getDenom()); // 20
        System.out.println();

        var rat6 = rat3.sub(rat4);
        System.out.println(rat6.getNumer()); // -53
        System.out.println(rat6.getDenom()); // 20
        System.out.println();

    }
}
