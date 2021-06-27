import java.util.Scanner;

public class AsalSayiR {
    public static int isAsal(int sayi, int i) {
        if (i == 1) {
            return 1;
        } else {
            if (sayi % i == 0) {
                return 0;
            } else {
                return isAsal(sayi, i - 1);
            }
        }
    }
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz: ");
        int sayi = k.nextInt();
        System.out.println(sayi + " " + (isAsal(sayi, sayi / 2) == 1 ? "Sayısı Asal Sayıdır" : "Sayısı Asal Sayı Değildir"));

    }
}

