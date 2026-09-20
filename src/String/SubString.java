package String;
//A substring is a contiguous sequence of characters within a string.
// In Java, the substring() method is used to extract a portion of a String,
// where the starting index is inclusive and the ending index is exclusive.
// suppose this is your String s = abcd
// sp the substring for this String are ;ile a ab abc abcd b bc bcd c cd d  -> so these are the all substring of givrn string


public class SubString {
    static void main() {
        String x = "";  //-> this is Empty String With Length 0
        System.out.println(x.length());

        String s = "abcd";
        System.out.println(s.substring(2));//its meaning print all the Substring after index number 2
        System.out.println(s.substring(1,4));//-> This gets part from i to j-1


    }
}
