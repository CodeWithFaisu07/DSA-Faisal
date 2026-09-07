package Arrays;

import java.util.Scanner;

public class RotateArray {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int[] arr = {10,20,30,40,50,60,70};
        int n = arr.length;
        // 1Step  adding k Elements inside a temp Variable:
        System.out.print("Rotated Steps:");
        int k = sc.nextInt();
        k = k%n;
        int[] temp=new int[k] ;
        for(int i = 0;i<k;i++){
            temp[i]=arr[i];
        }

        // step 2  Moving k Element ahead : index 0 to arr.length
        for(int i = k;i<n;i++){
            arr[i-k]=arr[i];
        }

        // step 3 left rotate k values(which's store in temp) after k element

        for (int i = n-k ; i<n; i++) {
            arr[i] = temp[i-(n-k)];
        }
        for(int ele: arr){
            System.out.print(ele+",");
        }



    }
}
