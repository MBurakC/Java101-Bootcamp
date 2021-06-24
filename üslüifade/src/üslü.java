import java.util.Scanner;
public class üslü {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        System.out.print("taban sayınzı giriniz : ");
        int a=k.nextInt();
        System.out.print("üs sayınızı giriniz : ");
        int b=k.nextInt();
        int sonuc=1;
        for(int i =0;i<b;i++){
                sonuc=sonuc*a;
        }
        System.out.println(sonuc);

    }
}
