package java07;

import java.util.Arrays;
import java.util.Scanner;

public class ex07_05_유효점수22 {
    
    public static void main(String[] args) {
        int sum = 0;
        double avr = 0;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("심사 위원의 수를 입력하시오");
        int size = keyboard.nextInt();
        
        int[] b = new int[size];
        
        for (int i = 0; i < size; i++) {
            System.out.println("점수를 입력하시오");
            int Sco = keyboard.nextInt();
            b[i] = Sco;
            
        }
        
        Arrays.sort(b);
        System.out.println("유효점수");
        for (int i = 1; i < b.length - 1; i++) {
            
            System.out.print(" "+ b[i]);
            sum = sum + b[i];
            
        }
        avr = (double) sum / (size-2);
        System.out.println();
        System.out.println();
        System.out.printf("합계:%d", sum);
        System.out.println();
        System.out.printf("평균:%f", avr);
    }
    
}
