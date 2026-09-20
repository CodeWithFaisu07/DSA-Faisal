package twoPointer_array;
//iven a 1-indexed array of integers numbers that is already sorted in non-decreasing order
// , find two numbers such that they add up to a specific target number.
// Let these two numbers be numbers[index1] and numbers[index2]
// where 1 <= index1 < index2 <= numbers.length.

public class TwoSum2 {
    static void main() {
        int [] arr = {2,7,11,15};
        int x = 9; // x -> Target
        int n = arr.length;
        int i= 0;  int j =n-1;
        while (i<j){
            if(arr[i]+arr[j]==x){
                System.out.println(arr[i] + "+"+ arr[j]);
            }
            j--;
        }
    }
}
