package CRM.views;

import CRM.base.BaseView;
import CRM.base.SubMenu;
import CRM.base.SubMenuButtons;
import CRM.enums.ContragentsSubMenuButtons;
import CRM.enums.ProjectsSubMenuButtons;
import CRM.pages.AllContactsPage;
import CRM.pages.MyProjectPage;
import org.openqa.selenium.WebDriver;

public class ContragentsSubMenu extends SubMenu {

    public ContragentsSubMenu(WebDriver driver){
        super(driver);
    }
    @Override
    public BaseView clickSubMenuButton (SubMenuButtons buttons){
        if (buttons instanceof ContragentsSubMenuButtons){
            switch ((ContragentsSubMenuButtons) buttons){
                case CONTACTS:
                    driver.findElement(((ContragentsSubMenuButtons) buttons).getBy()).click();
                    return new AllContactsPage(driver);
                default:
                    throw new IllegalArgumentException("Not implemented yet");
            }
        }else
        {
            throw new IllegalArgumentException("Incorrect button type");
        }
    }
}
