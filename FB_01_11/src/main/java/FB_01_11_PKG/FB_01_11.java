package FB_01_11_PKG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FB_01_11 {

		
		public static void main (String[]  args) {
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\Selenium_Scripts\\Chrome_Path\\chromedriver_win32 (4)\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			
			driver.get("https://www.facebook.com/");
			
			System.out.println(driver.getTitle());
			
			
		}
		
		
		

	}



