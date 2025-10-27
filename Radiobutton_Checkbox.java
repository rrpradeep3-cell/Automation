package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radiobutton_Checkbox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Ch driver\\ChromeDriver.exe");
		WebDriver wd=new ChromeDriver();
		wd.get("https://ironspider.ca/forms/checkradio.htm");
		WebElement red=wd.findElement(By.xpath("//*[@id=\"Content\"]/div[1]/blockquote[1]/form/input[1]"));
		red.click();
		Thread.sleep(3000);
		WebElement yellow=wd.findElement(By.xpath("//*[@id=\"Content\"]/div[1]/blockquote[1]/form/input[2]"));
		yellow.click();
		Thread.sleep(3000);
		WebElement blue=wd.findElement(By.xpath("//*[@id=\"Content\"]/div[1]/blockquote[1]/form/input[3]"));
		blue.click();
		Thread.sleep(3000);
		WebElement mozilla=wd.findElement(By.xpath("//*[@id=\"Content\"]/div[1]/blockquote[2]/form/input[2]"));
		mozilla.click();

	}

}
