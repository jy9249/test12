package java07_메서드;


public class java07_01메서드합계 {
    public static void main(String[] args)
    {
        int x = 3;
        int y = 5;
        
        int add=Add(x,y);
      System.out.print(add);
    }
    
    
    
    private static int Add(int x, int y){
        
    
    int result = x + y;
    return result;

    }
}

