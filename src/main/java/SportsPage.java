import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class SportsPage {

    @FindBy(css = "#featured-league-162")
    @CacheLookup
    private WebElement uefaChampionsLeagueButton;

    @FindBy(xpath = "//*[@id=\"-1\"]/div[1]/div/div[1]/span")
    @CacheLookup
    private WebElement manchesterCityButton;

    public void clickOnUefaChamppionsLeagueButton(){

        uefaChampionsLeagueButton.click();
    }

    public void clickOnManchesterCityButton(){

        manchesterCityButton.click();
    }
}
