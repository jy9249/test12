package java13_직원클래스객체배열;

import java.util.Scanner;

import java12.st3car.Car;

public class EmployeeTest2 {
    
    public static void main(String[] args) {
        
        // 배열의 인스턴스 생성 (먼저 for로 3번물어보기부터하고 생성)
        
        Employee[] arr = new Employee[3];
        // 키보드로 변수 4개 입력받기
        
        Scanner keyboard = new Scanner(System.in);
        // Employee 저장할 수 있는 배열 만들기
        // int[] arr= new int[3];
        for (int i = 0; i < 3; i = i + 1) {
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
            
            // 생성자를 이용하여 인스턴스 생성.
            Employee emp1 = new Employee(name, address, salary, rrn);
            
            // emp1 의 모든 필드 값을 출력하시오.
            System.out.println(emp1.toString());
            // 직원의 인스턴스를 배열에 저장
            arr[i] = emp1;
            
        }
        
        for (Employee e : arr) {
            System.out.println(e.toString());
            
        }
    }
}
