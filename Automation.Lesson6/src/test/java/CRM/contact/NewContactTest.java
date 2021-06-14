package CRM.contact;

import CRM.base.BaseUiTest;
import CRM.enums.ContragentsSubMenuButtons;
import CRM.enums.NavigationBarTabs;
import CRM.enums.ProjectsSubMenuButtons;
import CRM.pages.AllContactsPage;
import CRM.pages.LoginPage;
import CRM.pages.MyProjectPage;
import org.junit.jupiter.api.Test;

public class NewContactTest extends BaseUiTest {

    @Test
    public void createNewContactPositiveTest (){
        AllContactsPage projectScreen =(AllContactsPage) new LoginPage(driver)
                .enterLogin(STUDENT_LOGIN)
                .enterPassword(STUDENT_PASSWORD)
                .clickSubmit()
                .getPageNavigation()
                .moveCursorToNavigationBar(NavigationBarTabs.CONTRAGENTS)
                .clickSubMenuButton(ContragentsSubMenuButtons.CONTACTS);

        projectScreen
                .clickOnCreateNewContact()
                .enterFirstName("Иванов")
                .enterLastName("Иванов")
                .enterJobTitle("Инженер")
                .selectNameOrganization()
                .clickSubmit()
                .checkNewContact();
    }
}
