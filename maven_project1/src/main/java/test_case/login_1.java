package test_case;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import page_S.login_page;

public class login_1 {
	public static void main(String[]args) {
		
		
		WebDriver driver;
		login_page LoginPage;
		driver=new ChromeDriver();
		LoginPage=new login_page(driver);
		LoginPage.navigateTo();
		LoginPage.login("standard_user","secret_sauce");
		LoginPage.navigateTo();
		LoginPage.login("invalid_user","wrong_password");
		driver.quit();
	}

}
