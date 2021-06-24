import java.sql.SQLOutput;
import java.util.Scanner;
public class CiftSayıbulan {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        System.out.println("kaç sayı girmek istersiniz : ");
        int a=k.nextInt();
        int s;
        int top=0;
        for (int i=0;i<a;i++){
            System.out.print("sayınızı giriniz : ");
            s=k.nextInt();
        if (s%4==0){

            top=top+s;
            System.out.println("tam bölen sayıların toplamı : "+ top );
        }
        else {
            System.out.println("tek sayı girmeyiniz !! ");

        }
        }
    }


    }



