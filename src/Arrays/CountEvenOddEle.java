package Arrays;

public class CountEvenOddEle {
    static void main() {
        int[] arr = {10,15,20,25,30,35};
        int CountEven = 0;

        int CountOdd = 0;
        for(int i=0 ;i<arr.length;i++){
            if(arr[i] % 2==0) CountEven++;
            else CountOdd++;
        }
        System.out.println("Total Even Number:"+CountEven);
        System.out.println("Total Odd Number:"+CountOdd );

        }
    }

