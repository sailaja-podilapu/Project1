package page_S;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window_s {
	public static void main(String[]args)throws InterruptedException{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		String initialHandle=driver.getWindowHandle();
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.google.com/imghp?h1=en&ogb1");
		System.out.println(driver.getWindowHandles().size());
		driver.switchTo().window(initialHandle);
		Thread.sleep(3000);
		driver.close();
		System.out.println(driver.getWindowHandles().size());
		driver.quit();
		
	}
	

}
