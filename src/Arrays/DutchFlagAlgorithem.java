package Arrays;

public class DutchFlagAlgorithem {
    static void main() {
        int[] arr = {0,1,2,0,1,2,1,2,0,0};
        for(int ele : arr){
            System.out.print(ele+",");
        }

        //method one
//        int noofZeros = 0 ;
//        int noofOnes = 0;
//        int noofTwos = 0;
//        int n = arr.length;
//
//        for (int i = 0; i < n; i++) {
//            if(arr[i]==0)  noofZeros++;
//            else if( arr[i]== 1) noofOnes++;
//            else noofTwos++;
//        }
//        for (int i = 0; i <arr.length ; i++) {
//            if (i < noofZeros)  arr[i] = 0;
//            else if (i < noofZeros+noofOnes)  arr[i] =1 ;
//            else arr[i] = 2;
//        }

        // method no 2 : A professional Method
        int n = arr.length;
        int i = 0 ; int j = 0; int k = n-1;
        while (i<k){
            if (arr[i]==0) i++;
            if(arr[i]==1) j++;
            if(arr[i]==2) k--;
            if ( arr[i]==1&& arr[j]==0){
                arr[i]=0;
                arr[j]=1;
            }
            if (arr[i]==2 && arr[k]==0){
                arr[i]=0;
                arr[k]=2;
            }
            if (arr[j]==2 && arr[k]==1){
                arr[j]=1;
                arr[k]=2;
            }

        }

        System.out.println();
        for(int ele : arr){
            System.out.print(ele+",");
        }

    }
}
