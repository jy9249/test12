package javaTest2017_10;

import java.util.Scanner;

public class ex06_22_무한구구단_method {
    
    public static void main(String[] args) {
        
        int temp;
        Scanner keyboard = new Scanner(System.in);
        
        for (; true;) {
            
            System.out.print("시작 단수입력:");
            int 시작단 = keyboard.nextInt();
            
            System.out.print("끝단수입력:");
            int 끝단 = keyboard.nextInt();
            
            if (시작단 > 끝단) {
                temp = 끝단;
                끝단 = 시작단;
                시작단 = temp;
            }
            
            if (시작단 == 0 || 끝단 == 0) {
                break;
            }
            
            Prints c = new Prints();
            c.Prints(시작단, 끝단);
        }
        
    }
}
