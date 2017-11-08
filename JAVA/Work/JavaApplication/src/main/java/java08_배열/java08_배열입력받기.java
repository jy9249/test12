package java08_배열;

import java.util.Scanner;

public class java08_배열입력받기 {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the number");
        int k = keyboard.nextInt();
        
        int [] number = new int [k];
        
        System.out.println("배열의 크기는 : "+number.length);
    }
}
