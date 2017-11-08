package java02_조건문연습;

public class java02_3항연산자_if축약 {
    public static void main(String[] arg){
        int x=10;
        int y=20;
        int max =0;
        
        
        if(x>y){
            max =x;
        }
            
    
        else{
            max=y;
            
        }
        System.out.println(max);
        
        max=(x>y) ? x: y ;
        System.out.println(max);
    }
    
}
