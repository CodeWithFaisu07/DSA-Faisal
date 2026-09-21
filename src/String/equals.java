package String;

public class equals {
    static void main() {
        // Equals Operator is used to cheak wheather the charecter of 2 diffrent String is same or not
        //its simaller to ==(comparison)  but == operator take Desicion bassed on Adress of String not for the Charecter of String  str;1+=ch
        String a = "abcxyz";
        String b = "abcxyz";
        String c = "abc";
        c = c+"xyz";
        System.out.println(a==b); //-> Obviosuly its Gives true but not because there CHarecters are same their is reson behind us is String a and String b are diffrent refrence variable but technically the take refrence of same string we can acsess same string via a or b also because Both strings are same

        System.out.println(a==c); //-> its through false because we already know that == opreator only cheaks the Address of String not The charecter inside that string in case of string c there are two strings are creates first whwn we intiallzie String c = "abc and Second time one more String is created when we are adding "xyz" so abc and xyz are both same string but we acesss it with a same refrence Variable
        // to solve this Problem Java Provides a Equals() method to cheak and Compare two String basis on thier Charecter
        // lets do same thing using Equals Operator its gaves you Exact result
        String d = "abcxyz";
        String e = "abc";
        e = e+"xyz";
        System.out.println(d.equals(e)); //-> true because Equals method cheaks Charecter not addresses of String

    }
}
