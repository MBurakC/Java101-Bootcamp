import java.util.Scanner;
public class taksımetre {
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        int km,acılısucretı=10;
        double basKM=2.20 ,tophesap;
        System.out.print("Gidilecek mesafe uzaklığı giriniz = ");
        km=k.nextInt();
        tophesap=acılısucretı+(km*basKM);
        tophesap=(tophesap<20) ? 20 : tophesap;
        System.out.println("Ödemeniz gereken tutarınız = " + tophesap);


    }
}
