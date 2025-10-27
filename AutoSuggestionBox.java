package SeleniumBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestionBox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Ch driver\\ChromeDriver.exe");
		WebDriver wd=new ChromeDriver();
		wd.get("https://www.google.com/?zx=1758642951013&no_sw_cr=1");
		wd.manage().window().maximize();
		Thread.sleep(3000);
		wd.findElement(By.id("APjFqb")).sendKeys("youtube");
		
		List<WebElement> atsg=wd.findElements(By.xpath("//*[@id=\"Alh6id\"]/div[1]"));
		Thread.sleep(3000);
		
        for(WebElement a:atsg)
        {
        	System.out.println("Values are = "+a.getText());
        	if(a.getText().equals("youtube music"));
        	a.click();
    		Thread.sleep(3000);
        }
       
	}

}
