package com.aimprosoft.steps;

import com.aimprosoft.steps.serenity.EndUserSteps;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

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
        endUserSteps.loginAsuser();
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

    @When("^click on the settings button of \"([^\"]*)\" room$")
    public void clickOnTheSettingsButtonOfRoom(String arg0) throws Throwable {
        endUserSteps.clickOnTheSettingsButtonOfRoom(arg0);
    }

    @When("^click on the \"([^\"]*)\" channel details link$")
    public void clickOnTheChannelDetailsLink(String arg0) throws Throwable {
        endUserSteps.clickOnTheChannelDetailsLink(arg0);
    }

    @Then("^room settings is displayed on the \"([^\"]*)\" name$")
    public void roomSettingsIsDisplayedOnTheName(String arg0) throws Throwable {
        endUserSteps.roomSettingsIsDisplayedOnTheName(arg0);
    }

    @When("^click on the Edit room name link$")
    public void clickOnTheEditRoomNameLink() throws Throwable {
        endUserSteps.clickOnTheEditRoomNameLink();
    }

    @Then("^input room name field on the \"([^\"]*)\" is displayed$")
    public void inputRoomNameFieldOnTheIsDisplayed(String arg0) throws Throwable {
        endUserSteps.inputRoomNameFieldOnTheIsDisplayed(arg0);
    }

    @When("^clear data in the input room name field$")
    public void clearDataInTheInputRoomNameField() throws Throwable {
        endUserSteps.clearDataInTheInputRoomNameField();
    }

    @When("^enter \"([^\"]*)\" in the input room name field$")
    public void enterInTheInputRoomNameField(String arg0) throws Throwable {
        endUserSteps.enterInTheInputRoomNameField(arg0);
    }

    @When("^click on Save changes button under the input room name field$")
    public void clickOnSaveChangesButtonUnderTheInputRoomNameField() throws Throwable {
        endUserSteps.clickOnSaveChangesButtonUnderTheInputRoomNameField();
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

    @Then("^\"([^\"]*)\" delete room pop-up is displayed$")
    public void deleteRoomPopUpIsDisplayed(String arg0) throws Throwable {
        endUserSteps.deleteRoomPopUpIsDisplayed(arg0);
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

    @When("^click on the right control hamburger on the \"([^\"]*)\" file$")
    public void clickOnTheRightControlHamburgerOnTheFile(String arg0) throws Throwable {
        endUserSteps.clickOnTheRightControlHamburgerOnTheFile(arg0);
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

    @Then("^the \"([^\"]*)\" file is downloaded on the local machine$")
    public void theFileIsDownloadedOnTheLocalMachine(String arg0) throws Throwable {
        endUserSteps.theFileIsDownloadedOnTheLocalMachine(arg0);
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

    @Then("^the \"([^\"]*)\" toast is displayed$")
    public void theToastIsDisplayed(String arg0) throws Throwable {
        endUserSteps.theToastIsDisplayed(arg0);
    }

    @Then("^the \"([^\"]*)\" toast is closed$")
    public void theToastIsClosed(String arg0) throws Throwable {
        endUserSteps.theToastIsClosed(arg0);
    }

    @When("^enter \"([^\"]*)\" in the snippet file name field$")
    public void enterInTheSnippetFileNameField(String arg0) throws Throwable {
        endUserSteps.enterInTheSnippetFileNameField(arg0);
    }

    @When("^enter \"([^\"]*)\" in the textarea field$")
    public void enterInTheTextareaField(String arg0) throws Throwable {
        endUserSteps.enterInTheTextareaField(arg0);
    }

    @When("^click on the Create button$")
    public void clickOnTheCreateButton() throws Throwable {
        endUserSteps.clickOnTheCreateButton();
    }

    @Then("^\"([^\"]*)\" is created$")
    public void isCreated(String arg0) throws Throwable {
        endUserSteps.isCreated(arg0);
    }

    @Then("^\"([^\"]*)\" is displayed$")
    public void isDisplayed(String arg0) throws Throwable {
        endUserSteps.isDisplayed(arg0);
    }

    @When("^click on the edit link on the \"([^\"]*)\"$")
    public void clickOnTheEditLinkOnThe(String arg0) throws Throwable {
        endUserSteps.clickOnTheEditLinkOnThe(arg0);
    }

    @Then("^create snippet title inside opened popup is displayed$")
    public void createSnippetTitleInsideOpenedPopupIsDisplayed() throws Throwable {
        endUserSteps.createSnippetTitleInsideOpenedPopupIsDisplayed();
    }

    @Then("^edit snippet title inside opened popup is displayed$")
    public void editSnippetTitleInsideOpenedPopupIsDisplayed() throws Throwable {
        endUserSteps.editSnippetTitleInsideOpenedPopupIsDisplayed();
    }

    @When("^click on the arrow in the Programming Language dropdown menu$")
    public void clickOnTheArrowInTheProgrammingLanguageDropdownMenu() throws Throwable {
        endUserSteps.clickOnTheArrowInTheProgrammingLanguageDropdownMenu();
    }

    @When("^click \"([^\"]*)\" option from the Programming Language drop-down list$")
    public void clickOptionFromTheProgrammingLanguageDropDownList(String arg0) throws Throwable {
        endUserSteps.clickOptionFromTheProgrammingLanguageDropDownList(arg0);
    }

    @When("^clear data in the snippet file name field$")
    public void clearDataInTheSnippetFileNameField() throws Throwable {
        endUserSteps.clearDataInTheSnippetFileNameField();
    }

    @When("^clear data in the textarea field$")
    public void clearDataInTheTextareaField() throws Throwable {
        endUserSteps.clearDataInTheTextareaField();
    }

    @Then("^Programming Language drop-down list is opened$")
    public void programmingLanguageDropDownListIsOpened() throws Throwable {
        endUserSteps.programmingLanguageDropDownListIsOpened();
    }

    @Then("^\"([^\"]*)\" option is displayed in the Programming Language dropdown menu$")
    public void optionIsDisplayedInTheProgrammingLanguageDropdownMenu(String arg0) throws Throwable {
        endUserSteps.optionIsDisplayedInTheProgrammingLanguageDropdownMenu(arg0);
    }

    @When("^click on the arrow in the Theme dropdown menu$")
    public void clickOnTheArrowInTheThemeDropdownMenu() throws Throwable {
        endUserSteps.clickOnTheArrowInTheThemeDropdownMenu();
    }

    @Then("^Theme drop-down list is opened$")
    public void themeDropDownListIsOpened() throws Throwable {
        endUserSteps.themeDropDownListIsOpened();
    }

    @When("^click \"([^\"]*)\" option from the Theme drop-down list$")
    public void clickOptionFromTheThemeDropDownList(String arg0) throws Throwable {
        endUserSteps.clickOptionFromTheThemeDropDownList(arg0);
    }

    @Then("^\"([^\"]*)\" option is displayed in the Theme dropdown menu$")
    public void optionIsDisplayedInTheThemeDropdownMenu(String arg0) throws Throwable {
        endUserSteps.optionIsDisplayedInTheThemeDropdownMenu(arg0);
    }

    @When("^click on the Save button$")
    public void clickOnTheSaveButton() throws Throwable {
        endUserSteps.clickOnTheSaveButton();
    }

    @Then("^\"([^\"]*)\" is edited$")
    public void isEdited(String arg0) throws Throwable {
        endUserSteps.isEdited(arg0);
    }

    @When("^click on the \"([^\"]*)\" snippet name$")
    public void clickOnTheSnippetName(String arg0) throws Throwable {
        endUserSteps.clickOnTheSnippetName(arg0);
    }

    @Then("^preview \"([^\"]*)\" text on the \"([^\"]*)\" snippet name is displayed$")
    public void previewTextOnTheSnippetNameIsDisplayed(String arg0, String arg1) throws Throwable {
        endUserSteps.previewTextOnTheSnippetNameIsDisplayed(arg0, arg1);
    }

    @When("^click on the right control hamburger on the \"([^\"]*)\" snippet$")
    public void clickOnTheRightControlHamburgerOnTheSnippet(String arg0) throws Throwable {
        endUserSteps.clickOnTheRightControlHamburgerOnTheSnippet(arg0);
    }

    @When("^navigate on \"([^\"]*)\" snippet$")
    public void navigateOnSnippet(String arg0) throws Throwable {
        endUserSteps.navigateOnSnippet(arg0);
    }

    @Then("^message menu for the \"([^\"]*)\" snippet is displayed$")
    public void messageMenuForTheSnippetIsDisplayed(String arg0) throws Throwable {
        endUserSteps.messageMenuForTheSnippetIsDisplayed(arg0);
    }

    @When("^click on the Delete Message link on the \"([^\"]*)\" snippet in the message menu$")
    public void clickOnTheDeleteMessageLinkOnTheSnippetInTheMessageMenu(String arg0) throws Throwable {
        endUserSteps.clickOnTheDeleteMessageLinkOnTheSnippetInTheMessageMenu(arg0);
    }

    @Then("^the \"([^\"]*)\" snippet is displayed inside the Delete Message pop-up$")
    public void theSnippetIsDisplayedInsideTheDeleteMessagePopUp(String arg0) throws Throwable {
        endUserSteps.theSnippetIsDisplayedInsideTheDeleteMessagePopUp(arg0);
    }

    @When("^click on the Download button near the \"([^\"]*)\" snippet$")
    public void clickOnTheDownloadButtonNearTheSnippet(String arg0) throws Throwable {
        endUserSteps.clickOnTheDownloadButtonNearTheSnippet(arg0);
    }

    @Then("^the \"([^\"]*)\" snippet is downloaded on the local machine$")
    public void theSnippetIsDownloadedOnTheLocalMachine(String arg0) throws Throwable {
        endUserSteps.theSnippetIsDownloadedOnTheLocalMachine(arg0);
    }

    @Then("^message menu for the \"([^\"]*)\" message is displayed$")
    public void messageMenuForTheMessageIsDisplayed(String arg0) throws Throwable {
        endUserSteps.messageMenuForTheMessageIsDisplayed(arg0);
    }

    @When("^click on a Pin to conversation link on the \"([^\"]*)\" message in the message menu$")
    public void clickOnAPinToConversationLinkOnTheMessageInTheMessageMenu(String arg0) throws Throwable {
        endUserSteps.clickOnAPinToConversationLinkOnTheMessageInTheMessageMenu(arg0);
    }

    @Then("^the \"([^\"]*)\" message is displayed inside the Pin Message pop-up$")
    public void theMessageIsDisplayedInsideThePinMessagePopUp(String arg0) throws Throwable {
        endUserSteps.theMessageIsDisplayedInsideThePinMessagePopUp(arg0);
    }

    @When("^click on the Pin button$")
    public void clickOnThePinButton() throws Throwable {
        endUserSteps.clickOnThePinButton();
    }

    @Then("^pinned sign is displayed near the \"([^\"]*)\" message$")
    public void pinnedSignIsDisplayedNearTheMessage(String arg0) throws Throwable {
        endUserSteps.pinnedSignIsDisplayedNearTheMessage(arg0);
    }

    @When("^click on the Pin button of \"([^\"]*)\" direct$")
    public void clickOnThePinButtonOfDirect(String arg0) throws Throwable {
        endUserSteps.clickOnThePinButtonOfDirect(arg0);
    }

    @Then("^the \"([^\"]*)\" message is displayed in the Pinned messages block$")
    public void theMessageIsDisplayedInThePinnedMessagesBlock(String arg0) throws Throwable {
        endUserSteps.theMessageIsDisplayedInThePinnedMessagesBlock(arg0);
    }

    @Then("^open link is displayed on the \"([^\"]*)\" in the right panel$")
    public void openLinkIsDisplayedOnTheInTheRightPanel(String arg0) throws Throwable {
        endUserSteps.openLinkIsDisplayedOnTheInTheRightPanel(arg0);
    }

    @When("^click on the open link on the \"([^\"]*)\" in the right panel$")
    public void clickOnTheOpenLinkOnTheInTheRightPanel(String arg0) throws Throwable {
        endUserSteps.clickOnTheOpenLinkOnTheInTheRightPanel(arg0);
    }

    @Then("^highlight is displayed on the \"([^\"]*)\" message$")
    public void highlightIsDisplayedOnTheMessage(String arg0) throws Throwable {
        endUserSteps.highlightIsDisplayedOnTheMessage(arg0);
    }

    @Then("^\"([^\"]*)\" file is displayed in the direct$")
    public void fileIsDisplayedInTheDirect(String arg0) throws Throwable {
        endUserSteps.fileIsDisplayedInTheDirect(arg0);
    }

    @When("^click on the right control hamburger on the \"([^\"]*)\" message$")
    public void clickOnTheRightControlHamburgerOnTheMessage(String arg0) throws Throwable {
        endUserSteps.clickOnTheRightControlHamburgerOnTheMessage(arg0);
    }

    @Then("^message menu for the \"([^\"]*)\" file is displayed$")
    public void messageMenuForTheFileIsDisplayed(String arg0) throws Throwable {
        endUserSteps.messageMenuForTheFileIsDisplayed(arg0);
    }

    @When("^click on a Pin to conversation link on the \"([^\"]*)\" file in the message menu$")
    public void clickOnAPinToConversationLinkOnTheFileInTheMessageMenu(String arg0) throws Throwable {
        endUserSteps.clickOnAPinToConversationLinkOnTheFileInTheMessageMenu(arg0);
    }

    @Then("^the \"([^\"]*)\" file is displayed inside the Unpin Message pop-up$")
    public void theFileIsDisplayedInsideTheUnpinMessagePopUp(String arg0) throws Throwable {
        endUserSteps.theFileIsDisplayedInsideTheUnpinMessagePopUp(arg0);
    }

    @Then("^pinned sign is displayed near the \"([^\"]*)\" file$")
    public void pinnedSignIsDisplayedNearTheFile(String arg0) throws Throwable {
        endUserSteps.pinnedSignIsDisplayedNearTheFile(arg0);
    }

    @Then("^the \"([^\"]*)\" file is displayed in the Pinned messages block$")
    public void theFileIsDisplayedInThePinnedMessagesBlock(String arg0) throws Throwable {
        endUserSteps.theFileIsDisplayedInThePinnedMessagesBlock(arg0);
    }

    @When("^scroll down to \"([^\"]*)\" file$")
    public void scrollDownToFile(String arg0) throws Throwable {
        endUserSteps.scrollDownToFile(arg0);
    }

    @When("^scroll down to \"([^\"]*)\" message$")
    public void scrollDownToMessage(String arg0) throws Throwable {
        endUserSteps.scrollDownToMessage(arg0);
    }

    @When("^click on the Download button under \"([^\"]*)\" file in the Pinned messages block$")
    public void clickOnTheDownloadButtonUnderFileInThePinnedMessagesBlock(String arg0) throws Throwable {
        endUserSteps.clickOnTheDownloadButtonUnderFileInThePinnedMessagesBlock(arg0);
    }

    @When("^navigate on \"([^\"]*)\" message block$")
    public void navigateOnMessageBlock(String arg0) throws Throwable {
        endUserSteps.navigateOnMessageBlock(arg0);
    }

    @When("^navigate on \"([^\"]*)\" file block$")
    public void navigateOnFileBlock(String arg0) throws Throwable {
        endUserSteps.navigateOnFileBlock(arg0);
    }

    @When("^click on a Unpin from conversation link on the \"([^\"]*)\" file in the message menu$")
    public void clickOnAUnpinFromConversationLinkOnTheFileInTheMessageMenu(String arg0) throws Throwable {
        endUserSteps.clickOnAUnpinFromConversationLinkOnTheFileInTheMessageMenu(arg0);
    }

    @When("^click on the Unpin button$")
    public void clickOnTheUnpinButton() throws Throwable {
        endUserSteps.clickOnTheUnpinButton();
    }

    @Then("^pinned sign isn't displayed near the \"([^\"]*)\" file$")
    public void pinnedSignIsnTDisplayedNearTheFile(String arg0) throws Throwable {
        endUserSteps.pinnedSignIsnTDisplayedNearTheFile(arg0);
    }

    @Then("^the \"([^\"]*)\" file is displayed inside the Pin Message pop-up$")
    public void theFileIsDisplayedInsideThePinMessagePopUp(String arg0) throws Throwable {
        endUserSteps.theFileIsDisplayedInsideThePinMessagePopUp(arg0);
    }

    @Then("^unpin link is displayed on the \"([^\"]*)\" in the right panel$")
    public void unpinLinkIsDisplayedOnTheInTheRightPanel(String arg0) throws Throwable {
        endUserSteps.unpinLinkIsDisplayedOnTheInTheRightPanel(arg0);
    }

    @When("^click on the unpin link on the \"([^\"]*)\" in the right panel$")
    public void clickOnTheUnpinLinkOnTheInTheRightPanel(String arg0) throws Throwable {
        endUserSteps.clickOnTheUnpinLinkOnTheInTheRightPanel(arg0);
    }

    @Then("^pinned sign isn't displayed near the \"([^\"]*)\" message$")
    public void pinnedSignIsnTDisplayedNearTheMessage(String arg0) throws Throwable {
        endUserSteps.pinnedSignIsnTDisplayedNearTheMessage(arg0);
    }

    @Then("^the \"([^\"]*)\" message is displayed inside the Unpin Message pop-up$")
    public void theMessageIsDisplayedInsideTheUnpinMessagePopUp(String arg0) throws Throwable {
        endUserSteps.theMessageIsDisplayedInsideTheUnpinMessagePopUp(arg0);
    }

    @When("^click on the \"([^\"]*)\" file$")
    public void clickOnTheFile(String arg0) throws Throwable {
        endUserSteps.clickOnTheFile(arg0);
    }

    @When("^navigate on the pinned \"([^\"]*)\" file$")
    public void navigateOnThePinnedFile(String arg0) throws Throwable {
        endUserSteps.navigateOnThePinnedFile(arg0);
    }

    @Then("^under \"([^\"]*)\" title there is \"([^\"]*)\" counter displayed$")
    public void underTitleThereIsCounterDisplayed(String arg0, String arg1) throws Throwable {
        endUserSteps.underTitleThereIsCounterDisplayed(arg0, arg1);
    }

    @When("^click on a star sign on the \"([^\"]*)\" message$")
    public void clickOnAStarSignOnTheMessage(String arg0) throws Throwable {
        endUserSteps.clickOnAStarSignOnTheMessage(arg0);
    }

    @Then("^star sign is displayed near the \"([^\"]*)\" message$")
    public void starSignIsDisplayedNearTheMessage(String arg0) throws Throwable {
        endUserSteps.starSignIsDisplayedNearTheMessage(arg0);
    }

    @When("^click on the Star button of \"([^\"]*)\" direct$")
    public void clickOnTheStarButtonOfDirect(String arg0) throws Throwable {
        endUserSteps.clickOnTheStarButtonOfDirect(arg0);
    }

    @Then("^the \"([^\"]*)\" message is displayed in the Starred messages block$")
    public void theMessageIsDisplayedInTheStarredMessagesBlock(String arg0) throws Throwable {
        endUserSteps.theMessageIsDisplayedInTheStarredMessagesBlock(arg0);
    }

    @When("^navigate on \"([^\"]*)\" message block in the Starred message block$")
    public void navigateOnMessageBlockInTheStarredMessageBlock(String arg0) throws Throwable {
        endUserSteps.navigateOnMessageBlockInTheStarredMessageBlock(arg0);
    }

    @Then("^open link is displayed on the \"([^\"]*)\" in the right panel on the Starred message block$")
    public void openLinkIsDisplayedOnTheInTheRightPanelOnTheStarredMessageBlock(String arg0) throws Throwable {
        endUserSteps.openLinkIsDisplayedOnTheInTheRightPanelOnTheStarredMessageBlock(arg0);
    }

    @When("^click on the open link on the \"([^\"]*)\" in the right panel on the Starred message block$")
    public void clickOnTheOpenLinkOnTheInTheRightPanelOnTheStarredMessageBlock(String arg0) throws Throwable {
        endUserSteps.clickOnTheOpenLinkOnTheInTheRightPanelOnTheStarredMessageBlock(arg0);
    }

    @Then("^highlight is displayed on the starred \"([^\"]*)\" message$")
    public void highlightIsDisplayedOnTheStarredMessage(String arg0) throws Throwable {
        endUserSteps.highlightIsDisplayedOnTheStarredMessage(arg0);
    }

    @When("^click on a star sign on the \"([^\"]*)\" file$")
    public void clickOnAStarSignOnTheFile(String arg0) throws Throwable {
        endUserSteps.clickOnAStarSignOnTheFile(arg0);
    }

    @Then("^star sign is displayed near the \"([^\"]*)\" file$")
    public void starSignIsDisplayedNearTheFile(String arg0) throws Throwable {
        endUserSteps.starSignIsDisplayedNearTheFile(arg0);
    }

    @Then("^the \"([^\"]*)\" file is displayed in the Starred messages block$")
    public void theFileIsDisplayedInTheStarredMessagesBlock(String arg0) throws Throwable {
        endUserSteps.theFileIsDisplayedInTheStarredMessagesBlock(arg0);
    }

    @When("^navigate on \"([^\"]*)\" file block in the Starred messages block$")
    public void navigateOnFileBlockInTheStarredMessagesBlock(String arg0) throws Throwable {
        endUserSteps.navigateOnFileBlockInTheStarredMessagesBlock(arg0);
    }

    @When("^click on the Download button under \"([^\"]*)\" file in the Starred messages block$")
    public void clickOnTheDownloadButtonUnderFileInTheStarredMessagesBlock(String arg0) throws Throwable {
        endUserSteps.clickOnTheDownloadButtonUnderFileInTheStarredMessagesBlock(arg0);
    }

    @Then("^Edited mark is displayed on the \"([^\"]*)\" snippet$")
    public void editedMarkIsDisplayedOnTheSnippet(String arg0) throws Throwable {
        endUserSteps.editedMarkIsDisplayedOnTheSnippet(arg0);
    }

    @Then("^the \"([^\"]*)\" room name title in the top is displayed$")
    public void theRoomNameTitleInTheTopIsDisplayed(String arg0) throws Throwable {
        endUserSteps.theRoomNameTitleInTheTopIsDisplayed(arg0);
    }

    @Then("^the \"([^\"]*)\" description in the top is displayed$")
    public void theDescriptionInTheTopIsDisplayed(String arg0) throws Throwable {
        endUserSteps.theDescriptionInTheTopIsDisplayed(arg0);
    }

    @Then("^star sign isn't displayed near the \"([^\"]*)\" message$")
    public void starSignIsnTDisplayedNearTheMessage(String arg0) throws Throwable {
        endUserSteps.starSignIsnTDisplayedNearTheMessage(arg0);
    }

    @Then("^star sign isn't displayed near the \"([^\"]*)\" file$")
    public void starSignIsnTDisplayedNearTheFile(String arg0) throws Throwable {
        endUserSteps.starSignIsnTDisplayedNearTheFile(arg0);
    }

    @When("^check the appearance of the sticker button$")
    public void checkTheAppearanceOfTheStickerButton() throws Throwable {
        endUserSteps.checkTheAppearanceOfTheStickerButton();
    }

    @Then("^the sticker search input inside opened popup is displayed$")
    public void theStickerSearchInputInsideOpenedPopupIsDisplayed() throws Throwable {
        endUserSteps.theStickerSearchInputInsideOpenedPopupIsDisplayed();
    }

    @When("^click on the manage stickers button$")
    public void clickOnTheManageStickersButton() throws Throwable {
        endUserSteps.clickOnTheManageStickersButton();
    }

    @Then("^add stickers title in popup is displayed$")
    public void addStickersTitleInPopupIsDisplayed() throws Throwable {
        endUserSteps.addStickersTitleInPopupIsDisplayed();
    }

    @When("^click on the create pack button$")
    public void clickOnTheCreatePackButton() throws Throwable {
        endUserSteps.clickOnTheCreatePackButton();
    }

    @When("^click on the room header in the left panel$")
    public void clickOnTheRoomHeaderInTheLeftPanel() {
        endUserSteps.clickOnTheRoomHeaderInTheLeftPanel();
    }

    @Then("^\"([^\"]*)\" modal is displayed$")
    public void modalIsDisplayed(String arg0) throws Throwable {
        endUserSteps.modalIsDisplayed(arg0);
    }

    @Then("^the \"([^\"]*)\" is displayed in the list of users$")
    public void theIsDisplayedInTheListOfUsers(String arg0) throws Throwable {
        endUserSteps.theIsDisplayedInTheListOfUsers(arg0);
    }

    @When("^click the \"([^\"]*)\" name in the list of users$")
    public void clickTheNameInTheListOfUsers(String arg0) throws Throwable {
        endUserSteps.clickTheNameInTheListOfUsers(arg0);
    }

    @When("^clear data in the input \"([^\"]*)\" room name field$")
    public void clearDataInTheInputRoomNameField(String arg0) throws Throwable {
        endUserSteps.clearDataInTheInputRoomNameField(arg0);
    }
}
