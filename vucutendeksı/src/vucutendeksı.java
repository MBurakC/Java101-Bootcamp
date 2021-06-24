import java.sql.SQLOutput;
import java.util.Scanner;
public class vucutendeksı {
    public static void main(String[] args) {
        Scanner k =new Scanner(System.in);
        int kilo;
        double boy,VKindeksi;
        System.out.print("Lütfen boyunuzu metre cinsinde giriniz : ");
        boy=k.nextDouble();
        System.out.print("Lütfen kilonuzu giriniz :");
        kilo=k.nextInt();
        VKindeksi=kilo/(boy*boy);
        System.out.println("Vücut Kitle İndeksiniz :" + VKindeksi);




    }









}
