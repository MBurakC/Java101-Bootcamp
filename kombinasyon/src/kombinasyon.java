
public class kombinasyon {
    public static void main(String[] args) {

        int n=4,r=2;
        int topn=1,topr=1,topkomb=1;
        int komb,kombfark;
        for(int i=1;i<=n;i++){
            topn=topn*i;
        }
        System.out.println(n + "sayısının faktöriyeli : "+ topn);
        for(int j=1;j<=r;j++) {
            topr = topr * j;

        }  System.out.println(r + "sayısının faktöriyeli : "+ topr);
        kombfark=n-r;
        for(int k=1;k<=kombfark;k++) {
            topkomb=topkomb*k;
        }
        komb=topn/(topr * topkomb);
        System.out.print("Sayıların kombinasyonu : "+ komb);

          }
}

