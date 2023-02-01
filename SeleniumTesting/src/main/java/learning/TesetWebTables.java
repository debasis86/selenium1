import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TesetWebTables {
		public static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://money.rediff.com/gainers/bse/daily/groupa");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		List<WebElement> rowNum = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td")); 
		System.out.println("Row count : "+rowNum.size());
		List<WebElement> colNum = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr[1]/td"));
		System.out.println("Column count: "+colNum.size());
		for(int rows=1;rows<=rowNum.size();rows++)
		{
			for (int cols=1;cols<=colNum.size();cols++)
			{
				System.out.print(driver
						.findElement(By.xpath("//table[@class='dataTable']/tbody/tr["+rows+"]/td["+cols+"]")).getText());
		}
		System.out.println();	
		
		
	}
	}
}
