package com.aimprosoft.pages;

import net.serenitybdd.core.Serenity;
import net.thucydides.core.annotations.DefaultUrl;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.aimprosoft.LOCATORS;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.io.File;
import java.net.URISyntaxException;
import java.util.concurrent.TimeUnit;

@DefaultUrl("https://chat-stage.aimprosoft.com/index.html")
//https://chat-stage.aimprosoft.com/index.html
//https://chat-predprod.aimprosoft.com/index.html

public class HomePage extends net.serenitybdd.core.pages.PageObject {

    private static Logger logger = LoggerFactory.getLogger(HomePage.class);

    public void clickOnPlusLink() {
        withTimeoutOf(15, TimeUnit.SECONDS).waitFor(ExpectedConditions.visibilityOfElementLocated(By.xpath(LOCATORS.PLUS_LINK)));
        $(LOCATORS.PLUS_LINK).click();
    }

    public boolean roomTitleInPopupIsDisplayed() {
        withTimeoutOf(21, TimeUnit.SECONDS).waitFor(ExpectedConditions.visibilityOfElementLocated(By.xpath(LOCATORS.ROOM_TITLE_IN_POPUP)));
        return $(LOCATORS.ROOM_TITLE_IN_POPUP).isPresent();
    }

    public void enterInTheInputField(String arg0, String arg1) {
        waitABit(1500);
        Actions actions = new Actions(getDriver());
        actions.moveToElement(find(By.xpath(LOCATORS.INPUT_FIELD_WITH_LABEL.replace("$1", arg1))));
        actions.click();
        actions.sendKeys(arg0);
        actions.build().perform();
        Serenity.getCurrentSession().put(arg1, arg0);
    }

    public void choosePublicRoomCheckbox() {
        withTimeoutOf(1, TimeUnit.SECONDS);
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("arguments[0].click();", findBy(LOCATORS.PUBLIC_ROOM_TYPE_CHECKBOX));
        Serenity.getCurrentSession().put("Public Room", true);
    }

    public void enterInTheInviteMembersField(String superadmin) {
        $(LOCATORS.INVITE_MEMBERS_INPUT_FIELD).sendKeys(superadmin);
    }

    public void enterInTheTextareaField(String arg0, String arg1) {
        waitABit(500);
        Actions actions = new Actions(getDriver());
        actions.moveToElement(find(By.xpath(LOCATORS.TEXTAREA_FIELD_WITH_LABEL.replace("$1", arg1))));
        actions.click();
        actions.sendKeys(arg0);
        actions.build().perform();
        Serenity.getCurrentSession().put(arg1, arg0);
    }

    public void clickOnAddButton() {
        withTimeoutOf(1, TimeUnit.SECONDS);
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("arguments[0].click();", findBy(LOCATORS.ADD_BUTTON));
    }

    public boolean theRoomIsCreated(String arg0) {
        withTimeoutOf(15, TimeUnit.SECONDS).waitFor(ExpectedConditions.visibilityOfElementLocated(By.xpath(LOCATORS.ROOM_NAME_IN_THE_LEFT_PANEL.replace("$1", arg0))));
        return $(LOCATORS.ROOM_NAME_IN_THE_LEFT_PANEL.replace("$1", arg0)).isPresent();
    }

    public void clickOnRoomInTheLeftPanel(String arg0) {
        withTimeoutOf(3, TimeUnit.SECONDS);
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("arguments[0].click();", findBy(LOCATORS.ROOM_NAME_IN_THE_LEFT_PANEL.replace("$1", arg0)));
    }

    public boolean theTitleIsDisplayedInTheHeader(String arg0) {
        withTimeoutOf(15, TimeUnit.SECONDS).waitFor(ExpectedConditions.visibilityOfElementLocated(By.xpath(LOCATORS.ROOM_TITLE_NAME_IN_THE_HEADER.replace("$1", arg0))));
        return $(LOCATORS.ROOM_TITLE_NAME_IN_THE_HEADER.replace("$1", arg0)).isPresent();
    }

