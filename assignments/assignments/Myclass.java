package assignments;

public class Myclass {

    public static void main(String args[]) 
    {
        int[] array = new int[4];
        try 
        {
            array[6] = 2;
        }
        catch (ArrayIndexOutOfBoundsException e) 
        {
            System.out.println("Array index is out of bounds!"); 
        }
        finally 
        {
            System.out.println("The array is of size " + array.length);
        }
    }
}
