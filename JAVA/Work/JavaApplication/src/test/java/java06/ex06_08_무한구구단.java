package java06;

import java.util.Scanner;

public class ex06_08_무한구구단 {
    
    public static void  출력부분 (int 시작단 , int 끝단) {
        int 출력부분= 0 ;
        for (int i = 시작단; i <= 끝단; i++) {
            for (int j = 1; j < 10; j++) {
                System.out.format("%dX%d=%d ", i, j, i * j);

        
            }
        }
       
    }
    
    
    public static void main(String[] args) {
        int temp;
        
        Scanner keyboard = new Scanner(System.in);
        
        for (; true;) // 무한루프만들기.
        {
            System.out.print("시작 단수입력:");
            int 시작단 = keyboard.nextInt();
            System.out.print("끝 단수입력:");
            int 끝단 = keyboard.nextInt();
            
            if (시작단 > 끝단) { // 시작단이 종료단 보다크면 교환.
                temp = 끝단;
                끝단 = 시작단;
                시작단 = temp;
            }
            if (시작단 == 0 || 끝단 == 0) { // 시작단 또는 종료단이 0이면 탈출
                break;
            }
            
          출력부분(시작단,끝단);
                }
            }
}

        
        
  