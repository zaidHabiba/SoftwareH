

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FaceBookTestCase {

	private static WebDriver driver; 
	
	@Before
	public void setUp() throws Exception {
		
		System.setProperty("webdriver.gecko.driver", "C:\\geckodriver.exe");
		driver=new FirefoxDriver();
		
	}
	
	
	
	@After
	public void tearDown()throws Exception{
		
	}
	
	@Test
	public void test() {
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath(".//*[@id='email']")).sendKeys("ayman.h.97abu-eideh@hotmail.com");
		driver.findElement(By.xpath(".//*[@id='pass']")).sendKeys("ayman1234567890");
		driver.findElement(By.xpath(".//*[@id='u_0_2']")).click();
		
	}
	
	

}
