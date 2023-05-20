package Dynamic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class class2 
{
	

	public static void main(String[] args) throws InterruptedException 
	{
		
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		
		WebDriver driver=new ChromeDriver(co);
		driver.get("https://www.bhliquors.com/justin-cabernet-sauvignon-750ml.html");
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		WebElement SKU=driver.findElement(By.xpath("//div[@class='value'][@itemprop='sku']"));
		
		System.out.println(SKU.getText());
		
		
		
	}

}
