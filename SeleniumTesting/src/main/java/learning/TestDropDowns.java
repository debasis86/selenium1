import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestDropDowns {
	public static void main(String[] args)
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.wikipedia.org/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement dropdown = driver.findElement(By.id("searchLanguage"));
		Select select = new Select(dropdown);
		
		//select.selectByVisibleText("Eesti");
//		select.selectByValue("ar");
//		//select.selectByIndex(1);
//		List<WebElement> values = driver.findElementsByTagName("option");
//		System.out.println("Total values are : " + values.size());
//		System.out.println(values.get(7).getText());
//		
		WebElement block = driver.findElementByXPath("//*[@id='www-wikipedia-org']/div[6]/div[3]");
		
		List<WebElement> links = block.findElements(By.tagName("option"));
		System.out.println("Total links : "+links.size());
		for(WebElement link:links)
		{
			System.out.println(link.getText() + " URL is  : " + link.getAttribute("href"));
		}
	}

}
