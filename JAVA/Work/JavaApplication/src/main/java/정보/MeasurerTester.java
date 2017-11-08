package 정보;

import java.awt.Rectangle;
import java.util.Arrays;

public class MeasurerTester {
    
    public static void main(String[] args) {
        Measurer areaMeas = new AreaMeasurer();
        int[] size = new int[3];
        Rect[] rects = new Rect[] {
                
                new Rect(5, 10, 20, 30), // x좌표,y좌표, 가로(width), 세로(height)
                
                new Rect(10, 20, 30, 40),
                
                new Rect(20, 30, 5, 15) };
        
        for (int i = 0; i < rects.length; i++) {
            
            System.out.println(i + 1 + "번째 사각형 " + rects[i].toString());
            
            System.out.println(i + 1 + "번째 사각형 둘레" + rects[i].per());
            size[i] = rects[i].per();
            
        }
        
        Arrays.sort(size);
        System.out.println("최대 둘레 : " + size[size.length - 1]);
        System.out.println("최소 둘레 : " + size[0]);
        
        System.out.println("최대 둘레를 가지는 사각형  " + rects[size.length - 1].toString());
        
        double averageArea = Data.average(rects, areaMeas);
        System.out.println("Averagearea: " + averageArea);
        System.out.println("Expected: 625");
        
    }
    
}
