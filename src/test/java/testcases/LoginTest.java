package testcases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.HomePage;
import pages.LandingPage;

public class LoginTest {

	
	@Test
	public void loginTest() {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com/");
		
		//HomePage home = new HomePage(driver);  // When you want to use the constructor
		//HomePage home = PageFactory.initElements(driver, HomePage.class);
		HomePage home = new HomePage(driver);
		home.doLogin("tbs.mohitk@gmail.com", "MKmk11!!");
		
		LandingPage lp = new LandingPage(driver);
		lp.goToProfile();
		
	//	new HomePage(driver).doLogin("tbs.mohitk@gmail.com", "MKmk11!!").goToProfile();
		
		//This is the actual method
//		HomePage home = new HomePage(driver);
//		LandingPage lp=home.doLogin("tbs.mohitk@gmail.com", "MKmk11!!");
//		lp.goToProfile();
	}
	
}
