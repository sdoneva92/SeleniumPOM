import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class TestClass {

    DesiredCapabilities capabilities;
    WebDriver driver;
    @BeforeTest
    public void startGoogleChrome(){

        System.setProperty("webdriver.gecko.driver","C:\\users\\svetlana.doneva\\Downloads\\geckodriver-v0.26.0-win64\\geckodriver.exe");
        capabilities = DesiredCapabilities.firefox();
        capabilities.setCapability("marionette", true);
        driver = new FirefoxDriver(capabilities);
        driver.get("https://www.1000000bet.com/");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Test
    public  void verifyLogin() throws InterruptedException {

        LoginPage loginPage = PageFactory.initElements(driver,LoginPage.class);
        loginPage.clickOnLoginButton();
        AccountLoginPage accountLoginPage = PageFactory.initElements(driver,AccountLoginPage.class);
        accountLoginPage.typeUsernameIntheUsernameBpx("tu_assessment");
        Thread.sleep(100);
        accountLoginPage.typePassword("Assessment@1");
        accountLoginPage.clickOnTheLoginButton();
    }

    @Test
    public void verifyPlacingABet(){



    }
}


