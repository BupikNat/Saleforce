package tests;


import com.github.javafaker.Faker;
import dto.Account;
import io.qameta.allure.Description;
import lombok.extern.log4j.Log4j2;
import org.testng.annotations.Test;

@Log4j2
public class AccountsTest extends BaseTest {

    Faker faker = new Faker();

    //Account account = getAccount("Hot", "Prospect", "Public", "Banking");

    //Можно создать Builder - благодаря аннотации в классе Account
    Account account1 = Account.builder()
            .name(faker.company().name())
            .rating("Hot")
            .phone(faker.phoneNumber().phoneNumber())
            .fax(faker.phoneNumber().cellPhone())
            .accountNumber(faker.number().digit())
            .website(faker.internet().url())
            .accountsite(faker.company().url())
            .tickersymbol(faker.company().suffix())
            .type("Prospect")
            .ownership("Public")
            .industry("Banking")
            .employees(faker.funnyName().name())
            .revenue(faker.commerce().price())
            .siccode(faker.code().imei())
            .billingstreet(faker.address().streetAddress())
            .billingcity(faker.address().city())
            .billingstate(faker.address().state())
            .billingzip(faker.address().zipCode())
            .billingcountry(faker.address().country())
            .shippingstreet(faker.address().streetAddress())
            .shippingcity(faker.address().city())
            .shippingstate(faker.address().state())
            .shippingzip(faker.address().zipCode())
            .shippingcountry(faker.address().country())
            .build();

    //Открыть страницу Account - заполнить её данными (путь к полям указан в NewAccountModal) - нажать кнопку Save
    @Test
    @Description("Заполнение страницы Account данными")
    public void checkCreateAccount() {
        log.info("Create account");
        loginPage.openPage()
                     .isPageOpened()
                     .login("tborodich@tms.sandbox", "Password001");
        accountStep.create(account1);
    }
}