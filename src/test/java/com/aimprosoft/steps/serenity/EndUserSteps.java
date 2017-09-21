package com.aimprosoft.steps.serenity;

import com.aimprosoft.LOCATORS;
import com.aimprosoft.pages.HomePage;
import com.aimprosoft.pages.SignInPage;
import net.serenitybdd.core.Serenity;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.junit.Assert;
import java.net.URISyntaxException;
import java.text.ParseException;

public class EndUserSteps extends ScenarioSteps {

    SignInPage signinPage;
    HomePage homePage;

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

    @Step
    public void homePageIsOpened() {
        Assert.assertTrue("False", signinPage.homePageIsOpened());
    }

    @Step
    public void userNameIsDisplayed(String admin) {
        Assert.assertTrue("False", signinPage.userNameIsDisplayed(admin));
    }

//======================================================HomePage======================================================

    @Step
    public void clickOnPlusLink() {
        homePage.clickOnPlusLink();
    }

    @Step
    public void roomTitleInPopupIsDisplayed() {
        Assert.assertTrue("False", homePage.roomTitleInPopupIsDisplayed());
    }

    @Step
    public void enterInTheInputField(String arg0, String arg1) {
        homePage.enterInTheInputField(arg0, arg1);
    }

    @Step
    public void choosePublicRoomCheckbox() {
        homePage.choosePublicRoomCheckbox();
    }

    @Step
    public void enterInTheInviteMembersField(String superadmin) {
        homePage.enterInTheInviteMembersField(superadmin);
    }

    @Step
    public void enterInTheTextareaField(String arg0, String arg1) {
        homePage.enterInTheTextareaField(arg0, arg1);
    }
}