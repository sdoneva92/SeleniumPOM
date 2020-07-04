import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

    @FindBy(xpath = "//*[@id=\"header\"]/div/div/div/div/div/div/div/div/button[2]")
    @CacheLookup
    private WebElement logInButton;

    @FindBy(xpath = "//*[@id=\"header\"]/div[1]/div/div/div/div[3]/div/div/div/button[1]")
    @CacheLookup
    private WebElement registerButton;

    public void clickOnLoginButton(){
         logInButton.click();
    }

    public  void clickOnRegisterButton(){
        registerButton.click();
    }
}
