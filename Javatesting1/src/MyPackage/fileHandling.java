package MyPackage;

import java.io.File;
import java.io.IOException;

public class fileHandling {

	public static void main(String[] args) throws IOException {
		
		File fileObject=new File("C:/Users/suraj/Desktop/Home.txt");
		//fileObject.createNewFile();
		fileObject.delete();
		
	}

}
