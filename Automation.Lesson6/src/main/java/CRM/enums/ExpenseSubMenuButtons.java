package CRM.enums;

import CRM.base.SubMenuButtons;
import org.openqa.selenium.By;

public enum ExpenseSubMenuButtons implements SubMenuButtons {

    EXPENSE_REQUEST ("  ");
    private final By by;

    ExpenseSubMenuButtons (String xpath) { this.by = By.xpath(xpath);}

    public By getBy() {return by;}
}
