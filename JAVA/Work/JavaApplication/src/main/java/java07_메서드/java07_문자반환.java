package java07_메서드;

import java.util.Scanner;

public class java07_문자반환 {
    
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("문자열을 입력하시오");
        String str = keyboard.next();
        
        boolean s = isNumber (str);
        System.out.println(s);
    }
    
    public static boolean isNumber(String s) {
        if ( s == "" ||  s == null) {
            return false;
        } 
        else {
            return true;
        }
    }
    
}
