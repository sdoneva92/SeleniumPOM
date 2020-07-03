import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountLoginPage {

    @FindBy(xpath = "//*[@id=\"login-guest-modal\"]/div/div/div[1]")
    @CacheLookup
    private WebElement accountLoginBox;

    @FindBy(xpath = "//*[@id=\"login_form[username]\"]")
    @CacheLookup
    private WebElement userNameTextBoc;

    @FindBy(xpath = "//*[@id=\"login-modal-password-input\"]")
    @CacheLookup
    private WebElement passwordField;

    @FindBy(xpath = "//*[@id=\"login-modal-form\"]/div[3]/button")
    @CacheLookup
    private WebElement logInButton;

    @FindBy(xpath = "//*[@id=\"login-guest-modal\"]/div/div/div[1]/button")
    @CacheLookup
    private WebElement xButton;


    public String getTextFromAccountLoginBox() {

        String accountLoginText = accountLoginBox.getText();

        return accountLoginText;
    }

    public void typeUsernameIntheUsernameBpx(String userName) {

        userNameTextBoc.sendKeys(userName);
    }

    public void typePassword(String password) {

        passwordField.sendKeys(password);
    }

    public void clickOnTheLoginButton() {

        logInButton.click();
    }

    public void clickOnTheXButton(){

        xButton.click();
    }


}
