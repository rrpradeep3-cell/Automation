package SeleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserAutomation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:\\Ch driver\\ChromeDriver.exe");
WebDriver wd=new ChromeDriver();
wd.get("https://www.youtube.com/");
Thread.sleep(3000);
System.out.println(wd.getCurrentUrl());
System.out.println(wd.getCurrentUrl().length());
System.out.println(wd.getTitle());
System.out.println(wd.getTitle().length());
System.out.println(wd.getPageSource());
System.out.println(wd.getPageSource().length());

	}

}
