package page_S;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login_page_factory {
	private WebDriver driver;
	private final String url="https://www.saucedemo.com";
	@FindBy(id="user-name")
	private WebElement usernameField;
	@FindBy(id="password")
	private WebElement passwordField;
	@FindBy(id="login_button")
	private WebElement loginbutton;
	@FindBy(css="h3[data-test='error']")
	private WebElement errorMessage;
	public login_page_factory(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	public void navigateTo() {
		if(!driver.getCurrentUrl().equals(url)) {
			driver.get(url);
		}
	}
	
	

}
