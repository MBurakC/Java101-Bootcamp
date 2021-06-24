public class polindrom {
    public static boolean polindrom(int sayi) {
        int gecici = sayi, ilksayi = 0, kalan;
        while (gecici != 0) {
            kalan = gecici % 10;
            ilksayi = (ilksayi * 10) + kalan;
            gecici /= 10;
        }
            if (sayi == ilksayi)
                return true;
            else
                return false;
        }

    public static void main(String[] args){
            System.out.println(polindrom(9889));

    }
}
