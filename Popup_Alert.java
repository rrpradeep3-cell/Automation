package SeleniumBasics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popup_Alert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Ch driver\\ChromeDriver.exe");
		WebDriver wd=new ChromeDriver();
		wd.get("https://demo.automationtesting.in/Alerts.html");
		WebElement sim=wd.findElement(By.className("analystic"));
		sim.click();
		Thread.sleep(3000);
		WebElement in=wd.findElement(By.xpath("//*[@id=\"OKTab\"]/button"));
		in.click();
		Thread.sleep(3000);
		Alert al=wd.switchTo().alert();
		System.out.println(al.getText());
		Thread.sleep(3000);
		al.accept();
		Thread.sleep(3000);

		WebElement con=wd.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a"));
		con.click();
		Thread.sleep(3000);
		WebElement nn=wd.findElement(By.xpath("//*[@id=\"CancelTab\"]/button"));
		nn.click();
		Thread.sleep(3000);
		al=wd.switchTo().alert();
		System.out.println(al.getText());
		Thread.sleep(3000);
		al.dismiss();
	}

}
