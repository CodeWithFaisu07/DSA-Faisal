package String;

public class BuiltInStringMethods {
    static void main() {
        String s = "Faisal Khan";
        //Technically String is Array of Character so we Can Acsses the Elements using CharAT()
        // in array we are using refrence Variable + [] to Acess array element but in the Case of String Java provide CharAt method to asaess the element

        System.out.println(s.charAt(4));
        System.out.println(s.charAt(6)); //-> Space Consider also a Character
        System.out.println(s.charAt(8));

        //Like Array Length Operator is a inbuilt method so you can Acsses the length of string but in case of arr you are writing something like this arr.length but in case of String we Have to write like this
        int n = s.length();
        System.out.println("Length Of Str :" + n);

        //IndexOf is Method inside java String its helps to Print Index Number of Particular Char inside a string
        System.out.println(s.indexOf('l'));
        System.out.println(s.indexOf('a'));
        System.out.println(s.indexOf('z'));
        System.out.println(s.lastIndexOf('a'));



        //CompareTo  is uses to compare 2 given String lexographically
        // beacuse you Know every charecter has a ASCII Value so in this comparison its Cheak the ASCII value
        String a = "abc";
        String b =" dbc";
        System.out.println(a.compareTo(b));

        //Contains() and StartWith both Functions are Work almost simillarly Contains() cheak given char is part of String or not and return answer in true or false
        //StartsWith() is one more Method in Java its helps to  cheaks the particulat char is in stating Point of The string ot not
        String name = "Faisu";
        System.out.println(name.startsWith("Fa"));
        System.out.println(name.contains("is"));
        System.out.println(name.endsWith("is"));


        // toLowerCase is one of the methood it is used for to convert Capital latter into Lower
        // toUpperCase is also a method it is used to Concert smaller Letter into Capital
        //Concrete is used for adding to Strings (a+b)

        String m = "Faisal khan IS 22 YEAR OLD ";
        String mn ="and he is also a Software Engineer";
        System.out.println(m.toLowerCase());
        System.out.println(m.toUpperCase());
        System.out.println(m.concat(mn));
    }

    }

