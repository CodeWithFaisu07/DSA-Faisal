package Arrays;

import java.util.Scanner;

public class LinearSearch {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of Array");
        int sizeOfArray = sc.nextInt();
        int[] arr = new int[sizeOfArray];
        // Loop -> to take input from user 
        for(int i = 0;i<sizeOfArray ; i++){
            System.out.println("array input of index"+i);
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter Target Value:");
        int target = sc.nextInt();
        sc.close();
        boolean result = false;
      for (int i = 0; i <sizeOfArray ; i++) {
          if(arr[i]==target){
              result= true;
              break;
          }
      }
      if (result==true) System.out.println("Element Found");
      else System.out.println("Element not found");
            
        }
        
    }
    

