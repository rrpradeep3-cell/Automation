package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_and_Drop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Ch driver\\ChromeDriver.exe");
		WebDriver wd=new ChromeDriver();
		wd.get("https://testautomationcentral.com/demo/drag_and_drop.html");
		WebElement drag=wd.findElement(By.xpath("//*[@id=\"draggable\"]"));
		WebElement drop=wd.findElement(By.xpath("//*[@id=\"droppable\"]"));
		Actions act=new Actions(wd);
		act.dragAndDrop(drag, drop).build().perform();
	}

}
