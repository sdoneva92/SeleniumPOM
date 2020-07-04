import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class BetsPage {

    @FindBy(xpath = "//*[@id=\"inputBetStake\"]")
    @CacheLookup
    private WebElement stakeTextBox;

    @FindBy(css = ".btn-place-bet")
    @CacheLookup
    private WebElement placeBetButton;

    @FindBy(xpath = "//*[@id=\"userBalanceContainer\"]/ul/li[1]/span[2]")
    @CacheLookup
    private WebElement balanceBox;


    public void placeABetInStakeTextBox(String stakeAmount) {

        stakeTextBox.sendKeys(stakeAmount);
    }

    public void clickOnPlaceAbetButton() {

        placeBetButton.click();
    }

    public String extractBalanceFromBalanceBox() {

        String balance = balanceBox.getText();

        return balance;
    }
}
