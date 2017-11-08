package java03_반복문연습;

import java.util.Scanner;

public class java03_Swap {
    public static void main(String[] args) {
        int sum = 0;
        int temp = 0;
        int i;
        
        Scanner key = new Scanner(System.in);
        System.out.println("시작값을입력하시오");
        int 시작 = key.nextInt();
        System.out.println("종료값을입력하시오");
        int 종료 = key.nextInt();
        
        if (종료 < 시작) {
            temp = 종료;
            종료 = 시작;
            시작 = temp;
            
            for (i = 시작; i <= 종료; i++) {
                sum = sum + i;
            }
            
            System.out.printf("합은 %d 이다.", sum);
        }
        
        else {
            
            for (i = 시작; i <= 종료; i++) {
                sum = sum + i;
            }
            System.out.printf("합은 %d 이다.", sum);
        }
        
    }
}
