package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DifferentLocators {

	public static void main(String[] args) throws InterruptedException {
		
		
		BrowserUtil brUtil = new BrowserUtil();
		WebDriver driver = brUtil.init_driver("chrome");
		brUtil.launchUrl("http://opencart.antropy.co.uk/index.php?route=account/register");
		System.out.println(brUtil.getPageTitle());
		
		By firstName= By.name("firstname");
		By laseName= By.name("lastname");
		By email= By.name("email");
		By teleph= By.name("telephone");
		By fax= By.name("fax");
		By company= By.name("company");
		By add1= By.name("address_1");
		By add2= By.name("address_2");
		By city= By.name("city");
		By zipcode= By.name("postcode");
		By country= By.name("country_id");
		By state= By.name("zone_id");
		By pwd= By.name("password");
		By confpwd= By.name("confirm");
		By subscibe= By.name("newsletter");
		By policy= By.name("agree");
		
		ElementUtil eleUtil=new ElementUtil(driver);
		eleUtil.doSendKeys(firstName, "supriya");
		eleUtil.doSendKeys(laseName, "Handiavar");
		eleUtil.doSendKeys(email, "supriya@gmail.com");
		eleUtil.doSendKeys(teleph, "915482142");
		eleUtil.doSendKeys(fax, "122545");
		eleUtil.doSendKeys(company, "XYZ");
		eleUtil.doSendKeys(add1, "#307 Hakki Goodu Winnfield Garden Bangalore 560077");
		eleUtil.doSendKeys(add2, "#307 Hakki Goodu Winnfield Garden Bangalore 560077");
		eleUtil.doSendKeys(city, "Bangalore");
		eleUtil.selectDropDownByVisibleText(country, "India");
		Thread.sleep(3000);
		eleUtil.selectDropDownByVisibleText(state, "Karnataka");
		eleUtil.doSendKeys(zipcode, "581204");
		eleUtil.doSendKeys(pwd, "supriya123");
		eleUtil.doSendKeys(confpwd, "supriya123");
		eleUtil.doClick(subscibe);
		eleUtil.doClick(policy);
		
//		String firstName_xpath="//*[@id=\"input-firstname\"]"; 
//		String lastName_xpath= "//*[@id=\"input-lastname\"]";
//		String email_xpath= "//*[@id=\"input-email\"]";
//		String teleph_xpath= "//*[@id=\"input-telephone\"]";
//		
//		String fax_xpath= "//*[@id=\"input-fax\"]";
//		String company_xpath= "//*[@id=\"input-company\"]";
//		String add1_xpath= "//*[@id=\"input-address-1\"]";
//		String add2_xpath= "//*[@id=\"input-address-2\"]";
//		
//		String city_xpath= "//*[@id=\"input-city\"]";
//		String zipcode_xpath= "//*[@id=\"input-postcode\"]";
//		String country_xpath= "//*[@id=\"input-country\"]";
//		String state_xpath= "//*[@id=\"input-zone\"]";
//		
//		String pwd_xpath= "//*[@id=\"input-password\"]";
//		String confpwd_xpath= "//*[@id=\"input-confirm\"]";
//		String subscribe_xpath= "//*[@id=\"content\"]/form/fieldset[4]/div/div/label[1]/input";
//		String privacypolicy_xpath= "//*[@id=\"content\"]/form/div/div/input[1]";
//		
//		ElementUtil eleUtil=new ElementUtil(driver);
//		eleUtil.doSendKeys("xpath", firstName_xpath, "pradeep");
//		eleUtil.doSendKeys("xpath", lastName_xpath, "Handi");
//		eleUtil.doSendKeys("xpath", email_xpath, "pradeep@yahoo.com");
//		eleUtil.doSendKeys("xpath", teleph_xpath, "9164317508");
//		eleUtil.doSendKeys("xpath", fax_xpath, "546125");
//		eleUtil.doSendKeys("xpath", company_xpath, "xyz");
//		eleUtil.doSendKeys("xpath", add1_xpath, "#307 Hakki goodu");
//		eleUtil.doSendKeys("xpath", add2_xpath, "#307 Hakki goodu");
//		eleUtil.doSendKeys("xpath", city_xpath, "Banglore");
//		
//		eleUtil.doSendKeys("xpath", zipcode_xpath, "560077");
//	
		
	}

}
