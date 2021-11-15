package SeleniumTest.SeleniumTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class App
{
	public String baseUrl = "https://www.javatpoint.com/";  
	String driverPath = "resources\\chromedriver.exe";  
	public WebDriver driver ;   
	@Test             
	public void test() {       
	System.setProperty("webdriver.chrome.driver", driverPath);  
	driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);  
	driver.manage().window().maximize();  
	driver.get(baseUrl);  
	String URL= driver.getCurrentUrl();  
	System.out.print(URL);  
	String title = driver.getTitle();                  
	System.out.println(title);  
	}     
	@BeforeTest  
	public void beforeTest() {    
	System.out.println("before test");  
	}     
	@AfterTest  
	public void afterTest() {  
	driver.quit();  
	System.out.println("after test");  
	}   
	public static void main(String[] args) {
		
	}
}
