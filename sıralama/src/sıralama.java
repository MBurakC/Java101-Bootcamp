import java.util.Scanner;
public class sıralama {
    public static void main(String[] args) {
        Scanner k= new Scanner(System.in);
        int s1,s2,s3;
        System.out.print("İlk sayınızı giriniz : ");
        s1 =k.nextInt();
        System.out.print("İkinci sayınızı giriniz : ");
        s2=k.nextInt();
        System.out.print("Üçüncü sayınızı giriniz : ");
        s3=k.nextInt();
        if(s1>s2 && s1>s3) {
            if (s2 > s3) {
                System.out.println("s1>s2>s3");
            } else {
                System.out.println("s1>s3>s2");
            }
        }else if(s2>s1 && s2>s3) {
            if (s1 > s3) {
                System.out.println("s2>s1>s3");
            } else {
                System.out.println("s2>s3>s1");
            }
        }else if (s3>s1 && s3>s2){
                    if(s1>s2){
                        System.out.println("s3>s1>s2");
                    }
                    else{
                        System.out.println("s3>s2>s1");
                    }
            }
        }
    }

