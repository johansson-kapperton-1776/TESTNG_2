package TestRunner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parameter {
	
	@Test
	@Parameters({"browsername" , "url"})
	void homepage(String browser, String url)  {
	
		WebDriver driver = new ChromeDriver();
		
		if (browser.equals("Firefox")) {
			driver = new FirefoxDriver();
		} else if (browser.equals("Chrome")){
			driver = new ChromeDriver(); 
		} else if (browser.equals("Edge"));
			driver = new EdgeDriver();
	}
	
	@Test
	void titletest() {
		
		String expectedtitle = "products";
		String actualtitle = "Products";
		
		int expectedproduct = 6;
		int actualproduct = 9;
		
		Assert.assertEquals(expectedtitle, actualtitle);
	}
}
