package SeleniumSession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class selectapproch {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		BrowserUtil brUtil = new BrowserUtil();
		driver = brUtil.init_driver("chrome");
		brUtil.launchUrl("http://opencart.antropy.co.uk/index.php?route=account/register");
		System.out.println(brUtil.getPageTitle());
		System.out.println(brUtil.getPageUrl());

		By country = By.id("input-country");
		By state = By.id("input-zone");

		//dropDownSelectValue(country, "India");
		Thread.sleep(3000);
	//	dropDownSelectValue(state, "Goa");
		
		dropDownSelectValueWithGetOptions(country, "India");
	}



	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public static void dropDownSelectValueWithGetOptions(By locator, String value) {
			Select select= new Select(getElement(locator));
			List<WebElement> optionList= select.getOptions();
			
			for(WebElement e: optionList) {
				String text= e.getText();
				System.out.println(text);
				if(text.equals(value)) {
					e.click();
					break;
				}
			}
		

	}
}
