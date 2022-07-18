import java.util.Scanner;

public class Zodiac {
    public static void main(String[] args) {
        int m, d;
        Scanner input = new Scanner(System.in);

        System.out.print("Dogdugunuz ayi sayi degerinden giriniz: ");
        m = input.nextInt();

        System.out.print("Dogdugunuz gunu giriniz: ");
        d = input.nextInt();

        if ((d >= 1 && d <= 31) && (m >= 1 && m <= 31)) {
            if (m == 1) {
                if (d >= 22) {
                    System.out.println("Kova");
                } else {
                    System.out.println("Oglak");
                }
            } else if (m == 2) {
                if (d >= 20) {
                    System.out.println("Balik");
                } else {
                    System.out.println("Kova");
                }
            } else if (m == 3) {
                if (d >= 21) {
                    System.out.println("Koc");
                } else {
                    System.out.println("Balik");
                }
            } else if (m == 4) {
                if (d >= 21) {
                    System.out.println("Boga");
                } else {
                    System.out.println("Koc");
                }
            } else if (m == 5) {
                if (d >= 22) {
                    System.out.println("Ikizler");
                } else {
                    System.out.println("Boga");
                }
            } else if (m == 6) {
                if (d >= 23) {
                    System.out.println("Yengec");
                } else {
                    System.out.println("Ikizler");
                }
            } else if (m == 7) {
                if (d >= 23) {
                    System.out.println("Aslan");
                } else {
                    System.out.println("Yengec");
                }
            } else if (m == 8) {
                if (d >= 23) {
                    System.out.println("Basak");
                } else {
                    System.out.println("Aslan");
                }
            } else if (m == 9) {
                if (d >= 23) {
                    System.out.println("Terazi");
                } else {
                    System.out.println("Basak");
                }
            } else if (m == 10) {
                if (d >= 23) {
                    System.out.println("Akrep");
                } else {
                    System.out.println("Terazi");
                }
            } else if (m == 11) {
                if (d >= 22) {
                    System.out.println("Yay");
                } else {
                    System.out.println("Akrep");
                }
            } else if (m == 12) {
                if (d >= 22) {
                    System.out.println("Oglak");
                } else {
                    System.out.println("Yay");
                }
            }
        } else {
            System.out.println("Gecersiz bir deger girdiniz!");
        }
    }
}
