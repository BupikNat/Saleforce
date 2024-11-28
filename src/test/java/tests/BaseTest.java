package tests;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.annotations.*;

import java.time.Duration;

@Listeners(TestListener.class)
public class BaseTest {

    WebDriver driver;

    @Parameters({"browser"})
    @BeforeMethod
    @Description("Открытие браузера")
    public void setup(@Optional("chrome") String browser, ITestContext context) {
        //Настройка и инициация драйвера, можно запустить 3 разных браузера
        if(browser.equalsIgnoreCase("chrome")) {
            ChromeOptions options = new ChromeOptions();
            options.addArguments("start-maximized");
            driver = new ChromeDriver(options);   //инициализация
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        } else if(browser.equalsIgnoreCase("edge")) {
            driver = new EdgeDriver();
        } else if (browser.equalsIgnoreCase("firefox")) {
            FirefoxOptions options = new FirefoxOptions();
            driver = new FirefoxDriver(options);
        }

        //context.setAttribute("driver", driver); - работает только с версией TestNG 7.4.0, если выше версия то скрины при падении теста делать не будет
        TestListener.setDriver(driver);
    }

    //Закрыть браузер
    @AfterMethod(alwaysRun = true)
    @Description("Закрытие браузера")
    public void tearDown(ITestResult result) {
//        if (ITestResult.FAILURE == result.getStatus()) {
//            AllureUtils.takeScreenshot(driver);
//        }
        driver.quit();
    }
}
