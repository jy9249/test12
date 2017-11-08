package java03_반복문연습;

import java.util.Scanner;

public class java03_구구단출력_가로 {
    public static void main(String[] args) {
        int r = 0;
        int temp = 0;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("처음 값을 입력하시오");
        int 시작 = keyboard.nextInt();
        
        System.out.println("종료 값을 입력하시오");
        int 종료 = keyboard.nextInt();
        
        if (시작 > 종료) {
            temp = 종료;
            종료 = 시작;
            시작 = temp;
            for (int i = 시작; i <= 종료; i = i + 1) {
                for (int j = 1; j < 10; j = j + 1) {
                    
                    r = i * j;
                    if (j < 9) {
                        System.out.printf("%d*%d=%d, ", i, j, r);
                    } else {
                        System.out.printf("%d*%d=%d.", i, j, r);
                    }
                    
                }
                System.out.printf("\n");
            }
        } else {
            for (int i = 시작; i <= 종료; i = i + 1) {
                for (int j = 1; j < 10; j = j + 1) {
                    
                    r = i * j;
                    if (j < 9) {
                        System.out.printf("%d*%d=%d, ", i, j, r);
                    } else {
                        System.out.printf("%d*%d=%d.", i, j, r);
                    }
                    
                }
                System.out.printf("\n");
            }
        }
    }
}
