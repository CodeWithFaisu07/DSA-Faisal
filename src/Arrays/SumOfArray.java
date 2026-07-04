package Arrays;
import java.util.Scanner;

public class SumOfArray {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of Array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        //taking array input through user
        for(int i =0 ; i<n ; i++){
            arr[i]=sc.nextInt();
        }
        int sum=0;
        for(int i=0;i<n;i++){
           sum+=arr[i];
        }
        System.out.println("the sum of given array is : "+sum);

    }
}
