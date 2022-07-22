import java.util.Scanner;

public class Number34 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n,i,top = 0,sa = 0;
        double ort;
        n = inp.nextInt();
        for (i=1; i<=n; i++){
            if (i%3==0 || i%4==0){
                top += i;
                sa++;
            }
        }
        ort = top/sa;
        System.out.println(ort);
    }
}
