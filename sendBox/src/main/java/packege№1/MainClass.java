import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MainClass {

    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\A.Khnyrev\\Documents\\test29012020\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("http://way2automation.com/way2auto_jquery/index.php");

    }
}
