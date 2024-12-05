package steps;

import dto.Account;
import org.openqa.selenium.WebDriver;
import pages.AccountsPage;
import pages.NewAccountModal;

public class AccountStep {

    AccountsPage accountsPage;
    NewAccountModal newAccountModal;

    public AccountStep(WebDriver driver) {
        accountsPage = new AccountsPage(driver);
        newAccountModal = new NewAccountModal(driver);
    }

    public void create (Account account) {
        accountsPage.openAccountPage();
        newAccountModal.createAccount(account);
        accountsPage.clickOnSaveButton();
    }
}