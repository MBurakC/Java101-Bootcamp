import java.util.Scanner;

public class DeseneGöreMetot {
    public static void metotDeseni(int sayi, int t, boolean status) {

        if (sayi <= t) {
            System.out.println(sayi);
            if (sayi > 0 && !status) {
                metotDeseni(sayi-5,t,false);
            }else{
                metotDeseni(sayi+5,t,true);
            }
        } }
    public static void main(String[] args) {

        Scanner k = new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz: ");
        int sayi = k.nextInt();
        int t = sayi;
        metotDeseni(sayi,t,false);
    }
}

