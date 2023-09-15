import com.zebrunner.carina.utils.R;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends AbstractPage {

    @FindBy(className = "_25r3t_lrPF3M6zD2YkWvZU")
    private ExtendedWebElement iframe;

    @FindBy(xpath = "//input[@id='%s']")
    private ExtendedWebElement input;

    @FindBy(xpath = "//input[@id='%s']")
    private ExtendedWebElement username;

    @FindBy(xpath = "//button[contains(text(),'Log In')]")
    private ExtendedWebElement loginButton;

    protected LoginPage(WebDriver driver) {
        super(driver);
    }

    public void typeInput(SingInEnum field, String text) {


        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        jsExecutor.executeScript("retur arguments [0].shadowRoot",input);

        input = input.format(field.getId());
        input.type(text);
    }


    public void typeUser() {
        username.type(R.TESTDATA.get("username"));
    }

    public void switchToIFrame() {
        driver.switchTo().frame(iframe.getElement());
    }

    public UserPage clickOnLogin(){
        UserPage userPage = new UserPage(driver);
        loginButton.click();
        switchToMainPages();
        return userPage;
    }

    public void switchToMainPages(){
        driver.switchTo().defaultContent();
    }

}
