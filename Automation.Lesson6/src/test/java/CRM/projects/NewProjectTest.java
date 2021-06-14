package CRM.projects;

import CRM.base.BaseUiTest;
import CRM.enums.NavigationBarTabs;
import CRM.enums.ProjectsSubMenuButtons;
import CRM.pages.LoginPage;
import CRM.pages.MyProjectPage;
import org.junit.jupiter.api.Test;

public class NewProjectTest extends BaseUiTest {
    @Test
    public void createNewProjectPositiveTest(){
        MyProjectPage projectScreen =(MyProjectPage) new LoginPage(driver)
                .enterLogin(STUDENT_LOGIN)
                .enterPassword(STUDENT_PASSWORD)
                .clickSubmit()
                .getPageNavigation()
                .moveCursorToNavigationBar(NavigationBarTabs.PROJECTS)
                .clickSubMenuButton(ProjectsSubMenuButtons.PROJECT_MY);

        projectScreen
                .clickOnCreateNewProjectButton()
                .enterProjectName("MyProject")
                .selectNameOrganization()
                .selectBusinessUnit("Research & Development")
                .selectCurator("115")
                .selectManager("Applanatest1 Applanatest1 Applanatest1")
                .selectRP("Applanatest2 Applanatest2 Applanatest2")
                .selectAdministrator("Applanatest2 Applanatest2 Applanatest2")
                .clickSubmit()
                .checkNewProject();
    }
}
