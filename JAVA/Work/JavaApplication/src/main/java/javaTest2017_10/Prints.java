package javaTest2017_10;

import java.io.PrintStream;

public class Prints {
    public void Prints(int 시작단, int 끝단) {
        int 출력부분 = 0;
        for (int i = 시작단; i <= 끝단; i++) {
            for (int j = 1; j < 10; j++) {
                System.out.format("%dX%d=%d ", i, j, i * j);
                
            }
        }
    }
}
