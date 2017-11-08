package java02_조건문연습;

import java.util.Scanner;

public class java02_조건문2 {
    public static void main(String[] args) {
        int x, y, z;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("x값을 입력하시오 : ");
        x = keyboard.nextInt();
        
        System.out.println("y값을 입력하시오: ");
        y = keyboard.nextInt();
        
        System.out.println("y값을 입력하시오: ");
        z = keyboard.nextInt();
        
        if (x > y) {
            if (x > z) {
                System.out.println("max : " + x);
            } else {
                System.out.println("max : " + z);
            }
        } else {
            if (y > z) {
                System.out.println("max : " + y);
            } else {
                System.out.println("max : " + z);
            }
        }
        
    }
}
