package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sample_project_testing {

	public static void main(String[] args) throws Exception {
	
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]")).sendKeys("mobiles");
		driver.findElement(By.xpath("//input[@id=\"nav-search-submit-button\"]")).click();
		driver.findElement(By.xpath("(//i[@class=\"a-icon a-icon-checkbox\"])[7]")).click();
		driver.findElement(By.xpath("(//div[@class=\"a-section s-color-swatch-outer-circle s-color-swatch-pad\"])[6]"));
		driver.findElement(By.xpath("(//div[@class=\"a-section s-color-swatch-outer-circle s-color-swatch-pad\"])[2]")).click();
	
		//WebDriverWait wait = new WebDriverWait(driver, 10);
		//WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//i[@class=\"a-icon a-icon-checkbox\"]")));	
	
		driver.navigate().to("https://www.spicejet.com/");
		driver.navigate().back();
		driver.navigate().forward();
		System.out.println( driver.getTitle());
		Thread.sleep(3000);
		driver.navigate().refresh();
		
		boolean Aboard=driver.findElement(By.xpath("//div[text()='Welcome aboard']")).isDisplayed();
		System.out.println(Aboard);

		boolean oneway=driver.findElement(By.xpath("//div[text()='one way']")).isEnabled();
		System.out.println(oneway);

		boolean roundTrip = driver.findElement(By.xpath("//div[text()='round trip']")).isSelected();
		System.out.println(roundTrip);
		
		//driver.findElement(By.partialLinkText("Hote")).click();
		  driver.findElement(By.linkText("Hotels")).click();
		 
		//driver.close();
		
	
	
	}

}
