package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegistrationPageTest {

	public static void main(String[] args) throws InterruptedException {

		BrowserUtil brUtil = new BrowserUtil();
		WebDriver driver = brUtil.init_driver("chrome");
		brUtil.launchUrl("http://opencart.antropy.co.uk/index.php?route=account/register");
		System.out.println(brUtil.getPageTitle());
		System.out.println(brUtil.getPageUrl());
		//driver.manage().window().maximize();

		By firstName = By.id("input-firstname");
		By lastName = By.id("input-lastname");
		By email = By.id("input-email");
		By teleph = By.id("input-telephone");

		By fax = By.id("input-fax");
		By company = By.id("input-company");
		By add1 = By.id("input-address-1");
		By add2 = By.id("input-address-2");

		By city = By.id("input-city");
		By zipCode = By.id("input-postcode");
		By country = By.id("input-country");
		By state = By.id("input-zone");

		By password = By.id("input-password");
		By confpwd = By.id("input-confirm");
		By subscribBtn = By.name("newsletter");
		By policyBtn = By.name("agree");

		ElementUtil eleUtil = new ElementUtil(driver);
		eleUtil.doSendKeys(firstName, "pradeep");
		eleUtil.doSendKeys(lastName, "Handiavar");
		eleUtil.doSendKeys(email, "pfh@gmail.com");
		eleUtil.doSendKeys(teleph, "9165784523");
		eleUtil.doSendKeys(fax, "12542");
		eleUtil.doSendKeys(company, "wipro");
		eleUtil.doSendKeys(add1, "#307 Hakki Goodu Winnfield Garden Bangalore 560077");
		eleUtil.doSendKeys(add2, "#307 Hakki Goodu Winnfield Garden Bangalore 560077");
		eleUtil.doSendKeys(city, "Bangalore");
		eleUtil.doSendKeys(zipCode, "560077");

		eleUtil.selectDropDownByVisibleText(country, "India");
		Thread.sleep(3000);
		eleUtil.selectDropDownByVisibleText(state, "Karnataka");

		eleUtil.doSendKeys(password, "1254GAjs4");
		eleUtil.doSendKeys(confpwd, "1254GAjs4");
		eleUtil.doClick(subscribBtn);
		eleUtil.doClick(policyBtn);

	}

}
