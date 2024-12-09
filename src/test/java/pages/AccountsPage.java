package pages;

import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

@Log4j2
public class AccountsPage extends BasePage{

    private final By NEW_BUTTON = By.xpath("//div[@title='New']");
    private final By SAVE_BUTTON = By.xpath("//*[@name='SaveEdit']");

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
    public NewAccountModal openAccountPage() {
        log.info("Open Account page");
        driver.get("https://tms9-dev-ed.develop.lightning.force.com/lightning/o/Account/list?filterName=AllAccounts");
        driver.findElement(NEW_BUTTON).click();
        //driver.get("https://tms9-dev-ed.develop.lightning.force.com/lightning/o/Account/new"); //открыть страницу Accounts по прямой ссылке, а не через меню
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@name='SaveEdit']")));
        return new NewAccountModal(driver);
    }

    @Step("Click on Save button")
    public AccountsPage clickOnSaveButton() {
        log.info("Click on Save button");
        driver.findElement(SAVE_BUTTON).click();
        return this;
    }
}