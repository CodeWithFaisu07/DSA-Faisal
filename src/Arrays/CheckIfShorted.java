package Arrays;

import java.util.Scanner;

public class CheckIfShorted {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size of Array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        //taking input from user
        for (int i = 0; i <n ; i++) {
            arr[i]=sc.nextInt();

        }
        //to print ouput
        for(int i = 0; i <n ; i++) {
            if(arr[i]>arr[i+1]) {
                System.out.println("not soted");
                break;

            } else System.out.println("arr is sorted");
            break;

        }


    }
}
