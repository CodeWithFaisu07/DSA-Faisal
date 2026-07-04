package Arrays;

public class LargestElement {
    static void main() {
        int[] arr = {10, 15, 20, 25, 35, 23};
        int mx = Integer.MIN_VALUE;
        for(int i =0; i<arr.length; i++){
//            if(arr[i]>mx) mx=arr[i];   1st method where we
            mx=Math.max(arr[i] ,mx);
        }
        System.out.print("the largest number of array is : "+ mx);
    }
}
