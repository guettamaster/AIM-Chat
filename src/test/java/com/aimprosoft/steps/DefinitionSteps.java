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

    @Then("^the \"([^\"]*)\" description is displayed in the channel details block$")
    public void theDescriptionIsDisplayedInTheChannelDetailsBlock(String arg0) throws Throwable {
        endUserSteps.theDescriptionIsDisplayedInTheChannelDetailsBlock(arg0);
    }

    @Then("^the \"([^\"]*)\" description is displayed in the header$")
    public void theDescriptionIsDisplayedInTheHeader(String arg0) throws Throwable {
        endUserSteps.theDescriptionIsDisplayedInTheHeader(arg0);
    }

    @When("^click on the wheel link$")
    public void clickOnTheWheelLink() throws Throwable {
        endUserSteps.clickOnTheWheelLink();
    }

    @Then("^Delete room link is displayed$")
    public void deleteRoomLinkIsDisplayed() throws Throwable {
        endUserSteps.deleteRoomLinkIsDisplayed();
    }

    @When("^click on the Delete room link$")
    public void clickOnTheDeleteRoomLink() throws Throwable {
        endUserSteps.clickOnTheDeleteRoomLink();
    }

    @Then("^the \"([^\"]*)\" room is deleted$")
    public void theRoomIsDeleted(String arg0) throws Throwable {
        endUserSteps.theRoomIsDeleted(arg0);
    }

    @Then("^delete room pop-up is displayed$")
    public void deleteRoomPopUpIsDisplayed() throws Throwable {
        endUserSteps.deleteRoomPopUpIsDisplayed();
    }

    @When("^click on the Yes delete this room button$")
    public void clickOnTheYesDeleteThisRoomButton() throws Throwable {
        endUserSteps.clickOnTheYesDeleteThisRoomButton();
    }

    @When("^click on the Direct Messages link$")
    public void clickOnTheDirectMessagesLink() throws Throwable {
        endUserSteps.clickOnTheDirectMessagesLink();
    }

    @Then("^direct rooms pop-up is displayed$")
    public void directRoomsPopUpIsDisplayed() throws Throwable {
        endUserSteps.directRoomsPopUpIsDisplayed();
    }

    @When("^enter \"([^\"]*)\" in the input search field$")
    public void enterInTheInputSearchField(String arg0) throws Throwable {
        endUserSteps.enterInTheInputSearchField(arg0);
    }

    @Then("^\"([^\"]*)\" is displayed in the list of users$")
    public void isDisplayedInTheListOfUsers(String arg0) throws Throwable {
        endUserSteps.isDisplayedInTheListOfUsers(arg0);
    }

    @When("^click on the \"([^\"]*)\" name in the list of users$")
    public void clickOnTheNameInTheListOfUsers(String arg0) throws Throwable {
        endUserSteps.clickOnTheNameInTheListOfUsers(arg0);
    }

    @Then("^\"([^\"]*)\" user name is displayed in the left panel$")
    public void userNameIsDisplayedInTheLeftPanel(String arg0) throws Throwable {
        endUserSteps.userNameIsDisplayedInTheLeftPanel(arg0);
    }

    @Then("^\"([^\"]*)\" user name is displayed in the header$")
    public void userNameIsDisplayedInTheHeader(String arg0) throws Throwable {
        endUserSteps.userNameIsDisplayedInTheHeader(arg0);
    }

    @When("^click on the \"([^\"]*)\" user name in the left panel$")
    public void clickOnTheUserNameInTheLeftPanel(String arg0) throws Throwable {
        endUserSteps.clickOnTheUserNameInTheLeftPanel(arg0);
    }

    @When("^enter \"([^\"]*)\" in the input message field$")
    public void enterInTheInputMessageField(String arg0) throws Throwable {
        endUserSteps.enterInTheInputMessageField(arg0);
    }

    @When("^click on Enter button$")
    public void clickOnEnterButton() throws Throwable {
        endUserSteps.clickOnEnterButton();
    }
}
