package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SortArray {
    static void main() {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n =sc.nextInt();
        int[] arr = new int[n];
        //taking array input from user
        System.out.print("write array elements  : ");
        for(int i=0; i<n ; i++){
            arr[i]=sc.nextInt();
        }
        //to display array
        System.out.println("Unsorted Array : ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+",");

        }
        //sorting given array
        Arrays.sort(arr);
        System.out.println();
        System.out.print("Arrays After Shorting : ");
        for (int i =0 ; i<n;i++){
            System.out.print(arr[i]+",");
        }


    }
}
