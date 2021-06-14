package CRM.login;

import CRM.base.BaseUiTest;
import org.junit.jupiter.api.Test;
import CRM.pages.LoginPage;

public class PozotiveLoginTest extends BaseUiTest {

    @Test
    public void loginWithBaseUserTest(){
        new LoginPage(driver)
                .enterLogin(STUDENT_LOGIN)
                .enterPassword(STUDENT_PASSWORD)
                .clickSubmit()
                .checkUrl(BASE_URL);
    }
}
