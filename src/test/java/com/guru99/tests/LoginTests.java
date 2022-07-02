package com.guru99.tests;

import org.junit.Assert;
import org.testng.annotations.Test;

public class LoginTests extends BaseTests {
    @Test
    public void verifyLoginWithCorrectCredentials(String userName, String userPassword) {
        loginPage.loginToApplication(userName, userPassword);
        String actualTitle = commonDriver.getTitleOfThePage();
        String expectedTitle = "Guru99 Bank Manager HomePage";
        Assert.assertEquals(actualTitle, expectedTitle);
    }

    @Test
    public void justanotherTest() {
        System.out.println("This is just a test");
    }
}
