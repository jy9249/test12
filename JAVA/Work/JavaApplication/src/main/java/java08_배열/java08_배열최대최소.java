package java08_배열;

import java.util.Scanner;

public class java08_배열최대최소 {
    public static void main(String[] args) {
        int size = 3;
        int[] array = new int[size];
        
        for (int i = 0; i <= array.length; i++) {
            
            Scanner keyboard = new Scanner(System.in);
            System.out.print("숫자를 입력하시오");
            int k = keyboard.nextInt();
            
            array[i] = k;
           
        }
        for (int i = 0; i <= array.length - 1; i = i + 1) {
            
            System.out.printf("number[%d] = %d, ", i, array[i]);
        }
    }
}
