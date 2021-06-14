package CRM.pages;

import CRM.base.BaseView;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BaseView {

    @FindBy(name = "_username")
    private WebElement inputLogin;

    @FindBy(name = "_password")
    private WebElement inputPassword;

    @FindBy(name = "_submit")
    private WebElement buttonSubmit;


    public LoginPage (WebDriver driver)
    {super(driver);}

    public LoginPage enterLogin (String login){
        inputLogin.sendKeys(login);
        return this;
    }

    public LoginPage enterPassword (String password){
        inputPassword.sendKeys(password);
        return this;
    }

    public HomePage clickSubmit (){
        buttonSubmit.click();
        return new HomePage(driver);
    }


}
