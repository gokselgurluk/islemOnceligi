import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       
       int a,b,c,islem;
       
       Scanner input = new Scanner(System.in);

        System.out.print("a sayisini giriniz");
        a= input.nextInt();
        System.out.print("b sayisini giriniz");
        b= input.nextInt();
        System.out.print("c sayisini giriniz");
        c= input.nextInt();
        islem = ( a+b*c-b);
        System.out.print("SONUC: "+islem);
    }
}