package Challangese;


import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Day3 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.zoopla.co.uk/");
		JavascriptExecutor js = (JavascriptExecutor) driver;  
		WebElement p=driver.findElement(By.xpath("//form[@class='ui-form ui-cookie-consent']//button[@type='button']"));
		js.executeScript("arguments[0].click();",p);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement skey=driver.findElement(By.xpath("//div[@class='css-fbvwf6-StyledWrapper eubx8ma9']//input[@id='filters-location-mobile']"));
		js.executeScript("arguments[0].click();", skey);
		skey.sendKeys("London");
		System.out.println("Hi");
		
		
		
		}
		
	

}
