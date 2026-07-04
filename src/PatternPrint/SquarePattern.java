package PatternPrint;


import java.util.Scanner;

public class SquarePattern {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number of rows:");
        int row=sc.nextInt();
        System.out.print("enter number of columns ");
        int column = sc.nextInt();
        for(int i =1;i<=row;i++){
            for(int j=1;j<=column;j++){
                System.out.print("*");

            }
            System.out.println();
        }
        sc.close();

    }
}
