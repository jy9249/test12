package java08_배열;


public class java08_for_each루프 {
    public static void main (String[] args)
    {
        int [] number = {10, 20 ,30};
        
        
        for (int j=0 ; j < number.length ; j++){
            System.out.println(number[j]);
        }
        
        
        for (int value : number){ //for (자료형변수 : 배열이름)
            System.out.println(value);
        }
    }
}
