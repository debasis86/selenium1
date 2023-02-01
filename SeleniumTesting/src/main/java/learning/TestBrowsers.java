import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBrowsers {

	public static void main(String[] args)
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://gmail.com");
		//System.out.println(driver.getTitle());
		//WebElement webelment = driver.findElementByCssSelector("#identifierId");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			WebDriverWait wait = new WebDriverWait(driver, 20);
		//		try {
//			Thread.sleep(1000);
//		}catch (InterruptedException e)
//		{
//			e.printStackTrace()
//		}
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("identifierId"))).sendKeys("debasis");
		driver.findElementByXPath("//*[@id=\"identifierNext\"]/content").click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password"))).sendKeys("Asdasd");
		//driver.findElementByXPath("//*[@id='identifierId']").sendKeys("alliswell");
		
		//driver.findElementByName("password").sendKeys("meOOO");
		//
		//webelment.sendKeys("debasis@");
		//driver.close();
	}
}
