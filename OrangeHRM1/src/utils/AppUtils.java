package utils;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AppUtils 
{
	  public static WebDriver driver ;
	  
	 public static void lauchApp(String url ) 
	 {
		 System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
		 driver = new FirefoxDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 driver.manage().deleteAllCookies();
		 driver.get(url);
	 }
 public static void closeApp() 
	 { 
		driver.close(); 
	 }

}
