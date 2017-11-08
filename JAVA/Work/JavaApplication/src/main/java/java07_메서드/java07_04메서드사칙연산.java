package java07_메서드;

import java.util.Scanner;

public class java07_04메서드사칙연산 {
    public static void main(String[] args) {
        int x = 0, y = 0;
        
        Scanner keyboard = new Scanner(System.in);
        System.out.println("x값을 입력하시오");
        x = keyboard.nextInt();
        System.out.println("y값을 입력하시오");
        y = keyboard.nextInt();
        
        int add = Add(x, y);
        int minus = Minux(x, y);
        int mul = Mul(x, y);
        int div = Div(x, y);
        System.out.printf("더하면:%d,빼면:%d,곱하면:%d,나누면:%d", add, minus,mul,div);
    }
    
    private static int Div(int x, int y) {
        int result = x / y;// TODO Auto-generated method stub
        return result;
    }
    
    private static int Mul(int x, int y) {
        int result = x * y; // TODO Auto-generated method stub
        return result;
    }
    
    private static int Minux(int x, int y) {
        int result = x - y;
        // TODO Auto-generated method stub
        return result;
    }
    
    private static int Add(int x, int y) {
        int result = x + y; // TODO Auto-generated method stub
        return result;
    }
}
