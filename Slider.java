package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Slider {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Ch driver\\ChromeDriver.exe");
		WebDriver wd=new ChromeDriver();
		wd.get("https://jqueryui.com/slider/");
		wd.switchTo().frame(0);
		WebElement sl=wd.findElement(By.xpath("//*[@id=\"slider\"]/span"));
		Thread.sleep(3000);
		
		for(int i=1;i<=60;i++)
		{
			sl.sendKeys(Keys.ARROW_RIGHT);
		}
		Thread.sleep(3000);
		for (int i=60;i>=35;i--)
		{
			sl.sendKeys(Keys.ARROW_LEFT);
		}

	}

}
