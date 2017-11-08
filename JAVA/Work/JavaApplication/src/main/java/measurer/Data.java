package measurer;

public class Data {
		    
	    public static double average(Object[] objects, Measurer meas) { // ����� ������ ��� �ѷ��� ���ϰ� ����� ���� �ǵ� ?
	        double sum = 0;
	        for (Object obj : objects) {
	            sum = sum + meas.measure(obj);
	        }
	        if (objects.length > 0) {
	            return sum / objects.length;
	        } else {
	            return 0;
	        }
	    }
	}



