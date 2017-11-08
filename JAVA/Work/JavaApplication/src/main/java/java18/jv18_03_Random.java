package java18;

import java.util.Random;
import java.util.Scanner;

public class jv18_03_Random {
    
    public static void main(String[] args) {
        int temp;
        Random rand = new Random();
        double rand1 = rand.nextDouble();
        System.out.println("0~1난수" + rand1);
        
        double rand3 = rand.nextDouble() * 2;
        System.out.println("0~2난수" + rand3);
        
        // 문제1
        double rand4 = (rand.nextDouble() * 2) + 1;
        System.out.println("1~3난수" + rand4);
        
        // 문제2
        
        for (int i = 0; i < 5; i++) {
            double rand5 = rand.nextDouble() * 10;
            System.out.print("0~10 난수 5개" + rand5);
        }
        for (int i = 0; i < 5; i++) {
            double rand6 = Math.random() * 10;
            System.out.println("0~10 난수 5개" + rand6);
        }
        // 문제 3
        
        Scanner keyboard = new Scanner(System.in);
        System.out.println("a를 입력하시오");
        int a = keyboard.nextInt();
        System.out.println("b를 입력하시오");
        int b = keyboard.nextInt();
        
        for (int i = 0; i < 10; i++) {
            if (a > b) {
                temp = b;
                b = a;
                a = temp;
                
                int rand7 = (int) (Math.random() * (a - b + 1)) + b;
                System.out.println(rand7);
            } else {
                int rand8 = (int) (Math.random() * (a - b + 1)) + b;
                
                System.out.print(rand8);
            }
        }
        
    }
    
}
