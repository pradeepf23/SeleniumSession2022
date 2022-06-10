package SeleniumSession;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class BrowserUtil {
	private WebDriver driver;

	
	public WebDriver init_driver(String browserNae) {

		System.out.println("Browser name is.." + browserNae);
		
		if (browserNae.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browserNae.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else if (browserNae.equals("safari")) {
			WebDriverManager.safaridriver().setup();
			driver = new SafariDriver();
		} else {
			System.out.println("please pass the correct browser.." + browserNae);
		}
		return driver;
	}

	public void launchUrl(String url) {
		// google.com
		if (url == null) {
			System.out.println("url is null...");
			return;
		}

		if (url.indexOf("http") == -1 || url.indexOf("https") == -1) {
			System.out.println("http(s) is missing in the url...");
			try {
				throw new Exception("HTTPMISSINGEXCEPTION");
			} catch (Exception e) {
				System.out.println("http (s) is missing....");
			}

		}

		driver.get(url);

	}

	public String getPageTitle() {
		return driver.getTitle();
	}
	
	public String getPageUrl() {
		return driver.getCurrentUrl();
	}
	
	public void closeBrowser() {
		driver.close();
	}
	public void quitBrowser() {
		driver.quit();
	}
}
