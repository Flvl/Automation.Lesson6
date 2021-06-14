package CRM.enums;

import org.openqa.selenium.By;

public enum NavigationBarTabs {

PROJECTS ("//span[contains(.,'Проекты')]"),
CONTRAGENTS ("//span[contains(.,'Контрагенты')]");

private final By by;
NavigationBarTabs(String xpath) {this.by =By.xpath(xpath);}

    public By getBy() {return  by;}
}
