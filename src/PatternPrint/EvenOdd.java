package PatternPrint;
import java.util.Scanner;
public class EvenOdd {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of n to cheak wheather the number is even or not : ");
        int n= sc.nextInt();
        sc.close();
        // program logic
        if(n % 2 == 0) System.out.println(n + "  is an even number ");
        else if(n % 2 != 0) System.out.println(n + "  is a odd number");
        else if (n == 0 ) System.out.println("zero is not even and odd ");
    }
}
