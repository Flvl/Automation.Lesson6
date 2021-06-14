package CRM.views;

import CRM.base.SubMenu;
import CRM.base.BaseView;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import CRM.enums.NavigationBarTabs;

public class NavigationBar extends BaseView {

    public NavigationBar (WebDriver driver){
        super(driver);
    }

    public SubMenu moveCursorToNavigationBar (NavigationBarTabs tab){
        Actions actions=new Actions(driver);

        actions.moveToElement(driver.findElement(tab.getBy()))
                .build()
                .perform();
        switch (tab){
            case PROJECTS:
                return new ProjectSubMenu(driver);
            case CONTRAGENTS:
                return new ContragentsSubMenu(driver);
            default: throw new IllegalArgumentException("Another tabs");
        }
    }

    public NavigationBar checkTabVisibility (NavigationBarTabs tab){
        Assertions.assertTrue(driver.findElement(tab.getBy()).isDisplayed());

        return this;
    }
}
