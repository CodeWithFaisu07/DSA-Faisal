package Arrays;

import java.util.Scanner;

public class CheckIfShorted {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size of Array"); //-> size 0 5 10 20
        int n = sc.nextInt();
        int[] arr = new int[n];


        //taking input from user
        for (int i = 0; i <n-1 ; i++) {
            arr[i]=sc.nextInt();
        }


        // if user wants to make 0 size of Array
        if (n == 0){
            System.out.println("Invalid Array Size");
            return;
        }
        sc.close();

        //Condition Cheak Given Array is Sorted or Not
        boolean isSorted= true;
        for(int i = 0; i <n ; i++) {  // treversing Pattern
            if(arr[i]>arr[i+1]) {
                isSorted = false;
                break;
            }
        }
        if (isSorted==false) {
            System.out.println("array is not sorted Sort it now");
        } else if (isSorted == true) {
            System.out.println("Congrats! your Array is Sorted...");
        }

    }
}
