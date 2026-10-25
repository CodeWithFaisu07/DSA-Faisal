package basic_maths;

import java.util.Scanner;

public class ReverseNumber {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int n = sc.nextInt();
        int original = n;
        int reminder = 0;
        int reverse = 0;
        while (n!=0){
            reminder=n%10;
            reverse=reverse*10+reminder;
            n/=10;
        }
        System.out.println("reverse of "+original+" is : "+reverse);
    }
}
