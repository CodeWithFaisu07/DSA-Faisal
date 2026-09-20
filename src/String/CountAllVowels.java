package String;
// Take a Input String from user and Find the All Vowels inside That string
import java.util.Scanner;

public class CountAllVowels {
    static void main() {
        Scanner sc = new Scanner(System.in);
        String str;
        System.out.print("Enter a string");
        str = sc.nextLine();

        int n = str.length();
        int count = 0;
        for (int i = 0 ; i<n;i++) {
            char ch = str.charAt(i);
            if (isVowel(ch) == true) {
                count++;
            }
        }
        System.out.println(count);
    }
    public static boolean isVowel(char ch){
        if(ch=='a' || ch =='A') return true;
        if(ch=='e' || ch =='E') return true;
        if(ch=='o' || ch =='O') return true;
        if(ch=='u' || ch =='U') return true;
        if(ch=='i' || ch =='I') return true;
        return false;
    }
}
