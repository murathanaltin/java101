package NotOrtalamasıHesaplama;

import java.util.Scanner;

public class Not {
    public static void main(String[] args) {

        // Değişkenleri oluştur
        int mat,fizik,kimya,turkce,tarih,muzik;

        // Scanner sınıfı tanımlandı
        Scanner inp = new Scanner(System.in);

        //Kullanıcıdan matematik değerini al
        System.out.print("Matematik notu: ");
        mat = inp.nextInt();

        System.out.print("Fizik notu: ");
        fizik = inp.nextInt();

        System.out.print("Kimya notu: ");
        kimya = inp.nextInt();

        System.out.print("Turkce notu: ");
        turkce = inp.nextInt();

        System.out.print("Tarih notu: ");
        tarih = inp.nextInt();

        System.out.print("Muzik notu: ");
        muzik = inp.nextInt();

        int toplam = (mat + fizik + kimya + tarih + turkce + muzik);
        double sonuc = toplam / 6;

        System.out.println("Ortalama: " + sonuc);

        String snc = sonuc >= 60 ? "Basarili" : "Basarisiz";
        System.out.println(snc);

    }
}
