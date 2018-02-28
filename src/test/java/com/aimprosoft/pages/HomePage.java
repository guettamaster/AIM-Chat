package com.aimprosoft.pages;

import com.aimprosoft.LOCATORS;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.annotations.findby.By;
import net.thucydides.core.annotations.DefaultUrl;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.io.File;
import java.net.URISyntaxException;
import java.util.concurrent.TimeUnit;


@DefaultUrl("https://chat-stage.aimprosoft.com/index.html")
//https://chat-stage.aimprosoft.com/index.html
//https://chat-predprod.aimprosoft.com/index.html
//https://chat.aimprosoft.com/index.html

public class HomePage extends net.serenitybdd.core.pages.PageObject {

    private static Logger logger = LoggerFactory.getLogger(HomePage.class);

    public void clickOnPlusLink() {
//        waitABit(8000);
        withTimeoutOf(15, TimeUnit.SECONDS).waitFor(ExpectedConditions.visibilityOfElementLocated(By.xpath(LOCATORS.PLUS_LINK)));
        evaluateJavascript("arguments[0].click();", $(LOCATORS.PLUS_LINK));
//        $(LOCATORS.PLUS_LINK).click();
    }

    public boolean roomTitleInPopupIsDisplayed() {
        withTimeoutOf(21, TimeUnit.SECONDS).waitFor(ExpectedConditions.visibilityOfElementLocated(By.xpath(LOCATORS.ROOM_TITLE_IN_POPUP)));
        return $(LOCATORS.ROOM_TITLE_IN_POPUP).isPresent();
    }

