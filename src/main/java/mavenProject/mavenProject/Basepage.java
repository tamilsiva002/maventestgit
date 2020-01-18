package mavenProject.mavenProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basepage{
	public static WebDriver driver;

		
		public static void main(String[] args) {
			
		
		
	System.setProperty("webdriver.chrome.driver", "E:\\Study\\Framework\\chromedriver78\\chromedriver.exe");

	WebDriver driver =new ChromeDriver();
	
    driver.get(" http://automationpractice.com/index.php");
	
	
	driver.close();
}
}







