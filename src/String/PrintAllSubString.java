package String;

public class PrintAllSubString {
    static void main() {
        String name = "abcd";
        for(int i =  0 ; i<name.length();i++){
            for (int j = i+1 ; j<=name.length();j++){

                System.out.println(name.substring(i,j));
            }
        }
    }
}
