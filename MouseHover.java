package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Ch driver\\ChromeDriver.exe");
		WebDriver wd=new ChromeDriver();
		wd.get("https://practice.expandtesting.com/hovers");
		WebElement one=wd.findElement(By.xpath("//*[@id=\"core\"]/div/div/div[1]/img"));
		WebElement two=wd.findElement(By.xpath("//*[@id=\"core\"]/div/div/div[2]/img"));
		WebElement three=wd.findElement(By.xpath("//*[@id=\"core\"]/div/div/div[3]/img"));
		Actions act=new Actions(wd);
		act.moveToElement(three).perform();
		Thread.sleep(2000);
		act.moveToElement(two).perform();
		Thread.sleep(2000);
		act.moveToElement(one).perform();
		Thread.sleep(2000);
		wd.findElement(By.xpath("//*[@id=\"core\"]/div/div/div[1]/div/a")).click();
	}

}
