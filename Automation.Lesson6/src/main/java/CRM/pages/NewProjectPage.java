package CRM.pages;

import CRM.base.BaseView;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.Date;

public class NewProjectPage extends BaseView {
    @FindBy(name = "crm_project[name]")
    private WebElement projectNameInput;

    @FindBy(xpath = "//span[contains(.,'Укажите организацию')]")
    private WebElement nameOrganizationDropDown;

    @FindBy(xpath = "//*[@id=\"select2-drop\"]/ul[2]/li[1]/div")
    private WebElement nameOrganizationInput;

    @FindBy(name = "crm_project[businessUnit]")
    private WebElement nameBusinessUnitDropDownSelect;

    @FindBy(name = "crm_project[curator]")
    private WebElement nameCuratorDropDownSelect;

    @FindBy(name = "crm_project[manager]")
    private WebElement nameManagerDropDownSelect;

    @FindBy(name = "crm_project[rp]")
    private WebElement nameRPDropDownSelect;

    @FindBy(name = "crm_project[administrator]")
    private WebElement nameAdministratorDropDownSelect;

    @FindBy(xpath = "//button[contains(.,'Сохранить и закрыть')]")
    private WebElement submitButton;

    public NewProjectPage (WebDriver driver) {super(driver);}

    public NewProjectPage enterProjectName (String projectName)
    {
        Date date = new Date();
        projectNameInput.sendKeys(projectName+date.getTime());
        return this;
    }

    public NewProjectPage selectBusinessUnit (String visibleText) {
        Select nameBusinessUnitDropDown = new Select(nameBusinessUnitDropDownSelect);
        nameBusinessUnitDropDown.selectByVisibleText(visibleText);
        return this;
    }

    public NewProjectPage selectCurator (String value) {
        Select nameCuratorUnitDropDown = new Select(nameCuratorDropDownSelect);
        nameCuratorUnitDropDown.selectByValue(value);
        return this;
    }

    public NewProjectPage selectManager (String visibleText) {
        Select nameManagerDropDown = new Select(nameManagerDropDownSelect);
        nameManagerDropDown.selectByVisibleText(visibleText);
        return this;
    }

    public NewProjectPage selectRP (String visibleText) {
        Select nameRPDropDown = new Select(nameRPDropDownSelect);
        nameRPDropDown.selectByVisibleText(visibleText);
        return this;
    }

    public NewProjectPage selectAdministrator (String visibleText) {
        Select nameAdministratorDropDown = new Select(nameAdministratorDropDownSelect);
        nameAdministratorDropDown.selectByVisibleText(visibleText);
        return this;
    }

    public NewProjectPage selectNameOrganization (){

        nameOrganizationDropDown.click();

        nameOrganizationInput.click();
        return this;

    }

    public MyProjectPage clickSubmit(){
        submitButton.click();
        return new MyProjectPage(driver);
    }


}