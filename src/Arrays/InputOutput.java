package Arrays;
import java.util.Scanner;
public class InputOutput {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size of Array : ");
        int n= sc.nextInt();
        int[] arr = new int[n];
        //taking array input throgh user using loop
        for(int i = 0; i<n ; i++){
            System.out.print("write value of array index"+i +" ");
            arr[i]=sc.nextInt();

        }
        sc.close();
        for(int i=0; i<n ;i++){
            System.out.print(arr[i]+",");
        }


    }
}
