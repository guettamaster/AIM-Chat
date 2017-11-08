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
    public void clickOnTheAboutChannelButtonOfRoom(String arg0) {
        homePage.clickOnTheAboutChannelButtonOfRoom(arg0);
    }

    @Step
    public void clickOnTheChannelDetailsLink(String arg0) {
        homePage.clickOnTheChannelDetailsLink(arg0);
    }

    @Step
    public void nameIsDisplayedInTheChannelDetailsBlock(String arg0) {
        Assert.assertTrue("False", homePage.nameIsDisplayedInTheChannelDetailsBlock(arg0));
    }

    @Step
    public void clickOnTheEditRoomNameLink() {
        homePage.clickOnTheEditRoomNameLink();
    }

    @Step
    public void inputRoomNameFieldIsDisplayed() {
        Assert.assertTrue("False", homePage.inputRoomNameFieldIsDisplayed());
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
    public void clickOnSaveButtonUnderTheInputRoomNameField() {
        homePage.clickOnSaveButtonUnderTheInputRoomNameField();
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
    public void deleteRoomPopUpIsDisplayed() {
        Assert.assertTrue("False", homePage.deleteRoomPopUpIsDisplayed());
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
    public void clickOnTheRightControlHamburgerOnTheMessage(String arg0) {
        homePage.clickOnTheRightControlHamburgerOnTheMessage(arg0);
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
    public void theFileIsDownloadedOnTheLocalMachine() {
        homePage.theFileIsDownloadedOnTheLocalMachine();
    }

    @Step
    public void clickOnAddRoomTitle() {
        homePage.clickOnAddRoomTitle();
    }
}