package java13_직원클래스객체배열;

import java.util.Scanner;

public class EmployeeTest {
    
    public static void main(String[] args) {
        // 키보드로 변수 4개 입력받기
        Scanner keyboard = new Scanner(System.in);
        // Employee 저장할 수 있는 배열 만들기
        // int[] arr= new int[3];
        Employee[] arr = new Employee[3];
        
        for (int i = 0; i < 3; i++) {
            // 이름
            System.out.println("이름을 입력하시오");
            String name = keyboard.next();
            
            // 주소
            System.out.println("주소를 입력하시오");
            String address = keyboard.next();
            
            // 주민번호
            System.out.println("주민등록번호를입력하시오");
            String rrn = keyboard.next();
            
            // 월급
            System.out.println("월급을 입력하시오");
            int salary = keyboard.nextInt();
            
            // 키보드를 입력값을 이용하여 Employee 인스턴스를 생성하시오.
            Employee emp1 = new Employee();
            
            // setter를 이용하여 필드 값 설정
            emp1.setAddress(address);
            emp1.setName(name);
            emp1.setRrn(rrn);
            emp1.setSalary(salary);
            
            // 배열에 저장되는 코드를 추가
            arr[i] = emp1;
            
            
            // emp1의 모든 필드 값을 출력하시오.
            System.out.println(emp1.toString());
            
        }
        //foreach 문을 사용하여 배열의 값을 출력 하시오 
        for(int i =0; i < arr.length-1 ; i ++){
            System.out.println(arr[i]);
        }
        System.out.println("-----------end-------------");
    }
}
