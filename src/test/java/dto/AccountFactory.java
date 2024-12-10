package dto;

import com.github.javafaker.Faker;

public class AccountFactory {

    public static Account getAccount(String rating, String type, String ownership, String industry) {
        Faker faker = new Faker();
        return new Account(
                faker.company().name(),
                rating,
                faker.phoneNumber().phoneNumber(),
                faker.phoneNumber().cellPhone(),
                faker.number().digit(),
                faker.internet().url(),
                faker.company().url(),
                faker.company().suffix(),
                type,
                ownership,
                industry,
                faker.funnyName().name(),
                faker.commerce().price(),
                faker.code().imei(),
                faker.address().streetAddress(),
                faker.address().city(),
                faker.address().state(),
                faker.address().zipCode(),
                faker.address().country(),
                faker.address().streetAddress(),
                faker.address().city(),
                faker.address().state(),
                faker.address().zipCode(),
                faker.address().country()
        );
    }
}