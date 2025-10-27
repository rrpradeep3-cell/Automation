package SeleniumBasics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Doubleclick_Rightclick {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Ch driver\\ChromeDriver.exe");
		WebDriver wd=new ChromeDriver();
		wd.get("https://demo.guru99.com/test/simple_context_menu");
		WebElement db=wd.findElement(By.xpath("//*[@id=\"authentication\"]/button"));
		Actions act=new Actions(wd);
		Thread.sleep(3000);
		act.doubleClick(db).perform();
		Alert al=wd.switchTo().alert();
		Thread.sleep(3000);
		al.accept();
		Thread.sleep(3000);

		WebElement rc=wd.findElement(By.xpath("//*[@id=\"authentication\"]/span"));
		act.contextClick(rc).perform();
		Thread.sleep(3000);
		WebElement pt=wd.findElement(By.xpath("//*[@id=\"authentication\"]/ul/li[4]/span"));
		Thread.sleep(3000);
		pt.click();
		al=wd.switchTo().alert();
		Thread.sleep(3000);
		al.accept();
		

	}

}
