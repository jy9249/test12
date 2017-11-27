package z최진영;

import java.util.Scanner;

public class ex3 {
    
    public static void main(String[] args) {
        int temp = 0;
        Scanner keyboard = new Scanner(System.in);
        for (;;) {
            System.out.println("시작단수를입력하시오");
            int a = keyboard.nextInt();
            
            System.out.println("끝단수를입력하시오");
            int b = keyboard.nextInt();
            
            if (a > b) {
                temp = b;
                b = a;
                a = temp;
                
            }
            
            if (a == 0 || b == 0) {
                break;
            }
            
            for (int i = a; i <= b; i++) {
                for (int j = 1; j < 10; j++) {
                    
                    int result = i * j;
                    System.out.printf(" %d x %d = %d ", i, j, result);
                    if (j == 9) {
                        System.out.print(".\n");
                    } else {
                        System.out.print(",");
                        
                    }
                }
            }
        }
    }
}
