import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Crawl {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:/Users/ASUS/Downloads/chromedriver_win32 (1)/chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://nguoikesu.com/");
	    Thread.sleep(5000);
	    WebElement ul = driver.findElement(By.xpath("//*[@id=\"jm-left\"]/div/div[1]/div/div[2]/ul"));
	    List<WebElement> obj = ul.findElements(By.tagName("a"));
	    for (WebElement e: obj) {
	    	System.out.println(e.getText());
	    }
	    System.out.println(obj.size());
	    driver.close();
	}

}
