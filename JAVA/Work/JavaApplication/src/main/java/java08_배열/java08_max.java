package java08_배열;

import java.lang.reflect.Array;
import java.util.Arrays;

public class java08_max {
    public static void main(String[] args) {
        int size = 6;
        int[] arr = new int[size];
        arr[0] = 5;
        arr[1] = 3;
        arr[2] = 4;
        arr[3] = 3;
        arr[4] = 10;
        arr[5] = 32;
      
        
        Arrays.sort(arr);
        
        System.out.println("최대값 :" + arr[arr.length - 1]);
        System.out.println("최소값 : " + arr[0]);
        int temp = max(arr);
        System.out.println("최대값 : " + temp);
    }
    
    public static int max(int[] x) {
        // 배열 정렬
        Arrays.sort(x);
        // 최대값 반환
        
        return x[x.length - 1];
    }
    
}
