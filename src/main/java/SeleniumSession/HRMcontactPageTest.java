package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class HRMcontactPageTest {

	public static void main(String[] args) {

		BrowserUtil brUtil = new BrowserUtil();

		WebDriver driver = brUtil.init_driver("chrome"); 
		brUtil.launchUrl("https://www.orangehrm.com/contact-sales/");
		System.out.println(brUtil.getPageTitle());
		System.out.println(brUtil.getPageUrl());

		By name = By.id("Form_submitForm_FullName");
		By companyName = By.id("Form_submitForm_CompanyName");
		By jobTitle = By.id("Form_submitForm_JobTitle");
		By contact = By.id("Form_submitForm_Contact");
		By email = By.id("Form_submitForm_Email");
		By comment = By.id("Form_submitForm_Comment");
		By employees = By.id("Form_submitForm_NoOfEmployees");

		ElementUtil eleUtil = new ElementUtil(driver);
		eleUtil.doSendKeys(name, "Pradeep Handiavar");
		eleUtil.doSendKeys(companyName, "wipro");
		eleUtil.doSendKeys(jobTitle, "QA");
		eleUtil.doSendKeys(contact, "9565485254");
		eleUtil.doSendKeys(email, "pradeepfhan@gmail.com");
		eleUtil.doSendKeys(comment, "I am working as QA engg");
		eleUtil.selectDropDownByVisibleText(employees, "2,001 - 2,500");
		

	}

}

//Select select= new Select(driver.findElement(By.id("Form_submitForm_NoOfEmployees")));
// select.selectByValue("2,001 - 2,500");