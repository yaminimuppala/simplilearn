package assignments;

public class constructor {


class calculate
{
	//Zero argument constructor
	calculate()
	{
		System.out.println("zero argument constructor");
	}
	//parameterised constructor
	public int calculate(int a,int b)
	{
	int  c=a+b;
	System.out.println("addition of two numbers"+ c);
	return c;
	}
	
	public double calculate(int r)
	{
	 double circle=0.5*3.14*r*r;
	 System.out.println("area of circle"+ circle);
	 return circle;
	}
	 
	 public double calculate(double width,int length)
	 {
	 double rect=length*width;
	 System.out.println("area of rectangle"+rect);
	 return rect;
	 }
}

public static class constructor5 
{
	public static void main(String[] args)
	{
	  calculate cal=new calculate();
	  cal.calculate(2,3);
	  cal.calculate(52);
	  cal.calculate(9.85,6);
	 }
}
}