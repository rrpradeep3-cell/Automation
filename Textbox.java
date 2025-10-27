package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Textbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Ch driver\\ChromeDriver.exe");
		WebDriver wd=new ChromeDriver();
		wd.get("https://demoqa.com/automation-practice-form");
		wd.findElement(By.id("firstName")).sendKeys("John");
		wd.findElement(By.id("lastName")).sendKeys("Snow");
		wd.findElement(By.id("userEmail")).sendKeys("johnsnow@gmail.com");
		wd.findElement(By.id("userNumber")).sendKeys("9000050000");
		wd.findElement(By.id("currentAddress")).sendKeys("536,downtown,california,USA-50023");

		
	}

}
