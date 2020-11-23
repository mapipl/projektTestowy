import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class CartTest {
    WebDriver driver;
    WebDriverWait wait;

    @BeforeEach
    public void driverSetup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.manage().window().setSize(new Dimension(1366, 768));
        driver.manage().window().setPosition(new Point(5, 5));
        driver.manage().window().maximize();

        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        wait = new WebDriverWait(driver, 5);

        driver.navigate().to("https://fakestore.testelka.pl");
        driver.findElement(By.cssSelector("[class='woocommerce-store-notice__dismiss-link']")).click();
    }

    @AfterEach
    public void driveQuit() {
        driver.quit();
    }

    @Test
    public void test() {
    }

}
