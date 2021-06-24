import java.util.Scanner;
public class Hava {
    public static void main(String[] args) {
        Scanner k =new Scanner(System.in);
        System.out.print("Hava sıcaklığı kaç derece ? : ");
        int hava = k.nextInt();
        if (hava<=5){
            System.out.println("Kayak yapmaya elverişli :) ");
        }
        else if(hava>5 || hava<=15){
            System.out.println("Sinemaya gitmek için müthiş");
        }
        else if(hava>10 || hava<=25){
            System.out.println("Piknik yapmak için neyi bekliyorsun :) ");
        }
        else if(hava>25){
            System.out.println("Bu havada Yüzmeye gitmek hoş olur :) ");
        }
     }
    }

