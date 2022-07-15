import java.util.Scanner;
public class Manav {
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        double armut = 2.14, elma = 3.67, domates = 1.11, muz = 0.95, patlican = 5, fiyat,kilo,armutt,elmat,domatest,muzt,patlicant;

        System.out.print("armut kilo?: ");
        kilo = girdi.nextDouble();
        armutt = kilo * armut;

        System.out.print("elma kilo?: ");
        kilo = girdi.nextDouble();
        elmat = kilo * elma;

        System.out.print("domates kilo?: ");
        kilo = girdi.nextDouble();
        domatest = kilo * domates;

        System.out.print("muz kilo?: ");
        kilo = girdi.nextDouble();
        muzt = kilo * muz;

        System.out.print("patlıcan kilo?: ");
        kilo = girdi.nextDouble();
        patlicant = kilo * patlican;

        fiyat = armutt + elmat + domatest + muzt + patlicant;
        System.out.print("Toplam tutar: " + fiyat);

    }
}
