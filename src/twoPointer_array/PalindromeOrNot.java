package twoPointer_array;
//Given an array, the task is to determine whether an array is a palindrome or not.
//        Examples:
//
//Input: arr[] = [1, 2, 3, 2, 1]
//Output: true
//Explanation: Elements match from both ends, 3==3, 6==6, middle 0, all match.
//
//Input: arr[] = [1, 2, 3, 4, 5]
//Output: false
//Explanation: First and last elements differ, 1 != 5, so it is not a palindrome.

public class PalindromeOrNot {
    static void main() {
        int[] arr = {1,2,2,1};
        int n = arr.length;
        Boolean result = false;
        int i = 0; int j = n-1;
        while(i<j){
            if(arr[i]==arr[j]){
                result=true;
                i++;
                j--;
            }
            else break;
        }
        System.out.print("Are Given Array is Palindrome ? "+ result);
    }
}
