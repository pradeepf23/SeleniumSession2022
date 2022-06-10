package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HRMpageTest {

	public static void main(String[] args) {
		
		BrowserUtil brUtil = new BrowserUtil();
		WebDriver driver = brUtil.init_driver("chrome");
		brUtil.launchUrl("https://www.orangehrm.com/hris-hr-software-demo/");
		System.out.println(brUtil.getPageTitle());
		System.out.println(brUtil.getPageUrl());

		By firstname= By.id("Form_submitForm_FirstName");
		By lastname= By.id("Form_submitForm_LastName");
		By email= By.id("Form_submitForm_Email");
		
		ElementUtil eleUtil =new ElementUtil(driver);
		eleUtil.doSendKeys(firstname, "pradeep");
		eleUtil.doSendKeys(lastname, "Handiavar");
		eleUtil.doSendKeys(email, "praddefphan@gmail.com");
		
		brUtil.closeBrowser();
	}

}
