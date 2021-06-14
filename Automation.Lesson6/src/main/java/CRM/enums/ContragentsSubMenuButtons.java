package CRM.enums;

import CRM.base.SubMenuButtons;
import org.openqa.selenium.By;

public enum ContragentsSubMenuButtons implements SubMenuButtons {

    ORGANIZATION ("//span[contains(.,'Организации')]"),
    CONTACTS (" //span[contains(.,'Контактные лица')]");

    private final By by;

    ContragentsSubMenuButtons (String xpath) { this.by = By.xpath(xpath);}

    public By getBy() {return by;}
}
