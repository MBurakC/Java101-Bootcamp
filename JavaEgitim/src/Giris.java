import java.util.Scanner;

public class Giris {

    public static void main(String[] args) {
        int matematik = 60,fizik = 65,kimya = 60,turkce = 61,tarih = 80,muzik = 40;
        int ort = (matematik+fizik+kimya+turkce+tarih+muzik)/6;
        switch  (ort/60) {
            case 0:
                System.out.println("Sınıfta Kaldınız.");
                break;
            case 1:
                System.out.println("Sınıfı Geçtiniz.");
                break;
        }}}



