package java08_배열;

import java.util.Arrays;

public class java08_최대값최소값구하기 {
    public static void main(String[] args) {
        int[] arr = { 23, 96, 35, 42, 81, 19, 8, 77, 50, 64 };
        
        
        
        System.out.print("배열 정렬 전 : ");  
        for (int i = 0; i < arr.length; i++) {
           
            System.out.print(arr[i]);
            if ( i==arr.length-1)
            {
                System.out.print(".");
            }
            else{
            System.out.print(",");
            }
       
        }
        System.out.print("배열 정렬 후 : ");
        Arrays.sort(arr);
        
        for (int i = 0; i < arr.length; i++) {
        
            System.out.print(arr[i]);
            if ( i==arr.length-1)
            {
                System.out.print(".");
            }
            else{
            System.out.print(",");
            }
        }
        System.out.println("\n최대값 :" + arr[arr.length - 1]);
        System.out.println("최소값 : " + arr[0]);
        
    }
}
