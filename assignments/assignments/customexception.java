package assignments;

public class customexception {


	static void performance(int salary)throws PerformanceException
	{
	if (salary<2100)
		throw new PerformanceException("you need to work hard");
	else if(salary>2100 && salary<5000)
		throw new PerformanceException("your salary is somehow good");
	else if(salary>5100 && salary<9000)
		throw new PerformanceException("your salary is very good");
	else
		System.out.println("invalidamount");
}
public static void main(String[] args) {
	try {
		performance(5200);
	}
	catch(Exception e)
	{
		System.out.println("Exception occured:"+e.getMessage());
	}
	finally
	{
		System.out.println("finally block executed");
	}
}

}
class PerformanceException  extends Exception{
PerformanceException(String e){
	super(e);
}


}



