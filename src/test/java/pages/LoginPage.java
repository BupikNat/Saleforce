package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @Step("Login into Salesforce")
    public static void login(String user, String password) {
        driver.get("https://tms9-dev-ed.develop.my.salesforce.com");
        driver.findElement(By.id("username")).sendKeys(user);
        driver.findElement(By.id("password")).sendKeys(password);
        driver.findElement(By.id("Login")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@data-key='home']//ancestor::lightning-icon")));
    }
}