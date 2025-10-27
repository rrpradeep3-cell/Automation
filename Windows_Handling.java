package SeleniumBasics;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windows_Handling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Ch driver\\ChromeDriver.exe");
		WebDriver wd=new ChromeDriver();
		wd.get("https://www.leafground.com/window.xhtml");
		wd.manage().window().maximize();
		String oldwnd=wd.getWindowHandle();
		Thread.sleep(3000);
		WebElement opbtn=wd.findElement(By.xpath("//*[@id=\"j_idt88:new\"]"));
		opbtn.click();
		Thread.sleep(3000);
		
		Set<String> childwnd=wd.getWindowHandles();
		
		for(String newwnd:childwnd)
		{
			wd.switchTo().window(newwnd);
		}
		WebElement dlqz=wd.findElement(By.id("j_idt107"));
		dlqz.click();
		Thread.sleep(3000);
		wd.switchTo().window(oldwnd);
		Thread.sleep(3000);

		WebElement multiplewnd=wd.findElement(By.id("j_idt88:j_idt91"));
		multiplewnd.click();
		Thread.sleep(3000);
		int noofwndw=wd.getWindowHandles().size();
		System.out.println(noofwndw);
		Thread.sleep(3000);
		
		WebElement clwnd=wd.findElement(By.id("j_idt88:j_idt93"));
		clwnd.click();
		Thread.sleep(3000);
		
		Set<String> windowPrimary=wd.getWindowHandles();
		for(String primary:windowPrimary)
		{
			if(!primary.equals(oldwnd))
			{
				wd.switchTo().window(primary);
				Thread.sleep(3000);
				wd.close();

			}
		}



		

		
	}

}
