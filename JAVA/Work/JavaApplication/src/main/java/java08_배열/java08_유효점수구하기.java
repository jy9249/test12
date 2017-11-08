package java08_배열;

import java.util.Arrays;
import java.util.Scanner;

public class java08_유효점수구하기 {
    public static void main(String[] args) {
        int max, min = 0;
        
        Scanner keyboard = new Scanner(System.in);
        System.out.print("심사 위원의 수를 입력하시오");
        int size = keyboard.nextInt();
        int[] arr = new int[size];
        int sum = 0;
        double avr = 0;
        for (int i = 0; i < arr.length; i = i + 1) {
            
            System.out.printf("%d번째 심사 위원 점수 입력 : ", i + 1);
            int k = keyboard.nextInt();
            
            arr[i] = k;
            
        }
        System.out.printf("%d명 심사 위원의 점수 : ", size);
        for (int i = 0; i < arr.length; i = i + 1) {
            System.out.print(arr[i]);
            if (i == arr.length - 1) {
                System.out.print(".");
            } else {
                System.out.print(",");
            }
            
        }
        System.out.print("\n");
        
        
        
        Arrays.sort(arr);
        System.out.print("유효숫자 : ");
        for (int i = 1; i < arr.length - 1; i++) {
            System.out.print(arr[i]);
            if (i == arr.length - 2) {
                System.out.print(".");
            } else {
                System.out.print(",");
            }
            sum = sum + arr[i];
        }
        avr = (double)sum / (arr.length-2);
        System.out.print("\n");
        System.out.print("합계 : " + sum);
        System.out.print("\n");
        System.out.print("평균 : " + avr);
    }
}
