import java.util.Scanner;

public class MaxMinBul {
    public static void main(String[] args) {

        Scanner k = new Scanner(System.in);
        System.out.print("Kaç sayı girmek istersiniz : n =  ");
        int n = k.nextInt();
        int maks = 0;
        int min = 0;

        for (int i = 1; i <= n; i++) {
            System.out.println(i + ". sayıyı giriniz : ");
            int sayi = k.nextInt();
            if (i == 1) {
                maks = sayi;
                min = sayi;
            }
            if (sayi > maks) {
                maks = sayi;
            }
            if (sayi < min) {
                min = sayi;
            }
        }
        System.out.println("En Büyük Sayı: " + maks);
        System.out.println("En Küçük Sayı: " + min);
    }
}
