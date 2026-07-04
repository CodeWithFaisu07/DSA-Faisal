package PatternPrint;
import java.util.Scanner;

public class Factorial {
    static void main() {
     Scanner sc = new Scanner (System.in);
        System.out.print("Enter number of n:");
        int n= sc.nextInt();
        int fact=0;
        for (int i = 1; i <=n ; ++i) {
            fact*=i;

        }
        System.out.print(fact);
    }
}
