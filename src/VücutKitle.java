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

        if (endeks < 18.5) {
            System.out.println("Zayıfsınız!");
        } else if (endeks > 18.5 && endeks < 24.9) {
            System.out.println("Kilonuz normal");
        } else if (endeks > 24.9 && endeks < 29.9) {
            System.out.println("Kilolu");
        } else {
            System.out.println("Obezsiniz");
        }
    }
}
