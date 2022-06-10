package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selenium4NewWindows {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		String parentWindowId= driver.getWindowHandle();
		driver.switchTo().newWindow(WindowType.WINDOW);// Selenium 4.x feature
		driver.navigate().to("https://www.amazon.com/");
		System.out.println(driver.getTitle());
		driver.close();
		
		driver.switchTo().window(parentWindowId);
		System.out.println(driver.getTitle());
		driver.findElement(By.id("txtUsername")).sendKeys("pradeep");

	}

}
