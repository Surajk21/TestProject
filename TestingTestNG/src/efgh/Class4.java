package efgh;

import org.testng.annotations.Test;

public class Class4 {
	 @Test
	  public void testcase1(){
		 long id=Thread.currentThread().getId();
		 System.out.println("testcase1 Successful"+"thread count is"+ id);
	  }
	  @Test
	  public void testcase2(){
		  long id=Thread.currentThread().getId();
		  System.out.println("testcase2 Successful"+"thread count is"+id);
	  }
	  @Test
	  public void testcase3(){
		  long id=Thread.currentThread().getId();
		  System.out.println("testcase3 Successful"+"thread count is"+id);
	  }
	  @Test
	  public void testcase4(){
		  long id=Thread.currentThread().getId();
		  System.out.println("testcase4 Successful"+"thread count is"+id);
	  }
}
