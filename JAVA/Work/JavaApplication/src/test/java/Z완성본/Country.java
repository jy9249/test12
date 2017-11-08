package Z완성본;

public class Country implements Measurable, Comparable{
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
    public int compareTo(Object o) {
        // TODO Auto-generated method stub
        return 0;
    }
	
	

}
