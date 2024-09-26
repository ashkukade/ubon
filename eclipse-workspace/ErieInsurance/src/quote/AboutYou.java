package quote;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AboutYou {

	public static void main(String[] args) throws InterruptedException {
		 
		//aboutYouMethod();
//-------------------------------------------------------------------------------------------------------------------------------		
        WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.erieinsurance.com/OnlineQuote/?zipCode=10005&product=Auto#/AboutYou");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

		
		//Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id='txtFirstName']")).sendKeys("Ashwin");
		driver.findElement(By.xpath("//*[@id='txtLastName']")).sendKeys("Kukade");
		
		driver.findElement(By.xpath("//*[@class='datepicker']//*[@class='ui-datepicker-trigger']")).click();
		
		WebElement year = driver.findElement(By.xpath("//*[@class='ui-datepicker-year']"));
		Select sltyr = new Select(year);
		sltyr.selectByValue("1990");
		
		WebElement month = driver.findElement(By.xpath("//*[@class='ui-datepicker-month']"));
		Select sltmonth = new Select(month);
		sltmonth.selectByIndex(9);
		
		driver.findElement(By.xpath("//*[@data-handler='selectDay']//*[text()='5']")).click();
		
		driver.findElement(By.xpath("//*[@id='txtAddressLine1']")).sendKeys("Belgium Street 44");
		
		driver.findElement(By.xpath("//*[@id='txtCity']")).sendKeys("NewYork");

		
		//WebElement state = driver.findElement(By.xpath("//select[@class='form-control completed ng-touched ng-dirty ng-valid-parse ng-empty ng-invalid ng-invalid-required']"));
		WebElement state= driver.findElement(By.id("txtState"));
		Select sltstate = new Select(state);
		sltstate.selectByValue("string:NY");
		
		//driver.findElement(By.id("txtZipCode")).sendKeys("10006");
	    Thread.sleep(5000);
		driver.findElement(By.xpath("//*[text()='Continue']")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[text()='YES, THIS IS CORRECT']")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));


		WebElement Vehicletp = driver.findElement(By.xpath("//*[@id='ddlNewVehicleType']"));
		Select Vehtyp = new Select(Vehicletp);
		Vehtyp.selectByVisibleText("ATV");
		
		wait.until(ExpectedConditions.elementToBeClickable(Vehicletp));


		
		// Use the correct method  waiting for visibility

		
		
		
	}
	
	

}
