package SeleniumSession;

public class Amazon12344 {

	public static void main(String[] args) {
		
		BrowserUtil brUtil = new BrowserUtil();
		brUtil.init_driver("chrome");
		brUtil.launchUrl("https://www.amazon.com/");
		
		String title = brUtil.getPageTitle();
		System.out.println(title);
		if(title.contains("Amazon")) {
			System.out.println("correct title");
		}
		String url =brUtil.getPageUrl();
		System.out.println(url);
		if(url.contains("https://www.amazon.com")) {
			System.out.println("url is correct");
		}
		
		brUtil.closeBrowser();
	}

}
