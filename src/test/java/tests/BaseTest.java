package tests;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.annotations.*;
import pages.LoginPage;
import pages.NewAccountModal;
import steps.AccountStep;

import java.time.Duration;

//@Listeners(TestListener.class)
public class BaseTest {

    public WebDriver driver;
    public WebDriverWait wait;
    public NewAccountModal newAccountModal;
    protected AccountStep accountStep;
    protected LoginPage loginPage;

    @Parameters({"browser"})
    @BeforeMethod
    @Description("Открытие браузера")
    public void setup(@Optional("chrome") String browser, ITestContext context) {
        //Настройка и инициация драйвера, можно запустить 3 разных браузера
        if(browser.equalsIgnoreCase("chrome")) {
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--disable-notifications");  //отключение всплывающих уведомлений
            options.addArguments("start-maximized");
            driver = new ChromeDriver(options);   //инициализация
            //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        } else if(browser.equalsIgnoreCase("edge")) {
            driver = new EdgeDriver();
        } else if (browser.equalsIgnoreCase("firefox")) {
            FirefoxOptions options = new FirefoxOptions();
            driver = new FirefoxDriver(options);
        }

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        wait = new WebDriverWait(driver,(Duration.ofSeconds(10)));
        newAccountModal = new NewAccountModal(driver);
        accountStep = new AccountStep(driver);
        loginPage = new LoginPage(driver);
    }

    //Закрыть браузер
    @AfterMethod(alwaysRun = true)
    @Description("Закрытие браузера")
    public void tearDown(ITestResult result) {
        driver.quit();
    }
}