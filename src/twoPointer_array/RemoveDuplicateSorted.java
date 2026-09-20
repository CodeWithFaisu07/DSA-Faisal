package twoPointer_array;
//remove Duplicates Element from sorted Array Using Two Pointer

public class RemoveDuplicateSorted {
    static void main() {
        int[] arr = {5,5,7,8,8,9,9,10,10};
        int n = arr.length;
        //solving through two pointer Approach or Algorethem
        int j = 1;
        int i = 1;
        while(i<n){
            if(arr[i]!= arr[i-1]){
                j+=1;
                arr[j-1]=arr[i];
            }
            i++;
        }
        for(int k = 0;k<j;k++){
            System.out.print(arr[k]+" ");
        }
        }
    }

