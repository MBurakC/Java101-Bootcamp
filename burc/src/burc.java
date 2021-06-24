import java.util.Scanner;
public class burc {
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        int g,a;        //gün ve ay değerlerini otomatik olarak (12 ay ve 31 gün) olarak sınırlandırdım.
        String burc = " ";
        System.out.print("Ay giriniz =");
        a=k.nextInt();
        if(a<1||a>12){
            a=k.nextInt();
        }
        System.out.print("Gün giriniz =");
        g=k.nextInt();
        if(g<1||g>31){
            g=k.nextInt();
        }
        if(a==1){
            if(g<=19){burc="oğlak";}
            if(g>19){burc="kova";}
        }
        if(a==2){
            if(g<=18){burc="kova";}
            if(g>18){burc="balık";}
        }
        if(a==3){
            if(g<=19){burc="balık";}
            if(g>19){burc="koç";}
        }
        if(a==4){
            if(g<=19){burc="koç";}
            if(g>19){burc="boğa";}
        }
        if(a==5){
            if(g<=20){burc="boğa";}
            if(g>20){burc="ikizler";}
        }
        if(a==6){
            if(g<=21){burc="ikizler";}
            if(g>21){burc="yengeç";}
        }
        if(a==7){
            if(g<=22){burc="yengeç";}
            if(g>22){burc="aslan";}
        }
        if(a==8){
            if(g<=22){burc="aslan";}
            if(g>22){burc="başak";}
        }
        if(a==9){
            if(g<=22){burc="başak";}
            if(g>22){burc="terazi";}
        }
        if(a==10){
            if(g<=22){burc="terazi";}
            if(g>22){burc="akrep";}
        }
        if(a==11){
            if(g<=21){burc="akrep";}
            if(g>21){burc="yay";}
        }
        if(a==12){
            if(g<=21){burc="yay";}
            if(g>21){burc="oğlak";}
        }
        System.out.print("Burcunuz : "+ burc);
    }
}



