package java01;

import java.util.Scanner;

public class jv01_03_Salary {
    public static void main(String[] arg)
    
    {
        
        int salary = 0;
        int deposit = 0;
        
        Scanner keyboard = new Scanner(System.in);
        System.out.println("월급을 입력하시오 ");
        salary = keyboard.nextInt();
        
        deposit = 10*12*salary;
        System.out.println(deposit);
        
        
       
    }
    
}