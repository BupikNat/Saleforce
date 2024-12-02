package tests;


import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;
import pages.AccountsPage;
import pages.LoginPage;
import pages.NewAccountModal;


public class AccountsTest extends BaseTest {

    //Открыть страницу Account - заполнить её данными (путь к полям указан в NewAccountModal) - нажать кнопку Save
    @Test
    @Description("Заполнение страницы Account данными")
    public void checkCreateAccount() {
        LoginPage.login("tborodich@tms.sandbox", "Password001");
        AccountsPage.openAccountPage();
        newAccountModal.createAccount("TMS-Nataly", "Hot", "0290001100", "0290001199", "1",
                "www.leningrad.ru", "none", "###", "Prospect", "Public",
                "Banking", "10", "100", "111", "Ulica", "Minsk",
                "Urucca", "220056", "Belarus", "Ulica", "Minsk",
                "Urucca", "22056", "Belarus");
        AccountsPage.clickOnSaveButton();
    }
}