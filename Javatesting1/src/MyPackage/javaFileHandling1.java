package MyPackage;

import java.io.File;

public class javaFileHandling1 {
	
	public static void main(String[] args) {

		File fileObject=new File("C:/Users/suraj/Desktop/Home");
		boolean status=fileObject.exists();
		
		if(status==true)
			System.out.println("Folder Exists");
		else
			System.out.println("Folder does not exists");

	}

}
