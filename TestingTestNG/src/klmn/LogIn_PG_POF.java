package klmn;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LogIn_PG_POF {
	
	final WebDriver driver;
	
	@FindBy(how=How.NAME, using="userName")
	public WebElement txtbox_uname;
	
	@FindBy(how=How.NAME, using="password")
	public WebElement txtbox_password;
	
	@FindBy(how=How.NAME, using="login")
	public WebElement btn_login;
	
	public LogIn_PG_POF(WebDriver driver){
		this.driver=driver;
	}
	
	public void LogIn_Action(String sUname, String sPass)
	{
		txtbox_uname.sendKeys(sUname);
		txtbox_password.sendKeys(sPass);
	}
	
}
