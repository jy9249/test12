package java01;

public class java_형변환예제2 {
    public static void main(String[] arg) {
        int i = 0;
        double d = 0;
        int e=1+'2';
        System.out.println(e);
        d = (double) (5 / 4);
    
        d = (double) 5 / 4; // (double)(5/4) 절대안됨
        System.out.println("(5/4)==" + d);
        System.out.format("답:%f", d);
        
    }
    
}
