import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class NavigationPage {

    @FindBy(xpath = "//*[@id=\"header\"]/div[1]/div/div/div/div[2]/div/ul/li[1]/a")
    @CacheLookup
    private WebElement sportsButton;

    @FindBy(xpath = "//*[@id=\"header\"]/div[1]/div/div/div/div[2]/div/ul/li[2]/a")
    @CacheLookup
    private WebElement liveButton;

    @FindBy(xpath = "//*[@id=\"header\"]/div[1]/div/div/div/div[2]/div/ul/li[3]/a")
    @CacheLookup
    private WebElement eSportsButton;

    @FindBy(xpath = "//*[@id=\"header\"]/div[1]/div/div/div/div[2]/div/ul/li[4]/a")
    @CacheLookup
    private WebElement casinoButton;

    @FindBy(xpath = "//*[@id=\"header\"]/div[1]/div/div/div/div[2]/div/ul/li[5]/a")
    @CacheLookup
    private WebElement liveCasinoButton;

    @FindBy(xpath = "//*[@id=\"header\"]/div[1]/div/div/div/div[2]/div/ul/li[6]/a")
    @CacheLookup
    private WebElement tvGamesButton;

    @FindBy(xpath = "//*[@id=\"header\"]/div[1]/div/div/div/div[2]/div/ul/li[7]/a")
    @CacheLookup
    private WebElement VirtualSportsButton;

    @FindBy(xpath = "//*[@id=\"header\"]/div[1]/div/div/div/div[2]/div/ul/li[8]/a")
    @CacheLookup
    private WebElement GamesButton;

    @FindBy(xpath = "//*[@id=\"header\"]/div[1]/div/div/div/div[2]/div/ul/li[9]/a")
    @CacheLookup
    private WebElement PromotionsButton;

    public void clickOnSportsButton(){

        sportsButton.click();
    }

    public void clickOnLiveButton(){

        liveButton.click();
    }

    public void clickOnESportsButton(){

        eSportsButton.click();
    }

    public void clickOnCasinoButton(){

        casinoButton.click();
    }
}
