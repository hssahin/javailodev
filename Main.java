import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        //değişkenler
        int mat, fizik, kimya, turkce, tarih, muzik;
        Scanner input = new Scanner(System.in);
        System.out.print("matematik notunu giriniz");
        mat = input.nextInt();

        System.out.print("fizik notunu giriniz");
        fizik = input.nextInt();

        System.out.print("kimya notunu giriniz");
        kimya = input.nextInt();

        System.out.print("turkce notunu giriniz");
        turkce = input.nextInt();

        System.out.print("muzik notunu giriniz");
        muzik = input.nextInt();

        System.out.print("tarih notunu giriniz");
        tarih=input.nextInt();

        System.out.print("matematik notunu giriniz");
        mat = input.nextInt();
       int toplam= (mat+fizik+kimya+tarih+turkce+muzik);
       double ort=toplam/6.0;
        System.out.println("ortalamanız:"+ort);

        boolean kosul= ort>=50;

        String str= kosul ? "gecti" : "kaldi";
        System.out.print(str);
}
}