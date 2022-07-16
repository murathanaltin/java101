import java.util.Scanner;

public class Kullanici {
    public static void main(String[] args) {

        String username,password;
        Scanner input = new Scanner(System.in);

        System.out.println("Username: ");
        username = input.nextLine();

        System.out.println("Password: ");
        password = input.nextLine();

        if (username.equals("patika") && password.equals("java123")) {
            System.out.println("Giriş yapıldı.");
        }else{
                System.out.println("Bilgileriniz yanlış!");
            }
        }
    }

