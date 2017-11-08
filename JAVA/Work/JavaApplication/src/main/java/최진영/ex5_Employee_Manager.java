package 최진영;

import java.util.Scanner;

import java13_직원클래스객체배열.Employee;

public class ex5_Employee_Manager {
    
    public static void main(String[] args) {
        Employee[] arr = new Employee[3];
        Scanner keyboard = new Scanner(System.in);
        
        for (int i = 0; i < 3; i = i + 1) {
            
            System.out.println("이름을 입력하시오");
            String name = keyboard.next();
            
            System.out.println("주소를 입력하시오");
            String addr = keyboard.next();
            
            System.out.println("주민등록번호를입력하시오");
            String rrn = keyboard.next();
            
            System.out.println("월급을 입력하시오");
            int salary = keyboard.nextInt();
            
            Employee emp1 = new Employee(name, addr, salary, rrn);
            
            System.out.println(emp1.toString());
            
            arr[i] = emp1;
            
        }
    }
    
}
