package String;
import java.util.Scanner;

public class WhyString {
    static void main() {
        Scanner sc = new Scanner(System.in);
        // String meams Collection of Char;
        // ordinary method
        char[] ch = {'R','a','g','h','a','v'};
        for(char ele : ch){
            System.out.print(ele);
        }

        // to solve this Java Provide a Class Called String (also a data structure ) and insted of doimg this We can
        //use String Variable Which we can directly store a collection of char with a refrence variable Let see

        String s = "Raghav is Java Teacher we teaches DSA in Java";
        System.out.println(s);

        // how to take String Input;
        System.out.println("ENter your name here");
        String str= sc.next(); // -> we are using sc.next only so if user write Faisal khan then the String consider only Faisal and not print Khan to solve this problem we have to use next line

        System.out.println("hey"+str);


    }
}
