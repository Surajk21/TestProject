package efgh;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Class3 {
	
	@Test(groups={"sanity"}, priority=1)
	  public void login(){
		  System.out.println("Login Successfully");
	  }
	@Test(groups={"sanity","regression"},priority=6)
	  public void logout(){
		  System.out.println("Logout Successfully");
	  }
	
	 @Test(groups={"sanity"}, priority=2)
	  public void search(){
		  System.out.println("search Successfully");
	  }
	  @Test(groups={"regression"}, priority=3)
	  public void advancedSearch(){
		  System.out.println("advancedSearch Successfully");
	  }
	  @Test(groups={"regression"}, priority=4)
	  public void billPayment(){
		  System.out.println("billPayment Successfully");
	  }
	  @Test(groups={"sanity","regression"},priority=5)
	  public void prepaidRecharge(){
		  System.out.println("prepaidRecharge Successfully");
	  }
}
