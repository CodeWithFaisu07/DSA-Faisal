package String;

public class BuiltInMethodAppend {
    // in normal String we can not add something in existing string because if you try ko add something techanically a new String
    //can be created
    // so StringBuilder Provides a method Called Append() -> it helps to add anything into the String
    static void main() {
        StringBuilder s = new StringBuilder("abc");
        s.append("xyz");//-> we can append any data type including array trough append function
        System.out.println(s);
    }
}
