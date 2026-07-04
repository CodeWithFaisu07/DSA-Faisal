package Arrays;

public class ReverseArray {
    static void main() {
        int[] arr = new int[]{10, 20, 30, 40};
        int start=0;
        int end= arr.length-1;
        for (int i = 0; i<arr.length; i++) {
            start=arr[i];
            start=end;
            System.out.print(end+",");

        }

    }

}
