package page_S;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class basic_prog {
	private static WebElement element=null;
	private static WebElement textbox_search(WebDriver driver) {
		element=driver.findElement(By.name("q"));
		return element;
	}
	
	
	}


