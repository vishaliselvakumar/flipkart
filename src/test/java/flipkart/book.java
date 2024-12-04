package flipkart;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class book {
	public WebDriver driver;
	
	public void launch() {
     driver=new ChromeDriver();
     Actions a=new Actions(driver);
    JavascriptExecutor js = (JavascriptExecutor)driver;
    
	WebDriverManager.chromedriver().setup();
	
	driver.get("www.flipkart.com");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	WebElement Beauty=driver.findElement(By.xpath("//span[text()='Beauty, Toys & More']"));
    a.moveToElement(Beauty).build().perform();
	WebElement book=driver.findElement(By.xpath("//a[@class='_1BJVlg _11MZbx' and text()='Books']"));
	js.executeScript("arguments[0].click()",book);
	
	//
	

}
}
