package testSurvey;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

	public static void main(String[] args) 
	
	{
		
		System.setProperty("webdriver.chrome.driver" , "D:\\automation\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.google.com/");
		String pgtitle1 = driver.getTitle();
		System.out.println("page title is" + pgtitle1);
		driver.navigate().refresh();
		driver.get("https://www.gmail.com/");
		String pgtitle2 = driver.getTitle();
		System.out.println("page title is" +pgtitle2);
		driver.navigate().back();
	}
}


		
		
		
		
		
		
	

	