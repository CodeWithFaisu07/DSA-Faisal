package PatternPrint;

import java.util.Scanner;

public class NumberSquare01 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("number Square column print pattern:  ");
        System.out.print("Enter number of rows: ");
        int m= sc.nextInt();
        System.out.print("Enter number of columns: ");
        int n= sc.nextInt();
        for(int i = 1 ; i<=m; i++){
            for(int j = 1;j <= n; j++)
                System.out.print(i);
            System.out.println();
        }
        System.out.println("print number square row ");
        for(int i = 1 ; i<=m; i++){
            for(int j = 1;j <= n; j++)
                System.out.print(j);
            System.out.println();
        }
        sc.close();

    }
}
