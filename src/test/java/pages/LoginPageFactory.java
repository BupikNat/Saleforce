package pages;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//с PageFactory не работают явные ожидания. часто используется для мобильных устройств.
public class LoginPageFactory extends BasePage{

    public LoginPageFactory(WebDriver driver) {
        super(driver);
        //PageFactory.initElements(driver, this);  //инициализирует веб-элементы на страницу, можно вставлять не в конструктор, а в отдельном методе ниже
    }

    //@Override
    public BasePage isPageOpened() {
        return null;
    }

    //@Override
    public BasePage openPage() {
        return null;
    }

    @FindBy(id = "username")   // @FindBy(xpath = "")
    WebElement usernameField;

    @FindBy(id = "password")
    WebElement passwordField;

    @FindBy(id = "Login")
    WebElement loginButton;

    public void open() {
        driver.get("https://tms9-dev-ed.develop.my.salesforce.com/");
        PageFactory.initElements(driver, this);  //инициализирует веб-элементы на страницу
    }

    public void login(String username, String password) {
        usernameField.sendKeys(username);
        passwordField.sendKeys(password);
        loginButton.click();
    }
}