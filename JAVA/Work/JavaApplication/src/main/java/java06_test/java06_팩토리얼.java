package java06_test;

public class java06_팩토리얼 {
    public static void main(String[] args) {
        int sum = 0;
        
        // 1부터 10까지
        for (int k = 0; k <= 10; k++) {
            for (int i = 0; i <= 10; i++) {
                for (int j = k; j <= i + k; j++)
                
                {
                    sum = sum + j;
                }
            }
        }
        System.out.println("합계 = " + sum);
    }
}
