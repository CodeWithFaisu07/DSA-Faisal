package String;

import java.util.Scanner;

public class UpdateEvenPositionsString {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String here ");
        String s = sc.nextLine();
        int n = s.length();
        String str="";
        for(int i= 0;i<n;i++){
           if(i%2==0){
               str+='a';
           }else str+=s.charAt(i);
        }
        s=str;
        System.out.println(str);
    }
}
