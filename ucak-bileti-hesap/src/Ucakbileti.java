import java.util.Scanner;
public class Ucakbileti {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        System.out.print("Mesafeyi Km turunden giriniz: "); int km = k.nextInt();
        System.out.print("Yaşınızı giriniz: "); int yas = k.nextInt();
        System.out.print("Yolculuk tipi seciniz (1-Tek Yönlü uçuş ||2-Gidiş Dönüş): "); int secim = k.nextInt();
        if(km>0 && yas>0 && secim==1 || secim==2){
            int baslangicFiyati = (int) (km * 0.10);
            System.out.println("Normal Tutar: "+baslangicFiyati);
            if(yas<12 && secim==1){
                int indirimli = (int) (baslangicFiyati*0.50);
                baslangicFiyati -= indirimli;
                System.out.println("İndirimli tutar: "+baslangicFiyati);
            }
            else if(yas>=12 || yas<=24 && secim==1){
                int indirimli = (int) (baslangicFiyati*0.10);
                baslangicFiyati -= indirimli;
                System.out.println("İndirimli tutar: "+baslangicFiyati);
            }
            else if(yas>=65 && secim==1){
                int indirimli = (int) (baslangicFiyati*0.30);
                baslangicFiyati -= indirimli;
                System.out.println("İndirimli tutar: "+baslangicFiyati);
            }
            else if(yas<12 && secim==2){
                int indirimli = (int) (baslangicFiyati*0.50);
                int indirimliTutar = baslangicFiyati-indirimli;
                int donusIndirim = (int) (indirimliTutar*.20);
                baslangicFiyati = (indirimliTutar-donusIndirim)*2;
                System.out.println("İndirimli tutar: "+baslangicFiyati);
            }
            else if(yas>=12 || yas<=24 && secim==2){
                int indirimli = (int) (baslangicFiyati*0.10);
                int indirimliTutar = baslangicFiyati-indirimli;
                int donusIndirim = (int) (indirimliTutar*0.20);
                baslangicFiyati = (indirimliTutar-donusIndirim)*2;
                System.out.println("İndirimli tutar: "+baslangicFiyati);
            }
            else if(yas>=65 && secim==2){
                int indirimli = (int) (baslangicFiyati*0.30);
                int indirimliTutar = baslangicFiyati-indirimli;
                int donusIndirim = (int) (indirimliTutar*0.20);
                baslangicFiyati = (indirimliTutar-donusIndirim)*2;
                System.out.println("İndirimli tutar: "+baslangicFiyati);
            }
        }
           else {
            System.out.println("Hatalı Bilgi Girdiniz");
        }
    }
}

