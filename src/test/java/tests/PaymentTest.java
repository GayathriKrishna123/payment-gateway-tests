package tests;

import config.BaseConfig;
import config.EcommerceConfig;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;
import utils.WebDriverFactory;

public class PaymentTest {
    WebDriver driver;
    BaseConfig config;

    @BeforeClass
    public void setup() {
        config = new EcommerceConfig();
        driver = WebDriverFactory.createDriver(config.browser);
        driver.get(config.baseUrl);
    }

    @Test(priority = 1)
    public void testCardPaymentSuccess() {
        // simulate payment form flow + validation
    }

    @Test(priority = 2)
    public void testCardPaymentFailure() {
        // simulate invalid card scenario
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) driver.quit();
    }
}