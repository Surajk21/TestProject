package MyPackage;

import java.io.File;
import java.io.IOException;

public class javaFileHandling {

	public static void main(String[] args) throws IOException {
		
		File fileObject=new File("C:/Users/suraj/Desktop/Home");
		//fileObject.mkdir(); //To Create
		fileObject.delete(); //To Delete
		
		

	}

}
