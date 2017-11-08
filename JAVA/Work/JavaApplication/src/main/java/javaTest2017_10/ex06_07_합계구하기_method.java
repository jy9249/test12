package javaTest2017_10;


public class ex06_07_합계구하기_method {
    
    public int sum(int 시작값, int 종료값){
       int  sum =0 ;
       for(int i = 시작값 ; i <=종료값; i++){
           sum=sum+i;
       }
       return sum;
    }
}
