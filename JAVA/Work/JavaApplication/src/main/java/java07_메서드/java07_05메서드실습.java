package java07_메서드;


public class java07_05메서드실습 {
    public static void main (String[] args) {
        int a=3, b=4;
        int value = add (a,b);
        System.out.print(value);
    }
    
    public static int add(int x, int y)
    {
        int result = x+y;
        return result;
        
    }
}
