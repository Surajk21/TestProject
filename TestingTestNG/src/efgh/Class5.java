package efgh;

import org.testng.annotations.Test;

public class Class5 {
	 @Test
	  public void testcase5(){
		 long id=Thread.currentThread().getId();
		 System.out.println("testcase5 Successful"+"thread count is"+ id);
	  }
	  @Test
	  public void testcase6(){
		  long id=Thread.currentThread().getId();
		  System.out.println("testcase6 Successful"+"thread count is"+id);
	  }
	  @Test
	  public void testcase7(){
		  long id=Thread.currentThread().getId();
		  System.out.println("testcase7 Successful"+"thread count is"+id);
	  }
	  @Test
	  public void testcase8(){
		  long id=Thread.currentThread().getId();
		  System.out.println("testcase8 Successful"+"thread count is"+id);
	  }
}
