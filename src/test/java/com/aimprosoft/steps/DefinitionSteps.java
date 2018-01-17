package com.aimprosoft.steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import net.thucydides.core.annotations.Steps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import com.aimprosoft.steps.serenity.EndUserSteps;

import java.net.URISyntaxException;
import java.util.Map;

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

    @When("^click on Add button$")
    public void clickOnAddButton() throws Throwable {
        endUserSteps.clickOnAddButton();
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

    @When("^click on the Delete button$")
    public void clickOnTheDeleteButton() throws Throwable {
        endUserSteps.clickOnTheDeleteButton();
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

    @Then("^\"([^\"]*)\" message is created$")
    public void messageIsCreated(String arg0) throws Throwable {
        endUserSteps.messageIsCreated(arg0);
    }

    @Then("^\"([^\"]*)\" message is displayed$")
    public void messageIsDisplayed(String arg0) throws Throwable {
        endUserSteps.messageIsDisplayed(arg0);
    }

    @When("^click on the right control hamburger on the \"([^\"]*)\" message$")
    public void clickOnTheRightControlHamburgerOnTheMessage(String arg0) throws Throwable {
        endUserSteps.clickOnTheRightControlHamburgerOnTheMessage(arg0);
    }

    @Then("^message menu is displayed$")
    public void messageMenuIsDisplayed() throws Throwable {
        endUserSteps.messageMenuIsDisplayed();
    }

    @When("^click on the \"([^\"]*)\" link in the message menu$")
    public void clickOnTheLinkInTheMessageMenu(String arg0) throws Throwable {
        endUserSteps.clickOnTheLinkInTheMessageMenu(arg0);
    }

    @When("^clear data in the input message field$")
    public void clearDataInTheInputMessageField() throws Throwable {
        endUserSteps.clearDataInTheInputMessageField();
    }

    @Then("^\"([^\"]*)\" action is displayed$")
    public void actionIsDisplayed(String arg0) throws Throwable {
        endUserSteps.actionIsDisplayed(arg0);
    }

    @When("^click on the Delete Message link in the message menu$")
    public void clickOnTheDeleteMessageLinkInTheMessageMenu() throws Throwable {
        endUserSteps.clickOnTheDeleteMessageLinkInTheMessageMenu();
    }

    @Then("^Delete Message title in the opened pop-up is displayed$")
    public void deleteMessageTitleInTheOpenedPopUpIsDisplayed() throws Throwable {
        endUserSteps.deleteMessageTitleInTheOpenedPopUpIsDisplayed();
    }

    @When("^click on the Delete button in the opened pop-up$")
    public void clickOnTheDeleteButtonInTheOpenedPopUp() throws Throwable {
        endUserSteps.clickOnTheDeleteButtonInTheOpenedPopUp();
    }

    @Then("^\"([^\"]*)\" message is deleted$")
    public void messageIsDeleted(String arg0) throws Throwable {
        endUserSteps.messageIsDeleted(arg0);
    }

    @When("^click on the delete sign near \"([^\"]*)\" user in the left panel$")
    public void clickOnTheDeleteSignNearUserInTheLeftPanel(String arg0) throws Throwable {
        endUserSteps.clickOnTheDeleteSignNearUserInTheLeftPanel(arg0);
    }

    @Then("^\"([^\"]*)\" user is deleted in the left panel$")
    public void userIsDeletedInTheLeftPanel(String arg0) throws Throwable {
        endUserSteps.userIsDeletedInTheLeftPanel(arg0);
    }

    @When("^click on Clip button$")
    public void clickOnClipButton() throws Throwable {
        endUserSteps.clickOnClipButton();
    }

    @Then("^Upload file link is displayed$")
    public void uploadFileLinkIsDisplayed() throws Throwable {
        endUserSteps.uploadFileLinkIsDisplayed();
    }

    @When("^Upload \"([^\"]*)\" to the form$")
    public void uploadToTheForm(String arg0) throws Throwable {
        endUserSteps.uploadToTheForm(arg0);
    }

    @Then("^\"([^\"]*)\" title is displayed in the pop-up$")
    public void titleIsDisplayedInThePopUp(String arg0) throws Throwable {
        endUserSteps.titleIsDisplayedInThePopUp(arg0);
    }

    @When("^click on Upload button$")
    public void clickOnUploadButton() throws Throwable {
        endUserSteps.clickOnUploadButton();
    }

    @Then("^\"([^\"]*)\" file is displayed in the room$")
    public void fileIsDisplayedInTheRoom(String arg0) throws Throwable {
        endUserSteps.fileIsDisplayedInTheRoom(arg0);
    }

    @When("^click on the Download button under \"([^\"]*)\" file$")
    public void clickOnTheDownloadButtonUnderFile(String arg0) throws Throwable {
        endUserSteps.clickOnTheDownloadButtonUnderFile(arg0);
    }

    @Then("^the file is downloaded on the local machine$")
    public void theFileIsDownloadedOnTheLocalMachine() throws Throwable {
        endUserSteps.theFileIsDownloadedOnTheLocalMachine();
    }

    @When("^click on Add Room title$")
    public void clickOnAddRoomTitle() throws Throwable {
        endUserSteps.clickOnAddRoomTitle();
    }

    @When("^click on the favorite room button$")
    public void clickOnTheFavoriteRoomButton() throws Throwable {
        endUserSteps.clickOnTheFavoriteRoomButton();
    }

    @Then("^the \"([^\"]*)\" is displayed in the Favorites on the left panel$")
    public void theIsDisplayedInTheFavoritesOnTheLeftPanel(String arg0) throws Throwable {
        endUserSteps.theIsDisplayedInTheFavoritesOnTheLeftPanel(arg0);
    }

    @When("^click on the unfavorite room button$")
    public void clickOnTheUnfavoriteRoomButton() throws Throwable {
        endUserSteps.clickOnTheUnfavoriteRoomButton();
    }

    @Then("^the \"([^\"]*)\" is deleted in the Favorites on the left panel$")
    public void theIsDeletedInTheFavoritesOnTheLeftPanel(String arg0) throws Throwable {
        endUserSteps.theIsDeletedInTheFavoritesOnTheLeftPanel(arg0);
    }

    @Then("^the \"([^\"]*)\" room returns to the Rooms on the left panel$")
    public void theRoomReturnsToTheRoomsOnTheLeftPanel(String arg0) throws Throwable {
        endUserSteps.theRoomReturnsToTheRoomsOnTheLeftPanel(arg0);
    }

    @When("^Upload file many times$")
    public void uploadFileManyTimes(Map<String,String> parameters) throws URISyntaxException {
      endUserSteps.uploadFileManyTimes(parameters);
    }

    @When("^click on user name$")
    public void clickOnUserName() throws Throwable {
        endUserSteps.clickOnUserName();
    }

    @When("^click on room title in popup$")
    public void clickOnRoomTitleInPopup() throws Throwable {
        endUserSteps.clickOnRoomTitleInPopup();
    }

    @Then("^Clip button is displayed$")
    public void clipButtonIsDisplayed() throws Throwable {
        endUserSteps.clipButtonIsDisplayed();
    }

    @Then("^progress bar is disappeared$")
    public void progressBarIsDisappeared() throws Throwable {
        endUserSteps.progressBarIsDisappeared();
    }

    @When("^click on \"([^\"]*)\" user name$")
    public void clickOnUserName(String arg0) throws Throwable {
        endUserSteps.clickOnUserName(arg0);
    }

    @Then("^the user menu with actions is displayed$")
    public void theUserMenuWithActionsIsDisplayed() throws Throwable {
        endUserSteps.theUserMenuWithActionsIsDisplayed();
    }

    @When("^click on the Profile link$")
    public void clickOnTheProfileLink() throws Throwable {
        endUserSteps.clickOnTheProfileLink();
    }

    @Then("^the Profile page is displayed$")
    public void theProfilePageIsDisplayed() throws Throwable {
        endUserSteps.theProfilePageIsDisplayed();
    }

    @When("^Upload avatar to the Profile page$")
    public void uploadAvatarToTheProfilePage(Map<String,String> parameters) throws URISyntaxException {
        endUserSteps.uploadAvatarToTheProfilePage(parameters);
    }

    @When("^click on the Save button on the Profile page$")
    public void clickOnTheSaveButtonOnTheProfilePage() throws Throwable {
        endUserSteps.clickOnTheSaveButtonOnTheProfilePage();
    }

    @When("^clear data in the \"([^\"]*)\" input field$")
    public void clearDataInTheInputField(String arg0) throws Throwable {
        endUserSteps.clearDataInTheInputField(arg0);
    }

    @Then("^Profile successfully updated message is displayed$")
    public void profileSuccessfullyUpdatedMessageIsDisplayed() throws Throwable {
        endUserSteps.profileSuccessfullyUpdatedMessageIsDisplayed();
    }

    @When("^click on the arrow back$")
    public void clickOnTheArrowBack() throws Throwable {
        endUserSteps.clickOnTheArrowBack();
    }

    @Then("^\"([^\"]*)\" user name is displayed in the left panel after updating profile$")
    public void userNameIsDisplayedInTheLeftPanelAfterUpdatingProfile(String arg0) throws Throwable {
        endUserSteps.userNameIsDisplayedInTheLeftPanelAfterUpdatingProfile(arg0);
    }

    @Then("^the \"([^\"]*)\" input field is correct$")
    public void theInputFieldIsCorrect(String arg0) throws Throwable {
        endUserSteps.checkTheValueOfTheFieldWithLabel(arg0);
    }

    @Then("^the draft sign is displayed near \"([^\"]*)\" user name in the left panel$")
    public void theDraftSignIsDisplayedNearUserNameInTheLeftPanel(String arg0) throws Throwable {
        endUserSteps.theDraftSignIsDisplayedNearUserNameInTheLeftPanel(arg0);
    }

    @When("^enter \"([^\"]*)\" in the input search field inside a room$")
    public void enterInTheInputSearchFieldInsideARoom(String arg0) throws Throwable {
        endUserSteps.enterInTheInputSearchFieldInsideARoom(arg0);
    }

    @Then("^\"([^\"]*)\" title name of a panel with list is displayed$")
    public void titleNameOfAPanelWithListIsDisplayed(String arg0) throws Throwable {
        endUserSteps.titleNameOfAPanelWithListIsDisplayed(arg0);
    }

    @When("^check the appearance of the snippet button$")
    public void checkTheAppearanceOfTheSnippetButton() throws Throwable {
        endUserSteps.checkTheAppearanceOfTheSnippetButton();
    }
}
