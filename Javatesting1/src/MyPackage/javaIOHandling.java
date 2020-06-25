package MyPackage;

import java.util.Scanner;

public class javaIOHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your Name: ");
		String name=scan.nextLine();
		System.out.println("Your name is "+name);
		
		System.out.println("Enter your City: ");
		String city=scan.next();
		System.out.println("Your city is "+city);
		
		System.out.println("Enter your Lucky Number: ");
		int num=scan.nextInt();
		System.out.println("Your Lucky no. is "+num);
		
		System.out.println("Enter your Mobile No: ");
		Long num2=scan.nextLong();
		System.out.println("Your number is "+num2);
		
		System.out.println("Enter your Float Number: ");
		Double num3=scan.nextDouble();
		System.out.println("Your float num is "+num3);
		
		
		System.out.println("Enter your Character: ");
		char a=scan.next().charAt(2);
		System.out.println("Your lucky character is "+a);
		
		System.out.println("Enter your Boolean Value: ");
		boolean val=scan.nextBoolean();
		System.out.println("Your value is "+val);
		
		scan.close();
	}

}