    public void enterInTheInputField(String arg0, String arg1) {
        waitABit(500);
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
        evaluateJavascript("arguments[0].click();", $(LOCATORS.ADD_BUTTON));
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

    public void clickOnTheSettingsButtonOfRoom(String arg0) {
        withTimeoutOf(1, TimeUnit.SECONDS);
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("arguments[0].click();", findBy(LOCATORS.SETTINGS_BUTTON_IN_THE_RIGHT_PANEL.replace("$1", arg0)));
    }

    public void clickOnTheChannelDetailsLink(String arg0) {
        $(LOCATORS.CHANNEL_DETAILS_LINK.replace("$1", arg0)).click();
    }

    public boolean roomSettingsIsDisplayedOnTheName(String arg0) {
        waitABit(500);
        return $(LOCATORS.ROOM_NAME_IN_THE_SETTINGS_BLOCK_IN_THE_RIGHT_BUTTON.replace("$1", arg0)).isPresent();
    }

    public void clickOnTheEditRoomNameLink() {
        withTimeoutOf(1, TimeUnit.SECONDS);
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("arguments[0].click();", findBy(LOCATORS.EDIT_ROOM_NAME_LINK));
    }

    public boolean inputRoomNameFieldOnTheIsDisplayed(String arg0) {
        waitABit(500);
        return $(LOCATORS.ROOM_NAME_INPUT_FIELD_ACTIVE.replace("$1", arg0)).isPresent();
    }

    public void clearDataInTheInputRoomNameField() {
        if (inputRoomNameField()) {
            $(LOCATORS.ROOM_NAME_INPUT_FIELD.replace("$1", "1")).clear();
        } else {
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

    public void clickOnSaveChangesButtonUnderTheInputRoomNameField() {
        withTimeoutOf(1, TimeUnit.SECONDS);
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("arguments[0].click();", findBy(LOCATORS.SAVE_CHANGES_BUTTON_BELOW_THE_ROOM_NAME_INPUT_FIELD));
    }

    public void clickOnTheEditDescriptionLinkInTheRoom(String arg0) {
        withTimeoutOf(1, TimeUnit.SECONDS);
        evaluateJavascript("arguments[0].click();", $(LOCATORS.EDIT_DESCRIPTION_LINK.replace("$1", arg0)));
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

    public boolean deleteRoomPopUpIsDisplayed(String arg0) {
        withTimeoutOf(15, TimeUnit.SECONDS).waitFor(ExpectedConditions.visibilityOfElementLocated(By.xpath(LOCATORS.DELETE_ROOM_TITLE_IN_THE_DELETE_ROOM_POPUP.replace("$1", arg0))));
        return $(LOCATORS.DELETE_ROOM_TITLE_IN_THE_DELETE_ROOM_POPUP.replace("$1", arg0)).isPresent();
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
//        Actions action = new Actions(getDriver());
//        waitABit(500);
//        action.moveToElement(find(By.xpath(String.format(LOCATORS.SEARCH_INPUT_FIELD_IN_THE_DIRECT_ROOMS_POPUP.replace("$1", arg0))))).click().sendKeys(Keys.ENTER).build().perform();

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
//        waitABit(5000);
//        $(LOCATORS.USER_NAME_IN_THE_USERS_LIST_FROM_THE_DIRECT_ROOMS_POPUP.replace("$1", arg0)).click();
//        waitABit(5000);

        withTimeoutOf(10, TimeUnit.SECONDS).waitFor(ExpectedConditions.visibilityOfElementLocated(By.xpath(LOCATORS.USER_NAME_IN_THE_USERS_LIST_FROM_THE_DIRECT_ROOMS_POPUP.replace("$1", arg0))));
        evaluateJavascript("arguments[0].click();", $(LOCATORS.USER_NAME_IN_THE_USERS_LIST_FROM_THE_DIRECT_ROOMS_POPUP.replace("$1", arg0)));

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
        evaluateJavascript("arguments[0].click();", $(LOCATORS.USER_NAME_IN_THE_LEFT_PANEL.replace("$1", arg0)));
    }

    public void enterInTheInputMessageField(String arg0) {
        Actions actions = new Actions(getDriver());
        actions.sendKeys(arg0);
        actions.moveToElement(find(By.xpath(LOCATORS.INPUT_MESSAGE_FIELD.replace("$1", arg0))));
        actions.build().perform();
    }

    public void clickOnEnterButton() {
        waitABit(500);
        $(LOCATORS.INPUT_MESSAGE_FIELD).click();
        waitABit(500);
        $(LOCATORS.INPUT_MESSAGE_FIELD).sendKeys(Keys.ENTER);
    }

    public boolean messageIsCreated(String arg0) {
        withTimeoutOf(15, TimeUnit.SECONDS).waitFor(ExpectedConditions.visibilityOfElementLocated(By.xpath(LOCATORS.THE_SENT_MESSAGE_INSIDE_THE_ROOM.replace("$1", arg0))));
        return $(LOCATORS.THE_SENT_MESSAGE_INSIDE_THE_ROOM.replace("$1", arg0)).isVisible();
    }

    public boolean messageIsDisplayed(String arg0) {
        withTimeoutOf(15, TimeUnit.SECONDS).waitFor(ExpectedConditions.visibilityOfElementLocated(By.xpath(LOCATORS.THE_SENT_MESSAGE_INSIDE_THE_ROOM.replace("$1", arg0))));
        return $(LOCATORS.THE_SENT_MESSAGE_INSIDE_THE_ROOM.replace("$1", arg0)).isPresent();
    }

    public void clickOnTheRightControlHamburgerOnTheMessage(String arg0) {
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("arguments[0].click();", findBy(LOCATORS.RIGHT_CONTROL_HAMBURGER_ON_THE_MESSAGE.replace("$1", arg0)));
    }

    public boolean messageMenuIsDisplayed() {
        withTimeoutOf(15, TimeUnit.SECONDS).waitFor(ExpectedConditions.visibilityOfElementLocated(By.xpath(LOCATORS.MESSAGE_MENU)));
        return $(LOCATORS.MESSAGE_MENU).isPresent();
    }

    public void clickOnTheLinkInTheMessageMenu(String arg0) {
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
        waitABit(500);
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
        waitABit(2000);
//        withTimeoutOf(10, TimeUnit.SECONDS).waitFor(ExpectedConditions.visibilityOfElementLocated(By.xpath(LOCATORS.DELETE_SIGN_NEAR_USER_NAME_IN_THE_LEFT_PANEL.replace("$1", arg0))));
        evaluateJavascript("arguments[0].click();", $(LOCATORS.DELETE_SIGN_NEAR_USER_NAME_IN_THE_LEFT_PANEL.replace("$1", arg0)));
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
        waitABit(2000);
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("arguments[0].click();", findBy(LOCATORS.CLIP_BUTTON));
    }

    public boolean uploadFileLinkIsDisplayed() {
        withTimeoutOf(60, TimeUnit.SECONDS).waitFor(ExpectedConditions.visibilityOfElementLocated(By.xpath(LOCATORS.UPLOAD_BUTTON)));
        return $(LOCATORS.UPLOAD_BUTTON).isPresent();
    }

    public void uploadToTheForm(String arg0) throws URISyntaxException {
        getDriver().findElement(By.id("formControlsFile")).sendKeys(arg0);
        withTimeoutOf(1, TimeUnit.SECONDS);
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("arguments[0].click();", findBy(LOCATORS.UPLOAD_BUTTON));
    }

    public boolean titleIsDisplayedInThePopUp(String arg0) {
        withTimeoutOf(60, TimeUnit.SECONDS).waitFor(ExpectedConditions.visibilityOfElementLocated(By.xpath(LOCATORS.UPLOAD_FILE_TITLE_IN_THE_UPLOAD_POPUP.replace("$1", arg0))));
        return $(LOCATORS.UPLOAD_FILE_TITLE_IN_THE_UPLOAD_POPUP.replace("$1", arg0)).isPresent();
    }

    public void clickOnUploadButton() {
        waitABit(1500);
//        withTimeoutOf(60, TimeUnit.SECONDS).waitFor(ExpectedConditions.elementToBeClickable(By.xpath(LOCATORS.UPLOAD_BUTTON_IN_THE_UPLOAD_POPUP)));
        $(LOCATORS.UPLOAD_BUTTON_IN_THE_UPLOAD_POPUP).click();
    }

    public boolean fileIsDisplayedInTheRoom(String arg0) {
        withTimeoutOf(60, TimeUnit.SECONDS).waitFor(ExpectedConditions.visibilityOfElementLocated(By.xpath(LOCATORS.FILE_NAME_IN_THE_ROOM_AFTER_UPLOADING.replace("$1", arg0))));
        return $(LOCATORS.FILE_NAME_IN_THE_ROOM_AFTER_UPLOADING.replace("$1", arg0)).isPresent();
    }

    public void clickOnTheDownloadButtonUnderFile(String arg0) {
        waitABit(2000);
        $(LOCATORS.DOWNLOAD_BUTTON_UNDER_FILE_NAME.replace("$1", arg0)).click();
    }

    public void theFileIsDownloadedOnTheLocalMachine() {
        waitABit(3500);
        File folder = new File("/var/lib/jenkins/Downloads/"); // this is for Jenkins
//        File folder = new File("/home/user-qa/Downloads");  //this is for local machine
        waitABit(1500);
        File[] listOfFile = folder.listFiles();
        int file = listOfFile.length;
        Assert.assertEquals(1, file);
    }

    public void clickOnAddRoomTitle() {
        $(LOCATORS.ROOM_TITLE_IN_POPUP).click();
    }

    public void clickOnTheFavoriteRoomButton() {
        withTimeoutOf(10, TimeUnit.SECONDS).waitFor(ExpectedConditions.visibilityOfElementLocated(By.xpath(LOCATORS.FAVORITE_ROOM_BUTTON)));
        evaluateJavascript("arguments[0].click();", $(LOCATORS.FAVORITE_ROOM_BUTTON));
    }

    public boolean theIsDisplayedInTheFavoritesOnTheLeftPanel(String arg0) {
        withTimeoutOf(15, TimeUnit.SECONDS).waitFor(ExpectedConditions.visibilityOfElementLocated(By.xpath(LOCATORS.FAVORITE_ROOM_NAME_IN_THE_LEFT_PANEL.replace("$1", arg0))));
        return $(LOCATORS.FAVORITE_ROOM_NAME_IN_THE_LEFT_PANEL.replace("$1", arg0)).isPresent();
    }

    public void clickOnTheUnfavoriteRoomButton() {
        withTimeoutOf(10, TimeUnit.SECONDS).waitFor(ExpectedConditions.visibilityOfElementLocated(By.xpath(LOCATORS.UNFAVORITE_ROOM_BUTTON)));
        evaluateJavascript("arguments[0].click();", $(LOCATORS.UNFAVORITE_ROOM_BUTTON));
    }

    public boolean theIsDeletedInTheFavoritesOnTheLeftPanel(String arg0) {
        try {
            System.out.println("wait that documents are invisible");
            withTimeoutOf(6, TimeUnit.SECONDS).waitFor(ExpectedConditions.invisibilityOfElementLocated(By.xpath(LOCATORS.FAVORITE_ROOM_NAME_IN_THE_LEFT_PANEL.replace("$1", arg0))));
            System.out.println("Element is invisible");
        } catch (Exception e) {
            System.out.println("Element isn`t invisible");
        }

        try {
            System.out.println("check that documents are presented in the DOM");
            withTimeoutOf(1, TimeUnit.SECONDS).waitFor(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath(LOCATORS.FAVORITE_ROOM_NAME_IN_THE_LEFT_PANEL.replace("$1", arg0))));
            System.out.println("documents are presented in the DOM");
            System.out.println("check that documents are visibility");
            withTimeoutOf(1, TimeUnit.SECONDS).waitFor(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(LOCATORS.FAVORITE_ROOM_NAME_IN_THE_LEFT_PANEL.replace("$1", arg0))));
            System.out.println("documents are visibility");
            return false;
        } catch (Exception e) {
            return true;
        }
    }

    public boolean theRoomReturnsToTheRoomsOnTheLeftPanel(String arg0) {
        withTimeoutOf(15, TimeUnit.SECONDS).waitFor(ExpectedConditions.visibilityOfElementLocated(By.xpath(LOCATORS.PUBLIC_ROOM_NAME_IN_THE_LEFT_PANEL.replace("$1", arg0))));
        return $(LOCATORS.PUBLIC_ROOM_NAME_IN_THE_LEFT_PANEL.replace("$1", arg0)).isPresent();
    }

    public void clickOnUserName() {
//        waitABit(2000);
        $(LOCATORS.USER_FROM_THE_LIST).click();
    }

    public void clickOnRoomTitleInPopup() {
//        waitABit(2000);
        $(LOCATORS.ROOM_TITLE_IN_POPUP).click();
    }

    public boolean clipButtonIsDisplayed() {
        withTimeoutOf(60, TimeUnit.SECONDS).waitFor(ExpectedConditions.visibilityOfElementLocated(By.xpath(LOCATORS.CLIP_BUTTON)));
        return $(LOCATORS.CLIP_BUTTON).isPresent();
    }

    public void progressBarIsDisappeared() {
        try {
            withTimeoutOf(30, TimeUnit.SECONDS).waitFor(ExpectedConditions.visibilityOfElementLocated(By.xpath(LOCATORS.PROGRESS_BAR_IN_THE_UPLOAD_POPUP)));
        } catch (Exception e) {
        }
    }

    public void progressBarIsHided() {
        try {
            withTimeoutOf(30, TimeUnit.SECONDS).waitFor(ExpectedConditions.invisibilityOfElementLocated(By.xpath(LOCATORS.PROGRESS_BAR_IN_THE_UPLOAD_POPUP)));
        } catch (Exception e) {
        }
    }

    public void titleIsHidedInThePopUp() {
        try {
            withTimeoutOf(60, TimeUnit.SECONDS).waitFor(ExpectedConditions.invisibilityOfElementLocated(By.xpath(LOCATORS.UPLOAD_FILE_TITLE_IN_THE_UPLOAD_POPUP)));
        } catch (Exception e) {
        }
    }

    public void clickOnUserName(String arg0) {
        withTimeoutOf(10, TimeUnit.SECONDS).waitFor(ExpectedConditions.visibilityOfElementLocated(By.xpath(LOCATORS.THE_CURRENT_AUTHORIZED_USER_NAME_IN_THE_LEFT_PANEL.replace("$1", arg0))));
        evaluateJavascript("arguments[0].click();", $(LOCATORS.THE_CURRENT_AUTHORIZED_USER_NAME_IN_THE_LEFT_PANEL.replace("$1", arg0)));
    }

    public boolean theUserMenuWithActionsIsDisplayed() {
        withTimeoutOf(15, TimeUnit.SECONDS).waitFor(ExpectedConditions.visibilityOfElementLocated(By.xpath(LOCATORS.USER_MENU_WITH_ACTIONS)));
        return $(LOCATORS.USER_MENU_WITH_ACTIONS).isPresent();
    }

    public void clickOnTheProfileLink() {
        evaluateJavascript("arguments[0].click();", $(LOCATORS.PROFILE_LINK_INSIDE_USER_MENU));
//        $(LOCATORS.PROFILE_LINK_INSIDE_USER_MENU).click();
    }

    public boolean theProfilePageIsDisplayed() {
//        waitABit(500);
        withTimeoutOf(15, TimeUnit.SECONDS).waitFor(ExpectedConditions.visibilityOfElementLocated(By.xpath(LOCATORS.PROFILE_TITLE_IN_THE_PROFILE_PAGE)));
        return $(LOCATORS.PROFILE_TITLE_IN_THE_PROFILE_PAGE).isPresent();
    }

    public void uploadAvatar(String arg0) throws URISyntaxException {
        getDriver().findElement(By.id("avatarFile")).sendKeys(arg0);
        withTimeoutOf(1, TimeUnit.SECONDS);
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("arguments[0].click();", findBy(LOCATORS.CHANGE_AVATAR_BUTTON));
    }

    public void clickOnSaveButton() {
        waitABit(500);
        $(LOCATORS.SAVE_BUTTON_ON_THE_CHANGE_AVATAR_PAGE).click();
    }

    public void clickOnTheSaveButtonOnTheProfilePage() {
        withTimeoutOf(15, TimeUnit.SECONDS).waitFor(ExpectedConditions.elementToBeClickable(By.xpath(LOCATORS.SAVE_BUTTON_ON_THE_PROFILE_PAGE)));
        $(LOCATORS.SAVE_BUTTON_ON_THE_PROFILE_PAGE).click();
    }

    public void clearDataInTheInputField(String arg0) {
        waitABit(500);
        $(LOCATORS.INPUT_FIELD_WITH_LABEL.replace("$1", arg0)).clear();
    }

    public boolean profileSuccessfullyUpdatedMessageIsDisplayed() {
        withTimeoutOf(15, TimeUnit.SECONDS).waitFor(ExpectedConditions.visibilityOfElementLocated(By.xpath(LOCATORS.STATUS_AFTER_SAVING_FIELDS)));
        return $(LOCATORS.STATUS_AFTER_SAVING_FIELDS).isPresent();
    }

    public void clickOnTheArrowBack() {
        $(LOCATORS.ARROW_BACK).click();
    }

    public boolean userNameIsDisplayedInTheLeftPanelAfterUpdatingProfile(String arg0) {
        withTimeoutOf(15, TimeUnit.SECONDS).waitFor(ExpectedConditions.visibilityOfElementLocated(By.xpath(LOCATORS.USER_NAME_AFTER_UPDATING_PROFILE.replace("$1", arg0))));
        return $(LOCATORS.USER_NAME_AFTER_UPDATING_PROFILE.replace("$1", arg0)).isPresent();
    }

    public String checkTheValueOfTheFieldWithLabel(String arg0) {
        withTimeoutOf(15, TimeUnit.SECONDS).waitFor(ExpectedConditions.visibilityOfElementLocated(org.openqa.selenium.By.xpath(LOCATORS.INPUT_FIELD_WITH_LABEL.replace("$1", arg0))));
        return $(LOCATORS.INPUT_FIELD_WITH_LABEL.replace("$1", arg0)).getValue();
    }

    public boolean theDraftSignIsDisplayedNearUserNameInTheLeftPanel(String arg0) {
        withTimeoutOf(15, TimeUnit.SECONDS).waitFor(ExpectedConditions.visibilityOfElementLocated(By.xpath(LOCATORS.DRAFT_SIGN_NEAR_USER_NAME.replace("$1", arg0))));
        return $(LOCATORS.DRAFT_SIGN_NEAR_USER_NAME.replace("$1", arg0)).isPresent();
    }

    public void enterInTheInputSearchFieldInsideARoom(String arg0) {
//        Actions actions = new Actions(getDriver());
//        actions.sendKeys(arg0);
//        actions.moveToElement(find(By.xpath(LOCATORS.INPUT_FIELD_INSIDE_A_ROOM.replace("$1", arg0))));
//        actions.build().perform();
        $(LOCATORS.INPUT_FIELD_INSIDE_A_ROOM.replace("$1", arg0)).sendKeys(arg0);
//        waitABit(3000);
    }

    public boolean titleNameOfAPanelWithListIsDisplayed(String arg0) {
        withTimeoutOf(15, TimeUnit.SECONDS).waitFor(ExpectedConditions.visibilityOfElementLocated(By.xpath(LOCATORS.TITLE_NAME_OF_A_PANEL.replace("$1", arg0))));
        return $(LOCATORS.TITLE_NAME_OF_A_PANEL.replace("$1", arg0)).isPresent();
    }

    public boolean createSnippetLinkIsDisplayed() {
        withTimeoutOf(15, TimeUnit.SECONDS).waitFor(ExpectedConditions.visibilityOfElementLocated(By.xpath(LOCATORS.CREATE_SNIPPET_LINK)));
        return $(LOCATORS.CREATE_SNIPPET_LINK).isPresent();
    }

    public void clickOnTheSnippetLink() {
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("arguments[0].click();", findBy(LOCATORS.CREATE_SNIPPET_LINK));
    }

    public boolean createSnippetTitleInsideOpenedPopupIsDisplayed() {
        withTimeoutOf(15, TimeUnit.SECONDS).waitFor(ExpectedConditions.visibilityOfElementLocated(By.xpath(LOCATORS.CREATE_SNIPPET_TITLE)));
        return $(LOCATORS.CREATE_SNIPPET_TITLE).isPresent();
    }

    public boolean theToastIsDisplayed(String arg0) {
        withTimeoutOf(10, TimeUnit.SECONDS).waitFor(ExpectedConditions.presenceOfElementLocated(By.xpath(LOCATORS.TOAST_MESSAGE.replace("$1", arg0))));
        return $(LOCATORS.TOAST_MESSAGE.replace("$1", arg0)).isPresent();
    }

    public void theToastIsClosed(String arg0) {
        withTimeoutOf(10, TimeUnit.SECONDS).waitFor(ExpectedConditions.invisibilityOfElementLocated(By.xpath(LOCATORS.TOAST_MESSAGE.replace("$1", arg0))));
    }

    public void enterInTheSnippetFileNameField(String arg0) {
        $(LOCATORS.SNIPPET_FILE_NAME_INPUT_FIELD.replace("$1", arg0)).sendKeys(arg0);
    }

    public void enterInTheTextareaField(String arg0) {
        $(LOCATORS.TEXTAREA_INPUT_FIELD_INSIDE_A_SNIPPET_POPUP.replace("$1", arg0)).sendKeys(arg0);
        waitABit(5000);
    }

    public void clickOnTheCreateButton() {
        evaluateJavascript("arguments[0].click();", $(LOCATORS.CREATE_BUTTON_INSIDE_A_SNIPPET_POPUP));
//        evaluateJavascript("alert(\"test passed\")");
    }

    public boolean isCreated(String arg0) {
        withTimeoutOf(15, TimeUnit.SECONDS).waitFor(ExpectedConditions.visibilityOfElementLocated(By.xpath(LOCATORS.SNIPPET_NAME_IN_THE_CHAT.replace("$1", arg0))));
        return $(LOCATORS.SNIPPET_NAME_IN_THE_CHAT.replace("$1", arg0)).isPresent();
    }

    public boolean isDisplayed(String arg0) {
        withTimeoutOf(15, TimeUnit.SECONDS).waitFor(ExpectedConditions.visibilityOfElementLocated(By.xpath(LOCATORS.SNIPPET_NAME_IN_THE_CHAT.replace("$1", arg0))));
        return $(LOCATORS.SNIPPET_NAME_IN_THE_CHAT.replace("$1", arg0)).isPresent();
    }

    public void clickOnTheEditLinkOnThe(String arg0) {
        withTimeoutOf(10, TimeUnit.SECONDS).waitFor(ExpectedConditions.visibilityOfElementLocated(By.xpath(LOCATORS.EDIT_SNIPPET_LINK.replace("$1", arg0))));
        evaluateJavascript("arguments[0].click();", $(LOCATORS.EDIT_SNIPPET_LINK.replace("$1", arg0)));
    }

    public boolean editSnippetTitleInsideOpenedPopupIsDisplayed() {
        withTimeoutOf(15, TimeUnit.SECONDS).waitFor(ExpectedConditions.visibilityOfElementLocated(By.xpath(LOCATORS.EDIT_SNIPPET_TITLE)));
        return $(LOCATORS.EDIT_SNIPPET_TITLE).isPresent();
    }

    public void clickOnTheArrowInTheProgrammingLanguageDropdownMenu() {
        withTimeoutOf(10, TimeUnit.SECONDS).waitFor(ExpectedConditions.visibilityOfElementLocated(By.xpath(LOCATORS.PROGRAMMING_LANGUAGE_ARROW)));
        evaluateJavascript("arguments[0].click();", $(LOCATORS.PROGRAMMING_LANGUAGE_ARROW));
    }

    public void clickOptionFromTheProgrammingLanguageDropDownList(String arg0) {
        withTimeoutOf(10, TimeUnit.SECONDS).waitFor(ExpectedConditions.visibilityOfElementLocated(By.xpath(LOCATORS.OPTION_FROM_THE_PROGRAMMING_LANGUAGE_DROP_DOWN_LIST.replace("$1", arg0))));
        evaluateJavascript("arguments[0].click();", $(LOCATORS.OPTION_FROM_THE_PROGRAMMING_LANGUAGE_DROP_DOWN_LIST.replace("$1", arg0)));
    }

    public void clearDataInTheSnippetFileNameField() {
        waitABit(500);
        $(LOCATORS.SNIPPET_FILE_NAME_INPUT_FIELD).clear();
    }

    public void clearDataInTheTextareaField() {
        waitABit(500);
        $(LOCATORS.TEXTAREA_INPUT_FIELD_INSIDE_A_SNIPPET_POPUP).clear();
    }

    public boolean programmingLanguageDropDownListIsOpened() {
        withTimeoutOf(15, TimeUnit.SECONDS).waitFor(ExpectedConditions.visibilityOfElementLocated(By.xpath(LOCATORS.PROGRAMMING_LANGUAGE_DROP_DOWN_LIST)));
        return $(LOCATORS.PROGRAMMING_LANGUAGE_DROP_DOWN_LIST).isPresent();
    }

    public boolean optionIsDisplayedInTheProgrammingLanguageDropdownMenu(String arg0) {
        withTimeoutOf(15, TimeUnit.SECONDS).waitFor(ExpectedConditions.visibilityOfElementLocated(By.xpath(LOCATORS.OPTION_IN_THE_PROGRAMMING_LANGUAGE_DROP_DOWN_MENU.replace("$1", arg0))));
        return $(LOCATORS.OPTION_IN_THE_PROGRAMMING_LANGUAGE_DROP_DOWN_MENU.replace("$1", arg0)).isPresent();
    }

    public void clickOnTheArrowInTheThemeDropdownMenu() {
        withTimeoutOf(10, TimeUnit.SECONDS).waitFor(ExpectedConditions.visibilityOfElementLocated(By.xpath(LOCATORS.THEME_ARROW)));
        evaluateJavascript("arguments[0].click();", $(LOCATORS.THEME_ARROW));
    }

    public boolean themeDropDownListIsOpened() {
        withTimeoutOf(15, TimeUnit.SECONDS).waitFor(ExpectedConditions.visibilityOfElementLocated(By.xpath(LOCATORS.THEME_DROP_DOWN_LIST)));
        return $(LOCATORS.THEME_DROP_DOWN_LIST).isPresent();
    }

    public void clickOptionFromTheThemeDropDownList(String arg0) {
        withTimeoutOf(10, TimeUnit.SECONDS).waitFor(ExpectedConditions.visibilityOfElementLocated(By.xpath(LOCATORS.OPTION_FROM_THE_THEME_LIST.replace("$1", arg0))));
        evaluateJavascript("arguments[0].click();", $(LOCATORS.OPTION_FROM_THE_THEME_LIST.replace("$1", arg0)));
    }

    public boolean optionIsDisplayedInTheThemeDropdownMenu(String arg0) {
        withTimeoutOf(15, TimeUnit.SECONDS).waitFor(ExpectedConditions.visibilityOfElementLocated(By.xpath(LOCATORS.OPTION_IN_THE_THEME_DROP_DOWN_MENU.replace("$1", arg0))));
        return $(LOCATORS.OPTION_IN_THE_THEME_DROP_DOWN_MENU.replace("$1", arg0)).isPresent();
    }

    public void clickOnTheSaveButton() {
        withTimeoutOf(10, TimeUnit.SECONDS).waitFor(ExpectedConditions.visibilityOfElementLocated(By.xpath(LOCATORS.SAVE_BUTTON_ON_THE_EDIT_SNIPPET_POPUP)));
        evaluateJavascript("arguments[0].click();", $(LOCATORS.SAVE_BUTTON_ON_THE_EDIT_SNIPPET_POPUP));
    }
}


