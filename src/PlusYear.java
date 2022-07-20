import java.util.Scanner;
public class PlusYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int year;

        System.out.print("Please type your birth year: ");
        year = input.nextInt();

        if (year % 4 == 0 || year % 400 == 0){
            System.out.println(year + " is a Plus Year.");
        }else{
            System.out.print(year + " is not a Plus Year.");
        }
    }
}
