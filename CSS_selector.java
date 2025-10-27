package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS_selector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Ch driver\\ChromeDriver.exe");
		WebDriver wd=new ChromeDriver();
		wd.get("https://www.flipkart.com/");
		wd.manage().window().maximize();
		wd.findElement(By.cssSelector("input.Pke_EE")).sendKeys("redmi");
		wd.findElement(By.cssSelector("button[type=submit]")).click();
	}

}
