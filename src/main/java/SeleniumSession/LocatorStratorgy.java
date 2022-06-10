package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorStratorgy {
	static WebDriver driver;
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/hris-hr-software-demo/");
		//1..
//		driver.findElement(By.id("Form_submitForm_FirstName")).sendKeys("pradeep");
//		driver.findElement(By.id("Form_submitForm_LastName")).sendKeys("Handiavar");
//		driver.findElement(By.id("Form_submitForm_Email")).sendKeys("pradeep@gmail.com");
//		driver.findElement(By.id("Form_submitForm_Contact")).sendKeys("9995966565");
		
		//2..
//		WebElement firstName=driver.findElement(By.id("Form_submitForm_FirstName"));
//		WebElement lastName=driver.findElement(By.id("Form_submitForm_LastName"));
//		WebElement Email=driver.findElement(By.id("Form_submitForm_Email"));
//		WebElement contact=driver.findElement(By.id("Form_submitForm_Contact"));
//		
//		firstName.sendKeys("reema");
//		lastName.sendKeys("pinto");
//		Email.sendKeys("reema@yahoo.com");
//		contact.sendKeys("45856565");
		
		//3... By locator : OR
//		By firstname= By.id("Form_submitForm_FirstName");
//		By lastname= By.id("Form_submitForm_LastName");
//		By email= By.id("Form_submitForm_Email");
//		
//		WebElement first_ele=driver.findElement(firstname);
//		WebElement last_ele=driver.findElement(lastname);
//		WebElement email_ele=driver.findElement(email);
//		
//		first_ele.sendKeys("Praveen");
//		last_ele.sendKeys("Reddy");
//		email_ele.sendKeys("praveen@gmail.com");
		
		//4..By locator with generic function
		
//		By firstname= By.id("Form_submitForm_FirstName");
//		By lastname= By.id("Form_submitForm_LastName");
//		By email= By.id("Form_submitForm_Email");
//		getElement(firstname).sendKeys("praveen");
//		getElement(lastname).sendKeys("Reddy");
//		getElement(email).sendKeys("praveen@gmail.com");
		
		//5..By locator with generic function of webElement and action:
//		By firstname= By.id("Form_submitForm_FirstName");
//		By lastname= By.id("Form_submitForm_LastName");
//		By email= By.id("Form_submitForm_Email");
//		doSendKeys(firstname, "Reema");
//		doSendKeys(lastname, "Pinto");
//		doSendKeys(email, "reemapr@yahoo.com");
		
		
//		//6...By locator with ElementUtil class having generic methods:
//		By firstname= By.id("Form_submitForm_FirstName");
//		By lastname= By.id("Form_submitForm_LastName");
//		By email= By.id("Form_submitForm_Email");
//		
//		ElementUtil eleUtil = new ElementUtil(driver);
//		eleUtil.doSendKeys(firstname, "prashant");
//		eleUtil.doSendKeys(lastname, "H");
//		eleUtil.doSendKeys(email, "prashant@gmail.com");
		
		//7...String locator with ElementUtil class having generic methods:
		
		String fname_id="Form_submitForm_FirstName";
		String lname_id= "Form_submitForm_LastName";
		String email_id= "Form_submitForm_Email";
//		
//		doSendKeys(getBy("id", fname_id), "Joyson");
//		doSendKeys(getBy("id", lname_id), "pinto");
//		doSendKeys(getBy("id", email_id), "joy@gmail.com");
		
		ElementUtil eleUtil = new ElementUtil(driver);
		eleUtil.doSendKeys("id", fname_id, "pammu");
		eleUtil.doSendKeys("id", lname_id, "H");
		eleUtil.doSendKeys("id", email_id, "pammu@yahoo");
	}
	
	
	public static By getBy(String locatorType, String locatorValue) {
		By locator = null;
		switch (locatorType.toLowerCase()) {
		case "id":
			locator=By.id(locatorValue);
			break;

		default:
			break;
		}
		return locator;
		
	}
	
	public static void doSendKeys(By locator, String value) {
		getElement(locator).sendKeys(value);
	}
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	

}
