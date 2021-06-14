package CRM.views;

import CRM.base.BaseView;
import CRM.base.SubMenu;
import CRM.base.SubMenuButtons;
import CRM.enums.ExpenseSubMenuButtons;
import CRM.enums.ProjectsSubMenuButtons;
import CRM.pages.AllExpensesPage;
import CRM.pages.MyProjectPage;
import org.openqa.selenium.WebDriver;

public class ProjectSubMenu extends SubMenu {

    public ProjectSubMenu(WebDriver driver){
        super(driver);
    }
    @Override
    public BaseView clickSubMenuButton (SubMenuButtons buttons){
        if (buttons instanceof ProjectsSubMenuButtons){
            switch ((ProjectsSubMenuButtons) buttons){
                case PROJECT_MY:
                    driver.findElement(((ProjectsSubMenuButtons) buttons).getBy()).click();
                    return new MyProjectPage(driver);
                default:
                    throw new IllegalArgumentException("Not implemented yet");
            }
        }else
        {
            throw new IllegalArgumentException("Incorrect button type");
        }
    }
}
