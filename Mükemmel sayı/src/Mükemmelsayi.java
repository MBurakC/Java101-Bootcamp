import java.util.Scanner;

public class Mükemmelsayi {
    public static void main(String[] args) {

        Scanner k = new Scanner(System.in);
        System.out.println("Sayıyı Girin: ");
        int sayi = k.nextInt();
        int toplam = 0;

        for (int i = 1; i <= sayi / 2; i++) {
            if (sayi % i == 0) {
                toplam += i;
            }
        }
        if (sayi == toplam) {
            System.out.println(sayi + " Mükemmel Sayıdır");
        } else {
            System.out.println(sayi + " Mükemmel Sayı Değildir");
        }
    }
}
