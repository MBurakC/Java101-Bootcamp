import java.util.Random;

public class Dövüs {
    String ad;
    int hasar;
    int can;
    int agirlik;
    double engelleme;

    public Dövüs(String ad, int hasar, int can, int agirlik, double engelleme) {
        this.ad = ad;
        this.hasar = hasar;
        this.can = can;
        this.agirlik = agirlik;
        this.engelleme = engelleme;
    }

    public int hit(Dövüs düsman) {
        System.out.println("------------");
        System.out.println(this.ad + " => " + düsman.ad + " " + this.hasar + " hasar vurdu.");

        if (düsman.engelleme()) {
            System.out.println(düsman.ad + " gelen hasarı savurdu.");
            return düsman.can;
        }

        if (düsman.can - this.hasar < 0) {
            return 0;
        }

        return düsman.can - this.hasar;
    }

    public boolean engelleme() {
        double randomValue = Math.random() * 100;
        return randomValue <= this.engelleme;
    }

    public static class Ring {

    Dövüs f1;
    Dövüs f2;
    int minagirlik;
    int maxagirlik;

    public Ring(Dövüs f1, Dövüs f2, int minagirlik, int maxagirlik) {
        this.f1 = f1;
        this.f2 = f2;
        this.minagirlik = minagirlik;
        this.maxagirlik = maxagirlik;
    }

    public void run() {

        if (checkagirlik()) {
            Random rnd = new Random();
            int rand = rnd.nextInt(2);
            while (f1.can > 0 && f2.can > 0) {
                System.out.println("-> YENİ ROUND <- ");
                if (rand == 1) {
                    f2.can = f1.hit(f2);
                    if (isWin()) {
                        break;
                    }
                    f1.can = f2.hit(f1);
                    if (isWin()) {
                        break;
                    }
                } else {
                    f1.can = f2.hit(f1);
                    if (isWin()) {
                        break;
                    }
                    f2.can = f1.hit(f2);
                    if (isWin()) {
                        break;
                    }
                }
                printScore();
            }

        } else {
            System.out.println("Sporcuların ağırlıkları uyuşmuyor.");
        }

    }
    public boolean checkagirlik() {
        return (f1.agirlik >= minagirlik && f1.agirlik <= maxagirlik) && (f2.agirlik >= minagirlik && f2.agirlik <= maxagirlik);
    }
    public boolean isWin() {
        if (f1.can == 0) {
            System.out.println("Maçı Kazanan : " + f2.ad);
            return true;
        } else if (f2.can == 0) {
            System.out.println("Maçı Kazanan : " + f1.ad);
            return true;
        }
        return false;
    }
    public void printScore() {
        System.out.println("------------");
        System.out.println(f1.ad + " Kalan Can \t:" + f1.can);
        System.out.println(f2.ad + " Kalan Can \t:" + f2.can);
    }
    public static void main(String[] args) {
        Dövüs burak = new Dövüs("Burak", 15, 100, 90, 0);
        Dövüs emre = new Dövüs("Emre", 10, 95, 100, 0);
        Ring r = new Ring(burak, emre, 90, 100);
        r.run();
    } } }



