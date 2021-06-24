import java.util.Scanner;
import java.util.Set;

public class manavhesap {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        double TopTutar,Armut = 2.14 ,Elma = 3.67 ,Domates = 1.11 ,Muz= 0.95 ,Patlıcan = 5.00;
        System.out.print("Armut Kaç Kilo ? :");
        Armut=k.nextDouble();
        System.out.print("Elma Kaç Kilo ? :");
        Elma=k.nextDouble();
        System.out.print("Domates Kaç Kilo ? :");
        Domates=k.nextDouble();
        System.out.print("Muz Kaç Kilo ? :");
        Muz=k.nextDouble();
        System.out.print("Patlıcan Kaç Kilo ? :");
        Patlıcan=k.nextDouble();
        TopTutar=(2.0*Armut)+(1.5*Elma)+(3.0*Domates)+(5.0*Muz)+(2.50*Patlıcan);
        System.out.println("Toplam Tutar : "+ TopTutar);





    }

}
