package Exams1;





import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Wappalyzer {
	
	WebDriver driver;
	
	@Before
	public void setUp()
	{
		driver=new FirefoxDriver();
		driver.get("https://www.wappalyzer.com");
		driver.manage().window().maximize();
	}
	
	@Test
	public void wapTest()
	{
		
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/main/div/div[1]/header/div/div/div/div[2]/button[2]/span")).click();
	    driver.findElement(By.xpath("//a[@href='/technologies/']/div/div")).click();	
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);			

		driver.findElement(By.xpath("//*[@id=\"app\"]/div/main/div/div[2]/div[2]/div/div[2]/div[1]/div[1]/a/div/div/div[2]/span")).click();
		driver.findElement(By.xpath("//div[@class=\"v-alert__content\"]/a/span")).click();
		
		driver.findElement(By.xpath("//*[@value='technologies']")).click();
		
	}
}

