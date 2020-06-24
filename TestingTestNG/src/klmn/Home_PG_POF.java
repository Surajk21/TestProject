package klmn;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Home_PG_POF {

	final WebDriver driver;
	
	@FindBy(how=How.XPATH, using="/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[1]/a")
	public WebElement lnk_LogOut;
	
	public Home_PG_POF(WebDriver driver){
		this.driver=driver;
	}
	
}
