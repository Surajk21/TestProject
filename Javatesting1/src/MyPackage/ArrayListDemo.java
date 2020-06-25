package MyPackage;
import java.util.ArrayList;

public class ArrayListDemo {
	
	
	public static void main(String args[])
	{
		ArrayList<String> arr=new ArrayList<String>();
	
		arr.add("A");
		arr.add("B");
		
		for(String str:arr)
		{
		System.out.println(str);
		}
		
		System.out.println("-----------------------------");
		arr.add("C");
		
		for(String str:arr)
		{
		System.out.println(str);
		}
		System.out.println("-----------------------------");
		arr.add(2,"-");
		
		for(String str:arr)
		{
		System.out.println(str);
		}
		
		
		arr.remove(2);
		//arr.remove("-");
		
		System.out.println("-----------------------------");
		for(String str:arr)
		{
		System.out.println(str);
		}
		
		
	}
}
