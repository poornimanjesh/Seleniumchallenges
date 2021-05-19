package Challangese;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class World_population_day1 {

	
		static WebDriver driver;
		static String totalcount="//div[@class='label-counter']//parent::div//span[@class='rts-counter']";
		static String today_BIRTH_DETH_TOTAL="//div[text()=' Current World Population' or text()='Today']//parent::div//span[@class='rts-counter']";
		
		public static void main(String[] args) {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			driver.get("https://www.worldometers.info/world-population/");
		     birt_death(totalcount);
			//birt_death(today_BIRTH_DETH_TOTAL);
		}
		public static void birt_death(String locator) {
			int count=1;
			while(count<=5) {
				count=count+1;
				System.out.println("++++++++++++every itirate++++++++++++++++++++++");
				List<WebElement> t=driver.findElements(By.xpath(locator));

				for (WebElement e : t) {

					System.out.println(e.getText());
				}
			}

	}

}
