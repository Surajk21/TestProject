package MyPackage;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		HashMap<String,String> hash=new HashMap<String,String>();
		hash.put("Name","vaibhav");
		hash.put("Number", "123");
		hash.put("Country","India");
		
		System.out.println(hash.get("Name"));		
			
		System.out.println("---------------------");
		//1st Method
		
		Iterator<String> iterator=hash.keySet().iterator();
		while(iterator.hasNext()){
			String key=iterator.next();
			System.out.println(key+"-"+hash.get(key));
		}
		System.out.println("---------------------");
		
		//2nd Method
		for(Entry<String,String> entry:hash.entrySet())
		{
		System.out.println(entry.getKey() + ":" + entry.getValue());	
		
		}
	}

}
