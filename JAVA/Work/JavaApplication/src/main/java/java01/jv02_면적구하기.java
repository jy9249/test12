package java01;

import java.util.Scanner;

public class jv02_면적구하기 {
    public static void main(String[] arg) {
        
        int perimeter = 0;
        int area = 0;
        
        Scanner keyboard = new Scanner(System.in);
        System.out.print("w값을 입력하시오 ");
        int w = keyboard.nextInt();
        
        System.out.print("h값을 입력하시오 ");
        int h = keyboard.nextInt();
        
        area = w * h;
        perimeter = 2 * (w + h);
        
        System.out.println("사각형의 넓이:" + area);
        System.out.format("사각형의 둘레:" + perimeter);
        
    }
    
}
