package String;

public class InsertandDeleteEle {
    // as we know String BUilder is Mutable then we can Acess manuplate and modify the CHsrecter of String
    static void main() {
        StringBuilder s = new StringBuilder("abcdef");
        System.out.println(s);
        s.deleteCharAt(3);//-> here if we delete 3rd ele of string then rest of string shift from 3rd index so right know if you want to acess 3rd ele then 4th element revieved because they shift when we are deleting 3rd ele let check
        System.out.println(s.charAt(3));
        System.out.println(s);
        s.append("xyz");
        System.out.println(s);
        s.delete(2,4);
        System.out.println(s);
        s.insert(2,'c');
        System.out.println(s);
        // we can also use setcharAt for inserting something into String but it replace it from the previous String
        //setCharAt() replaces a single character at a specific index,
        // while insert() adds new characters or values at a given offset and shifts existing characters to the right.
        // Both methods belong to Java's mutable string classes, StringBuilder and StringBuffer (not the immutable String class)
    }
}
