package com.ui.tests;

import com.ui.pageobjects.HomePage;
import com.ui.pageobjects.LoginPage;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class LoginTest {

    @Test
    public void testLogin() {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        //options.addArguments("--remote-allow-origins=*");
        ChromeDriver driver = new ChromeDriver();
        LoginPage signInPage = new LoginPage(driver);
        HomePage homePage = signInPage.loginValidUser("userName", "password");
        assertThat(homePage.getMessageText(), is("Hello userName"));
    }
}
