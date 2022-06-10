package testngsessions;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgAnnotatins {
	
	@BeforeSuite
	public void DbConnection() {
		System.out.println("BS---DbConnection");
	}
	@BeforeTest
	public void createUser() {
		System.out.println("BT---createUser");
	}
	@BeforeClass
	public void launchBrowser(){
		System.out.println("BC---launchBrowser and URL");
	}
	
	@BeforeMethod
	public void logintoApp() {
		System.out.println("BM---logintoApp");
	}
	
	
	@Test(priority = 1)
	public void getPageTitleTest() {
		System.out.println("getPageTitleTest");
	}
	
	@Test
	public void userInfoTest() {
		System.out.println("userInfoTest");
	}
	
	@Test(priority = 2)
	public void searchTest() {
		System.out.println("searchTest");
	}
	
	@AfterMethod
	public void logOut() {
		System.out.println("AM---logOut");
	}
	
	@AfterClass
	public void closeBrowser() {
		System.out.println("AC---closeBrowser");
	}
	
	@AfterTest
	public void deleteUser() {
		System.out.println("AT---deleteUser");
	}
	
	@AfterSuite
	public void disconnectDB() {
		System.out.println("AS---disconnectDB");
	}
	
	
	
	
	
	
}
