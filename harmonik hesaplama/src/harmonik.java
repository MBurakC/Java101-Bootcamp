import java.util.Scanner;
public class harmonik {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        System.out.println("N sayısını giriniz :");
        double n = k.nextInt();
        double result = 0;
        while (n > 0) {
            result += (1 / n);
            n--;
        }

        System.out.println(result);
    }
}

