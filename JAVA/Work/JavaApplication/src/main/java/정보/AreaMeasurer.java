package 정보;

import java.awt.Rectangle;

public class AreaMeasurer implements Measurer // 넓이
{
    @Override
    public double measure(Object anObject) {
        Rectangle 사각형 = (Rectangle) anObject; // area = 넓이
        double area = 사각형.getWidth() * 사각형.getHeight();
        return area;
    }
}
