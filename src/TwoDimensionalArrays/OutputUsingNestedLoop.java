package TwoDimensionalArrays;
import java.util.Scanner;

public class OutputUsingNestedLoop {
    static void main() {
        Scanner sc = new Scanner(System.in);

        //Declearation of 2D array
        int[][] arr = new int[2][3];

//        //Initialization of 2D array manually
//        arr[0][0]= 10;
//        arr[0][1]= 20;
//        arr[0][2]= 30;
//        arr[1][0]= 40;
//        arr[1][1]= 50;
//        arr[1][2]= 60;

    // We can also Take Input from user
        System.out.println("Enter Elements of Array :");
        for (int i = 0; i < 2; i++) {  // for rows
            for(int j = 0; j <3;j++){  // for columns
                arr[i][j]= sc.nextInt();
            }


        }







        //Print s Value of this array Using Nested Loop
        for (int i = 0; i < 2; i++) {  // for rows
            for(int j = 0; j <3;j++){  // for columns
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();

        }
         // we can also Find Length
        int m = arr.length; // for rows / lines
        int n = arr[0].length; // for cols
        System.out.println("Length of Rows/ Lines : "+m);
        System.out.println(" Length of cols : "+ n);
    }
}
