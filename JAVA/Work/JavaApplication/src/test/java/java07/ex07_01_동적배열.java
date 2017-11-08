package java07;

import java.util.Scanner;

public class ex07_01_동적배열 {

    public static void main( String [] args){

        Scanner keyboard = new Scanner(System.in);
        System.out.print("배열 크기 입력 : ");
        int size = keyboard.nextInt();

        int [] array = new int[ size ];

        array[0] = 0;
        array[1] = 1;
        array[2] = 2;
        array[3] = 3;
        array[4] = 4;
        array[5] = 5;
        

        // for문을 이용하여 배열의 값 대입
        for( int i = 0; i <= array.length-1 ; i++ ) {
            array[i] = 10;
        }


        // for문을 이용하여 배열의 값 출력
        for( int i = 0; i <= array.length-1 ; i++ ) {
            System.out.println( array[i] );
        }
    }
    
}
