package z실습;

public class Country implements Measurable, Named, Comparable{
	private String name;
	private double area;
	
	public Country(double area)
	{
		this.name = name;
		this.area = area;
	}

	public double getMeasure()
	{
		return area;
	}
	public String getName() 
	{
		return name;
	}

   

    @Override
    public double getComparable(String name, double area) {
        // TODO Auto-generated method stub
        return 0;
    }


 
    }

