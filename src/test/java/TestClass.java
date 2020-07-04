import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestClass {

    DesiredCapabilities capabilities;
    WebDriver driver;

    @BeforeTest
    public void startGoogleChrome() {

        System.setProperty("webdriver.gecko.driver", "C:\\users\\svetlana.doneva\\Downloads\\geckodriver-v0.26.0-win64\\geckodriver.exe");
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

    @BeforeMethod
    public void verifyLogin() throws InterruptedException {

        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
        loginPage.clickOnLoginButton();
        AccountLoginPage accountLoginPage = PageFactory.initElements(driver, AccountLoginPage.class);
        accountLoginPage.typeUsernameIntheUsernameBpx("tu_assessment");
        Thread.sleep(100);
        accountLoginPage.typePassword("Assessment@1");
        accountLoginPage.clickOnTheLoginButton();
        Thread.sleep(5000);
    }

    @Test
    public void verifyPlacingABet() throws InterruptedException {
        NavigationPage navigationPage = PageFactory.initElements(driver, NavigationPage.class);
        navigationPage.clickOnSportsButton();
        Thread.sleep(5000);
        SportsPage sportsPage = PageFactory.initElements(driver, SportsPage.class);
        sportsPage.clickOnUefaChamppionsLeagueButton();
        Thread.sleep(5000);
        sportsPage.clickOnManchesterCityButton();
        Thread.sleep(5000);
        BetsPage betsPage = PageFactory.initElements(driver, BetsPage.class);
        String startBalance = betsPage.extractBalanceFromBalanceBox();
        Thread.sleep(100);
        betsPage.placeABetInStakeTextBox("1.00");
        betsPage.clickOnPlaceAbetButton();
        String afterBetBalance = betsPage.extractBalanceFromBalanceBox();
        double expectedBalance = Double.parseDouble(startBalance) - 1.00;
        Assert.assertEquals(expectedBalance, Double.parseDouble(afterBetBalance));
    }
}


