package SeleniumBasics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popup_Alert2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Ch driver\\ChromeDriver.exe");
		WebDriver wd=new ChromeDriver();
		wd.get("https://vinothqaacademy.com/alert-and-popup/");
		WebElement sim=wd.findElement(By.name("alertbox"));
		sim.click();
		Alert al=wd.switchTo().alert();
		System.out.println(al.getText());
		Thread.sleep(3000);
		al.accept();
		Thread.sleep(3000);
		
		WebElement con=wd.findElement(By.name("confirmalertbox"));
		con.click();
		al=wd.switchTo().alert();
		System.out.println(al.getText());
		Thread.sleep(3000);
		al.dismiss();
		Thread.sleep(3000);
		
		WebElement pro=wd.findElement(By.name("promptalertbox1234"));
		pro.click();
		al=wd.switchTo().alert();
		Thread.sleep(3000);
		al.sendKeys("no");
		System.out.println(al.getText());
		Thread.sleep(3000);
		al.accept();

		
	}

}
