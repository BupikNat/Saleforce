package dto;  //data transfer object

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
//@AllArgsConstructor  //если есть билдер, то конструктор не нужен
@Builder
public class Account {

    private final String name;
    private final String rating;
    private final String phone;
    private final String fax;
    private final String accountNumber;
    private final String website;
    private final String accountsite;
    private final String tickersymbol;
    private final String type;
    private final String ownership;
    private final String industry;
    private final String employees;
    private final String revenue;
    private final String siccode;
    private final String billingstreet;
    private final String billingcity;
    private final String billingstate;
    private final String billingzip;
    private final String billingcountry;
    private final String shippingstreet;
    private final String shippingcity;
    private final String shippingstate;
    private final String shippingzip;
    private final String shippingcountry;
}