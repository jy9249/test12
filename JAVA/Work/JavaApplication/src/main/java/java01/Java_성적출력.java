package java01;

import java.util.Scanner;

public class Java_성적출력 {
    public static void main(String[] arg) {
        
        char grade = ' ';
        System.out.print("성적을 입력하시오 ");
        Scanner keyboard = new Scanner(System.in);
        
        int w = keyboard.nextInt();
        
        if (w > 90) {
            grade = 'A';
        } else if (w >= 80 && w < 90) {
            grade = 'B';
        } else if (w >= 70 && w < 80) {
            grade = 'C';
        } else if (w >= 60 && w < 70) {
            grade = 'D';
        } else {
            grade = 'F';
        }
        
        System.out.println("당신의 학점은 " + grade);
    }
}
