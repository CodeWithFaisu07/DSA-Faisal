package String;

public class PlusOperator {
    static void main() {

    String s = "abc";
    s = s.concat("xyz");//-> so there is a problem With Concate function you cannot add another data type element so we can add manually element

        System.out.println(s);

        String str =  "xyz";
        str = str + 10;
        str = 123+str;
        System.out.println(str);
        System.out.println("abc"+10+20);
}
    }
