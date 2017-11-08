package java11.st3;

import java11.st2.Car;

public class Box_test {
   
    
public static void main(String[] args){
        
        Box B =new Box();  //box 인스턴스 생성
        Box C =new Box(100,100,100);
        
        
        
        
        B.setHeight(100);  //width : 100
        B.setLength(100);  //length : 100
        B.setWidth(100);   //width : 100
        B.printVolunm();   //b의 부피출력
        C.printVolunm();   //c의 부피출력
        System.out.println(B.toString());
       
    }
    
}