    public void clickOnTheAboutChannelButtonOfRoom(String arg0) {
        withTimeoutOf(15, TimeUnit.SECONDS).waitFor(ExpectedConditions.visibilityOfElementLocated(By.xpath(LOCATORS.ABOUT_CHANNEL_BUTTON.replace("$1", arg0))));
        $(LOCATORS.ABOUT_CHANNEL_BUTTON.replace("$1", arg0)).click();
    }

    public void clickOnTheChannelDetailsLink(String arg0) {
        $(LOCATORS.CHANNEL_DETAILS_LINK.replace("$1", arg0)).click();
    }

    public boolean nameIsDisplayedInTheChannelDetailsBlock(String arg0) {
        waitABit(500);
        return $(LOCATORS.ROOM_NAME_IN_THE_CHANNEL_DETAILS_BLOCK.replace("$1", arg0)).isPresent();
    }

    public void clickOnTheEditRoomNameLink() {
        withTimeoutOf(1, TimeUnit.SECONDS);
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("arguments[0].click();", findBy(LOCATORS.EDIT_ROOM_NAME_LINK));
    }

    public boolean inputRoomNameFieldIsDisplayed() {
        waitABit(500);
        return $(LOCATORS.ROOM_NAME_INPUT_FIELD_ACTIVE).isPresent();
    }

    public void clearDataInTheInputRoomNameField() {
        if (inputRoomNameField()) {
    $(LOCATORS.ROOM_NAME_INPUT_FIELD.replace("$1","1")).clear();
        }else {
    $(LOCATORS.ROOM_NAME_INPUT_FIELD.replace("$1", "2")).clear();
        }
    }

    public boolean inputRoomNameField() {
        return $(LOCATORS.ROOM_NAME_INPUT_FIELD_ACTIVE).isVisible();
    }

    public void enterInTheInputRoomNameField(String arg0) {
        waitABit(500);
        Actions actions = new Actions(getDriver());
        actions.sendKeys(arg0);
        actions.moveToElement(find(By.xpath(LOCATORS.ROOM_NAME_INPUT_FIELD_ACTIVE.replace("$1", arg0))));
        actions.build().perform();
    }

    public void clickOnSaveButtonUnderTheInputRoomNameField() {
        withTimeoutOf(1, TimeUnit.SECONDS);
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("arguments[0].click();", findBy(LOCATORS.SAVE_BUTTON_BELOW_THE_ROOM_NAME_INPUT_FIELD));
    }

    public void clickOnTheEditDescriptionLinkInTheRoom(String arg0) {
        $(LOCATORS.EDIT_DESCRIPTION_LINK.replace("$1", arg0)).click();
    }

    public boolean inputDescriptionFieldIsDisplayed() {
        withTimeoutOf(15, TimeUnit.SECONDS).waitFor(ExpectedConditions.visibilityOfElementLocated(By.xpath(LOCATORS.DESCRIPTION_INPUT_FIELD)));
        return $(LOCATORS.DESCRIPTION_INPUT_FIELD).isPresent();
    }

    public void clearDataInTheInputDescriptionField() {
        $(LOCATORS.DESCRIPTION_INPUT_FIELD).clear();
    }

    public void enterInTheInputDescriptionField(String arg0) {
        Actions actions = new Actions(getDriver());
        actions.sendKeys(arg0);
        actions.moveToElement(find(By.xpath(LOCATORS.DESCRIPTION_INPUT_FIELD.replace("$1", arg0))));
        actions.build().perform();
    }

    public void clickOnDoneButtonUnderTheInputDescriptionField() throws InterruptedException {
        withTimeoutOf(4, TimeUnit.SECONDS);
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("arguments[0].click();", findBy(LOCATORS.DONE_BUTTON));
    }

