import java.util.Scanner;

public class PlaneTicketCalculaltion {
    public static void main(String[] args) {
        int distance, age, direction;
        double cost, totalcost;
        Scanner input = new Scanner(System.in);

        System.out.print("Please input the distance(KM) : ");
        distance = input.nextInt();

        System.out.print("Please input your age: ");
        age = input.nextInt();

        cost = distance * 0.10;

        if (distance > 0 && age > 0) {

            System.out.println("Please choose your direction:\n1-One way\n2-Go and back");
            direction = input.nextInt();

            if (age < 12) {
                totalcost = cost / 2;
            } else if (age < 24) {
                totalcost = cost * 0.9;
            } else if (age > 65) {
                totalcost = cost * 0.7;
            } else {
                totalcost = cost;
            }

            switch (direction) {
                case 1:
                    System.out.println("Total cost is: " + totalcost + " TL");
                    break;
                case 2:
                    System.out.println("Total cost is: " + totalcost * 0.8 + " TL");
            }
        } else {
            System.out.println("Please type a valid number!");
        }
    }
}
