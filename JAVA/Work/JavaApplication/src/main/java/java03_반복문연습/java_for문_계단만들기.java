package java03_반복문연습;

import java.util.Scanner;

public class java_for문_계단만들기 {
    public static void main(String[] args) {
        int num = 10;
        System.out.print("*을 출력할 라인의 수 입력\n\n\n\n");
        
        Scanner key = new Scanner(System.in);
        String tep = key.nextLine();
        num = Integer.parseInt(tep);
        
        for (int i = 0; i < num; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
}
