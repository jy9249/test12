package java03_반복문연습;


public class java03_for문2 {
    public static void main(String[] agrs) {
        for (int i = 0; i < 5; i++) {
            for (int j = 5; j <10; j++) {
            System.out.print("*");
            }
            System.out.println();  //10x5 행렬 만드는 느낌.
        }
    }
}
