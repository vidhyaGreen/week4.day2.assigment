package week4.day2.assigment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assigment1Selectable {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/selectable/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
   
		driver.switchTo().frame(0);
  
    WebElement item1= driver.findElement(By.xpath("//li[text()='Item 1']"));
    WebElement item5= driver.findElement(By.xpath("//li[text()='Item 5']"));
    WebElement item2= driver.findElement(By.xpath("//li[text()='Item 2']"));
    
	Actions Builder=new Actions(driver);

	//Builder.clickAndHold(item1).moveToElement(item2).release().perform();
	
	 Builder.keyDown(Keys.CONTROL).click(item1).click(item5).click(item2).keyUp(Keys.CONTROL).perform();
	 
	}
}

		