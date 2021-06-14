package CRM.pages;

import CRM.base.BaseView;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewExpensePage extends BaseView {
    @FindBy(xpath = " ")
    private WebElement descriptionTextInput;

    public NewExpensePage (WebDriver driver) {super(driver);}

    public NewExpensePage enterDescription (String description)
    {
        descriptionTextInput.sendKeys(description);
        return this;
    }
}