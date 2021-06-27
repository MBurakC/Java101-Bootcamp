import java.util.Scanner;

public class ÜsHesabi {
    public static int us(int taban, int usDeger) {
        if (usDeger == 0) {
            return 1;
        } else if (taban == 1) {
            return 1;
        } else {
            return taban * us(taban, usDeger - 1);
        }
    }
    public static void main(String[] args) {

        Scanner k = new Scanner(System.in);
        System.out.print("Taban Değeri Giriniz: ");
        int taban = k.nextInt();
        System.out.print("Üs Değeri Giriniz: ");
        int usDeger = k.nextInt();

        System.out.println("Sonuç = " + us(taban, usDeger));

    }
}

