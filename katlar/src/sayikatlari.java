import java.util.Scanner;
public class sayikatlari {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        System.out.print("kaç sayı girmek istersiniz ? : ");
        int a = k.nextInt();
        System.out.println("4 sayısının katları");

        for (int i = 1; i <=a; i *= 4) {
            System.out.println(i );
        }
        System.out.println("5 sayısının katları :");
        for (int j = 1; j <=a; j *= 5) {
            System.out.println(j);
        }

    }}