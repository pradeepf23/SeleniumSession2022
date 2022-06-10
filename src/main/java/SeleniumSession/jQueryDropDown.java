package SeleniumSession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class jQueryDropDown {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		driver.findElement(By.xpath("//input[@id='justAnInputBox']")).click();
		Thread.sleep(2000);
		
		By choice= By.xpath("(//div[contains(@id,'DropDownContainer')])[1]/ul//span[@class='comboTreeItemTitle']");
		
		//selectMultiChoice(choice, "choice 6 2 3");
		selectMultiChoice(choice, "choice 9");
		//selectMultiChoice(choice, "choice 6","choice 6 2 1", "choice 6 2 2");
		//selectMultiChoice(choice, "all");

	}
	

	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}
	//single choice selection
//	public static void selectChoice(By locator, String value) {
//		List<WebElement> choicelist = getElements(locator);
//		
//
//		System.out.println(choicelist.size());
//
//		for (WebElement e : choicelist) {
//			String text = e.getText().trim();
//			System.out.println(text);
//			
//			if(text.equals(value)) {
//				e.click();
//				break;
//				
//			}}
//			
//
//		}
	//multi choice selection
		public static void selectMultiChoice(By locator, String... value) {
			List<WebElement> choicelist = getElements(locator);
	
			System.out.println(choicelist.size());
			boolean flag=false;
			if(!value[0].equalsIgnoreCase("all")) {
				for (WebElement e : choicelist) {
					String text = e.getText().trim();
					System.out.println(text);
					for(int i=0; i<value.length; i++) {
						if(text.equalsIgnoreCase(value[i])) {
							flag= true;
							e.click();
							break;
						}
					}
				}
			}else{
				for (WebElement e : choicelist) {
					flag= true;
					e.click();
					//break;
				}
				
				
			}
			if(flag==false) {
				System.out.println("choice is not found "+value[0]);
				
			}
			
		
	}
	

}
