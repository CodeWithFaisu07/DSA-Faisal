package String;

public class interning {
    static void main() {
        // as We already Know String in java are Immutable
        // its mean you cannot change it after Creation
        String s = "Raghav";
//        s.charAt(0)='m';  / this will through an error beacuse string are imutable
//        s.charAt(2)='d';
        s = "Madhav";
        // We are dicussing Java String is Immutable we can not create it
        // then why we are assigning Madav and how it is possible
        // so the Answer is you're not changing Raghav we are just use their refrence variable to point something else Raghav is already in memory

    }
}
