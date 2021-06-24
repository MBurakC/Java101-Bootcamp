import java.util.Scanner;
public class dikalanhesap {

    public static int CevreHesapla(int a, int b) {
        int cevre = 2 * (a + b);
        return cevre;
    }

    public static int AlanHesapla(int a, int b) {
        int alan = (a * b);
        return alan;
    }

    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        k = new Scanner(System.in);
        int birinciKenar, ikinciKenar, Cevresi, Alani;

        System.out.print("Birinci Kenar Uzunluğunu giriniz:");
        birinciKenar = k.nextInt();

        System.out.print("İkinci Kenar Uzunluğunu giriniz:");
        ikinciKenar = k.nextInt();

        System.out.println("Çevre sonucu : "+ CevreHesapla(birinciKenar, ikinciKenar));
        System.out.println("Alan sonucu : "+ AlanHesapla(birinciKenar,ikinciKenar));

    }
}
