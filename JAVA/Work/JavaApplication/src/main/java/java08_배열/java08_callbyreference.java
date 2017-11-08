package java08_배열;

public class java08_callbyreference {
    public static void main(String[] args) {
        int max = 0;
        int min = 0;
        
        int[] arr = new int[] { 50, 60, 20, 70, 90 };
        
        for (int i = 0; i <= arr.length; i++) {
            
            if (arr[i] > max) {
                arr[i] = max;
                
                max = arr[4];
                
            }
        }
        
        for (int i = 0; i <= arr.length; i++) {
            
            if (arr[i] < min) {
                arr[i] = min;
                min = arr[0];
                
            }
        }       
            System.out.printf("min = %d", min);
            System.out.printf("min = %d", max);
        }
    }
