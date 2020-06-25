package MyPackage;

public class exceptionalHandling3 {

	public static void main(String[] args) {

		int a[]=new int[5];
		
		try
		{
		a[100]=12;
			System.out.println(a[100]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("ArrayIndexOutOfBoundsException Occured");
		}

	}

}
