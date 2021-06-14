package CRM.pages;

import CRM.base.BaseView;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class AllExpensesPage extends BaseView {

    @FindBy (css = "div []")
    private WebElement createNewExpenseButton;

    public AllExpensesPage (WebDriver driver) {super(driver);}

    public  NewExpensePage clickOnCreateNewExpenseButton (){
        createNewExpenseButton.click();
        return new NewExpensePage(driver);
    }

    public AllExpensesPage checkNewExpensePopUp (){
        String message =wait5seconds.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(" "))).getText();
       Assertions.assertTrue(message.contains(" "));
        return this;
    }
}
