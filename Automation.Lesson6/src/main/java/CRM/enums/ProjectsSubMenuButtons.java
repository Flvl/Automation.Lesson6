package CRM.enums;

import CRM.base.SubMenuButtons;
import org.openqa.selenium.By;

public enum ProjectsSubMenuButtons implements SubMenuButtons {

    PROJECT_REQUEST ("  "),
    PROJECT_ALL ("//span[contains(.,'Все проекты')]"),
    PROJECT_MY (" //span[contains(.,'Мои проекты')]");

    private final By by;

    ProjectsSubMenuButtons (String xpath) { this.by = By.xpath(xpath);}

    public By getBy() {return by;}
}
