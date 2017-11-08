package 최진영;

import java.util.Scanner;

public class ex1 {
    public static void print(int x) {
        System.out.println(x);
        
    }
    
    public static void main(String[] args) {
        int temp = 0;
        int sum = 0;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("시작값을 입력하세요.");
        int a = keyboard.nextInt();
        
        System.out.println("종료값을 입력하세요.");
        int b = keyboard.nextInt();
        
        if (a > b) {
            temp = b;
            b = a;
            a = temp;
            
        }
        
        for (int i = a; i <= b; i++) {
            sum = sum + i;
        }
        
        print(sum);
        
    }
    
}
