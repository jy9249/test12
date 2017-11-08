package java06;

import java.util.Scanner;

public class ex06_01_CompareString {
    
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        
        String a = "y";
        String b = s.nextLine();

        if ( a == b ) {
            System.out.println("같다");
        } else {
            System.out.println("같지않다.");
        }
        
        if ( a.equals(b) ) {
            System.out.println("같다");
        } else {
            System.out.println("같지않다.");
        }
    }
    
}
