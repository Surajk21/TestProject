package efgh;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Class1 {
	@BeforeTest
	  public void login(){
		  System.out.println("Login Successfully");
	  }
	  @AfterTest
	  public void logout(){
		  System.out.println("Logout Successfully");
	  }
	  
	  @Test(priority=1)
	  public void addProduct(){
		  System.out.println("Product Added Successfully");
	  }
	  @Test(priority=2)
	  public void addCurrency(){
		  System.out.println("Currency Added Successfully");
	  }
	  @Test(priority=3)
	  public void addVendors(){
		  System.out.println("Vendors Added Successfully");
	  }
}
