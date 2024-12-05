package pages;

import org.openqa.selenium.WebDriver;
import wrappers.Input;
import wrappers.Picklist;
import wrappers.Textarea;

public class NewAccountModal extends BasePage{

    public NewAccountModal(WebDriver driver) {
        super(driver);
    }

    //Выбрать различные типы данных на странице - инпуты, текст ареа и выпадающие списки. Выбор по названию поля. XPath указаны в wrappers для каждого типа поля
    public void createAccount (String name, String rating, String phone, String fax, String number, String website,
                               String accountsite, String tickersymbol, String type, String ownership, String industry,
                               String employees, String revenue, String siccode,String billingstreet, String billingcity,
                               String billingstate, String billingzip, String billingcountry, String shippingstreet,
                               String shippingcity, String shippingstate, String shippingzip, String shippingcountry)  {
        new Input(driver, "Account Name").write(name);
        new Picklist(driver, "Rating").select(rating);
        new Input(driver, "Phone").write(phone);
        new Input(driver, "Fax").write(fax);
        new Input(driver, "Account Number").write(number);
        new Input(driver, "Website").write(website);
        new Input(driver, "Account Site").write(accountsite);
        new Input(driver, "Ticker Symbol").write(tickersymbol);
        new Picklist(driver, "Type").select(type);
        new Picklist(driver, "Ownership").select(ownership);
        new Picklist(driver, "Industry").select(industry);
        new Input(driver, "Employees").write(employees);
        new Input(driver, "Annual Revenue").write(revenue);
        new Input(driver, "SIC Code").write(siccode);
        new Textarea(driver, "Billing Street").write(billingstreet);
        new Input(driver, "Billing City").write(billingcity);
        new Input(driver, "Billing State/Province").write(billingstate);
        new Input(driver, "Billing Zip/Postal Code").write(billingzip);
        new Input(driver, "Billing Country").write(billingcountry);
        new Textarea(driver, "Shipping Street").write(shippingstreet);
        new Input(driver, "Shipping City").write(shippingcity);
        new Input(driver, "Shipping State/Province").write(shippingstate);
        new Input(driver, "Shipping Zip/Postal Code").write(shippingzip);
        new Input(driver, "Shipping Country").write(shippingcountry);
    }
}