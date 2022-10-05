import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        double fiyat,kdv0=0.18,kdv1000=0.08,kdvtutar,sonfiyat;
        System.out.print("Ürün fiyatını giriniz: ");
        Scanner input = new Scanner(System.in);
        fiyat = input.nextDouble();
        boolean kosul=(fiyat<=1000);
        double sayi=kosul ? (kdvtutar=fiyat*kdv0):(kdvtutar=fiyat*kdv1000);
        sonfiyat=kdvtutar+fiyat;
        System.out.println("Kdv dahil fiyat: "+sonfiyat);
        System.out.print("Kdv tutarı: "+kdvtutar);
      }
}