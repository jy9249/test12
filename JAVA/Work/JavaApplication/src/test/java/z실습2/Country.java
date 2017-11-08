package z실습2;

public class Country implements Measurable, Named, Comparable{
	private String name;
	private double area;
	
	public Country(String name, double area)
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
    public double getComparable() {
        // TODO Auto-generated method stub
        return 0;
    }

}
