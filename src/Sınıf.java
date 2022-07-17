import java.util.Scanner;
public class Sınıf {
    public static void main(String[] args) {
        int mat,fiz,tur,kim,muz;
        Scanner inport = new Scanner(System.in);

        System.out.print("Matematik notunuzu giriniz: ");
        mat = inport.nextInt();

        System.out.print("Fizik notunuzu giriniz: ");
        fiz = inport.nextInt();

        System.out.print("Türkçe notunuzu giriniz: ");
        tur = inport.nextInt();

        System.out.print("Kimya notunuzu giriniz: ");
        kim = inport.nextInt();

        System.out.print("Müzik notunuzu giriniz: ");
        muz = inport.nextInt();

        double avarage = (mat + fiz + tur + kim + muz) / 5;
            if(avarage <= 55){
                System.out.println("Sınıfta kaldı!.");
            }else{
                System.out.println("Sınıfı geçti. :)");
            }

            System.out.println("Ortalamanız: " + avarage);

    }
}
