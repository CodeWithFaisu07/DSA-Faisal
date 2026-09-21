package String;
//In Java, StringBuilder is a mutable class used to create and manipulate a sequence of characters
//.The primary reason to use StringBuilder instead of a normal String is performance and memory efficiency during frequent text modifications,
//such as string concatenations inside loop


public class BuilderString {
    static void main() {

    String s =new String("Faisal");//-> Normal String
    StringBuilder sc = new StringBuilder("Faisal");//-> String BUilder
    StringBuilder sd = new StringBuilder();//-> Null String BUilder
        System.out.println(sd.capacity());//-> Output 16 because its a default capacity of a String and it can be grow as needed
    StringBuilder se = new StringBuilder(10);//-> capcity of String BUilder capacity in the sense we can say we are reserve 10 char space for this String in memory
        System.out.println(se.capacity());
        System.out.println(se.length());


    // we can also Make normal String to StringBuilder
        StringBuilder sf = new StringBuilder(s);//-> and now our normal String Becames StringBuilder




    }

}
