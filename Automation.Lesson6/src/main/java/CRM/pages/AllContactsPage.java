package CRM.pages;

import CRM.base.BaseView;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class AllContactsPage extends BaseView {

    @FindBy(linkText = "Создать контактное лицо")
    private WebElement createNewContactButton;

    public AllContactsPage(WebDriver driver) {super(driver);}

    public  NewContactPage clickOnCreateNewContact (){
        createNewContactButton.click();
        return new NewContactPage(driver);
    }

    public AllContactsPage checkNewContact (){
        String message =wait5seconds.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("div[class='message']"))).getText();
        Assertions.assertTrue(message.contains("Контактное лицо сохранено"));
        return this;
    }
}
