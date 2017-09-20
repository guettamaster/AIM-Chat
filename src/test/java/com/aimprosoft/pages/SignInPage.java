package com.aimprosoft.pages;

import com.aimprosoft.LOCATORS;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.concurrent.TimeUnit;

@DefaultUrl("https://chat-stage.aimprosoft.com/index.html")

public class SignInPage extends net.serenitybdd.core.pages.PageObject {

    private static Logger logger = LoggerFactory.getLogger(SignInPage.class);

    public void loginAsadmin() {
        withTimeoutOf(15, TimeUnit.SECONDS).waitFor(ExpectedConditions.visibilityOfElementLocated(By.xpath(LOCATORS.EMAIL_FIELD)));
        String email = "admin@email.com";
        String password = "qwerty1";
        logger.info("Entering email: " + email + " and password: " + password);
        $(LOCATORS.EMAIL_FIELD).sendKeys(email);
        $(LOCATORS.PASSWORD_FIELD).sendKeys(password);
    }

    public void clickOnLoginButton() {
        withTimeoutOf(15, TimeUnit.SECONDS).waitFor(ExpectedConditions.visibilityOfElementLocated(By.xpath(LOCATORS.SIGNINBUTTON)));
        $(LOCATORS.SIGNINBUTTON).click();
        //$("//button[contains(text(),'Login')]").click();
    }

    public boolean homePageIsOpened() {
        withTimeoutOf(15, TimeUnit.SECONDS).waitFor(ExpectedConditions.visibilityOfElementLocated(By.xpath(LOCATORS.AIMPROSOFT_LOGO)));
        return $(LOCATORS.AIMPROSOFT_LOGO).isPresent();
    }

    public boolean userNameIsDisplayed(String admin) {
        withTimeoutOf(16, TimeUnit.SECONDS).waitFor(ExpectedConditions.visibilityOfElementLocated(By.xpath(LOCATORS.USER_NAME_IN_THE_LEFT_PANEL.replace("$1", admin))));
        return $(LOCATORS.USER_NAME_IN_THE_LEFT_PANEL.replace("$1", admin)).isPresent();
    }
}