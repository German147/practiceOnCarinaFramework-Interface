import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.glassfish.tyrus.core.frame.Frame;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;


public class HomePage extends AbstractPage {

    @FindBy(xpath = "//span[@class='flex items-center gap-xs']")
    private ExtendedWebElement startSessionButton;



    protected HomePage(WebDriver driver) {
        super(driver);
    }

    public void openRedditPage() {
        openURL("https://www.reddit.com");
    }

    public LoginPage clickStartSession() {
        LoginPage loginPage = new LoginPage(driver);
        startSessionButton.click();
        return loginPage;
    }


}
