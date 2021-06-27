import java.util.Scanner;
public class ObebOkek {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        System.out.print("İki sayı giriniz : ");
        int n1 = k.nextInt(), n2 = k.nextInt(), okek,obeb=1;
        okek= (n1 > n2) ? n1 : n2;
        while(true)
        {
            if( okek % n1 == 0 && okek % n2 == 0 )
            {
                System.out.printf("Sayıların EKOK'u %d \n", n1, n2, okek);
                break;
            }
            ++okek;
        }
        while(n1 != n2)
        {
            if(n1 > n2)
                n1 -= n2;
            else
                n2 -= n1;
        }
        System.out.println("EBOB'u = " + n1);
    }
}
