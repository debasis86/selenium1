import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCheckBoxes {
		public static WebDriver driver;
		public static boolean isElementPresent(String locator)
		{
			try
			{
			driver.findElement(By.xpath(locator));
			return true;
			}
			catch (Throwable t)
			{
				return false;
			}
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("http://www.tizag.com/htmlT/htmlcheckboxes.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		int i=1;
		//TestElementPresent isPresent=new TestElementPresent();
		while(isElementPresent("//div[4]/input["+i+"]"))
		{
		driver.findElement(By.xpath("//div[4]/input["+i+"]")).click();
		i++;
		}
	}

}
