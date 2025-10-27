package SeleniumBasics;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.*;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Selenium_Assess {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Ch driver\\ChromeDriver.exe");
		WebDriver wd=new ChromeDriver();
		wd.get("https://testautomationpractice.blogspot.com/#");
		wd.manage().window().maximize();
		
		//GUI Elements//
		wd.findElement(By.id("name")).sendKeys("john");
		wd.findElement(By.id("email")).sendKeys("john5@gmail.com");
		wd.findElement(By.id("phone")).sendKeys("9500012345");
		wd.findElement(By.id("textarea")).sendKeys("543,down town,california,USA-250369");
		Thread.sleep(2000);
		
		WebElement male=wd.findElement(By.id("male"));
		male.click();
		WebElement Saturday=wd.findElement(By.id("saturday"));
		Saturday.click();
		Thread.sleep(2000);
		
		WebElement Country=wd.findElement(By.id("country"));
		Select st=new Select(Country);
		st.selectByIndex(6);
		WebElement Colors=wd.findElement(By.id("colors"));
		Select sl=new Select(Colors);
		sl.selectByIndex(0);
		WebElement lion=wd.findElement(By.xpath("//*[@id=\"animals\"]/option[8]"));
		lion.click();
		Thread.sleep(2000);
		
		//Date Picker//
		wd.findElement(By.id("datepicker")).sendKeys("09/27/2025");
		Thread.sleep(2000);
		wd.findElement(By.id("txtDate")).click();
		Thread.sleep(2000);
		WebElement month=wd.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/select[1]"));
		Select se=new Select(month);
		Thread.sleep(2000);
		se.selectByVisibleText("Oct");
		WebElement year=wd.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/select[2]"));
		Select sc=new Select(year);
		Thread.sleep(2000);
		sc.selectByVisibleText("2025");
		wd.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[5]/td[3]/a")).click();
		Thread.sleep(2000);
		
		//Upload Files//
		wd.findElement(By.xpath("//*[@id=\"singleFileInput\"]")).sendKeys("C:\\SQL2022\\Express_ENU\\AUTORUN.INF");
		Thread.sleep(2000);
		wd.findElement(By.xpath("//*[@id=\"singleFileForm\"]/button")).click();
		Thread.sleep(2000);
		wd.findElement(By.xpath("//*[@id=\"multipleFilesInput\"]")).sendKeys("C:\\Python313\\LICENSE.txt");
		wd.findElement(By.xpath("//*[@id=\"multipleFilesInput\"]")).sendKeys("C:\\Python313\\NEWS.txt");
		Thread.sleep(2000);
		wd.findElement(By.xpath("//*[@id=\"multipleFilesForm\"]/button")).click();
		Thread.sleep(2000);
		
		//Static Web Table//
		List col=wd.findElements(By.xpath("//*[@id=\"HTML1\"]/div[1]/table/tbody/tr[1]/th"));
		System.out.println("No of columns are : "+col.size());
		List row=wd.findElements(By.xpath("//*[@id=\"HTML1\"]/div[1]/table/tbody/tr/td[1]"));
		System.out.println("No of rows are : "+row.size());
		Thread.sleep(2000);
		
		//Dynamic Web Table//
		List col2=wd.findElements(By.xpath("//*[@id=\"headers\"]/th"));
		System.out.println("No of columns2 are : "+col2.size());
		List row2=wd.findElements(By.xpath("//*[@id=\"rows\"]/tr/td[1]"));
		System.out.println("No of rows2 are : "+row2.size());
		Thread.sleep(2000);
		
		//Pagination Web Table//
		wd.findElement(By.xpath("//*[@id=\"productTable\"]/tbody/tr[1]/td[4]/input")).click();
		wd.findElement(By.xpath("//*[@id=\"productTable\"]/tbody/tr[2]/td[4]/input")).click();
		wd.findElement(By.xpath("//*[@id=\"productTable\"]/tbody/tr[3]/td[4]/input")).click();
		wd.findElement(By.xpath("//*[@id=\"productTable\"]/tbody/tr[4]/td[4]/input")).click();
		Thread.sleep(3000);
		wd.findElement(By.xpath("//*[@id=\"pagination\"]/li[2]/a")).click();
		Thread.sleep(2000);
	
		//Tabs//
		wd.findElement(By.xpath("//*[@id=\"Wikipedia1_wikipedia-search-input\"]")).sendKeys("tiger");
		Thread.sleep(2000);
		wd.findElement(By.xpath("//*[@id=\"Wikipedia1_wikipedia-search-form\"]/div/span[2]/span[2]/input")).click();
		Thread.sleep(2000);

		//Dynamic Button//
		WebElement start=wd.findElement(By.name("start"));
		start.click();
		Thread.sleep(2000);
		
		//Alerts & Popups//
		WebElement simple=wd.findElement(By.id("alertBtn"));
		simple.click();
		Alert al=wd.switchTo().alert();
		Thread.sleep(2000);
		al.accept();
		Thread.sleep(2000);

		WebElement confirm=wd.findElement(By.id("confirmBtn"));
		confirm.click();
		al=wd.switchTo().alert();
		Thread.sleep(2000);
		al.dismiss();
		Thread.sleep(2000);

		WebElement prompt=wd.findElement(By.id("promptBtn"));
		prompt.click();
		al=wd.switchTo().alert();
		Thread.sleep(2000);
		al.sendKeys("Potter");
		al.accept();
		Thread.sleep(2000);

		//New Tab//
		WebElement tab=wd.findElement(By.xpath("//*[@id=\"HTML4\"]/div[1]/button"));
		tab.click();
		Thread.sleep(5000);
		ArrayList<String> tab2=new ArrayList<String>(wd.getWindowHandles());
		wd.switchTo().window(tab2.get(1));
		wd.close();
		Thread.sleep(2000);
		
		ArrayList<String> tab1R=new ArrayList<String>(wd.getWindowHandles());
		wd.switchTo().window(tab1R.get(0));
		
		//Popup Windows//
		WebElement popup=wd.findElement(By.id("PopUp"));
		popup.click();
		Thread.sleep(4000);
		String oldwnd=wd.getWindowHandle();
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
		wd.switchTo().window(oldwnd);
		
        //Mouse Hover//
		WebElement point=wd.findElement(By.xpath("//*[@id=\"HTML3\"]/div[1]/div/button"));
		Actions ac=new Actions(wd);
		ac.moveToElement(point).perform();
		Thread.sleep(2000);
		wd.findElement(By.xpath("//*[@id=\"HTML3\"]/div[1]/div/div/a[1]")).click();
		Thread.sleep(2000);
		
		//Double Click//
		WebElement copy=wd.findElement(By.xpath("//*[@id=\"HTML10\"]/div[1]/button"));
		ac.doubleClick(copy).perform();
		Thread.sleep(2000);
		
		//Drag and Drop//
		WebElement drag=wd.findElement(By.xpath("//*[@id=\"draggable\"]/p"));
        WebElement drop=wd.findElement(By.xpath("//*[@id=\"droppable\"]"));
        ac.dragAndDrop(drag, drop).build().perform();
		Thread.sleep(2000);
        
		//Slider//
        WebElement slider=wd.findElement(By.xpath("//*[@id=\"slider-range\"]/span[1]"));
        for(int i=76;i<=125;i++)
        {
        	slider.sendKeys(Keys.ARROW_RIGHT);
        }
		Thread.sleep(2000);

		//Scrolling DropDown//
		WebElement scroll=wd.findElement(By.id("comboBox"));
		scroll.click();
		Thread.sleep(2000);
		wd.findElement(By.xpath("//*[@id=\"dropdown\"]/div[3]")).click();
		
		//Laptop Links//
		wd.findElement(By.xpath("//*[@id=\"apple\"]")).click();
		Thread.sleep(4000);
		wd.navigate().back();
		       
		

	}

}
