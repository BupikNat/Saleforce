package steps;

import dto.Account;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.WebDriver;
import pages.AccountsPage;
import pages.NewAccountModal;

@Log4j2
public class AccountStep {

    AccountsPage accountsPage;
    NewAccountModal newAccountModal;

    public AccountStep(WebDriver driver) {
        accountsPage = new AccountsPage(driver);
        newAccountModal = new NewAccountModal(driver);
    }

    public AccountStep create (Account account) {
        log.info("Create account");
        accountsPage.openAccountPage();
        newAccountModal.createAccount(account);
        accountsPage.clickOnSaveButton();
        return this;
    }
}