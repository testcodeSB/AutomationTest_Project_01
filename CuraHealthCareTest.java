package CURAHealthcare;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class CuraHealthCareTest {
	
	public static void main(String[]args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		//ContactUs(driver);
		//BookApointment(driver,20);
		//AllmenuOpt(driver,30);
		Doctersdetails(driver,30);
	}
	
	
	
	public static  void ContactUs(WebDriver driver) throws InterruptedException {
		
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("http://www.curahealthcareservices.com/");
		
		Thread.sleep(2000);
		driver.findElement(By.linkText("Contact Us")).click();
		driver.findElement(By.id("fname")).sendKeys("Dusmanta");
		driver.findElement(By.id("lname")).sendKeys("Sahoo");
		driver.findElement(By.id("email")).sendKeys("Biki.12@gmail.com");
		driver.findElement(By.id("phone")).sendKeys("8310982687");
		driver.findElement(By.id("message")).sendKeys("I need an appointment");
		
		Thread.sleep(2000);
		WebElement Submit = driver.findElement(By.xpath("//input[@type='submit']"));
		
		Actions act=new Actions(driver);
		act.moveToElement(Submit);
		act.click().build().perform();
		
	}
	public static void BookApointment(WebDriver driver,int waitTime) throws InterruptedException {
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(waitTime));
		driver.get("http://www.curahealthcareservices.com/");
		
		driver.findElement(By.linkText("Book Appointment")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("name")).sendKeys("Biki");
		driver.findElement(By.id("phone")).sendKeys("8310982687");
		driver.findElement(By.id("email")).sendKeys("biki.12@gmail.com");
		driver.findElement(By.id("date")).sendKeys("30-04-2024");
		WebElement Session = driver.findElement(By.id("session"));
		Select SessionSelect=new Select(Session);
		SessionSelect.selectByIndex(2);
		 
		WebElement Book = driver.findElement(By.id("inpSubmit"));
		 
		Thread.sleep(2000);
		 
		Actions act=new Actions(driver);
		act.moveToElement(Book);
		act.click().build().perform();
		
		
		
	}
	
	public static void AllmenuOpt(WebDriver driver,int waitTime) throws InterruptedException {
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(waitTime));
		
		driver.navigate().to("http://www.curahealthcareservices.com/");
		driver.findElement(By.linkText("Services")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		driver.findElement(By.linkText("About")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		driver.findElement(By.linkText("Gallery")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		driver.findElement(By.linkText("Blogs")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().refresh();
		
	}
	public static void Doctersdetails(WebDriver driver,int wait) throws InterruptedException {
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(wait));
		
		driver.navigate().to("http://www.curahealthcareservices.com/");
		
		WebElement doctor1 = driver.findElement(By.xpath("//*[@id=\"doctors\"]/div/div[1]"));
		Actions act=new Actions(driver);
		act.moveToElement(doctor1);
		Thread.sleep(4000);
		
		 WebElement link1 = driver.findElement(By.xpath("//*[@id=\"doctors\"]/div/div[1]/div/a[1]"));
		 act.moveToElement(link1);
		 act.click().build().perform();
		 driver.navigate().back();
		 
		 Thread.sleep(3000);
		 WebElement link2 = driver.findElement(By.xpath("//*[@id=\"doctors\"]/div/div[1]/div/a[3]"));
		 act.moveToElement(link2);
		 act.click().build().perform();
	}
	
}
