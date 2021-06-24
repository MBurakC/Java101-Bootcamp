import java.util.Scanner;
public class Hesap {
    public static void main(String[] args) {
        Scanner k =new Scanner(System.in);
        double KDVOranı=0.18,KDVliFiyat,Tutar,KDVliTutar;
        System.out.print("Tutarınızı giriniz = ");
        Tutar=k.nextDouble();
        if(Tutar>1 && Tutar<1000 ){
            KDVOranı=0.18;
            KDVliTutar=KDVOranı*Tutar;
            System.out.println("KDV'li Tutar = " +KDVliTutar );}
        else {
            KDVOranı=0.08;
            KDVliTutar=KDVOranı*Tutar;
            System.out.println("KDV'li Tutar = " +KDVliTutar );}

        }






    }

