import java.util.Scanner;

public class ust2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;

        System.out.print("Number: ");
        number = input.nextInt();

        for (int i = 1; i <= number; i *= 4) {
            System.out.println(i);
        }

        for (int i = 1; i <= number; i *= 5) {
            System.out.println(i);
        }
    }
}
