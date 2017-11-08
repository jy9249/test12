package java01;

import java.util.Scanner;

public class java_형변환 {
    public static void main(String[] arg) {
        
        
        int i = 42;
        char a = (char) i; 
        boolean b = (i != 0); //구글 자바 int boolean 변환
               
        System.out.println(a);
        System.out.println(b);
        String c = Integer.toString(i);
        System.out.println(c);

      

     
        
        
    }
}
