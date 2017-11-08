package java03_반복문연습;

public class java03_중첩for문 {
    public static void main(String[] arg) {
        System.out.println("***********");
        System.out.println("***********");
        System.out.println("***********");
        System.out.println("***********");
        System.out.println("***********");
        System.out.println("----------------");
        for (int i = 0; i <= 5; i++) {
            // System.out.println("***********");
            for (int j = 1; j <= 10; j++) {
                System.out.print("*");
            }
            
            System.out.print("\n");
        }
        System.out.println("----------------");
        
    }
}
