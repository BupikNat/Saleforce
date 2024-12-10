package dto;  //data transfer object

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
//@AllArgsConstructor  //если есть билдер, то конструктор не нужен
@Builder
public class Account {

    @Builder.Default  //нужен для того, чтобы не требовалось наличие всех переменных при заполнении страницы аккаунта
    private final String name = "TMS";
    @Builder.Default
    private final String rating = "Hot";
    @Builder.Default
    private final String phone = "0291111111";
    @Builder.Default
    private final String fax = "0291111111";
    @Builder.Default
    private final String accountNumber = "111";
    @Builder.Default
    private final String website = "www.site.com";
    @Builder.Default
    private final String accountsite = "www.site.com";
    @Builder.Default
    private final String tickersymbol = "AAA";
    @Builder.Default
    private final String type = "Prospect";
    @Builder.Default
    private final String ownership = "Public";
    @Builder.Default
    private final String industry = "Banking";
    @Builder.Default
    private final String employees = "Nataly";
    @Builder.Default
    private final String revenue = "500";
    @Builder.Default
    private final String siccode = "AAA111";
    @Builder.Default
    private final String billingstreet = "Billing Street";
    @Builder.Default
    private final String billingcity = "Billing City";
    @Builder.Default
    private final String billingstate = "Billing State";
    @Builder.Default
    private final String billingzip = "Billing ZIP";
    @Builder.Default
    private final String billingcountry = "Billing Country";
    @Builder.Default
    private final String shippingstreet = "Shipping Street";
    @Builder.Default
    private final String shippingcity = "Shipping City";
    @Builder.Default
    private final String shippingstate = "Shipping State";
    @Builder.Default
    private final String shippingzip = "Shipping ZIP";
    @Builder.Default
    private final String shippingcountry = "Shipping Country";
}