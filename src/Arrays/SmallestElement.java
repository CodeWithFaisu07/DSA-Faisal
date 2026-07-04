package Arrays;

public class SmallestElement {
    static void main() {
        int [] arr= {10,15,20,25,35,9};
        int mn= Integer.MAX_VALUE;
        for(int i =0; i<arr.length; i++){
            if(arr[i]<mn) mn=arr[i];
           // mn=Math.min(arr[i], mn);
        }
        System.out.print("the smallest number of given array is : "+ mn);
    }
}
