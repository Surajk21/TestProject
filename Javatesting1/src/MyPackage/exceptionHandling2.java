package MyPackage;

import java.util.Scanner;

public class exceptionHandling2 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Read two numbers");
		
		try{
		String s1=scan.next();
		String s2=scan.next();
		
		int a=Integer.parseInt(s1);
		int b=Integer.parseInt(s2);
		System.out.println(a+b);
		}
		catch(NumberFormatException e){
			System.out.println("NumberFormatException exists");
		}
		scan.close();
		
	}

}
