package assignments;
import java.util.*;
public class returntypes {

	static void add()
	{
		int a,b;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the numbers");
		a=s.nextInt();
		b=s.nextInt();
		
		int c=a+b;
		System.out.println("Add method "+c);
	}
	static int addition()
	{
		int a,b;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the numbers");
		a=s.nextInt();
		b=s.nextInt();
		
		int c=a+b;
		return c;
	}
	static float adds()
	{
		float a,b;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the numbers");
		a=s.nextFloat();
		b=s.nextFloat();
		float c=a+b;
		return c;
	}
	static char returnchar()
	{
		return 'd';
	}
	
	
	public static void main(String[] args)
	{
		add();
		int addi=addition();
		System.out.println(addi);
		float addsmethod=adds();
		System.out.println(addsmethod);
		char d=returnchar();
		System.out.println(d);
	}
}
