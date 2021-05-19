package Challangese;
/*========================
Open Chrome/Firefox
Launch app : https://www.noon.com/uae-en/

Get the carousel items from:
 Recommended For You
 Sports shoes under 199 AED
 Top picks in laptops
 Limited time offers
 Bestselling fragrances*/

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day2 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.noon.com/uae-en/");

	}

}
