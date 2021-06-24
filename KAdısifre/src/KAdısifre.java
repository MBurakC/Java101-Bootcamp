import java.util.Scanner;
public class KAdısifre {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        String KAdı = "Burak";
        int sifre = 565656;
        System.out.print("Kullanici adinizi giriniz: ");
        String s = k.nextLine();
        System.out.print("Sifreyi giriniz: ");
        int sifre1 = k.nextInt();
        if(s.equals(KAdı) && sifre1== sifre){
            System.out.println("hosgeldiniz");
        }
        else{
            System.out.println("Giriş Başarısız");
            System.out.print("Sifrenizi sıfırlamak ister misiniz? 1-evet||2-hayır: ");
            int deger = k.nextInt();
            switch(deger){
                case 1:
                    System.out.print("Yeni sifrenizi giriniz: ");
                    int yeniSifre = k.nextInt();
                    if(yeniSifre == sifre || yeniSifre == sifre1){
                        System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz");
                    }else{
                        System.out.println("Sifre olusturuldu");
                        sifre = yeniSifre;
                    }
                    break;
                case 2:
                    System.out.println("Şifre sıfırlama iptal edildi");
                    break;

            }
        }

            }

            }


















