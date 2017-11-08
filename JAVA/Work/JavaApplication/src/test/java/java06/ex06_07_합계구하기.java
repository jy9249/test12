package java06;

import java.util.Scanner;

public class ex06_07_합계구하기 {
    
    public static int sum(int a , int b) {
            int sum = 0;
            for (int i =a ; i <= b; i++) {
                sum = sum + i;
            }

            return sum;
    }
    public static void main(String[] args) {
        int temp = 0;
        
        Scanner keyboard = new Scanner(System.in);
        System.out.println("정수를 입력하시오");
        int a = keyboard.nextInt();
        
        System.out.println("정수를 입력하시오");
        int b = keyboard.nextInt();
        
        if (a > b) {
            temp = b;
            b = a;
            a = temp;
            
        }
       int ss= sum(a, b);
        
        System.out.printf("%d 부터 %d 까지의 합계는 %d입니다",a,b,ss);
        
        
        
    }
    
}
