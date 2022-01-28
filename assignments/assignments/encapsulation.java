package assignments;

public class encapsulation {


class EmployeeCount
{
   private int numOfEmployees = 0;
   public void setNoOfEmployees (int count)
   {
       numOfEmployees = count;
   }
   public double getNoOfEmployees () 
   {
       return numOfEmployees;
   }
}
public static class Encapsulation
{
   private static EmployeeCount obj;

public static void main(String args[])
   {
      obj.setNoOfEmployees(5613);
      System.out.println("No Of Employees: "+(int)obj.getNoOfEmployees());
    }
}
}