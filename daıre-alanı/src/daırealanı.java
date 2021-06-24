import java.util.Scanner;
public class daırealanı {
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        int r;
        double alan,a,pi = 3.14;
        System.out.print("Daire yarı çapını giriniz : ");
        r = k.nextInt();
        System.out.print("Merkez açının ölçüsünü giriniz : ");
        a=k.nextDouble();

        alan = (pi * (r*r)* a) /360;
        System.out.println("Dairenin Alanı : " + alan);

    }
}
