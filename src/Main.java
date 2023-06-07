import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Değişkenlerin tanımlanması
        int kilo;
        double boy;

        //Scanner sınıfı
        Scanner imp = new Scanner(System.in);

        //Kullanıcıdan değerlerin alınıp ilgili değişkenlere atanması
        System.out.print("Lütfen boyunuzu metre cinsinden giriniz: ");
        boy = imp.nextDouble();
        System.out.print("Lütfen kilonuzu kilogram cinsinden giriniz: ");
        kilo = imp.nextInt();

        //İlgili hesaplamaların yapılması ve ekrana yazdırılması
        double vki = kilo / (boy * boy);
        System.out.println("Vücut kitle endeksiniz: " + vki);
    }
}