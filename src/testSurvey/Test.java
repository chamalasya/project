package testSurvey;

import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\automation\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://stage.survey.hff.ukkoteknik.com/admin/");

	}

}
