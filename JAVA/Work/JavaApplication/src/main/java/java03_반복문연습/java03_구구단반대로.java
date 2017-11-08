package java03_반복문연습;

public class java03_구구단반대로 {
    public static void main(String[] args) {
        int mult;
        for (int i = 9;
                        i >= 1;
                                i--) {
            
                mult = i * 2;
            System.out.printf("2*%d=%d\n",i,mult);
        }
    }
}
