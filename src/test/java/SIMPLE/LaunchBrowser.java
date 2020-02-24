package SIMPLE;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LaunchBrowser {
	@Test
	public void launch()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("http://google.com");
		String tit = driver.getTitle();
		System.out.println(tit);
	}

}
