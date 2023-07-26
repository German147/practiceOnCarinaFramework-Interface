import com.zebrunner.carina.core.IAbstractTest;
import org.testng.annotations.Test;
import page.LoginPage;

import java.util.logging.Logger;

public class TestLogin implements IAbstractTest {

    Logger logger= Logger.getLogger(TestLogin.class.getName());

    @Test
    public void testLogin(){
        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.open();

    }
}
