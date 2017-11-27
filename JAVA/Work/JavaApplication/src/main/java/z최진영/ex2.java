package z최진영;

import java.util.Arrays;

public class ex2 {
    
    public static void main(String[] args) {
        
        int[] arr = { 23, 96, 35, 42, 81, 19, 8, 77, 50 };
        
        System.out.print("배열 정렬 전 : ");
        for (int i = 0; i < arr.length; i++) {
            
            System.out.print(arr[i]);
            if (i == arr.length - 1) {
                System.out.print(".");
            } else {
                System.out.print(",");
            }
            
        }
        System.out.println("");
        Arrays.sort(arr);
        
        System.out.print("배열 정렬 후 : ");
        for (int i = 0; i < arr.length; i++) {
            
            System.out.print(arr[i]);
            if (i == arr.length - 1) {
                System.out.print(".");
            } else {
                System.out.print(",");
            }
            
        }
        
    }
    
}
