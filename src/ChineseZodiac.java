import java.util.Scanner;
public class ChineseZodiac {
    public static void main(String[] args) {
        int year,result;
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter your birth year: ");
        year = input.nextInt();

        result = year % 12;

        switch (result){
            case 0:
                System.out.println("Your Chinese Zodiac Sign is: Monkey");
                break;
            case 1:
                System.out.println("Your Chinese Zodiac Sign is: Cock");
                break;
            case 2:
                System.out.println("Your Chinese Zodiac Sign is: Dog");
                break;
            case 3:
                System.out.println("Your Chinese Zodiac Sign is: Pig");
                break;
            case 4:
                System.out.println("Your Chinese Zodiac Sign is: Rat");
                break;
            case 5:
                System.out.println("Your Chinese Zodiac Sign is: Ox");
                break;
            case 6:
                System.out.println("Your Chinese Zodiac Sign is: Tiger");
                break;
            case 7:
                System.out.println("Your Chinese Zodiac Sign is: Rabbit");
                break;
            case 8:
                System.out.println("Your Chinese Zodiac Sign is: Dragon");
                break;
            case 9:
                System.out.println("Your Chinese Zodiac Sign is: Snake");
                break;
            case 10:
                System.out.println("Your Chinese Zodiac Sign is: Horse");
                break;
            case 11:
                System.out.println("Your Chinese Zodiac Sign is: Sheep");
                break;
        }
    }
}
