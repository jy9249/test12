package java02_조건문연습;

import java.util.Scanner;

public class java_조건문 {
    public static void main(String[] args) {
        int x, y, z;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("x값을 입력하시오");
        x = keyboard.nextInt();
        
        System.out.println("y값을 입력하시오");
        y = keyboard.nextInt();
        
        if (x > y) {
            
            System.out.println("x=" + x);
        } else if (x < y) {
         
            System.out.println("y=" + y);
        } else {
         
            System.out.println("x=y=" +x);
        }
        
    }
}
