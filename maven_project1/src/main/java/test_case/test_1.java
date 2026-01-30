package test_case;
import org.openqa.selenium.Keys;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test_1 {
	static WebDriver driver;
	public static void main(String[]args) {
		googlesearch();
		driver.quit();
	}
	public static void googlesearch() {
		driver=new ChromeDriver();
		driver.get("http://www.google.com");
		driver.manage().window().maximize();
		basic_prog.textbox_search(driver).sendKeys("India");
		basic_prog.textbox_search(driver).sendKeys(Keys.ENTER);
	}
	

}
