import java.util.Scanner;
public class Tbolunen {
    public static void main(String[] args) {

        Scanner k=new Scanner(System.in);
        int N=5;
        int toplam=0; double ort; int sayi;

        for (int i=0;i<=N;i++) {
            System.out.print(i+".sayi=");
            sayi=k.nextInt();
            toplam=toplam+sayi;
        }
        ort=toplam/N;
        System.out.print("Sonuç="+ort);
    }
}


