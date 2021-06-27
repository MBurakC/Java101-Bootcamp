import java.util.Scanner;
public class Cinzodyak {
    public static void main(String[] args) {
        int dogumyıl ;
        int ay=12;
        Scanner k = new Scanner(System.in);
        System.out.print("dogum yılı giriniz : ");
        dogumyıl=k.nextInt();

        if(dogumyıl % ay == 0) {
            System.out.println("Çin Zodyağı Burcunuz :maymun");
        }else if(dogumyıl % ay ==1 ) {
            System.out.println("Çin Zodyağı Burcunuz :horoz");
        }else if(dogumyıl % ay ==2) {
            System.out.println("Çin Zodyağı Burcunuz köpek");
        }
        else if(dogumyıl % ay ==3) {
            System.out.println(" Çin Zodyağı Burcunuz  ; domuz");
        }else if(dogumyıl % ay ==4) {
            System.out.println("Çin Zodyağı Burcunuz ; fare");
        }else if(dogumyıl % ay ==5) {
            System.out.println("Çin Zodyağı Burcunuz ; öküz");
        }else if(dogumyıl % ay ==6) {
            System.out.println("Çin Zodyağı Burcunuz ; kaplan");
        }else if(dogumyıl % ay ==7) {
            System.out.println("Çin Zodyağı Burcunuz ; tavşan");
        }else if(dogumyıl % ay ==8) {
            System.out.println("Çin Zodyağı Burcunuz ; ejdarha");
        }else if(dogumyıl % ay ==9) {
            System.out.println("Çin Zodyağı Burcunuz ; yılan");
        }else if(dogumyıl % ay ==10) {
            System.out.println("Çin Zodyağı Burcunuz ; at");
        }else if(dogumyıl % ay ==11) {
            System.out.println("Çin Zodyağı Burcunuz ; koyun");
        }
        else {
            System.out.println("geçerli bir değer giriniz : ");
        }


    }
}
