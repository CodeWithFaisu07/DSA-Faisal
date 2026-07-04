package PatternPrint;

public class TringlePattern {
    static void main() {
        int n=5;
        System.out.println("horizontal tringle");
        for(int i =1;i<=n;i++){
            for(int j=1;j<=n-i;j++)
                System.out.print("*");
            System.out.println();
        }
        System.out.println("tringle");
        for(int i =1;i<=n;i++){
            for(int j=1;j<=i;j++)
                System.out.print("*");
            System.out.println();
        }


    }
}
