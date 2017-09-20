package com.aimprosoft.steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import net.thucydides.core.annotations.Steps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import com.aimprosoft.steps.serenity.EndUserSteps;

public class DefinitionSteps {

    @Steps
    EndUserSteps endUserSteps;

//======================================================SignInPage======================================================

    @Given("^open signin page$")
    public void openSigninPage() throws Throwable {
        endUserSteps.openSignInPage();
    }

    @And("^filled fields valid data$")
    public void filledFieldsValidData() throws Throwable {
        endUserSteps.loginAsadmin();
    }

    @When("^click on Login button$")
    public void clickOnLoginButton() throws Throwable {
        endUserSteps.clickOnLoginButton();
    }

    @Then("^home page is opened$")
    public void homePageIsOpened() throws Throwable {
        endUserSteps.homePageIsOpened();
    }

    @Then("^\"([^\"]*)\" user name is displayed$")
    public void userNameIsDisplayed(String admin) throws Throwable {
        endUserSteps.userNameIsDisplayed(admin);
    }

//======================================================HomePage======================================================

    @When("^click on plus link$")
    public void clickOnPlusLink() throws Throwable {
        endUserSteps.clickOnPlusLink();
    }

    @Then("^room title in popup is displayed$")
    public void roomTitleInPopupIsDisplayed() throws Throwable {
        endUserSteps.roomTitleInPopupIsDisplayed();
    }
}
