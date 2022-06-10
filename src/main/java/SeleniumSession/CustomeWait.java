package SeleniumSession;


import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class CustomeWait {

	static WebDriver driver;
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.get("https://www.amazon.com/");
		By customers = By.linkText("Amazon Science11");
		retryingElement(customers, 10, 1000).click();
		

	}
	
	public static WebElement retryingElement(By locator, int timeOut, long pollingTime) {
		
		WebElement element= null;
		int attempts=0;
		
		while(attempts<timeOut) {
			try {
			element = driver.findElement(locator);
			break;
			}catch (NoSuchElementException e) {
				System.out.println("element is not found in attempt : " + attempts + " for : " + locator);
				try {
					Thread.sleep(pollingTime);
				} catch (InterruptedException e1) {
					e1.printStackTrace();
					
				}
			}
			attempts++;
			
			
		}
		
		if(element==null) {
			try {
			throw new Exception("ELEMENTNOTFOUNDEXCEPTIN");
			}
			catch (Exception e) {
				System.out.println("element is not found exception....tried for : " + timeOut + " secs"
						+ " with the interval of : " + pollingTime + " ms ");
				}
		}
		return element;
		
	}

}
