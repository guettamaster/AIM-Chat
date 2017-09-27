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

    @When("^enter \"([^\"]*)\" in the \"([^\"]*)\" input field$")
    public void enterInTheInputField(String arg0, String arg1) throws Throwable {
        endUserSteps.enterInTheInputField(arg0, arg1);
    }

    @When("^choose public room checkbox$")
    public void choosePublicRoomCheckbox() throws Throwable {
        endUserSteps.choosePublicRoomCheckbox();
    }

    @When("^enter \"([^\"]*)\" in the Invite members field$")
    public void enterInTheInviteMembersField(String superadmin) throws Throwable {
        endUserSteps.enterInTheInviteMembersField(superadmin);
    }

    @When("^enter \"([^\"]*)\" in the \"([^\"]*)\" textarea field$")
    public void enterInTheTextareaField(String arg0, String arg1) throws Throwable {
        endUserSteps.enterInTheTextareaField(arg0, arg1);
    }

    @When("^click on OK button$")
    public void clickOnOKButton() throws Throwable {
        endUserSteps.clickOnOKButton();
    }

    @Then("^the \"([^\"]*)\" room is created$")
    public void theRoomIsCreated(String arg0) throws Throwable {
        endUserSteps.theRoomIsCreated(arg0);
    }

    @When("^click on Standard tab$")
    public void clickOnStandardTab() throws Throwable {
        endUserSteps.clickOnStandardTab();
    }

    @When("^click on \"([^\"]*)\" room in the left panel$")
    public void clickOnRoomInTheLeftPanel(String arg0) throws Throwable {
        endUserSteps.clickOnRoomInTheLeftPanel(arg0);
    }

    @Then("^the \"([^\"]*)\" title is displayed in the header$")
    public void theTitleIsDisplayedInTheHeader(String arg0) throws Throwable {
        endUserSteps.theTitleIsDisplayedInTheHeader(arg0);
    }

    @When("^click on the about channel button of \"([^\"]*)\" room$")
    public void clickOnTheAboutChannelButtonOfRoom(String arg0) throws Throwable {
        endUserSteps.clickOnTheAboutChannelButtonOfRoom(arg0);
    }

    @When("^click on the \"([^\"]*)\" channel details link$")
    public void clickOnTheChannelDetailsLink(String arg0) throws Throwable {
        endUserSteps.clickOnTheChannelDetailsLink(arg0);
    }

    @Then("^\"([^\"]*)\" name is displayed in the channel details block$")
    public void nameIsDisplayedInTheChannelDetailsBlock(String arg0) throws Throwable {
        endUserSteps.nameIsDisplayedInTheChannelDetailsBlock(arg0);
    }

    @When("^click on the Edit room name link$")
    public void clickOnTheEditRoomNameLink() throws Throwable {
        endUserSteps.clickOnTheEditRoomNameLink();
    }

    @Then("^input room name field is displayed$")
    public void inputRoomNameFieldIsDisplayed() throws Throwable {
        endUserSteps.inputRoomNameFieldIsDisplayed();
    }

    @When("^clear data in the input room name field$")
    public void clearDataInTheInputRoomNameField() throws Throwable {
        endUserSteps.clearDataInTheInputRoomNameField();
    }

    @When("^enter \"([^\"]*)\" in the input room name field$")
    public void enterInTheInputRoomNameField(String arg0) throws Throwable {
        endUserSteps.enterInTheInputRoomNameField(arg0);
    }

    @When("^click on Save button under the input room name field$")
    public void clickOnSaveButtonUnderTheInputRoomNameField() throws Throwable {
        endUserSteps.clickOnSaveButtonUnderTheInputRoomNameField();
    }

    @When("^click on the Edit description link in the \"([^\"]*)\" room$")
    public void clickOnTheEditDescriptionLinkInTheRoom(String arg0) throws Throwable {
        endUserSteps.clickOnTheEditDescriptionLinkInTheRoom(arg0);
    }

    @Then("^input description field is displayed$")
    public void inputDescriptionFieldIsDisplayed() throws Throwable {
        endUserSteps.inputDescriptionFieldIsDisplayed();
    }

    @When("^clear data in the input description field$")
    public void clearDataInTheInputDescriptionField() throws Throwable {
        endUserSteps.clearDataInTheInputDescriptionField();
    }

    @When("^enter \"([^\"]*)\" in the input description field$")
    public void enterInTheInputDescriptionField(String arg0) throws Throwable {
        endUserSteps.enterInTheInputDescriptionField(arg0);
    }

    @When("^click on Done button under the input description field$")
    public void clickOnDoneButtonUnderTheInputDescriptionField() throws Throwable {
        endUserSteps.clickOnDoneButtonUnderTheInputDescriptionField();
    }
}
