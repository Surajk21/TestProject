package MyPackage;

public class exceptionHandling1 {

	public static void main(String[] args) {
	
		String s=null;
		
		
		try{
			System.out.println(s.length());
		}
		catch(NullPointerException n)
		{
			System.out.println("NullPointerException occured");
		}
	}

}
