package pages;

import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

@Log4j2
public class LoginPage extends BasePage {

    private final By USERNAME_INPUT = By.id("username");
    private final By PASSWORD_INPUT = By.id("password");
    private final By LOGIN_BUTTON = By.id("Login");

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public LoginPage isPageOpened() {
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(LOGIN_BUTTON));
            return this;
        } catch (TimeoutException e) {
            log.error(e.getMessage());
            Assert.fail("Login page don't open");
        }
        return this;
    }

    //Открыть страницу Salesforce
    @Override
    @Step("Open Page Salesforce")
    public LoginPage openPage() {
        log.info("Open Login page");
        driver.get("https://tms9-dev-ed.develop.my.salesforce.com");
        return this;
    }

    @Step("Login into Salesforce")
    public LoginPage login(String user, String password) {
        log.info("Enter login '{}' and password '{}' and click Login button", user, password);
        driver.findElement(USERNAME_INPUT).sendKeys(user);
        driver.findElement(PASSWORD_INPUT).sendKeys(password);
        driver.findElement(LOGIN_BUTTON).click();
        //wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@data-key='home']//ancestor::lightning-icon")));
        return new LoginPage(driver);
    }
}