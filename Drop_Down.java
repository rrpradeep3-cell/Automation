package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Drop_Down {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Ch driver\\ChromeDriver.exe");
		WebDriver wd=new ChromeDriver();
		wd.get("https://practice.expandtesting.com/dropdown");
		WebElement country=wd.findElement(By.name("country"));
		Select se=new Select(country);
		//se.selectByIndex(30);
		//se.selectByValue("CA");
		se.selectByVisibleText("India");
		
	}

}
