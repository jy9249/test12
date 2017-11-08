package java08_배열;


public class java08_배열개념 {
    public static void main (String[] args)
    {
        int size =6;
        int [] number = new int [size];
        for(int i = 0; i<=number.length ; i++){
            number[i]=i;
        System.out.printf("number[%d] = %d\n",i,number[i]);
        }
        
    }
}
