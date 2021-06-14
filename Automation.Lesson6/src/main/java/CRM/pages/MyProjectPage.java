package CRM.pages;

import CRM.base.BaseView;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class MyProjectPage extends BaseView {

    @FindBy(linkText = "Создать проект")
    private WebElement createNewProjectButton;

    public MyProjectPage (WebDriver driver) {super(driver);}

    public  NewProjectPage clickOnCreateNewProjectButton (){
        createNewProjectButton.click();
        return new NewProjectPage(driver);
    }

    public MyProjectPage checkNewProject (){
        String message =wait5seconds.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("div[class='message']"))).getText();
        Assertions.assertTrue(message.contains("Проект сохранен"));
        return this;
    }
}