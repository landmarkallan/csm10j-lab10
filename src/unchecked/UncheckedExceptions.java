package unchecked;

public class UncheckedExceptions
{	
	public static void ThrowIndexOutOfBounds()
	{
		int[] intArray = new int[10];
		System.out.print("Item at index 10: " + intArray[10]);
	}
	
	public static void CatchIndexOutOfBounds()
	{
		try
		{
			int[] intArray = new int[10];
			System.out.println("Item at index 10: " + intArray[10]);
		}
		catch (ArrayIndexOutOfBoundsException aex)
		{
			System.out.println("Caught ArrayIndexOutOfBounds");
		}
	}
	
	public static void CatchIndexOutOfBoundsFinally()
	{
		try
		{
			int[] intArray = new int[10];
			intArray[0] = 13;
			System.out.println("Item at index 0: " + intArray[0]);
		}
		catch (ArrayIndexOutOfBoundsException aex)
		{
			System.out.println("Caught ArrayIndexOutOfBounds");
		}
		finally
		{
			System.out.println("Finally statement executed");
		}
	}
}
