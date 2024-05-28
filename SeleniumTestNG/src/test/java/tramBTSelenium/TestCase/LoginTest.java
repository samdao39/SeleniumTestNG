package tramBTSelenium.TestCase;

import org.testng.annotations.Test;
import tramBTSelenium.Pages.loginPage;
import tramBTSelenium.common.BaseTest;

public class LoginTest extends BaseTest {
 loginPage loginpage;
    @Test
    public void loginCmsSucess(){
        loginpage = new loginPage(driver);
        loginpage.loginSucess();

    }
}
