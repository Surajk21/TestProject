package efgh;

import org.testng.annotations.Test;

public class Class6 {
	 @Test
	  public void testcase9(){
		 long id=Thread.currentThread().getId();
		 System.out.println("testcase9 Successful"+"thread count is"+ id);
	  }
	  @Test
	  public void testcase10(){
		  long id=Thread.currentThread().getId();
		  System.out.println("testcase10 Successful"+"thread count is"+id);
	  }
	  @Test
	  public void testcase11(){
		  long id=Thread.currentThread().getId();
		  System.out.println("testcase11 Successful"+"thread count is"+id);
	  }
	  @Test
	  public void testcase12(){
		  long id=Thread.currentThread().getId();
		  System.out.println("testcase12 Successful"+"thread count is"+id);
	  }
}
