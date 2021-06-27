import java.util.Scanner;
public class atm {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        int bakiye = 5000;

        System.out.println("Bakiyeniz = " + bakiye);
        System.out.println("  MENÜ  ");
        System.out.println("1 -> Para Çekme");
        System.out.println("2 -> Para Yatırma");
        System.out.println("3 -> Bakiye sorgulama");
        System.out.println("4 -> Kart İade");

        System.out.print("\nİşleminizi Seçiniz: ");
        int islem = k.nextInt();

        switch(islem) {
            case 1:
                System.out.println("Bakiyeniz = " + bakiye);
                System.out.print("Çekmek istediğiniz tutarı giriniz: ");
                int tutar = k.nextInt();
                if(tutar > bakiye) {
                    System.out.print("Yetersiz bakiye !");
                    tutar = k.nextInt();
                }
                bakiye -= tutar;
                System.out.println("Yeni bakiyeniz = " + bakiye);
                break;
            case 2:
                System.out.println("Bakiyeniz = " + bakiye);
                System.out.print("Yatırmak istediğiniz tutarı giriniz: ");
                tutar = k.nextInt();
                bakiye += tutar;
                System.out.println("Yeni bakiyeniz = " + bakiye);
                break;
            case 3:
                System.out.println("Bakiyeniz = " + bakiye);
                break;
            case 4:
                System.out.println("Kartınızı almayı unutmayınız.!!");
            default:
                System.out.println("Yanlış işlem şecitiniz ! lütfen menü içinden seçim yapınız.");
        }
    }
}

