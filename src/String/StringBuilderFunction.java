package String;

import java.util.Scanner;

public class StringBuilderFunction {
    static void main() {
        Scanner sc = new Scanner(System.in);

    StringBuilder s= new StringBuilder("faisal");
    StringBuilder se= new StringBuilder("faisal");
        System.out.println(s.length());
        System.out.println(s.compareTo(se));
        System.out.println(s.reverse());

        // how to take Input of StringBuilder
        StringBuilder a= new StringBuilder(sc.nextLine());

        // Important Function of StringBuilder
        StringBuilder Str= new StringBuilder("faisal khan");
        Str.setCharAt(0,'F');
        System.out.println(Str);


    }
}
