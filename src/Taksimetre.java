import java.util.Scanner;
public class Taksimetre {
    public static void main(String[] args) {
        int km;
        double perKM = 2.20, total, startPrice = 10;

        Scanner girdi = new Scanner(System.in);
        System.out.print("KM giriniz: ");
        km = girdi.nextInt();

        total = km * perKM;
        total += startPrice;

        total = (total <20) ? 20 : total;

        System.out.print("Toplam ücret: " + total);

    }
}
