package Dynamic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class class1 
{
	
	public static void main(String[] args) throws InterruptedException 
	{
		
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		
		WebDriver driver=new ChromeDriver(co);
		driver.get("https://www.amazon.in/Samsung-Midnight-Storage-6000mAh-Battery/dp/B0B4F52B5X/ref=sr_1_8?crid=25E1NMBI5GBS3&keywords=mobile&qid=1684415773&sprefix=mobile%2Caps%2C506&sr=8-8&th=1");
		
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		WebElement ratings=driver.findElement(By.xpath("(//span[@id='acrCustomerReviewText'][@class='a-size-base'])[1]"));
		
		System.out.println("Ratings---"+ratings.getText());
		
		Thread.sleep(3000);
		
        WebElement que=driver.findElement(By.xpath("(//span[@class='a-size-base'])[14]"));
		
		System.out.println("Que---"+que.getText());
		
	}
	
	

}
