import java.util.Scanner;
public class hesapmakınesı {
    public static void main(String[] args) {
        Scanner k= new Scanner(System.in);
        int s1,s2,islem;
        System.out.print("ilk sayınızı giriniz : ");
        s1=k.nextInt();
        System.out.print("ikinci sayınızı giriniz : ");
        s2=k.nextInt();
        System.out.println("1-Toplam\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.print("lütfen işleminizi giriniz : ");
        islem=k.nextInt();
        switch (islem) {
            case 1 :
                System.out.println("işlem sonucunuz = "+ (s1+s2));
                break;
            case 2 :
                System.out.println("işlem sonucunuz = "+ (s1-s2));
                break;
            case 3:
                System.out.println("işlem sonucunuz = "+ (s1*s2));
                break;
            case 4 :
                System.out.println("işlem sonucunuz = "+ (s1/s2));
                break;
        }

    }

}
