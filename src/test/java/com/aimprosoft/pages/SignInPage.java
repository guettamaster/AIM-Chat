package com.aimprosoft.pages;

import com.aimprosoft.LOCATORS;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.concurrent.TimeUnit;

@DefaultUrl("https://chat-predprod.aimprosoft.com/index.html")
//https://chat-stage.aimprosoft.com/index.html
//https://chat-predprod.aimprosoft.com/index.html
//https://chat.aimprosoft.com/index.html

public class SignInPage extends net.serenitybdd.core.pages.PageObject {

    private static Logger logger = LoggerFactory.getLogger(SignInPage.class);

    public void loginAsadmin() {
        String email = "admin@aimprosoft.com";
//      admin@email.com
//      admin@aimprosoft.com
//      o.ivankovckyi
        String password = "qwerty1";
//      15028819
//      qwerty1
        logger.info("Entering email: " + email + " and password: " + password);
        $(LOCATORS.EMAIL_FIELD).sendKeys(email);
//      EMAIL_FIELD_PROD_LDAP
//      EMAIL_FIELD
        $(LOCATORS.PASSWORD_FIELD).sendKeys(password);

    }

    public void clickOnLoginButton() {
        withTimeoutOf(15, TimeUnit.SECONDS).waitFor(ExpectedConditions.visibilityOfElementLocated(By.xpath(LOCATORS.SIGNINBUTTON)));
        $(LOCATORS.SIGNINBUTTON).click();
//      LDAP_SIGNINBUTTON
//      SIGNINBUTTON
    }

    public boolean homePageIsOpened() {
        withTimeoutOf(15, TimeUnit.SECONDS).waitFor(ExpectedConditions.visibilityOfElementLocated(By.xpath(LOCATORS.AIMPROSOFT_LOGO)));
        return $(LOCATORS.AIMPROSOFT_LOGO).isPresent();
    }

    public boolean userNameIsDisplayed(String admin) {
        waitABit(7000);
//        withTimeoutOf(16, TimeUnit.SECONDS).waitFor(ExpectedConditions.visibilityOfElementLocated(By.xpath(LOCATORS.THE_CURRENT_AUTHORIZED_USER_NAME_IN_THE_LEFT_PANEL.replace("$1", admin))));
        return $(LOCATORS.THE_CURRENT_AUTHORIZED_USER_NAME_IN_THE_LEFT_PANEL.replace("$1", admin)).isPresent();
    }

    public void clickOnStandardTab() {
        withTimeoutOf(1, TimeUnit.SECONDS);
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("arguments[0].click();", findBy(LOCATORS.STANDARD_TAB));
    }

}