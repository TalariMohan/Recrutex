package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class Skipping_Popup_Alerts {

	 // static WebDriver driver;
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		//driver.get("https://the-internet.herokuapp.com/basic_auth");
		//With using send keys direct entering values.
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		driver.manage().window().maximize();
		
		//Skiping the popups
	       String text=driver.findElement(By.cssSelector("p")).getText();
	       System.out.println(text);
	       
	       System.out.println("Name");
		
		
		
		
		
	}

}
