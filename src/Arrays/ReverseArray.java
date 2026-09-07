package Arrays;
//in this Question we just print reverse of array but we dont make array reverse elements are available on their current indies

public class ReverseArray {
    static void main() {
        int[] arr = {10, 20, 30, 40};
        int n = arr.length;
//        System.out.println("array before Reversing");
//        for (int i = 0; i < n ; i++) {
//            System.out.print(arr[i]+",");
//            }
//        System.out.println();
//        for(int j = n-1;j>=0;j--){
//            System.out.print(arr[j]+",");
//        }
//        }
//    }
// if you want to reverse array in actuall way here is the way to reverse array

        int i = 0;
        int j = n-1;
        while(i<j){
           int temp = arr[i];
           arr[i]=arr[j];
           arr[j]= temp;
           i++;
           j--;
        }
        for(int ele: arr){
            System.out.println(ele+" ");
        }

    }
}