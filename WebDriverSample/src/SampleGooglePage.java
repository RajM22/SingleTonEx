import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class SampleGooglePage {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "D:\\SeleniumJars\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in");
		driver.findElement(By.name("q")).sendKeys("java");
		
		
		

	}

}
