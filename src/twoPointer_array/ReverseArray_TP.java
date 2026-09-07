package twoPointer_array;
// Reverse Array using Two Pointer
// if you just Want to Print a reverse of Array then you can only Print it through using a for loop
//but in this Case we Want to Convert a array from its reverse positions and we are not just printing reverse of array we are Converting array Positions inside memory
// so the Optimal solution for this Question is using two Pointer we can reverse a array in o(n) complexity

public class ReverseArray_TP {
    static void main() {
        int [] arr = {10,20,30,40};
        int n = arr.length;
        int left = 0;
        int right = n-1;
        while (left<right){
            int temp = arr[left];
            arr[left]= arr[right];
            arr[right]= temp;
            left++;
            right--;
        }
        for(int ele: arr){
            System.out.print(ele+" ");
        }
    }
}
