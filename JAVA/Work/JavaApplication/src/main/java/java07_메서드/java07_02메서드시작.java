package java07_메서드;

public class java07_02메서드시작 {
    public static int getSum(int start, int end) {
        int sum = 0;
        for (int i = start; i <= end; i = i + 1) {
            sum = sum + i;
        }
        return sum;
    }
    
    public static void main(String[] args) { // main 자리에 char int double 모두 가능
        
        int sum = getSum(1, 10);
        System.out.println(+sum);
        
        int sum2 = getSum(1, 100);
        
        System.out.println(+sum2);
        
        int sum3 = getSum(100, sum2);
        
        System.out.println(+sum3);
        
    }
}
