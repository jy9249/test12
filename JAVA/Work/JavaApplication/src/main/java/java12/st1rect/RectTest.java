package java12.st1rect;

import java.awt.RenderingHints.Key;
import java.util.Scanner;

public class RectTest {
    public static void main(String[] args) {
      
        Rect re = new Rect();
        re.setHeight(h);
        re.setWidth(w);
        
        int area = re.area();
        System.out.println("넓이: " + area);
        
        int perimeter = re.perimeter();
        System.out.println("둘레: " + perimeter);
        
        
        System.out.println(re.toString());
    }
}
