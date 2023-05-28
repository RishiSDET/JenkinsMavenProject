package TestCases;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JenkinsExecution {
	
	@Test
	public void launchchrome() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in");
		String pagetitle = driver.getTitle();
		System.out.println("The Page Title is " + pagetitle);
		driver.quit();
	}

}
