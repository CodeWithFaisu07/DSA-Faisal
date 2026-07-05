package Arrays;
import java.util.ArrayList;
public class BasicOperationOfArraylist {
    static void main() {
    //Declaration of ArrayList
    ArrayList<Integer> arr = new ArrayList<>(6);
    //Initialization of ArrayList
    arr.add(0,10);
    arr.add(1,20);
    arr.add(2,30);
    arr.add(3,40);
    arr.add(4,50);
    arr.add(5,60);
    System.out.println("Size of Array after Initialization :"+arr.size());
    System.out.println(arr);
    //Modify Element of ArrayList
     arr.set(1,300);
     System.out.println("ArrayList After Modification:");
     System.out.println(arr);

     //add Extra element in ArrayList
        arr.add(70);
        System.out.println("Array Size After adding Extra Value"+arr.size());
        System.out.println(arr);
     // removing Extra Added Element From ArrayList
        arr.remove(6);
        System.out.println("Size of ArrayList After Removing Elecement : "+ arr.size());
        System.out.println(arr);




    }
}
