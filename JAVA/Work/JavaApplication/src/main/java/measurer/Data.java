package measurer;

public class Data {
		    
	    public static double average(Object[] objects, Measurer meas) { // 평균을 구함즉 모든 둘레를 구하고 평균을 내는 건데 ?
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



