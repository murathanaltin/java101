package KdvTutarıHesaplama;

import java.util.Scanner;

public class Kdv {
    public static void main(String[] args) {
        int tut,kdv,kf;
        Scanner inp = new Scanner(System.in);
        System.out.print("Tutar giriniz: ");
        tut = inp.nextInt();

        kdv = (tut * 18/100);
        System.out.println("KDV: " + kdv);

        kf = tut+kdv;
        System.out.println("KDV'li fyat: " + kf);
    }
}
