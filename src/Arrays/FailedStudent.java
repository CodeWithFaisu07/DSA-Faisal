package Arrays;

public class FailedStudent {
    static void main() {
        int[] arr={50,70,70,50,30,20};
        int n= arr.length;
        for (int i = 0; i < n; i++) {
            if(arr[i]<35) System.out.println("roll number:  " + i + " has less then 35 marks so he/she is failed in exams");

        }

    }
}
