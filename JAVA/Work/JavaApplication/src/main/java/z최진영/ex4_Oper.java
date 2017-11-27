package z최진영;

import java.util.Scanner;

public class ex4_Oper {
    
    public static void main(String[] args) {
 
    int result =0;
        
        Scanner keyboard = new Scanner(System.in);
      System.out.println("첫번째 숫자를 입력하시오.");
      int firstNum1 = keyboard.nextInt();
      
      System.out.println("두번째 숫자를 입력하시오.");
      int secondNum1 = keyboard.nextInt();
      
        Oper op = new Oper (firstNum1,secondNum1);
        
        result = op.Add();
        System.out.println("Add : "+result);
        
        result= op.Minus();
        System.out.println("Minus : "+result);
        result= op.Mul();
        System.out.println("Mul : "+result);
        double result2=(double)op.Div();
        System.out.printf("Div : %f " , result2);
    }
    
}
