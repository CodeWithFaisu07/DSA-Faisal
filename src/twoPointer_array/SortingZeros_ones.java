package twoPointer_array;

//Ques short the Given zeros or ones

public class SortingZeros_ones {
    static void main() {
        int [] arr = {1,0,0,1,1,1,0,0,1,0};
        int n = arr.length;
        //we can also solve it using Brute Force Approch But the Optimal solution of it using Two Pointer
        //using Two Pointer Technique to solve this Question
        int left= 0;
        int right = n-1;
        while (left<right){
            if(arr[left]== 0) left++;
            if (arr[right]==1) right--;
            if(arr[left]==1 && arr[right]==0){
                arr[left]=0;
                arr[right]=1;
                left++;
                right--;
            }


        }
        for(int ele : arr){
            System.out.println(ele+" ");
        }
    }
}
