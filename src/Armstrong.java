import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        int number;
        int total=0;
        Scanner input = new Scanner(System.in);
        System.out.print("Type a number: ");
        number = input.nextInt();

        while ( number != 0 ) {
            total += number % 10;
            number /= 10;
        }
        System.out.println("Total: " + total);
    }
}