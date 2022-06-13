package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BasePage;

public class HomePage extends BasePage{
	
	public HomePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(id="email")
	public WebElement usrname;
	
	@FindBy(id="pass")
	public WebElement pass;
	
	@FindBy(name="login")
	public WebElement login;
	
	//When you want to use HomePage home = new HomePage(driver);
//	public HomePage(WebDriver driver) {
//		
//		PageFactory.initElements(driver, this);
//		
//	}
	
	public void doLogin(String username, String password) {
		
		usrname.sendKeys(username);
		pass.sendKeys(password);
		login.click();
		
//		driver.findElement(By.id("email")).sendKeys("Xusuhukj");
//		driver.findElement(By.id("pass")).sendKeys("xuhiusadhsiuad");
//		driver.findElement(By.name("login")).click();
		
	}
	
	public void valiateLinks() {
		
	}

}
