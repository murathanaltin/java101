import java.util.Scanner;

public class UsluSayi {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n, k, total = 1;

        System.out.print("Sayı: ");
        n = scan.nextInt();

        System.out.print("Üst: ");
        k = scan.nextInt();

        for (int i = 1; i <= k; i++) {
            total = total * n;
        }

        System.out.println("Cevap: " + total);

    }
}
