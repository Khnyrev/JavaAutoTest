import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SingUpPage {
    WebDriver driver;
    public SingUpPage (WebDriver driver) {
        this.driver = driver;
    }

    By emailField = By.cssSelector("input#register-email");
}
