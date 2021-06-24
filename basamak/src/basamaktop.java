import java.util.Scanner;
public class basamaktop {
    public static void main(String[] args) {
        Scanner k = new Scanner (System.in);
        System.out.print("sayınızı giriniz : ");
        int sayı=k.nextInt();
        int eldeki=0,sayac=0;
        while (sayı != 0) {
            eldeki=sayı%10+eldeki;
           sayı /= 10;

            sayac++;}

        System.out.println(eldeki);

    }}
