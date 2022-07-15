import java.util.Scanner;
public class VücutKitle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int kilo;
        double boy, endeks;

        System.out.print("Boyunuzu metre cinsinden giriniz: ");
        boy = input.nextDouble();

        System.out.print("Kilonuzu giriniz: ");
        kilo = input.nextInt();

        endeks = kilo / (boy * boy);

        System.out.println("Vücut kitle endeksiniz: " + endeks);



    }
}
