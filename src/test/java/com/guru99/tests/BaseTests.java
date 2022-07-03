package com.guru99.tests;

import com.guru99.pages.LoginPage;
import commonLibs.implementation.CommonDriver;
import commonLibs.utilities.ConfigUtils;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTests {

    CommonDriver commonDriver;
    String url;
    WebDriver driver;

    LoginPage loginPage;
    @BeforeClass
    public void setUp() throws Exception {
        ConfigUtils configUtils = new ConfigUtils();
        url = configUtils.getConfigValue("url");
        String browser = configUtils.getConfigValue("browser");
        commonDriver = new CommonDriver(browser);
        driver = commonDriver.getDriver();
        loginPage = new LoginPage(driver);
        commonDriver.navigateTo(url);
    }
    @AfterClass
    public void tearDown() {
       commonDriver.closeAllBrowser();
    }
}
