package CRM.pages;

import CRM.base.BaseView;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import CRM.views.*;

public class HomePage extends BaseView {
    private NavigationBar navigationBar;

    public HomePage (WebDriver driver)
    {super(driver);
    this.navigationBar =new NavigationBar (driver);
    }

    public void checkUrl (String url) {

        Assertions.assertEquals(url, driver.getCurrentUrl());
    }

    public NavigationBar getPageNavigation() {
        return navigationBar;
    }
}
