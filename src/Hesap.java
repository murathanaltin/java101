import java.util.Scanner;

public class Hesap {
    public static void main(String[] args) {
        int n1,n2,select;
        Scanner input = new Scanner(System.in);

        System.out.print("ilk sayıyı giriniz: ");
        n1 = input.nextInt();

        System.out.print("ikinci sayıyı giriniz: ");
        n2 = input.nextInt();

        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.println("Hangi işlemi yapmak istiyorsunuz?: ");
        select = input.nextInt();

        switch (select) {
            case 1:
                System.out.println("Toplam: " + (n1 + n2));
                break;
            case 2:
                System.out.println("Sonuç: " + (n1 - n2));
                break;
            case 3:
                System.out.println("Sonuç: " + (n1 * n2));
                break;
            case 4:
                if (n1 < n2) {
                    System.out.println("ilk sayı ikinci sayıdan küçük olamaz!");
                }
                if (n2 > 0) {
                    System.out.println("Sonuç: " + (n1 / n2));
                }else{
                    System.out.println("Lütfen 0 harici bir değer giriniz!");
                }
                break;
            default:
                System.out.println("Lütfen geçerli bir değer giriniz!");
        }
    }
}