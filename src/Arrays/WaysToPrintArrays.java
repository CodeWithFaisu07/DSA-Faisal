package Arrays;

public class WaysToPrintArrays {
    static void main() {
        int [] arr = { 10,20,34,46,89,54,56};
        //Printing Arrays through For Loop
        for (int i = 0; i <arr.length ; i++) System.out.print(arr[i] + ",");
        System.out.println();
        //Printing Arrays through For Each loop
        for(int ele : arr) System.out.print(ele + ",");

    }
}
