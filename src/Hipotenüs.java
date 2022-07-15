import java.util.Scanner;
public class Hipotenüs {
    public static void main(String[] args) {
        // Dik üçgen kenar bilgileri
        Scanner input = new Scanner(System.in);
        int a,b;
        double c;
        System.out.print("'a' kenarı uzunluğunu giriniz: ");
        a = input.nextInt();
        System.out.print("'b' kenarı uzunluğunu giriniz: ");
        b = input.nextInt();
        c = Math.sqrt((a*a) + (b*b));
        System.out.print("Hipotenüs: " + c);
    }
}
