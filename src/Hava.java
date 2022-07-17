import java.util.Scanner;

public class Hava {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int hav;

        System.out.print("Hava sıcaklığı: ");
        hav = input.nextInt();

        if (hav < 5) {
            System.out.println("Kayak yapabilirsin!");
        } else if (hav >= 5 && hav <= 25) {
            if (hav <= 15) {
                System.out.println("Sinemaya gidebilirsin!");
            }
            if (hav >= 10)
                System.out.println("Pikniğe gidebilirsin!");
        } else {
            System.out.println("Yüzebilirsin!");
        }
    }
}
