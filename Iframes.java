package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Ch driver\\ChromeDriver.exe");
		WebDriver wd=new ChromeDriver();
		wd.get("https://www.rediff.com/");
		wd.switchTo().frame(0);
		//wd.switchTo().frame("moneyiframe");
		//WebElement fr=wd.findElement(By.xpath("//*[@id=\"moneyiframe\"]"));
		//wd.switchTo().frame(fr);
		WebElement nse=wd.findElement(By.id("nseindex"));
		System.out.println(nse.getText());
		wd.switchTo().defaultContent();
		wd.findElement(By.linkText("CRICKET")).click();
				
	}

}
