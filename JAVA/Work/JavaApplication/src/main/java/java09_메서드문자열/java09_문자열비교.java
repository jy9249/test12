package java09_메서드문자열;

import java.util.Scanner;

public class java09_문자열비교 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please first string : ");
        String x = input.next();
        System.out.println("please second string : ");
        String y = input.next(x);
        if (x.equals(y)) {
            System.out.println("x.equals(y):same");
            
        } else {
            System.out.println("x.equals(y):not same");
            
        }
        if (x==y) {
            System.out.println("x==y :same");
            
        } else {
            System.out.println("x=y : not same"); //같지만 not same 이 뜬다. ㅠ
            
        }
    }
}
