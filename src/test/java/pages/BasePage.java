package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Objects;

public abstract class BasePage {

    static WebDriver driver;
    static WebDriverWait wait;

    //Конструктор
    public BasePage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(40));
    }

    //public abstract BasePage isPageOpened();
   // public abstract BasePage openPage();


   /*
    //подождать пока все JS элементы на странице не прогрузились, вместо wait, в BasePage вставлять
    public void waitForPageLoaded() {
        new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver driver) {
                return Objects.requireNonNull((JavascriptExecutor) driver).executeScript("return document.readyState")
                        .toString().equals("complete");
            }
        };
    }

    //Нажатие на веб элемент на странице, даже если он чем-то перекрыт
    public void clickJS(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driver; //(JavascriptExecutor) - насильно приравнять к драйверу
       js.executeScript("argument[0].click()", element);  //нажать на элемент
    }

    //Скролл страницы
    public void scrollJS(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driver; //(JavascriptExecutor) - насильно приравнять к драйверу
        js.executeScript("window.scrollBy(0, 500)");  //0 - скролл горизонтально, 500 - скролл вертикально (на 500 пикселей)
    }

    //Скролл
    public void scroll(WebElement element) {
        Actions actions = new Actions (driver);
        actions.sendKeys(Keys.PAGE_UP);                         //скролл вверх /вниз (PAGE_DOWN)
        actions.moveToElement(driver.findElement(By.id("")));  //скролл к конкретному элемнту
    }

    //Скролл до заданного элемента
    public void scrollJSElement(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driver; //(JavascriptExecutor) - насильно приравнять к драйверу
        js.executeScript("window.scrollIntoView(true)", element);  //скролл внутри элемента
    }
    */
}