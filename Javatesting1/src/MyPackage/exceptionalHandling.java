package MyPackage;

public class exceptionalHandling {

	public static void main(String[] args) {
		
		int a=10;
		int b=10;
		
		try{
			int result=a/b;
			System.out.println(result);
			
		}
		catch(ArithmeticException e){
			System.out.println("Divide by zero error");
		}

	}

}
