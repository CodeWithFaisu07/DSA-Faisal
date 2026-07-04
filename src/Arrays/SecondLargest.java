package Arrays;

public class SecondLargest {
    static void main() {
        int[] arr={10,15,20,25,30,35};
        int mx= Integer.MIN_VALUE;
        int largest=0;
        int Seclargest =0;
        for(int i=0;i<arr.length;i++) {
            largest=Math.max(arr[i],mx);
        }
        for (int i = 0; i <arr.length ; i++) {
           if (arr[i]>mx && arr[i]<largest) Seclargest=arr[i];
        }
        System.out.println(Seclargest);
        System.out.println(largest);
    }
}
