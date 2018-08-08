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
import java.util.Map;

public class EndUserSteps extends ScenarioSteps {

    SignInPage signinPage;
    HomePage homePage;

//======================================================SignInPage======================================================

    @Step
    public void openSignInPage() {
        signinPage.open();
    }

    @Step
    public void loginAsuser() {
        signinPage.loginAsuser();
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

    @Step
    public void clickOnAddButton() {
        homePage.clickOnAddButton();
    }

    @Step
    public void theRoomIsCreated(String arg0) {
        Assert.assertTrue("False", homePage.theRoomIsCreated(arg0));
    }

    @Step
    public void clickOnStandardTab() {
        signinPage.clickOnStandardTab();
    }

    @Step
    public void clickOnRoomInTheLeftPanel(String arg0) {
        homePage.clickOnRoomInTheLeftPanel(arg0);
    }

    @Step
    public void theTitleIsDisplayedInTheHeader(String arg0) {
        Assert.assertTrue("False", homePage.theTitleIsDisplayedInTheHeader(arg0));
    }

    @Step
    public void clickOnTheSettingsButtonOfRoom(String arg0) {
        homePage.clickOnTheSettingsButtonOfRoom(arg0);
    }

    @Step
    public void clickOnTheChannelDetailsLink(String arg0) {
        homePage.clickOnTheChannelDetailsLink(arg0);
    }

    @Step
    public void roomSettingsIsDisplayedOnTheName(String arg0) {
        Assert.assertTrue("False", homePage.roomSettingsIsDisplayedOnTheName(arg0));
    }

    @Step
    public void clickOnTheEditRoomNameLink() {
        homePage.clickOnTheEditRoomNameLink();
    }

    @Step
    public void inputRoomNameFieldOnTheIsDisplayed(String arg0) {
        Assert.assertTrue("False", homePage.inputRoomNameFieldOnTheIsDisplayed(arg0));
    }

    @Step
    public void clearDataInTheInputRoomNameField() {
        homePage.clearDataInTheInputRoomNameField();
    }

    @Step
    public void enterInTheInputRoomNameField(String arg0) {
        homePage.enterInTheInputRoomNameField(arg0);
    }

    @Step
    public void clickOnSaveChangesButtonUnderTheInputRoomNameField() {
        homePage.clickOnSaveChangesButtonUnderTheInputRoomNameField();
    }

    @Step
    public void clickOnTheEditDescriptionLinkInTheRoom(String arg0) {
        homePage.clickOnTheEditDescriptionLinkInTheRoom(arg0);
    }

    @Step
    public void inputDescriptionFieldIsDisplayed() {
        Assert.assertTrue("False", homePage.inputDescriptionFieldIsDisplayed());
    }

    @Step
    public void clearDataInTheInputDescriptionField() {
        homePage.clearDataInTheInputDescriptionField();
    }

    @Step
    public void enterInTheInputDescriptionField(String arg0) {
        homePage.enterInTheInputDescriptionField(arg0);
    }

    @Step
    public void clickOnDoneButtonUnderTheInputDescriptionField() throws InterruptedException {
        homePage.clickOnDoneButtonUnderTheInputDescriptionField();
    }

    @Step
    public void theDescriptionIsDisplayedInTheChannelDetailsBlock(String arg0) {
        Assert.assertTrue("False", homePage.theDescriptionIsDisplayedInTheChannelDetailsBlock(arg0));
    }

    @Step
    public void theDescriptionIsDisplayedInTheHeader(String arg0) {
        Assert.assertTrue("False", homePage.theDescriptionIsDisplayedInTheHeader(arg0));
    }

    @Step
    public void clickOnTheWheelLink() {
        homePage.clickOnTheWheelLink();
    }

    @Step
    public void deleteRoomLinkIsDisplayed() {
        Assert.assertTrue("False", homePage.deleteRoomLinkIsDisplayed());
    }

    @Step
    public void clickOnTheDeleteRoomLink() throws InterruptedException {
        homePage.clickOnTheDeleteRoomLink();
    }

    @Step
    public void theRoomIsDeleted(String arg0) throws InterruptedException {
        Assert.assertTrue("False", homePage.theRoomIsDeleted(arg0));
    }

    @Step
    public void deleteRoomPopUpIsDisplayed(String arg0) {
        Assert.assertTrue("False", homePage.deleteRoomPopUpIsDisplayed(arg0));
    }

    @Step
    public void clickOnTheDeleteButton() {
        homePage.clickOnTheDeleteButton();
    }

    @Step
    public void clickOnTheDirectMessagesLink() {
        homePage.clickOnTheDirectMessagesLink();
    }

    @Step
    public void directRoomsPopUpIsDisplayed() {
        Assert.assertTrue("False", homePage.directRoomsPopUpIsDisplayed());
    }

    @Step
    public void enterInTheInputSearchField(String arg0) {
        homePage.enterInTheInputSearchField(arg0);
    }

    @Step
    public void isDisplayedInTheListOfUsers(String arg0) {
        Assert.assertTrue("False", homePage.isDisplayedInTheListOfUsers(arg0));
    }

    @Step
    public void clickOnTheNameInTheListOfUsers(String arg0) {
        homePage.clickOnTheNameInTheListOfUsers(arg0);
    }

    @Step
    public void userNameIsDisplayedInTheLeftPanel(String arg0) {
        Assert.assertTrue("False", homePage.userNameIsDisplayedInTheLeftPanel(arg0));
    }

    @Step
    public void userNameIsDisplayedInTheHeader(String arg0) {
        Assert.assertTrue("False", homePage.userNameIsDisplayedInTheHeader(arg0));
    }

    @Step
    public void clickOnTheUserNameInTheLeftPanel(String arg0) {
        homePage.clickOnTheUserNameInTheLeftPanel(arg0);
    }

    @Step
    public void enterInTheInputMessageField(String arg0) {
        homePage.enterInTheInputMessageField(arg0);
    }

    @Step
    public void clickOnEnterButton() {
        homePage.clickOnEnterButton();
    }

    @Step
    public void messageIsCreated(String arg0) {
        Assert.assertTrue("False", homePage.messageIsCreated(arg0));
    }

    @Step
    public void messageIsDisplayed(String arg0) {
        Assert.assertTrue("False", homePage.messageIsDisplayed(arg0));
    }

    @Step
    public void clickOnTheRightControlHamburgerOnTheFile(String arg0) {
        homePage.clickOnTheRightControlHamburgerOnTheFile(arg0);
    }

    @Step
    public void messageMenuIsDisplayed() {
        Assert.assertTrue("False", homePage.messageMenuIsDisplayed());
    }

    @Step
    public void clickOnTheLinkInTheMessageMenu(String arg0) {
        homePage.clickOnTheLinkInTheMessageMenu(arg0);
    }

    @Step
    public void clearDataInTheInputMessageField() {
        homePage.clearDataInTheInputMessageField();
    }

    @Step
    public void actionIsDisplayed(String arg0) {
        Assert.assertTrue("False", homePage.actionIsDisplayed(arg0));
    }

    @Step
    public void clickOnTheDeleteMessageLinkInTheMessageMenu() {
        homePage.clickOnTheDeleteMessageLinkInTheMessageMenu();
    }

    @Step
    public void deleteMessageTitleInTheOpenedPopUpIsDisplayed() {
        Assert.assertTrue("False", homePage.deleteMessageTitleInTheOpenedPopUpIsDisplayed());
    }

    @Step
    public void clickOnTheDeleteButtonInTheOpenedPopUp() {
        homePage.clickOnTheDeleteButtonInTheOpenedPopUp();
    }

    @Step
    public void messageIsDeleted(String arg0) throws InterruptedException {
        Assert.assertTrue("False", homePage.messageIsDeleted(arg0));
    }

    @Step
    public void clickOnTheDeleteSignNearUserInTheLeftPanel(String arg0) {
        homePage.clickOnTheDeleteSignNearUserInTheLeftPanel(arg0);
    }

    @Step
    public void userIsDeletedInTheLeftPanel(String arg0) throws InterruptedException {
        Assert.assertTrue("False", homePage.userIsDeletedInTheLeftPanel(arg0));
    }

    @Step
    public void clickOnClipButton() {
        homePage.clickOnClipButton();
    }

    @Step
    public void uploadFileLinkIsDisplayed() {
        Assert.assertTrue("False", homePage.uploadFileLinkIsDisplayed());
    }

    @Step
    public void uploadToTheForm(String arg0) throws URISyntaxException {
        homePage.uploadToTheForm(arg0);
    }

    @Step
    public void titleIsDisplayedInThePopUp(String arg0) {
        Assert.assertTrue("False", homePage.titleIsDisplayedInThePopUp(arg0));
    }

    @Step
    public void clickOnUploadButton() {
        homePage.clickOnUploadButton();
    }

    @Step
    public void fileIsDisplayedInTheRoom(String arg0) {
        Assert.assertTrue("False", homePage.fileIsDisplayedInTheRoom(arg0));
    }

    @Step
    public void clickOnTheDownloadButtonUnderFile(String arg0) {
        homePage.clickOnTheDownloadButtonUnderFile(arg0);
    }

    @Step
    public void theFileIsDownloadedOnTheLocalMachine(String arg0) {
        homePage.theFileIsDownloadedOnTheLocalMachine(arg0);
    }

    @Step
    public void clickOnAddRoomTitle() {
        homePage.clickOnAddRoomTitle();
    }

    @Step
    public void clickOnTheFavoriteRoomButton() {
        homePage.clickOnTheFavoriteRoomButton();
    }

    @Step
    public void theIsDisplayedInTheFavoritesOnTheLeftPanel(String arg0) {
        Assert.assertTrue("False", homePage.theIsDisplayedInTheFavoritesOnTheLeftPanel(arg0));
    }

    @Step
    public void clickOnTheUnfavoriteRoomButton() {
        homePage.clickOnTheUnfavoriteRoomButton();
    }

    @Step
    public void theIsDeletedInTheFavoritesOnTheLeftPanel(String arg0) {
        Assert.assertTrue("False", homePage.theIsDeletedInTheFavoritesOnTheLeftPanel(arg0));
    }

    @Step
    public void theRoomReturnsToTheRoomsOnTheLeftPanel(String arg0) {
        Assert.assertTrue("False", homePage.theRoomReturnsToTheRoomsOnTheLeftPanel(arg0));
    }

    @Step
    public void uploadFileManyTimes(Map<String, String> parameters) throws URISyntaxException {
        for(int i=0;i<Integer.valueOf(parameters.get("count"));i++) {
            clipButtonIsDisplayed();
            clickOnClipButton();
            uploadFileLinkIsDisplayed();
            uploadToTheForm(parameters.get("file"));
            titleIsDisplayedInThePopUp(parameters.get("title_name"));
            clickOnUploadButton();
            titleIsHidedInThePopUp();
//          progressBarIsDisappeared();
            fileIsDisplayedInTheRoom(parameters.get("expected_file_name"));
        }
    }

    @Step
    public void clickOnUserName() {
        homePage.clickOnUserName();
    }

    @Step
    public void clickOnRoomTitleInPopup() {
        homePage.clickOnRoomTitleInPopup();
    }

    @Step
    public void clipButtonIsDisplayed() {
        Assert.assertTrue("False", homePage.clipButtonIsDisplayed());
    }

    @Step
    public void progressBarIsDisappeared() {
        homePage.progressBarIsDisappeared();
        homePage.progressBarIsHided();
    }

    @Step
    public void titleIsHidedInThePopUp() {
        homePage.titleIsHidedInThePopUp();
    }

    @Step
    public void clickOnUserName(String arg0) {
        homePage.clickOnUserName(arg0);
    }

    @Step
    public void theUserMenuWithActionsIsDisplayed() {
        Assert.assertTrue("False", homePage.theUserMenuWithActionsIsDisplayed());
    }

    @Step
    public void clickOnTheProfileLink() {
        homePage.clickOnTheProfileLink();
    }

    @Step
    public void theProfilePageIsDisplayed() {
        Assert.assertTrue("False", homePage.theProfilePageIsDisplayed());
    }

    @Step
    public void uploadAvatarToTheProfilePage(Map<String, String> parameters) throws URISyntaxException {
        for(int i=0;i<Integer.valueOf(parameters.get("count"));i++) {
            uploadAvatar(parameters.get("file"));
            clickOnSaveButton();
        }
    }

    @Step
    private void clickOnSaveButton() {
        homePage.clickOnSaveButton();
    }

    @Step
    private void uploadAvatar(String arg0) throws URISyntaxException {
        homePage.uploadAvatar(arg0);
    }

    @Step
    public void clickOnTheSaveButtonOnTheProfilePage() {
        homePage.clickOnTheSaveButtonOnTheProfilePage();
    }

    @Step
    public void clearDataInTheInputField(String arg0) {
        homePage.clearDataInTheInputField(arg0);
    }

    @Step
    public void profileSuccessfullyUpdatedMessageIsDisplayed() {
        Assert.assertTrue("False", homePage.profileSuccessfullyUpdatedMessageIsDisplayed());
    }

    @Step
    public void clickOnTheArrowBack() {
        homePage.clickOnTheArrowBack();
    }

    @Step
    public void userNameIsDisplayedInTheLeftPanelAfterUpdatingProfile(String arg0) {
        Assert.assertTrue("False", homePage.userNameIsDisplayedInTheLeftPanelAfterUpdatingProfile(arg0));
    }

    @Step
    public void checkTheValueOfTheFieldWithLabel(String arg0) throws ParseException {
        Assert.assertTrue ("The value is not correct: expected - " + Serenity.getCurrentSession().get(arg0).toString() + ", but found - " + homePage.checkTheValueOfTheFieldWithLabel(arg0), Serenity.getCurrentSession().get(arg0).toString().equals(homePage.checkTheValueOfTheFieldWithLabel(arg0)));
    }

    @Step
    public void theDraftSignIsDisplayedNearUserNameInTheLeftPanel(String arg0) {
        Assert.assertTrue("False", homePage.theDraftSignIsDisplayedNearUserNameInTheLeftPanel(arg0));
    }

    @Step
    public void enterInTheInputSearchFieldInsideARoom(String arg0) {
        homePage.enterInTheInputSearchFieldInsideARoom(arg0);
    }

    @Step
    public void titleNameOfAPanelWithListIsDisplayed(String arg0) {
        Assert.assertTrue("False", homePage.titleNameOfAPanelWithListIsDisplayed(arg0));
    }

    @Step
    public void checkTheAppearanceOfTheSnippetButton() {
        clipButtonIsDisplayed();
        clickOnClipButton();
        createSnippetLinkIsDisplayed();
        clickOnTheSnippetLink();
        createSnippetTitleInsideOpenedPopupIsDisplayed();
    }

    @Step
    public void createSnippetTitleInsideOpenedPopupIsDisplayed() {
        Assert.assertTrue("False", homePage.createSnippetTitleInsideOpenedPopupIsDisplayed());
    }

    @Step
    private void clickOnTheSnippetLink() {
        homePage.clickOnTheSnippetLink();
    }

    @Step
    private void createSnippetLinkIsDisplayed() {
        Assert.assertTrue("False", homePage.createSnippetLinkIsDisplayed());
    }

    @Step
    public void theToastIsDisplayed(String arg0) {
        Assert.assertTrue("False", homePage.theToastIsDisplayed(arg0));
    }

    @Step
    public void theToastIsClosed(String arg0) {
        homePage.theToastIsClosed(arg0);
    }

    @Step
    public void enterInTheSnippetFileNameField(String arg0) {
        homePage.enterInTheSnippetFileNameField(arg0);
    }

    @Step
    public void enterInTheTextareaField(String arg0) {
        homePage.enterInTheTextareaField(arg0);
    }

    @Step
    public void clickOnTheCreateButton() {
        homePage.clickOnTheCreateButton();
    }

    @Step
    public void isCreated(String arg0) {
        Assert.assertTrue("False", homePage.isCreated(arg0));
    }

    @Step
    public void isDisplayed(String arg0) {
        Assert.assertTrue("False", homePage.isDisplayed(arg0));
    }

    @Step
    public void clickOnTheEditLinkOnThe(String arg0) {
        homePage.clickOnTheEditLinkOnThe(arg0);
    }

    @Step
    public void editSnippetTitleInsideOpenedPopupIsDisplayed() {
        Assert.assertTrue("False", homePage.editSnippetTitleInsideOpenedPopupIsDisplayed());
    }

    @Step
    public void clickOnTheArrowInTheProgrammingLanguageDropdownMenu() {
        homePage.clickOnTheArrowInTheProgrammingLanguageDropdownMenu();
    }

    @Step
    public void clickOptionFromTheProgrammingLanguageDropDownList(String arg0) {
        homePage.clickOptionFromTheProgrammingLanguageDropDownList(arg0);
    }

    @Step
    public void clearDataInTheSnippetFileNameField() {
        homePage.clearDataInTheSnippetFileNameField();
    }

    @Step
    public void clearDataInTheTextareaField() {
        homePage.clearDataInTheTextareaField();
    }

    @Step
    public void programmingLanguageDropDownListIsOpened() {
        Assert.assertTrue("False", homePage.programmingLanguageDropDownListIsOpened());
    }

    @Step
    public void optionIsDisplayedInTheProgrammingLanguageDropdownMenu(String arg0) {
        Assert.assertTrue("False", homePage.optionIsDisplayedInTheProgrammingLanguageDropdownMenu(arg0));
    }

    @Step
    public void clickOnTheArrowInTheThemeDropdownMenu() {
        homePage.clickOnTheArrowInTheThemeDropdownMenu();
    }

    @Step
    public void themeDropDownListIsOpened() {
        Assert.assertTrue("False", homePage.themeDropDownListIsOpened());
    }

    @Step
    public void clickOptionFromTheThemeDropDownList(String arg0) {
        homePage.clickOptionFromTheThemeDropDownList(arg0);
    }

    @Step
    public void optionIsDisplayedInTheThemeDropdownMenu(String arg0) {
        Assert.assertTrue("False", homePage.optionIsDisplayedInTheThemeDropdownMenu(arg0));
    }

    @Step
    public void clickOnTheSaveButton() {
        homePage.clickOnTheSaveButton();
    }

    @Step
    public void isEdited(String arg0) {
        Assert.assertTrue("False", homePage.isEdited(arg0));
    }

    @Step
    public void clickOnTheSnippetName(String arg0) {
        homePage.clickOnTheSnippetName(arg0);
    }

    @Step
    public void previewTextOnTheSnippetNameIsDisplayed(String arg0, String arg1) {
        Assert.assertTrue("False", homePage.previewTextOnTheSnippetNameIsDisplayed(arg0, arg1));
    }

    @Step
    public void clickOnTheRightControlHamburgerOnTheSnippet(String arg0) {
        homePage.clickOnTheRightControlHamburgerOnTheSnippet(arg0);
    }

    @Step
    public void navigateOnSnippet(String arg0) {
        homePage.navigateOnSnippet(arg0);
    }

    @Step
    public void messageMenuForTheSnippetIsDisplayed(String arg0) {
        Assert.assertTrue("False", homePage.messageMenuForTheSnippetIsDisplayed(arg0));
    }

    @Step
    public void clickOnTheDeleteMessageLinkOnTheSnippetInTheMessageMenu(String arg0) {
        homePage.clickOnTheDeleteMessageLinkOnTheSnippetInTheMessageMenu(arg0);
    }

    @Step
    public void theSnippetIsDisplayedInsideTheDeleteMessagePopUp(String arg0) {
        Assert.assertTrue("False", homePage.theSnippetIsDisplayedInsideTheDeleteMessagePopUp(arg0));
    }

    @Step
    public void clickOnTheDownloadButtonNearTheSnippet(String arg0) {
        homePage.clickOnTheDownloadButtonNearTheSnippet(arg0);
    }

    @Step
    public void theSnippetIsDownloadedOnTheLocalMachine(String arg0) {
        Assert.assertTrue("False", homePage.theSnippetIsDownloadedOnTheLocalMachine(arg0));
    }

    @Step
    public void messageMenuForTheMessageIsDisplayed(String arg0) {
        Assert.assertTrue("False", homePage.messageMenuForTheMessageIsDisplayed(arg0));
    }

    @Step
    public void clickOnAPinToConversationLinkOnTheMessageInTheMessageMenu(String arg0) {
        homePage.clickOnAPinToConversationLinkOnTheMessageInTheMessageMenu(arg0);
    }

    @Step
    public void theMessageIsDisplayedInsideThePinMessagePopUp(String arg0) {
        Assert.assertTrue("False", homePage.theMessageIsDisplayedInsideThePinMessagePopUp(arg0));
    }

    @Step
    public void clickOnThePinButton() {
        homePage.clickOnThePinButton();
    }

    @Step
    public void pinnedSignIsDisplayedNearTheMessage(String arg0) {
        Assert.assertTrue("False", homePage.pinnedSignIsDisplayedNearTheMessage(arg0));
    }

    @Step
    public void clickOnThePinButtonOfDirect(String arg0) {
        homePage.clickOnThePinButtonOfDirect(arg0);
    }

    @Step
    public void theMessageIsDisplayedInThePinnedMessagesBlock(String arg0) {
        Assert.assertTrue("False", homePage.theMessageIsDisplayedInThePinnedMessagesBlock(arg0));
    }

    @Step
    public void openLinkIsDisplayedOnTheInTheRightPanel(String arg0) {
        Assert.assertTrue("False", homePage.openLinkIsDisplayedOnTheInTheRightPanel(arg0));
    }

    @Step
    public void clickOnTheOpenLinkOnTheInTheRightPanel(String arg0) {
        homePage.clickOnTheOpenLinkOnTheInTheRightPanel(arg0);
    }

    @Step
    public void highlightIsDisplayedOnTheMessage(String arg0) {
        Assert.assertTrue("False", homePage.highlightIsDisplayedOnTheMessage(arg0));
    }

    @Step
    public void fileIsDisplayedInTheDirect(String arg0) {
        Assert.assertTrue("False", homePage.fileIsDisplayedInTheDirect(arg0));
    }

    @Step
    public void clickOnTheRightControlHamburgerOnTheMessage(String arg0) {
        homePage.clickOnTheRightControlHamburgerOnTheMessage(arg0);
    }

    @Step
    public void messageMenuForTheFileIsDisplayed(String arg0) {
        Assert.assertTrue("False", homePage.messageMenuForTheFileIsDisplayed(arg0));
    }

    @Step
    public void clickOnAPinToConversationLinkOnTheFileInTheMessageMenu(String arg0) {
        homePage.clickOnAPinToConversationLinkOnTheFileInTheMessageMenu(arg0);
    }

    @Step
    public void theFileIsDisplayedInsideTheUnpinMessagePopUp(String arg0) {
        Assert.assertTrue("False", homePage.theFileIsDisplayedInsideTheUnpinMessagePopUp(arg0));
    }

    @Step
    public void pinnedSignIsDisplayedNearTheFile(String arg0) {
        Assert.assertTrue("False", homePage.pinnedSignIsDisplayedNearTheFile(arg0));
    }

    @Step
    public void theFileIsDisplayedInThePinnedMessagesBlock(String arg0) {
        Assert.assertTrue("False", homePage.theFileIsDisplayedInThePinnedMessagesBlock(arg0));
    }

    @Step
    public void scrollDownToFile(String arg0) {
        homePage.scrollDownToFile(arg0);
    }

    @Step
    public void scrollDownToMessage(String arg0) {
        homePage.scrollDownToMessage(arg0);
    }

    @Step
    public void clickOnTheDownloadButtonUnderFileInThePinnedMessagesBlock(String arg0) {
        homePage.clickOnTheDownloadButtonUnderFileInThePinnedMessagesBlock(arg0);
    }

    @Step
    public void navigateOnMessageBlock(String arg0) {
        homePage.navigateOnMessageBlock(arg0);
    }

    @Step
    public void navigateOnFileBlock(String arg0) {
        homePage.navigateOnFileBlock(arg0);
    }

    @Step
    public void clickOnAUnpinFromConversationLinkOnTheFileInTheMessageMenu(String arg0) {
        homePage.clickOnAUnpinFromConversationLinkOnTheFileInTheMessageMenu(arg0);
    }

    @Step
    public void clickOnTheUnpinButton() {
        homePage.clickOnTheUnpinButton();
    }

    @Step
    public void pinnedSignIsnTDisplayedNearTheFile(String arg0) {
        Assert.assertTrue("False", homePage.pinnedSignIsnTDisplayedNearTheFile(arg0));
    }

    @Step
    public void theFileIsDisplayedInsideThePinMessagePopUp(String arg0) {
        Assert.assertTrue("False", homePage.theFileIsDisplayedInsideThePinMessagePopUp(arg0));
    }

    @Step
    public void unpinLinkIsDisplayedOnTheInTheRightPanel(String arg0) {
        Assert.assertTrue("False", homePage.unpinLinkIsDisplayedOnTheInTheRightPanel(arg0));
    }

    @Step
    public void clickOnTheUnpinLinkOnTheInTheRightPanel(String arg0) {
        homePage.clickOnTheUnpinLinkOnTheInTheRightPanel(arg0);
    }

    @Step
    public void pinnedSignIsnTDisplayedNearTheMessage(String arg0) {
        Assert.assertTrue("False", homePage.pinnedSignIsnTDisplayedNearTheMessage(arg0));
    }

    @Step
    public void theMessageIsDisplayedInsideTheUnpinMessagePopUp(String arg0) {
        Assert.assertTrue("False", homePage.theMessageIsDisplayedInsideTheUnpinMessagePopUp(arg0));
    }

    @Step
    public void clickOnTheFile(String arg0) {
        homePage.clickOnTheFile(arg0);
    }

    @Step
    public void navigateOnThePinnedFile(String arg0) {
        homePage.navigateOnThePinnedFile(arg0);
    }

    @Step
    public void underTitleThereIsCounterDisplayed(String arg0, String arg1) {
        Assert.assertTrue("False", homePage.underTitleThereIsCounterDisplayed(arg0, arg1));
    }

    @Step
    public void clickOnAStarSignOnTheMessage(String arg0) {
        homePage.clickOnAStarSignOnTheMessage(arg0);
    }

    @Step
    public void starSignIsDisplayedNearTheMessage(String arg0) {
        Assert.assertTrue("False", homePage.starSignIsDisplayedNearTheMessage(arg0));
    }

    @Step
    public void clickOnTheStarButtonOfDirect(String arg0) {
        homePage.clickOnTheStarButtonOfDirect(arg0);
    }

    @Step
    public void theMessageIsDisplayedInTheStarredMessagesBlock(String arg0) {
        Assert.assertTrue("False", homePage.theMessageIsDisplayedInTheStarredMessagesBlock(arg0));
    }

    @Step
    public void navigateOnMessageBlockInTheStarredMessageBlock(String arg0) {
        homePage.navigateOnMessageBlockInTheStarredMessageBlock(arg0);
    }

    @Step
    public void openLinkIsDisplayedOnTheInTheRightPanelOnTheStarredMessageBlock(String arg0) {
        Assert.assertTrue("False", homePage.openLinkIsDisplayedOnTheInTheRightPanelOnTheStarredMessageBlock(arg0));
    }

    @Step
    public void clickOnTheOpenLinkOnTheInTheRightPanelOnTheStarredMessageBlock(String arg0) {
        homePage.clickOnTheOpenLinkOnTheInTheRightPanelOnTheStarredMessageBlock(arg0);
    }

    @Step
    public void highlightIsDisplayedOnTheStarredMessage(String arg0) {
        Assert.assertTrue("False", homePage.highlightIsDisplayedOnTheStarredMessage(arg0));
    }

    @Step
    public void clickOnAStarSignOnTheFile(String arg0) {
        homePage.clickOnAStarSignOnTheFile(arg0);
    }

    @Step
    public void starSignIsDisplayedNearTheFile(String arg0) {
        Assert.assertTrue("False", homePage.starSignIsDisplayedNearTheFile(arg0));
    }

    @Step
    public void theFileIsDisplayedInTheStarredMessagesBlock(String arg0) {
        Assert.assertTrue("False", homePage.theFileIsDisplayedInTheStarredMessagesBlock(arg0));
    }

    @Step
    public void navigateOnFileBlockInTheStarredMessagesBlock(String arg0) {
        homePage.navigateOnFileBlockInTheStarredMessagesBlock(arg0);
    }

    @Step
    public void clickOnTheDownloadButtonUnderFileInTheStarredMessagesBlock(String arg0) {
        homePage.clickOnTheDownloadButtonUnderFileInTheStarredMessagesBlock(arg0);
    }

    @Step
    public void editedMarkIsDisplayedOnTheSnippet(String arg0) {
        Assert.assertTrue("False", homePage.editedMarkIsDisplayedOnTheSnippet(arg0));
    }

    @Step
    public void theRoomNameTitleInTheTopIsDisplayed(String arg0) {
        Assert.assertTrue("False", homePage.theRoomNameTitleInTheTopIsDisplayed(arg0));
    }

    @Step
    public void theDescriptionInTheTopIsDisplayed(String arg0) {
        Assert.assertTrue("False", homePage.theDescriptionInTheTopIsDisplayed(arg0));
    }

    @Step
    public void starSignIsnTDisplayedNearTheMessage(String arg0) {
        Assert.assertTrue("False", homePage.starSignIsnTDisplayedNearTheMessage(arg0));
    }

    @Step
    public void starSignIsnTDisplayedNearTheFile(String arg0) {
        Assert.assertTrue("False", homePage.starSignIsnTDisplayedNearTheFile(arg0));
    }

    @Step
    public void checkTheAppearanceOfTheStickerButton() {
        theStickerButtonIsDisplayed();
        clickOnTheStickerButton();
        theStickerSearchInputInsideOpenedPopupIsDisplayed();
    }

    @Step
    public void theStickerSearchInputInsideOpenedPopupIsDisplayed() {
        Assert.assertTrue("False", homePage.theStickerSearchInputInsideOpenedPopupIsDisplayed());
    }

    @Step
    private void clickOnTheStickerButton() {
        homePage.clickOnTheStickerButton();
    }

    @Step
    private void theStickerButtonIsDisplayed() {
        Assert.assertTrue("False", homePage.theStickerButtonIsDisplayed());
    }

    @Step
    public void clickOnTheManageStickersButton() {
        homePage.clickOnTheManageStickersButton();
    }

    @Step
    public void addStickersTitleInPopupIsDisplayed() {
        Assert.assertTrue("False", homePage.addStickersTitleInPopupIsDisplayed());
    }
}