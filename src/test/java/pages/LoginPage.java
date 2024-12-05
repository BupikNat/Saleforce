package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public BasePage isPageOpened() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("Login")));
        return this;
    }

    @Override
    public BasePage openPage() {
        return null;
    }

    //Открыть страницу Salesforce
    @Step("Open Page Salesforce")
    public LoginPage open() {
    driver.get("https://tms9-dev-ed.develop.my.salesforce.com");
    return this;
}

    @Step("Login into Salesforce")
    public LoginPage login(String user, String password) {
        driver.findElement(By.id("username")).sendKeys(user);
        driver.findElement(By.id("password")).sendKeys(password);
        driver.findElement(By.id("Login")).click();
        //wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@data-key='home']//ancestor::lightning-icon")));
        return new LoginPage(driver);
    }
}