package dto;

import com.github.javafaker.Faker;

public class AccountFactory {

    public static Account getAccount (String rating) {
        Faker faker = new Faker();
        return new Account(faker.company().name(), rating, faker.phoneNumber().phoneNumber(), faker.phoneNumber().cellPhone());
    }
}