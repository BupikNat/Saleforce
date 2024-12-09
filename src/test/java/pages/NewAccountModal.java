package pages;

import dto.Account;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import wrappers.Input;
import wrappers.Picklist;
import wrappers.Textarea;

@Log4j2
public class NewAccountModal extends BasePage{

    private final By SAVE_BUTTON = By.xpath("//*[@name='SaveEdit']");

    public NewAccountModal(WebDriver driver) {
        super(driver);
    }

    @Override
    public NewAccountModal isPageOpened() {
        log.info("Save button is visible on page");
        wait.until(ExpectedConditions.visibilityOfElementLocated(SAVE_BUTTON));
        return this;
    }

    @Override
    public NewAccountModal openPage() {
        log.info("Open Account page");
        driver.get("https://tms9-dev-ed.develop.lightning.force.com/lightning/o/Account/list?filterName=AllAccounts");
        return this;
    }

    //Выбрать различные типы данных на странице - инпуты, текст ареа и выпадающие списки. Выбор по названию поля. XPath указаны в wrappers для каждого типа поля
    public NewAccountModal createAccount (Account account)  {
        log.info("creating account '{}'", account.getName());
        new Input(driver, "Account Name").write(account.getName());
        new Picklist(driver, "Rating").select(account.getRating());
        new Input(driver, "Phone").write(account.getPhone());
        new Input(driver, "Fax").write(account.getFax());
        new Input(driver, "Account Number").write(account.getAccountNumber());
        new Input(driver, "Website").write(account.getWebsite());
        new Input(driver, "Account Site").write(account.getAccountsite());
        new Input(driver, "Ticker Symbol").write(account.getTickersymbol());
        new Picklist(driver, "Type").select(account.getType());
        new Picklist(driver, "Ownership").select(account.getOwnership());
        new Picklist(driver, "Industry").select(account.getIndustry());
        new Input(driver, "Employees").write(account.getEmployees());
        new Input(driver, "Annual Revenue").write(account.getRevenue());
        new Input(driver, "SIC Code").write(account.getSiccode());
        new Textarea(driver, "Billing Street").write(account.getBillingstreet());
        new Input(driver, "Billing City").write(account.getBillingcity());
        new Input(driver, "Billing State/Province").write(account.getBillingstate());
        new Input(driver, "Billing Zip/Postal Code").write(account.getBillingzip());
        new Input(driver, "Billing Country").write(account.getBillingcountry());
        new Textarea(driver, "Shipping Street").write(account.getShippingstreet());
        new Input(driver, "Shipping City").write(account.getShippingcity());
        new Input(driver, "Shipping State/Province").write(account.getShippingstate());
        new Input(driver, "Shipping Zip/Postal Code").write(account.getShippingzip());
        new Input(driver, "Shipping Country").write(account.getShippingcountry());
        return this;
    }
}