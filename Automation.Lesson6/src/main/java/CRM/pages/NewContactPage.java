package CRM.pages;

import CRM.base.BaseView;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.Date;

public class NewContactPage extends BaseView {
    @FindBy(name = "crm_contact[lastName]")
    private WebElement lastNameInput;

    @FindBy(name = "crm_contact[firstName]")
    private WebElement firstNameInput;

    @FindBy(name = "crm_contact[jobTitle]")
    private WebElement jobInput;

    @FindBy(xpath = "//span[contains(.,'Укажите организацию')]")
    private WebElement nameOrganizationDropDown;

    @FindBy(xpath = "//*[@id=\"select2-drop\"]/ul[2]/li[2]/div")
    private WebElement nameOrganizationInput;

    @FindBy(xpath = "//button[contains(.,'Сохранить и закрыть')]")
    private WebElement submitButton;

    public NewContactPage (WebDriver driver) {super(driver);}

    public NewContactPage enterFirstName (String firstName)
    {
firstNameInput.sendKeys(firstName);
        return this;
    }
    public NewContactPage enterLastName (String lastName)
    {
        lastNameInput.sendKeys(lastName);
        return this;
    }

    public NewContactPage enterJobTitle (String job)
    {
        jobInput.sendKeys(job);
        return this;
    }



    public NewContactPage selectNameOrganization (){

        nameOrganizationDropDown.click();

        nameOrganizationInput.click();
        return this;

    }

    public AllContactsPage clickSubmit(){
        submitButton.click();
        return new AllContactsPage(driver);
    }


}
