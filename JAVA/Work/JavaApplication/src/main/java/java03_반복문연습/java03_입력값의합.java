package java03_반복문연습;

import java.util.Scanner;

public class java03_입력값의합 {
    public static void main(String[] args) {
        int temp = 0;
        int sum = 0;
        
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the first num");
        int k1 = keyboard.nextInt();
        
        System.out.println("Enter the second num");
        int k2 = keyboard.nextInt();
        
        if (k1 > k2) {
            temp = k2;
            k2 = k1;
            k1 = temp;
            for (int i = k1; i <= k2; i = i + 1) {
                sum = sum + i;
                if (i < k2) {
                    System.out.printf("%d+", i);
                } else {
                    System.out.printf("%d=%d", i, sum);
                }
                
            }
        } else {
            for (int i = k1; i <= k2; i = i + 1) {
                sum = sum + i;
                if (i < k2) {
                    System.out.printf("%d+", i);
                } else {
                    System.out.printf("%d=%d", i, sum);
                }
            }
            
        }
    }
}
