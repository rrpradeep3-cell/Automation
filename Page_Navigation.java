package SeleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Page_Navigation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Ch driver\\ChromeDriver.exe");
		WebDriver wd=new ChromeDriver();
		wd.get("https://www.myntra.com/");
		Thread.sleep(3000);
		wd.navigate().refresh();
		wd.navigate().to("https://www.swiggy.com/");
		Thread.sleep(3000);
		wd.navigate().to("https://www.meesho.com/");
		Thread.sleep(3000);
		wd.navigate().to("https://www.flipkart.com/");
		Thread.sleep(3000);
		wd.navigate().back();
		Thread.sleep(3000);
		wd.navigate().back();
		Thread.sleep(3000);
		wd.navigate().forward();

	}

}
