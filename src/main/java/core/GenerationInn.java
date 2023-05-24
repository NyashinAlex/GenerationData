package core;

import com.github.javafaker.Faker;

public class GenerationInn {

    Faker faker = new Faker();

    public String generationNewInn() {

        String[] code = {"7846", "7847", "7900", "7900", "7901"};

        String randomCode = code[(int) Math.floor(Math.random() * code.length)];
        String randomNum = String.valueOf(faker.number().numberBetween(100000, 999999));

        int oneNumber = ((Integer.valueOf(String.valueOf(randomCode.charAt(0))) * 7
                + Integer.valueOf(String.valueOf(randomCode.charAt(1))) * 2 + Integer.valueOf(String.valueOf(randomCode.charAt(2))) * 4
                + Integer.valueOf(String.valueOf(randomCode.charAt(3))) * 10 + Integer.valueOf(String.valueOf(randomNum.charAt(0))) * 3 + Integer.valueOf(String.valueOf(randomNum.charAt(1))) * 5
                + Integer.valueOf(String.valueOf(randomNum.charAt(2))) * 9 + Integer.valueOf(String.valueOf(randomNum.charAt(3))) * 4 + Integer.valueOf(String.valueOf(randomNum.charAt(4))) * 6
                + Integer.valueOf(String.valueOf(randomNum.charAt(5))) * 8)) % 11 % 10;

        int twoNumber = ((Integer.valueOf(String.valueOf(randomCode.charAt(0))) * 3 + Integer.valueOf(String.valueOf(randomCode.charAt(1))) * 7 + Integer.valueOf(String.valueOf(randomCode.charAt(2))) * 2
                + Integer.valueOf(String.valueOf(randomCode.charAt(3))) * 4 + Integer.valueOf(String.valueOf(randomNum.charAt(0))) * 10 + Integer.valueOf(String.valueOf(randomNum.charAt(1))) * 3
                + Integer.valueOf(String.valueOf(randomNum.charAt(2))) * 5 + Integer.valueOf(String.valueOf(randomNum.charAt(3))) * 9 + Integer.valueOf(String.valueOf(randomNum.charAt(4))) * 4
                + Integer.valueOf(String.valueOf(randomNum.charAt(5))) * 6 + (oneNumber * 8))) % 11 % 10;

        String inn = randomCode + randomNum + oneNumber + twoNumber;

        return inn;
    }
}
