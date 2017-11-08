package java04;

import java.util.Scanner;

public class ex04_22_무한구구단 {

    public static void main(String[] args) {

        int temp;
        Scanner input = new Scanner(System.in);
        
        for( ; true; ){
            System.out.print("시작 단수입력:");
            int startDan = input.nextInt();
            System.out.print("끝 단수입력:");
            int endDan = input.nextInt();
            
            if(startDan == 0 || endDan ==0) {
                break;
            }
            
            if(startDan > endDan){
                temp = endDan;
                endDan = startDan;
                startDan = temp;
            }
            
            // step2. 구구단 출력
            for(int i=startDan; i<=endDan; i++){
                for(int j=1; j<10; j++){
                    System.out.format("%dX%d=%d", i, j, i*j);

                    if( j==9 ) {
                        System.out.print(".\n"); //System.out.println(".");
                    }
                    else {
                        System.out.print(", ");
                    }
                }
            }
        }

        System.out.print("프로그램 종료\n");
    }    
}