    public boolean theDescriptionIsDisplayedInTheChannelDetailsBlock(String arg0) {
        waitABit(2000);
        return $(LOCATORS.DESCRIPTION_TITLE_IN_THE_CHANNEL_DETAILS_BLOCK.replace("$1", arg0)).isPresent();
    }

    public boolean theDescriptionIsDisplayedInTheHeader(String arg0) {
        withTimeoutOf(15, TimeUnit.SECONDS).waitFor(ExpectedConditions.visibilityOfElementLocated(By.xpath(LOCATORS.DESCRIPTION_TITLE_IN_THE_HEADER.replace("$1", arg0))));
        return $(LOCATORS.DESCRIPTION_TITLE_IN_THE_HEADER.replace("$1", arg0)).isPresent();
    }

    public void clickOnTheWheelLink() {
        withTimeoutOf(1, TimeUnit.SECONDS);
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("arguments[0].click();", findBy(LOCATORS.WHEEL_LINK_IN_THE_HEADER));
    }

    public boolean deleteRoomLinkIsDisplayed() {
        withTimeoutOf(15, TimeUnit.SECONDS).waitFor(ExpectedConditions.visibilityOfElementLocated(By.xpath(LOCATORS.DELETE_ROOM_LINK)));
        return $(LOCATORS.DELETE_ROOM_LINK).isPresent();
    }

    public void clickOnTheDeleteRoomLink() throws InterruptedException {
        withTimeoutOf(1, TimeUnit.SECONDS);
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("arguments[0].click();", findBy(LOCATORS.DELETE_ROOM_LINK));
    }

