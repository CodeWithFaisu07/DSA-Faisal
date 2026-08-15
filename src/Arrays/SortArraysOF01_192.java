package Arrays;

import java.util.Arrays;

public class SortArraysOF01_192 {
    static void main() {
        int[] arr = {0,1,0,0,1,1,1,0,0,1,0};
        int n = arr.length;
        int noofOnes = 0;
        int noofZeros = 0;
//        System.out.println("Arrays Without Sorting...");
//        for(int i = 0 ; i<arr.length ; i++){
//            System.out.print(arr[i]+",");
//        }
        //method no one
//        System.out.println();
//        Arrays.sort(arr);
//        System.out.println("Arrays After Sorting...");
//        for(int i = 0 ; i<arr.length ; i++){
//            System.out.print(arr[i]+",");
//        }


       // Method 2 Manually
        for(int i = 0;i<arr.length;i++){
            if(arr[i]==0)  noofZeros++;
            else noofOnes++;
        }
        for(int i = 0;i<arr.length;i++){
            if(i<noofZeros) arr[i]= 0;
            else arr[i] = 1;

        }

//        //Method 3
//        int i = 0 ; int j =n-1;
//        while (i<j) {
//            if (arr[i] == 0) i++;
//            if (arr[j] == 1) j--;
//            if (arr[i] == 1 && arr[j] == 0){
//            arr[i] = 0;
//            arr[j] = 1;
//            i++;
//            j--;
//        }
//        }


        System.out.println();
       for (int ele : arr){
           System.out.print(ele);
       }

    }
}
