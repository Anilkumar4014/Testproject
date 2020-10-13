import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launchbrowser {
 
	public static void main(String[] args) {
		
			String url = "https://www.google.co.in";
			System.out.println("I'm Here");
			WebDriver driver = new ChromeDriver();
			System.setProperty("webdriver.chrome.driver", "E:\\SELENIUM\\chromedriver_win32\\chromedriver.exe");
			driver.get(url);
			System.out.println("I'm Here2");
			System.out.println("I'm Here4");
			System.out.println("Launch the browser");					
		}

	}
