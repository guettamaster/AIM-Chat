package com.aimprosoft.steps.serenity;

import com.aimprosoft.LOCATORS;
import com.aimprosoft.pages.SignInPage;
import net.serenitybdd.core.Serenity;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.junit.Assert;
import java.net.URISyntaxException;
import java.text.ParseException;

public class EndUserSteps extends ScenarioSteps {

    SignInPage signinPage;

//======================================================SignInPage======================================================

    @Step
    public void openSignInPage() {
        signinPage.open();
    }

    @Step
    public void loginAsadmin() {
        signinPage.loginAsadmin();
    }

    @Step
    public void clickOnLoginButton() {
        signinPage.clickOnLoginButton();
    }
}