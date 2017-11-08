package java02_조건문연습;

import java.util.Scanner;

public class java02_조건문3 {
    public static void main(String[] arg) {
        
        int k;
        
        Scanner keyboard = new Scanner(System.in);
        System.out.println("k값을 입력하시오");
        k = keyboard.nextInt();
        
        if (k == 0) {
            System.out.println("A");
            
        } else if (k > 3) {
            System.out.println("B");
            
        } else {
            System.out.println("C");
        }
        
    }
}
