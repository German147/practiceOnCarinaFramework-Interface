import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class UserPage extends AbstractPage {

    @FindBy(xpath = "//i[@class='_2wYneOcJEB6o4mj1NedmsR icon icon-karma_fill']")
    private ExtendedWebElement karmaInfo;

    protected UserPage(WebDriver driver) {
        super(driver);
    }

    public boolean isKarmaButtonPresent(){
        return karmaInfo.isElementPresent();
    }
}
