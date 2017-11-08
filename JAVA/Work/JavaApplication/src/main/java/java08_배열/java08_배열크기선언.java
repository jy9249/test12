package java08_배열;

import java.util.Scanner;

public class java08_배열크기선언 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.printf("배열의 크기 입력하시오 : ");
        int size = keyboard.nextInt();
        
        
        int[] array = new int[size];
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
           
            System.out.printf("숫자를 입력하시오 : ", i);
            int k = keyboard.nextInt();
            array[i] = k;
            
            System.out.printf("number[%d]= %d\n", i, array[i]);
        }
        for (int i = 0; i <= array.length - 1; i = i + 1) {
            
         
            System.out.printf("number[%d] = %d, " , i , array[i]);    
        }

    }
}