    public boolean theRoomIsDeleted(String arg0) throws InterruptedException {
        try {
            System.out.println("wait that documents are invisible");
            withTimeoutOf(6, TimeUnit.SECONDS).waitFor(ExpectedConditions.invisibilityOfElementLocated(By.xpath(LOCATORS.ROOM_NAME_IN_THE_LEFT_PANEL.replace("$1", arg0))));
            System.out.println("Element is invisible");
        } catch (Exception e) {
            System.out.println("Element isn`t invisible");
        }

        try {
            System.out.println("check that documents are presented in the DOM");
            withTimeoutOf(1, TimeUnit.SECONDS).waitFor(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath(LOCATORS.ROOM_NAME_IN_THE_LEFT_PANEL.replace("$1", arg0))));
            System.out.println("documents are presented in the DOM");
            System.out.println("check that documents are visibility");
            withTimeoutOf(1, TimeUnit.SECONDS).waitFor(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(LOCATORS.ROOM_NAME_IN_THE_LEFT_PANEL.replace("$1", arg0))));
            System.out.println("documents are visibility");
            return false;
        } catch (Exception e) {
            return true;
        }
    }

    public boolean deleteRoomPopUpIsDisplayed() {
        withTimeoutOf(15, TimeUnit.SECONDS).waitFor(ExpectedConditions.visibilityOfElementLocated(By.xpath(LOCATORS.DELETE_ROOM_TITLE_IN_THE_DELETE_ROOM_POPUP)));
        return $(LOCATORS.DELETE_ROOM_TITLE_IN_THE_DELETE_ROOM_POPUP).isPresent();
    }

    public void clickOnTheDeleteButton() {
        withTimeoutOf(1, TimeUnit.SECONDS);
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("arguments[0].click();", findBy(LOCATORS.DELETE_BUTTON));
    }

    public void clickOnTheDirectMessagesLink() {
        withTimeoutOf(1, TimeUnit.SECONDS);
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("arguments[0].click();", findBy(LOCATORS.DIRECT_MESSAGES_LINK));
    }

    public boolean directRoomsPopUpIsDisplayed() {
        withTimeoutOf(15, TimeUnit.SECONDS).waitFor(ExpectedConditions.visibilityOfElementLocated(By.xpath(LOCATORS.DIRECT_ROOMS_TITLE_IN_THE_DIRECT_ROOMS_POPUP)));
        return $(LOCATORS.DIRECT_ROOMS_TITLE_IN_THE_DIRECT_ROOMS_POPUP).isVisible();
    }

    public void enterInTheInputSearchField(String arg0) {
        waitABit(500);
        Actions actions = new Actions(getDriver());
        actions.sendKeys(arg0);
        actions.moveToElement(find(By.xpath(LOCATORS.SEARCH_INPUT_FIELD_IN_THE_DIRECT_ROOMS_POPUP.replace("$1", arg0))));
        actions.build().perform();
    }

    public boolean isDisplayedInTheListOfUsers(String arg0) {
        withTimeoutOf(15, TimeUnit.SECONDS).waitFor(ExpectedConditions.visibilityOfElementLocated(By.xpath(LOCATORS.USER_NAME_IN_THE_USERS_LIST_FROM_THE_DIRECT_ROOMS_POPUP.replace("$1", arg0))));
        return $(LOCATORS.USER_NAME_IN_THE_USERS_LIST_FROM_THE_DIRECT_ROOMS_POPUP.replace("$1", arg0)).isPresent();
    }

    public void clickOnTheNameInTheListOfUsers(String arg0) {
        withTimeoutOf(1, TimeUnit.SECONDS);
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("arguments[0].click();", findBy(LOCATORS.USER_NAME_IN_THE_USERS_LIST_FROM_THE_DIRECT_ROOMS_POPUP.replace("$1", arg0)));
    }

    public boolean userNameIsDisplayedInTheLeftPanel(String arg0) {
        withTimeoutOf(20, TimeUnit.SECONDS).waitFor(ExpectedConditions.visibilityOfElementLocated(By.xpath(LOCATORS.USER_NAME_IN_THE_LEFT_PANEL.replace("$1", arg0))));
        return $(LOCATORS.USER_NAME_IN_THE_LEFT_PANEL.replace("$1", arg0)).isPresent();
    }

    public boolean userNameIsDisplayedInTheHeader(String arg0) {
        withTimeoutOf(20, TimeUnit.SECONDS).waitFor(ExpectedConditions.visibilityOfElementLocated(By.xpath(LOCATORS.USER_NAME_IN_THE_HEADER.replace("$1", arg0))));
        return $(LOCATORS.USER_NAME_IN_THE_HEADER.replace("$1", arg0)).isPresent();
    }

    public void clickOnTheUserNameInTheLeftPanel(String arg0) {
        withTimeoutOf(20, TimeUnit.SECONDS).waitFor(ExpectedConditions.visibilityOfElementLocated(By.xpath(LOCATORS.USER_NAME_IN_THE_LEFT_PANEL.replace("$1", arg0))));
        $(LOCATORS.USER_NAME_IN_THE_LEFT_PANEL.replace("$1", arg0)).click();
    }

    public void enterInTheInputMessageField(String arg0) {
        Actions actions = new Actions(getDriver());
        actions.sendKeys(arg0);
        actions.moveToElement(find(By.xpath(LOCATORS.INPUT_MESSAGE_FIELD.replace("$1", arg0))));
        actions.build().perform();
    }

    public void clickOnEnterButton() {
        $(LOCATORS.INPUT_MESSAGE_FIELD).click();
        $(LOCATORS.INPUT_MESSAGE_FIELD).sendKeys(Keys.ENTER);
    }

    public boolean messageIsCreated(String arg0) {
        waitABit(500);
        return $(LOCATORS.THE_SENT_MESSAGE_INSIDE_THE_ROOM.replace("$1", arg0)).isPresent();
    }

    public boolean messageIsDisplayed(String arg0) {
        withTimeoutOf(15, TimeUnit.SECONDS).waitFor(ExpectedConditions.visibilityOfElementLocated(By.xpath(LOCATORS.THE_SENT_MESSAGE_INSIDE_THE_ROOM.replace("$1", arg0))));
        return $(LOCATORS.THE_SENT_MESSAGE_INSIDE_THE_ROOM.replace("$1", arg0)).isPresent();
    }

    public void clickOnTheRightControlHamburgerOnTheMessage(String arg0) {
        withTimeoutOf(1, TimeUnit.SECONDS);
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("arguments[0].click();", findBy(LOCATORS.RIGHT_CONTROL_HAMBURGER_ON_THE_MESSAGE.replace("$1", arg0)));
    }

    public boolean messageMenuIsDisplayed() {
        withTimeoutOf(15, TimeUnit.SECONDS).waitFor(ExpectedConditions.visibilityOfElementLocated(By.xpath(LOCATORS.MESSAGE_MENU)));
        return $(LOCATORS.MESSAGE_MENU).isPresent();
    }

    public void clickOnTheLinkInTheMessageMenu(String arg0) {
        withTimeoutOf(1, TimeUnit.SECONDS);
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("arguments[0].click();", findBy(LOCATORS.EDIT_MESSAGE_LINK_IN_THE_MESSAGE_MENU.replace("$1", arg0)));
    }

    public void clearDataInTheInputMessageField() {
        $(LOCATORS.INPUT_MESSAGE_FIELD).clear();
    }

    public boolean actionIsDisplayed(String arg0) {
        withTimeoutOf(15, TimeUnit.SECONDS).waitFor(ExpectedConditions.visibilityOfElementLocated(By.xpath(LOCATORS.COMMENT_UNDER_MESSAGE.replace("$1", arg0))));
        return $(LOCATORS.COMMENT_UNDER_MESSAGE.replace("$1", arg0)).isPresent();
    }

    public void clickOnTheDeleteMessageLinkInTheMessageMenu() {
        $(LOCATORS.DELETE_MESSAGE_LINK_IN_THE_MESSAGE_MENU).click();
    }

    public boolean deleteMessageTitleInTheOpenedPopUpIsDisplayed() {
        withTimeoutOf(15, TimeUnit.SECONDS).waitFor(ExpectedConditions.visibilityOfElementLocated(By.xpath(LOCATORS.DELETE_MESSAGE_TITLE_IN_THE_DELETE_MESSAGE_POPUP)));
        return $(LOCATORS.DELETE_MESSAGE_TITLE_IN_THE_DELETE_MESSAGE_POPUP).isPresent();
    }

    public void clickOnTheDeleteButtonInTheOpenedPopUp() {
        $(LOCATORS.DELETE_THIS_MESSAGE_BUTTON).click();
    }

    public boolean messageIsDeleted(String arg0) throws InterruptedException {
        try {
            System.out.println("wait that documents are invisible");
            withTimeoutOf(6, TimeUnit.SECONDS).waitFor(ExpectedConditions.invisibilityOfElementLocated(By.xpath(LOCATORS.THE_SENT_MESSAGE_INSIDE_THE_ROOM.replace("$1", arg0))));
            System.out.println("Element is invisible");
        } catch (Exception e) {
            System.out.println("Element isn`t invisible");
        }

        try {
            System.out.println("check that documents are presented in the DOM");
            withTimeoutOf(1, TimeUnit.SECONDS).waitFor(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath(LOCATORS.THE_SENT_MESSAGE_INSIDE_THE_ROOM.replace("$1", arg0))));
            System.out.println("documents are presented in the DOM");
            System.out.println("check that documents are visibility");
            withTimeoutOf(1, TimeUnit.SECONDS).waitFor(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(LOCATORS.THE_SENT_MESSAGE_INSIDE_THE_ROOM.replace("$1", arg0))));
            System.out.println("documents are visibility");
            return false;
        } catch (Exception e) {
            return true;
        }
    }

    public void clickOnTheDeleteSignNearUserInTheLeftPanel(String arg0) {
        withTimeoutOf(1, TimeUnit.SECONDS);
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("arguments[0].click();", findBy(LOCATORS.DELETE_SIGN_NEAR_USER_NAME_IN_THE_LEFT_PANEL.replace("$1", arg0)));
    }

    public boolean userIsDeletedInTheLeftPanel(String arg0) throws InterruptedException {
        try {
            System.out.println("wait that documents are invisible");
            withTimeoutOf(6, TimeUnit.SECONDS).waitFor(ExpectedConditions.invisibilityOfElementLocated(By.xpath(LOCATORS.USER_NAME_IN_THE_LEFT_PANEL.replace("$1", arg0))));
            System.out.println("Element is invisible");
        } catch (Exception e) {
            System.out.println("Element isn`t invisible");
        }

        try {
            System.out.println("check that documents are presented in the DOM");
            withTimeoutOf(1, TimeUnit.SECONDS).waitFor(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath(LOCATORS.USER_NAME_IN_THE_LEFT_PANEL.replace("$1", arg0))));
            System.out.println("documents are presented in the DOM");
            System.out.println("check that documents are visibility");
            withTimeoutOf(1, TimeUnit.SECONDS).waitFor(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(LOCATORS.USER_NAME_IN_THE_LEFT_PANEL.replace("$1", arg0))));
            System.out.println("documents are visibility");
            return false;
        } catch (Exception e) {
            return true;
        }
    }

    public void clickOnClipButton() {
        withTimeoutOf(1, TimeUnit.SECONDS);
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("arguments[0].click();", findBy(LOCATORS.CLIP_BUTTON));
    }

    public boolean uploadFileLinkIsDisplayed() {
        withTimeoutOf(15, TimeUnit.SECONDS).waitFor(ExpectedConditions.visibilityOfElementLocated(By.xpath(LOCATORS.UPLOAD_BUTTON)));
        return $(LOCATORS.UPLOAD_BUTTON).isPresent();
    }

    public void uploadToTheForm(String arg0) throws URISyntaxException {
        getDriver().findElement(By.id("formControlsFile")).sendKeys(arg0);
        withTimeoutOf(1, TimeUnit.SECONDS);
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("arguments[0].click();", findBy(LOCATORS.UPLOAD_BUTTON));
    }

    public boolean titleIsDisplayedInThePopUp(String arg0) {
        withTimeoutOf(15, TimeUnit.SECONDS).waitFor(ExpectedConditions.visibilityOfElementLocated(By.xpath(LOCATORS.UPLOAD_FILE_TITLE_IN_THE_UPLOAD_POPUP.replace("$1", arg0))));
        return $(LOCATORS.UPLOAD_FILE_TITLE_IN_THE_UPLOAD_POPUP.replace("$1", arg0)).isPresent();
    }

    public void clickOnUploadButton() {
        $(LOCATORS.UPLOAD_BUTTON_IN_THE_UPLOAD_POPUP).click();
    }

    public boolean fileIsDisplayedInTheRoom(String arg0) {
        withTimeoutOf(15, TimeUnit.SECONDS).waitFor(ExpectedConditions.visibilityOfElementLocated(By.xpath(LOCATORS.FILE_NAME_IN_THE_ROOM_AFTER_UPLOADING.replace("$1", arg0))));
        return $(LOCATORS.FILE_NAME_IN_THE_ROOM_AFTER_UPLOADING.replace("$1", arg0)).isPresent();
    }

    public void clickOnTheDownloadButtonUnderFile(String arg0) {
        withTimeoutOf(1, TimeUnit.SECONDS);
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("arguments[0].click();", findBy(LOCATORS.DOWNLOAD_BUTTON_UNDER_FILE_NAME.replace("$1", arg0)));
    }

    public void theFileIsDownloadedOnTheLocalMachine() {
        waitABit(3500);
        File folder = new File(System.getProperty("user.home") + "/Downloads/");
        waitABit(1500);
        File[] listOfFile = folder.listFiles();
        int file = listOfFile.length;
        Assert.assertEquals(1, file);
    }
}
