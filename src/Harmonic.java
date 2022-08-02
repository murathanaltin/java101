import java.util.Scanner;

public class Harmonic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        double total = 0;

        System.out.print("Please enter N number: ");
        n = input.nextInt();

        for ( double i = 1; i <= n; i++ ) {
            total += (1/i);
        }

        System.out.println("Total: " + total);

    }
}
