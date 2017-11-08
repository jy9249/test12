package measurer;

import java.awt.Rectangle;

public class Rect1 extends Rectangle{// �ѷ�
	
	    public Rect1(int x, int y, int width, int height) {
	        this.x = x;
	        this.y = y;
	        this.width = width;
	        this.height = height;
	      // TODO Auto-generated constructor stub
	    }

	    public int per  () {
	        Rectangle 사각형 = new Rectangle();
	        double perimeter = 2 * ( width*height);
	        return (int) perimeter;
	        
	    }
	}

