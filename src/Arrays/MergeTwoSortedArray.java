package Arrays;

public class MergeTwoSortedArray {
    static void main() {

        int[] a = {11,33,42,71};
        int[] b = {26,54,69,81,94};
        int m = a.length;
        int n = b.length;
        int[] c = new int[m+n];

//        Merging
        int i = 0; int j =0; int k = 0;
        while(i<a.length&& j<b.length){
            if (a[i]<=b[j]){
                c[k]= a[i];
                i++;
                k++;
            }else {
                c[k]= b[j];
                j++;
                k++;
            }


        }
        //Rest Elements Add into k
        if(i==a.length){
            while(j<b.length){
                c[k]=b[j];
                j++;
                k++;
            }

        }else if(j==b.length){
            while(i<a.length){
                c[k]= a[i];
                i++;
                k++;
            }

        }
        for(int ele : c){
            System.out.print(ele+" ");
        }

    }
}
