package SeleniumBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Ch driver\\ChromeDriver.exe");
		WebDriver wd=new ChromeDriver();
		wd.get("https://demo.guru99.com/test/web-table-element.php");
		List col=wd.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/thead/tr/th"));
		System.out.println("No of columns are - "+col.size());
		
		List row=wd.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr/td[1]/a"));
		System.out.println("No of rows are - "+row.size());
		
		for(int i=1;i<=5;i++)
		{
			wd.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[" +i+ "]/td[1]/a")).click();
			Thread.sleep(3000);
			wd.navigate().back();
		}
				
	}

}
