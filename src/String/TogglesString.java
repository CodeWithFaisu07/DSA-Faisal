package String;
//Input a String and toggle all the charecters of it (Replace small to Upper and Vice versa )


import java.util.Locale;
import java.util.Scanner;

public class TogglesString {
    static void main() {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder(sc.nextLine());
        int n = sb.length();
        for(int i =0;i<n;i++){
            char ch = sb.charAt(i);
            int Ascii = (int)ch;
            if(Ascii>=65 && Ascii<=90){ // Capital
                Ascii+=32;
                ch=(char)Ascii;
                sb.setCharAt(i,ch);
            }
             else if(Ascii>=97 && Ascii<=122){ // Capital
                Ascii-=32;
                ch=(char)Ascii;
                sb.setCharAt(i,ch);
            }
        }
        System.out.println(sb);
    }
}
