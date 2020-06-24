package efgh;

import org.testng.annotations.Test;

public class Class2 {
	 @Test(priority=4)
	  public void deleteProduct(){
		  System.out.println("Product delete Successfully");
	  }
	  @Test(priority=5)
	  public void deleteCurrency(){
		  System.out.println("Currency delete Successfully");
	  }
	  @Test(priority=6)
	  public void deleteVendors(){
		  System.out.println("Vendors delete Successfully");
	  }
}
