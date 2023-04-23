import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AcessLogin {
    @Test
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver","C:\\Users\\Notebook\\Downloads\\geckodriver-v0.33.0-win32\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.mercadolivre.com.br/");

    }
}
