package SeleniumSession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class multiSelectionJQuery {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		
		driver.findElement(By.xpath("//input[@id='justAnInputBox1']")).click();
		Thread.sleep(2000);
		By choice= By.xpath("(//div[contains(@id,'DropDownContainer')])[2]//span[@class='comboTreeItemTitle']");
		//selectionChoice(choice, "choice 2","choice 6");
		//selectionChoice(choice, "all");
		selectionChoice(choice, "choice 9");
	}
	public static void selectionChoice(By locator, String... value) {
		List<WebElement> listofChoices= driver.findElements(locator);
		System.out.println(listofChoices.size());
		boolean flag=false;
		if(!value[0].equalsIgnoreCase("all")) {
		for(WebElement e: listofChoices) {
			String text=e.getText();
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
		for (WebElement e : listofChoices) {
			flag= true;
			e.click();
			//break;
		}
		
		
	}
	if(flag==false) {
		System.out.println("choice is not found "+value[0]);
		
	}
	
}}
