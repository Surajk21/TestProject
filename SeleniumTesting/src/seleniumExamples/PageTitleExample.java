package seleniumExamples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class PageTitleExample {

	public static void main(String[] args) {
		/*System.setProperty("webdriver.gecko.driver", "D:/Suraj/geckodriver-v0.26.0-win64/geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();*/
		
		System.setProperty("webdriver.ie.driver", "D:/Suraj/IEDriverServer_Win32_3.150.1/IEDriverServer.exe");
		
		WebDriver driver = new InternetExplorerDriver();
		
		driver.get("https://www.google.com/");
		
		String PageTitle=driver.getTitle();
		System.out.println(PageTitle);
		if(PageTitle.equals("Google"))
			System.out.println("Passed");
		else
			System.out.println("Failed");
		
		driver.close();
	}

}
