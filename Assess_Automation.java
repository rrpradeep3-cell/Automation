package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assess_Automation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Ch driver\\ChromeDriver.exe");
		WebDriver wd=new ChromeDriver();
		wd.get("https://vinothqaacademy.com/mouse-event/");
		wd.manage().window().maximize();
		WebElement drag=wd.findElement(By.xpath("//*[@id=\"draggableElement\"]"));
		WebElement drop=wd.findElement(By.xpath("//*[@id=\"droppableElement\"]"));
		Actions act=new Actions(wd);
		Thread.sleep(5000);
		act.dragAndDrop(drag, drop).build().perform();
		Thread.sleep(2000);
		
		WebElement dc=wd.findElement(By.xpath("//*[@id=\"dblclick\"]"));
		act.doubleClick(dc).perform();
		Thread.sleep(2000);
		WebElement rc=wd.findElement(By.xpath("//*[@id=\"rightclick\"]"));
		act.contextClick(rc).perform();
		Thread.sleep(2000);	
		WebElement rg=wd.findElement(By.xpath("//*[@id=\"myDiv\"]/ul/center[1]/a"));
		rg.click();

		
	}

}

