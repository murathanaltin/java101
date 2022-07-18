import java.util.Scanner;

public class Sayilar {
    public static void main(String[] args) {
        int a, b, c;
        Scanner input = new Scanner(System.in);

        System.out.print("1. sayıyı giriniz: ");
        a = input.nextInt();

        System.out.print("2. sayıyı giriniz: ");
        b = input.nextInt();

        System.out.print("3. sayıyı giriniz: ");
        c = input.nextInt();

        if ((a > b) && (a > c)) {
            if (b > c) {
                System.out.println("1 > 2 > 3");
            } else {
                System.out.println("1 > 3 > 2");
            }
        } else if ((b > a) && (b > c)) {
            if (a > c) {
                System.out.println("2 > 1 > 3");
            } else {
                System.out.println("2 > 3 > 1");
            }
        } else {
            if (b > a) {
                System.out.println("3 > 2 > 1");
            } else {
                System.out.println("3 > 1 > 2");
            }
        }
    }
}

