package SeleniumBasics;

import java.util.*;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Move_to_Tab {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Ch driver\\ChromeDriver.exe");
		WebDriver wd=new ChromeDriver();
		wd.get("https://www.youtube.com/");
		wd.manage().window().maximize();
		Thread.sleep(3000);
		
		((JavascriptExecutor)wd).executeScript("window.open()");
		ArrayList<String> tab2=new ArrayList<String>(wd.getWindowHandles());
		wd.switchTo().window(tab2.get(1));
		wd.get("https://www.netflix.com/in/");
		Thread.sleep(3000);

		((JavascriptExecutor)wd).executeScript("window.open()");	
		ArrayList<String> tab3=new ArrayList<String>(wd.getWindowHandles());
		wd.switchTo().window(tab3.get(2));
		wd.get("https://www.primevideo.com/");
		Thread.sleep(3000);
		
		ArrayList<String> tab1R=new ArrayList<String>(wd.getWindowHandles());
		wd.switchTo().window(tab1R.get(0));
		wd.get("https://www.facebook.com/");
		Thread.sleep(3000);
		
		ArrayList<String> tab2R=new ArrayList<String>(wd.getWindowHandles());
		wd.switchTo().window(tab2R.get(1));
		wd.get("https://www.instagram.com/");
		Thread.sleep(3000);
		
		ArrayList<String> tab3R=new ArrayList<String>(wd.getWindowHandles());
		wd.switchTo().window(tab3R.get(2));
		wd.get("https://www.snapchat.com/");
		Thread.sleep(3000);

	}

}
