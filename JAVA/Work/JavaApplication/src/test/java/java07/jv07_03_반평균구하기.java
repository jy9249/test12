package java07;

import java.util.Scanner;

public class jv07_03_반평균구하기 {
    public static void main(String[] args) {
        int sum = 0;
        int avr = 0;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("학생수를 입력하시오");
        int size = keyboard.nextInt();
        
        int[] Stu = new int[size];
        
        for (int i = 0; i < Stu.length; i++) {
            System.out.println("성적을 입력하시오");
            int Gra = keyboard.nextInt();
            Stu[i] = Gra;
        }
        for (int i = 0; i < Stu.length; i++) {
            sum = sum + Stu[i];
            
        }
        System.out.printf("합계는 : %d", sum);
        System.out.println();
        avr = sum / size;
        
        System.out.printf("평균은 : %d ", avr);
    }
}
