package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class AccountsPage extends BasePage{

    public AccountsPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public BasePage isPageOpened() {
        return null;
    }

    @Override
    public BasePage openPage() {
        return null;
    }

    @Step("Open Account page")
    public static void openAccountPage() {
        driver.get("https://tms9-dev-ed.develop.lightning.force.com/lightning/o/Account/list?filterName=AllAccounts");
        driver.findElement(By.xpath("//div[@title='New']")).click();
        //driver.get("https://tms9-dev-ed.develop.lightning.force.com/lightning/o/Account/new"); //открыть страницу Accounts по прямой ссылке, а не через меню
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@name='SaveEdit']")));
    }

    @Step("Click on Save button")
    public static void clickOnSaveButton() {
        driver.findElement(By.xpath("//*[@name='SaveEdit']")).click();
    }
}