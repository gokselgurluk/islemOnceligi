import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       
       int a,b,c,islem;
      //kullanicidan girdi alabilmek icin scanner sınıfını tanımladık
       Scanner input = new Scanner(System.in);
        //kullanicidan 3 adet sayı almak ici ekrana bilgi bastırdık ver degiskene atadik
        System.out.print("a sayisini giriniz: ");
            a= input.nextInt();
        System.out.print("b sayisini giriniz: ");
            b= input.nextInt();
        System.out.print("c sayisini giriniz: ");
            c= input.nextInt();
            //islemi belirledik ve islemi degiskenine atadik
            islem = (a+b*c-b);
                //sonucu kullanici göremesi icin ekrana bastirdik
                System.out.print("SONUC: "+islem);
    }
}