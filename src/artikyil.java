import java.util.Scanner;
public class artikyil {
    public static void main(String[] args) {
        int yil;
        int deger =4;
        Scanner k = new Scanner(System.in);
        System.out.print("doğum yılınızı giriniz :");
        yil = k.nextInt();

        if(yil % deger ==0) {
            System.out.println(yil+" "+"artık yıldır !");
        }else {
            System.out.println(yil+" "+"artık yıl değildir ! ");

        }

    }

}
