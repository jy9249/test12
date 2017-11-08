package measurer;

import java.awt.Rectangle;

public class AreaMeasurer implements Measurer{ // ����
	

    @Override
    public double measure(Object anObject) {
        Rectangle 사각형 = (Rectangle) anObject; // area = ����
        double area = 사각형.getWidth() * 사각형.getHeight();
        return area;
    }


}
