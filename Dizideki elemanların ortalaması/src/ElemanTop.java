public class ElemanTop {
    public class Ortalama {

        public static void main(String[] args) {
            int i, n;
            int dizi[] = {1, 2, 3, 4, 5};
            double ort = 0;

            for (i = 0; i < dizi.length; i++) {
                ort = ort + (1.0 / dizi[i]);
            }
            ort = dizi.length / ort;
            System.out.println("Ortalama : " + ort);
        }

    }
}
