package measurer;

import java.util.Arrays;

import org.w3c.dom.css.Rect;

public class MesurerTester {
	    
	    public static void main(String[] args) {
	        Measurer areaMeas = new AreaMeasurer();
	        int[] size = new int[3];
	        Rect1[] rects = new Rect1[] {
	                
	                new Rect1(5, 10, 20, 30), // x��ǥ,y��ǥ, ����(width), ����(height)
	                
	                new Rect1(10, 20, 30, 40),
	                
	                new Rect1(20, 30, 5, 15) };
	        
	        for (int i = 0; i < rects.length; i++) {
	            
	            System.out.println(i + 1 + "��° �簢�� " + rects[i].toString());
	            
	            System.out.println(i + 1 + "��° �簢�� �ѷ�" + rects[i].per());
	            size[i] = rects[i].per();
	            
	        }
	        
	        Arrays.sort(size);
	        System.out.println("�ִ� �ѷ� : " + size[size.length - 1]);
	        System.out.println("�ּ� �ѷ� : " + size[0]);
	        
	        System.out.println("�ִ� �ѷ��� ������ �簢��  " + rects[1].toString());
	        
	        double averageArea = Data.average(rects, areaMeas);
	        System.out.println("Averagearea: " + averageArea);
	        System.out.println("Expected: 625");
	        
	    }
	    
	}