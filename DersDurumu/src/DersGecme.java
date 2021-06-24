import java.util.Scanner;
public class DersGecme {
    public static void main(String[] args) {
        Scanner k= new Scanner (System.in);
        int mat,fizik,turkce,kimya,muzik;
        System.out.print("Matematik notunuz : ");
        mat =k.nextInt();
        System.out.print("Fizik notunuz : ");
        fizik =k.nextInt();
        System.out.print("Türkçe notunuz : ");
        turkce =k.nextInt();
        System.out.print("Kimya notunuz : ");
        kimya =k.nextInt();
        System.out.print("Müzik notunuz : ");
        muzik =k.nextInt();
        if(mat<0 && mat>100){
            System.out.println("notunuz değer aralığında değil !!");
        if(fizik<0 && fizik>100)
            System.out.println("notunuz değer aralığında değil !!");
        if(turkce<0 && turkce>100)
            System.out.println("notunuz değer aralığında değil !!");
        if(kimya<0 && kimya>100)
            System.out.println("notunuz değer aralığında değil !!");
        if(muzik<0 && muzik>100)
            System.out.println("notunuz değer aralığında değil !!");
        }
        double ort = (mat+fizik+turkce+kimya+muzik)/5;
        if(ort>=55){
            System.out.println("Notunuz = " + ort + ": Tebrikler Sınıfı Geçtiniz :) ");
        }
        else {
            System.out.println("Notunuz = " + ort + ": Sınıfı Geçemediniz :( ");
        }


    }
}
