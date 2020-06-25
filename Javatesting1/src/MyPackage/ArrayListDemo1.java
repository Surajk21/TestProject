package MyPackage;
import java.util.ArrayList;

public class ArrayListDemo1 {

	public static void main(String[] args) {
		
		ArrayList arr=new ArrayList();
		
		arr.add(1);
		arr.add("A");
		
		for(Object str:arr)
		{
			System.out.println(str);
		}
	}

}
