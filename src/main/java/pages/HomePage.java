package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {
	
	@FindBy(id="email")
	public WebElement usrname;
	
	@FindBy(id="pass")
	public WebElement pass;
	
	@FindBy(id="u_0_d_if")
	public WebElement login;
	
	public WebDriver driver;
	
	public HomePage(WebDriver driver) {
		
		this.driver=driver;
		
	}
	
	public void doLogin(String username, String password) {
		
//		usrname.sendKeys(username);
//		pass.sendKeys(password);
//		login.click();
		
		driver.findElement(By.id("email")).sendKeys("Xusuhukj");
		driver.findElement(By.id("pass")).sendKeys("xuhiusadhsiuad");
		driver.findElement(By.id("u_0_d_if")).click();
		
	}
	
	public void valiateLinks() {
		
	}

}
