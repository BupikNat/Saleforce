package tests;


import dto.Account;
import io.qameta.allure.Description;
import org.testng.annotations.Test;
import pages.AccountsPage;
import pages.LoginPage;

import static dto.AccountFactory.getAccount;

public class AccountsTest extends BaseTest {

    Account account = getAccount("Hot");


    //Открыть страницу Account - заполнить её данными (путь к полям указан в NewAccountModal) - нажать кнопку Save
    @Test
    @Description("Заполнение страницы Account данными")
    public void checkCreateAccount() {
        loginPage.open()
                     .isPageOpened()
                     .login("tborodich@tms.sandbox", "Password001");
        accountStep.create(account);
    }
}