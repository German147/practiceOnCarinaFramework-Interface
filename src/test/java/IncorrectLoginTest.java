import com.zebrunner.carina.core.IAbstractTest;
import com.zebrunner.carina.utils.R;
import org.testng.Assert;
import org.testng.annotations.Test;


public class IncorrectLoginTest implements IAbstractTest {

    @Test
    public void incorrectLogin() throws InterruptedException {

        HomePage homePage = new HomePage(getDriver());
        homePage.openRedditPage();
        LoginPage loginPage = homePage.clickStartSession();
        Thread.sleep(5000);
        loginPage.switchToIFrame();
        loginPage.typeInput(SingInEnum.USER, R.TESTDATA.get("username"));
        Thread.sleep(1000);
        loginPage.typeInput(SingInEnum.PASSWORD, R.TESTDATA.get("password"));
        Thread.sleep(1000);

        UserPage userpage = loginPage.clickOnLogin();
        pause(2);
        Thread.sleep(1000);
        loginPage.switchToMainPages();

        Assert.assertTrue(userpage.isKarmaButtonPresent(),"Login was unsuccessful");


    }
}
