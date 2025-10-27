package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload_Download {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Ch driver\\ChromeDriver.exe");
		WebDriver wd=new ChromeDriver();
		wd.get("https://demoqa.com/upload-download");
		wd.manage().window().maximize();
		WebElement down=wd.findElement(By.id("downloadButton"));
		down.click();
		Thread.sleep(3000);
		wd.findElement(By.id("uploadFile")).sendKeys("C:\\Users\\prave\\Downloads\\RAGUL 2 (3) (3) (1).txt");
	}

}
