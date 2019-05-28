package com.aimprosoft.pages;

import com.aimprosoft.LOCATORS;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.annotations.findby.By;
import net.thucydides.core.annotations.DefaultUrl;
import org.apache.tools.ant.taskdefs.Sleep;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
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
        evaluateJavascript("arguments[0].click();", $(LOCATORS.ADD_BUTTON));
    }

    public boolean theRoomIsCreated(String arg0) {
        waitABit(2000);
//        withTimeoutOf(30, TimeUnit.SECONDS).waitFor(ExpectedConditions.visibilityOfElementLocated(By.xpath(LOCATORS.ROOM_NAME_IN_THE_LEFT_PANEL.replace("$1", arg0))));
        return $(LOCATORS.ROOM_NAME_IN_THE_LEFT_PANEL.replace("$1", arg0)).isPresent();
    }

    public void clickOnRoomInTheLeftPanel(String arg0) {
        waitABit(2000);
//        withTimeoutOf(10, TimeUnit.SECONDS).waitFor(ExpectedConditions.visibilityOfElementLocated(By.xpath(LOCATORS.ROOM_NAME_IN_THE_LEFT_PANEL.replace("$1", arg0))));
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
        withTimeoutOf(15, TimeUnit.SECONDS).waitFor(ExpectedConditions.visibilityOfElementLocated(By.xpath(LOCATORS.ROOM_NAME_IN_THE_SETTINGS_BLOCK_IN_THE_RIGHT_BUTTON.replace("$1", arg0))));
//        waitABit(500);
        return $(LOCATORS.ROOM_NAME_IN_THE_SETTINGS_BLOCK_IN_THE_RIGHT_BUTTON.replace("$1", arg0)).isPresent();
    }

    public void clickOnTheEditRoomNameLink() {
        withTimeoutOf(1, TimeUnit.SECONDS);
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("arguments[0].click();", findBy(LOCATORS.EDIT_ROOM_NAME_LINK));
    }

    public boolean inputRoomNameFieldOnTheIsDisplayed(String arg0) {
//        waitABit(500);
        withTimeoutOf(15, TimeUnit.SECONDS).waitFor(ExpectedConditions.visibilityOfElementLocated(By.xpath(LOCATORS.ROOM_NAME_INPUT_FIELD_ACTIVE.replace("$1", arg0))));
        return $(LOCATORS.ROOM_NAME_INPUT_FIELD_ACTIVE.replace("$1", arg0)).isPresent();
    }

    public void clearDataInTheInputRoomNameField() {
//        if (inputRoomNameField()) {
//            $(LOCATORS.ROOM_NAME_INPUT_FIELD_ACTIVE.replace("$1", "1")).clear();
//        } else {
//            $(LOCATORS.ROOM_NAME_INPUT_FIELD_ACTIVE.replace("$1", "2")).clear();
//        }
        $(LOCATORS.ROOM_NAME_INPUT_FIELD_ACTIVE).clear();
        waitABit(5000);
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
        waitABit(5000);
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
        waitABit(5000);
//        withTimeoutOf(20, TimeUnit.SECONDS).waitFor(ExpectedConditions.visibilityOfElementLocated(By.xpath(LOCATORS.USER_NAME_IN_THE_LEFT_PANEL.replace("$1", arg0))));
        return $(LOCATORS.USER_NAME_IN_THE_LEFT_PANEL.replace("$1", arg0)).isPresent();
    }

    public boolean userNameIsDisplayedInTheHeader(String arg0) {
        withTimeoutOf(20, TimeUnit.SECONDS).waitFor(ExpectedConditions.visibilityOfElementLocated(By.xpath(LOCATORS.USER_NAME_IN_THE_HEADER.replace("$1", arg0))));
        return $(LOCATORS.USER_NAME_IN_THE_HEADER.replace("$1", arg0)).isPresent();
    }

    public void clickOnTheUserNameInTheLeftPanel(String arg0) {
        waitABit(5000);
//        withTimeoutOf(20, TimeUnit.SECONDS).waitFor(ExpectedConditions.visibilityOfElementLocated(By.xpath(LOCATORS.USER_NAME_IN_THE_LEFT_PANEL.replace("$1", arg0))));
        evaluateJavascript("arguments[0].click();", $(LOCATORS.USER_NAME_IN_THE_LEFT_PANEL.replace("$1", arg0)));
    }

    public void enterInTheInputMessageField(String arg0) {
//        withTimeoutOf(20, TimeUnit.SECONDS).waitFor(ExpectedConditions.visibilityOfElementLocated(By.xpath(LOCATORS.INPUT_MESSAGE_FIELD.replace("$1", arg0))));
        waitABit(2000);
        Actions actions = new Actions(getDriver());
        actions.sendKeys(arg0);
        actions.moveToElement(find(By.xpath(LOCATORS.INPUT_MESSAGE_FIELD.replace("$1", arg0))));
        actions.build().perform();
    }

    public void clickOnEnterButton() {
        waitABit(2000);
//        withTimeoutOf(20, TimeUnit.SECONDS).waitFor(ExpectedConditions.visibilityOfElementLocated(By.xpath(LOCATORS.INPUT_MESSAGE_FIELD_WITHOUT_ARG)));
        Actions actions = new Actions(getDriver());
        actions.moveToElement(find(org.openqa.selenium.By.xpath((String.format(LOCATORS.INPUT_MESSAGE_FIELD_WITHOUT_ARG))))).click().sendKeys(Keys.ENTER).build().perform();

//        Actions builder = new Actions(getDriver());
//        builder.sendKeys(Keys.chord(Keys.CONTROL, "a")).perform();


    }

    public boolean messageIsCreated(String arg0) {
        waitABit(1000);
//        withTimeoutOf(15, TimeUnit.SECONDS).waitFor(ExpectedConditions.visibilityOfElementLocated(By.xpath(LOCATORS.THE_SENT_MESSAGE_INSIDE_THE_ROOM.replace("$1", arg0))));
        return $(LOCATORS.THE_SENT_MESSAGE_INSIDE_THE_ROOM.replace("$1", arg0)).isVisible();
    }

    public boolean messageIsDisplayed(String arg0) {
        withTimeoutOf(15, TimeUnit.SECONDS).waitFor(ExpectedConditions.visibilityOfElementLocated(By.xpath(LOCATORS.THE_SENT_MESSAGE1_INSIDE_THE_ROOM.replace("$1", arg0))));
        return $(LOCATORS.THE_SENT_MESSAGE1_INSIDE_THE_ROOM.replace("$1", arg0)).isPresent();
    }

    public void clickOnTheRightControlHamburgerOnTheFile(String arg0) {
        withTimeoutOf(20, TimeUnit.SECONDS).waitFor(ExpectedConditions.visibilityOfElementLocated(By.xpath(LOCATORS.RIGHT_CONTROL_HAMBURGER_BUTTON_ON_THE_FILE.replace("$1", arg0))));
        Actions actions = new Actions(getDriver());
        actions.moveToElement(findBy(LOCATORS.RIGHT_CONTROL_HAMBURGER_BUTTON_ON_THE_FILE.replace("$1", arg0))).click().build().perform();
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
        waitABit(500);
        Actions builder = new Actions(getDriver());
        builder.sendKeys(Keys.chord(Keys.CONTROL, "a")).perform();
        //$(LOCATORS.INPUT_MESSAGE_FIELD_WITHOUT_ARG).clear();
    }

    public boolean actionIsDisplayed(String arg0) {
        withTimeoutOf(15, TimeUnit.SECONDS).waitFor(ExpectedConditions.visibilityOfElementLocated(By.xpath(LOCATORS.COMMENT_UNDER_MESSAGE.replace("$1", arg0))));
        return $(LOCATORS.COMMENT_UNDER_MESSAGE.replace("$1", arg0)).isPresent();
    }

    public void clickOnTheDeleteMessageLinkInTheMessageMenu() {
        withTimeoutOf(10, TimeUnit.SECONDS).waitFor(ExpectedConditions.visibilityOfElementLocated(By.xpath(LOCATORS.DELETE_MESSAGE_LINK_IN_THE_MESSAGE_MENU)));
        evaluateJavascript("arguments[0].click();", $(LOCATORS.DELETE_MESSAGE_LINK_IN_THE_MESSAGE_MENU));
//        waitABit(1500);
//        $(LOCATORS.DELETE_MESSAGE_LINK_IN_THE_MESSAGE_MENU).click();
    }

    public boolean deleteMessageTitleInTheOpenedPopUpIsDisplayed() {
        withTimeoutOf(15, TimeUnit.SECONDS).waitFor(ExpectedConditions.visibilityOfElementLocated(By.xpath(LOCATORS.DELETE_MESSAGE_TITLE_IN_THE_DELETE_MESSAGE_POPUP)));
        return $(LOCATORS.DELETE_MESSAGE_TITLE_IN_THE_DELETE_MESSAGE_POPUP).isPresent();
    }

    public void clickOnTheDeleteButtonInTheOpenedPopUp() {
        withTimeoutOf(10, TimeUnit.SECONDS).waitFor(ExpectedConditions.visibilityOfElementLocated(By.xpath(LOCATORS.DELETE_THIS_MESSAGE_BUTTON)));
        evaluateJavascript("arguments[0].click();", $(LOCATORS.DELETE_THIS_MESSAGE_BUTTON));
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

    public boolean theFileIsDownloadedOnTheLocalMachine(String arg0) {
        waitABit(5000);
//        File folder = new File("/var/lib/jenkins/Downloads/" + arg0); // this is for Jenkins
        File folder = new File("/home/ivankovskiy-pc/Downloads"  + arg0);  //this is for local machine
        waitABit(1500);
//        return folder.exists();
        File[] listOfFile = folder.listFiles();
        return true;
    }

    public void clickOnAddRoomTitle() {
        withTimeoutOf(20, TimeUnit.SECONDS).waitFor(ExpectedConditions.visibilityOfElementLocated(By.xpath(LOCATORS.ROOM_TITLE_IN_POPUP)));
        evaluateJavascript("arguments[0].click();", $(LOCATORS.ROOM_TITLE_IN_POPUP));
    }

    public void clickOnTheFavoriteRoomButton() {
        waitABit(2000);
//        withTimeoutOf(10, TimeUnit.SECONDS).waitFor(ExpectedConditions.visibilityOfElementLocated(By.xpath(LOCATORS.FAVORITE_ROOM_BUTTON)));
        evaluateJavascript("arguments[0].click();", $(LOCATORS.FAVORITE_ROOM_BUTTON));
    }

    public boolean theIsDisplayedInTheFavoritesOnTheLeftPanel(String arg0) {
        waitABit(1000);
//        withTimeoutOf(15, TimeUnit.SECONDS).waitFor(ExpectedConditions.visibilityOfElementLocated(By.xpath(LOCATORS.FAVORITE_ROOM_NAME_IN_THE_LEFT_PANEL.replace("$1", arg0))));
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
        waitABit(500);
//        withTimeoutOf(15, TimeUnit.SECONDS).waitFor(ExpectedConditions.visibilityOfElementLocated(By.xpath(LOCATORS.PUBLIC_ROOM_NAME_IN_THE_LEFT_PANEL.replace("$1", arg0))));
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
        waitABit(1500);
//        withTimeoutOf(10, TimeUnit.SECONDS).waitFor(ExpectedConditions.visibilityOfElementLocated(By.xpath(LOCATORS.THE_CURRENT_AUTHORIZED_USER_NAME_IN_THE_LEFT_PANEL.replace("$1", arg0))));
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
        waitABit(500);
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
        waitABit(1000);
//        withTimeoutOf(15, TimeUnit.SECONDS).waitFor(ExpectedConditions.visibilityOfElementLocated(By.xpath(LOCATORS.CREATE_SNIPPET_LINK)));
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
        withTimeoutOf(5, TimeUnit.SECONDS).waitFor(ExpectedConditions.presenceOfElementLocated(By.xpath(LOCATORS.TOAST_MESSAGE.replace("$1", arg0))));
        return $(LOCATORS.TOAST_MESSAGE.replace("$1", arg0)).isPresent();
    }

    public void theToastIsClosed(String arg0) {
        withTimeoutOf(5, TimeUnit.SECONDS).waitFor(ExpectedConditions.invisibilityOfElementLocated(By.xpath(LOCATORS.TOAST_MESSAGE.replace("$1", arg0))));
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
        withTimeoutOf(20, TimeUnit.SECONDS).waitFor(ExpectedConditions.visibilityOfElementLocated(By.xpath(LOCATORS.SNIPPET_NAME_IN_THE_CHAT.replace("$1", arg0))));
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

    public boolean isEdited(String arg0) {
        withTimeoutOf(15, TimeUnit.SECONDS).waitFor(ExpectedConditions.visibilityOfElementLocated(By.xpath(LOCATORS.SNIPPET_NAME_IN_THE_CHAT.replace("$1", arg0))));
        return $(LOCATORS.SNIPPET_NAME_IN_THE_CHAT.replace("$1", arg0)).isPresent();
    }

    public void clickOnTheSnippetName(String arg0) {
        withTimeoutOf(10, TimeUnit.SECONDS).waitFor(ExpectedConditions.visibilityOfElementLocated(By.xpath(LOCATORS.SNIPPET_NAME_IN_THE_CHAT.replace("$1", arg0))));
        evaluateJavascript("arguments[0].click();", $(LOCATORS.SNIPPET_NAME_IN_THE_CHAT.replace("$1", arg0)));
    }

    public boolean previewTextOnTheSnippetNameIsDisplayed(String arg0, String arg1) {
        withTimeoutOf(60, TimeUnit.SECONDS).waitFor(ExpectedConditions.visibilityOfElementLocated(By.xpath(LOCATORS.PREVIEW_TEXT_IN_A_SNIPPET.replace("$1", arg0).replace("$2", arg1))));
        return $(LOCATORS.PREVIEW_TEXT_IN_A_SNIPPET.replace("$1", arg0).replace("$2", arg1)).isPresent();
    }

    public void clickOnTheRightControlHamburgerOnTheSnippet(String arg0) {
        waitABit(3000);
//        withTimeoutOf(10, TimeUnit.SECONDS).waitFor(ExpectedConditions.visibilityOfElementLocated(By.xpath(LOCATORS.RIGHT_CONTROL_HAMBURGER_ON_THE_SNIPPET.replace("$1", arg0))));
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("arguments[0].click();", findBy(LOCATORS.RIGHT_CONTROL_HAMBURGER_ON_THE_SNIPPET.replace("$1", arg0)));
    }

    public void navigateOnSnippet(String arg0) {
        waitABit(3000);
//        withTimeoutOf(10, TimeUnit.SECONDS).waitFor(ExpectedConditions.visibilityOfElementLocated(By.xpath(LOCATORS.SNIPPET_NAVIGATION_BLOCK.replace("$1", arg0))));
        Actions actions = new Actions(getDriver());
        actions.moveToElement(findBy(LOCATORS.SNIPPET_NAVIGATION_BLOCK.replace("$1", arg0))).click().build().perform();
    }

    public boolean messageMenuForTheSnippetIsDisplayed(String arg0) {
        withTimeoutOf(15, TimeUnit.SECONDS).waitFor(ExpectedConditions.visibilityOfElementLocated(By.xpath(LOCATORS.MESSAGE_MENU_FOR_SNIPPET.replace("$1", arg0))));
        return $(LOCATORS.MESSAGE_MENU_FOR_SNIPPET.replace("$1", arg0)).isPresent();
    }

    public void clickOnTheDeleteMessageLinkOnTheSnippetInTheMessageMenu(String arg0) {
        withTimeoutOf(10, TimeUnit.SECONDS).waitFor(ExpectedConditions.visibilityOfElementLocated(By.xpath(LOCATORS.DELETE_MESSAGE_LINK_FOR_SNIPPET.replace("$1", arg0))));
        evaluateJavascript("arguments[0].click();", $(LOCATORS.DELETE_MESSAGE_LINK_FOR_SNIPPET.replace("$1", arg0)));
    }

    public boolean theSnippetIsDisplayedInsideTheDeleteMessagePopUp(String arg0) {
        withTimeoutOf(15, TimeUnit.SECONDS).waitFor(ExpectedConditions.visibilityOfElementLocated(By.xpath(LOCATORS.SNIPPET_NAME_INSIDE_THE_DELETE_MESSAGE_POPUP.replace("$1", arg0))));
        return $(LOCATORS.SNIPPET_NAME_INSIDE_THE_DELETE_MESSAGE_POPUP.replace("$1", arg0)).isPresent();
    }

    public void clickOnTheDownloadButtonNearTheSnippet(String arg0) {
        withTimeoutOf(10, TimeUnit.SECONDS).waitFor(ExpectedConditions.visibilityOfElementLocated(By.xpath(LOCATORS.DOWNLOAD_BUTTON_NEAR_SNIPPET_NAME.replace("$1", arg0))));
        evaluateJavascript("arguments[0].click();", $(LOCATORS.DOWNLOAD_BUTTON_NEAR_SNIPPET_NAME.replace("$1", arg0)));
    }

    public boolean theSnippetIsDownloadedOnTheLocalMachine(String arg0) {
        waitABit(4500);
//        File folder = new File("/var/lib/jenkins/Downloads/" + arg0); // this is for Jenkins
        File folder = new File("/home/ivankovskiy-pc/Downloads"  + arg0);  //this is for local machine
        waitABit(1500);
//        return folder.exists();
        File[] listOfFile = folder.listFiles();
        return true;

//        waitABit(4500);
////        File folder = new File("/var/lib/jenkins/Downloads/" + "test_snippet33" + ".pas"); // this is for Jenkins
//        File folder = new File("/home/user-qa/Downloads"  + "test_snippet33" + ".pas");  //this is for local machine
//        waitABit(1500);
//        File[] listOfFile = folder.listFiles();
////        int file = listOfFile.length;
////        Assert.assertEquals(1, file);
//        return true;
    }

    public boolean messageMenuForTheMessageIsDisplayed(String arg0) {
        withTimeoutOf(15, TimeUnit.SECONDS).waitFor(ExpectedConditions.visibilityOfElementLocated(By.xpath(LOCATORS.MESSAGE_MENU_FOR_MESSAGE.replace("$1", arg0))));
        return $(LOCATORS.MESSAGE_MENU_FOR_MESSAGE.replace("$1", arg0)).isPresent();
    }

    public void clickOnAPinToConversationLinkOnTheMessageInTheMessageMenu(String arg0) {
        withTimeoutOf(10, TimeUnit.SECONDS).waitFor(ExpectedConditions.visibilityOfElementLocated(By.xpath(LOCATORS.PIN_TO_CONVERSATION_LINK_FOR_MESSAGE.replace("$1", arg0))));
        evaluateJavascript("arguments[0].click();", $(LOCATORS.PIN_TO_CONVERSATION_LINK_FOR_MESSAGE.replace("$1", arg0)));
    }

    public boolean theMessageIsDisplayedInsideThePinMessagePopUp(String arg0) {
        withTimeoutOf(15, TimeUnit.SECONDS).waitFor(ExpectedConditions.visibilityOfElementLocated(By.xpath(LOCATORS.MESSAGE_NAME_INSIDE_THE_PIN_MESSAGE_POPUP.replace("$1", arg0))));
        return $(LOCATORS.MESSAGE_NAME_INSIDE_THE_PIN_MESSAGE_POPUP.replace("$1", arg0)).isPresent();
    }

    public void clickOnThePinButton() {
        withTimeoutOf(40, TimeUnit.SECONDS).waitFor(ExpectedConditions.visibilityOfElementLocated(By.xpath(LOCATORS.PIN_BUTTON)));
        evaluateJavascript("arguments[0].click();", $(LOCATORS.PIN_BUTTON));
    }

    public boolean pinnedSignIsDisplayedNearTheMessage(String arg0) {
        withTimeoutOf(15, TimeUnit.SECONDS).waitFor(ExpectedConditions.visibilityOfElementLocated(By.xpath(LOCATORS.PINNED_SIGN_NEAR_A_MESSAGE.replace("$1", arg0))));
        return $(LOCATORS.PINNED_SIGN_NEAR_A_MESSAGE.replace("$1", arg0)).isPresent();
    }

    public void clickOnThePinButtonOfDirect(String arg0) {
        withTimeoutOf(40, TimeUnit.SECONDS).waitFor(ExpectedConditions.visibilityOfElementLocated(By.xpath(LOCATORS.PINNED_ITEMS_BUTTON_IN_THE_RIGHT_PANEL.replace("$1", arg0))));
        evaluateJavascript("arguments[0].click();", $(LOCATORS.PINNED_ITEMS_BUTTON_IN_THE_RIGHT_PANEL.replace("$1", arg0)));
    }

    public boolean theMessageIsDisplayedInThePinnedMessagesBlock(String arg0) {
        withTimeoutOf(15, TimeUnit.SECONDS).waitFor(ExpectedConditions.visibilityOfElementLocated(By.xpath(LOCATORS.MESSAGE_IN_THE_PINNED_ITEMS.replace("$1", arg0))));
        return $(LOCATORS.MESSAGE_IN_THE_PINNED_ITEMS.replace("$1", arg0)).isPresent();
    }

    public boolean openLinkIsDisplayedOnTheInTheRightPanel(String arg0) {
        withTimeoutOf(15, TimeUnit.SECONDS).waitFor(ExpectedConditions.visibilityOfElementLocated(By.xpath(LOCATORS.OPEN_LINK_ON_A_MESSAGE_IN_THE_RIGHT_PANEL.replace("$1", arg0))));
        return $(LOCATORS.OPEN_LINK_ON_A_MESSAGE_IN_THE_RIGHT_PANEL.replace("$1", arg0)).isPresent();
    }

    public void clickOnTheOpenLinkOnTheInTheRightPanel(String arg0) {
        withTimeoutOf(10, TimeUnit.SECONDS).waitFor(ExpectedConditions.visibilityOfElementLocated(By.xpath(LOCATORS.OPEN_LINK_ON_A_MESSAGE_IN_THE_RIGHT_PANEL.replace("$1", arg0))));
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("arguments[0].click();", findBy(LOCATORS.OPEN_LINK_ON_A_MESSAGE_IN_THE_RIGHT_PANEL.replace("$1", arg0)));


//        withTimeoutOf(10, TimeUnit.SECONDS).waitFor(ExpectedConditions.visibilityOfElementLocated(By.xpath(LOCATORS.OPEN_LINK_ON_A_MESSAGE_IN_THE_RIGHT_PANEL.replace("$1", arg0))));
//        evaluateJavascript("arguments[0].click();", $(LOCATORS.OPEN_LINK_ON_A_MESSAGE_IN_THE_RIGHT_PANEL.replace("$1", arg0)));
    }

    public boolean highlightIsDisplayedOnTheMessage(String arg0) {
        withTimeoutOf(15, TimeUnit.SECONDS).waitFor(ExpectedConditions.visibilityOfElementLocated(By.xpath(LOCATORS.PINNED_HIGHLIGHTED_MESSAGE_IN_THE_CENTRAL_CHAT_WINDOW.replace("$1", arg0))));
        return $(LOCATORS.PINNED_HIGHLIGHTED_MESSAGE_IN_THE_CENTRAL_CHAT_WINDOW.replace("$1", arg0)).isPresent();
    }

    public boolean fileIsDisplayedInTheDirect(String arg0) {
        withTimeoutOf(15, TimeUnit.SECONDS).waitFor(ExpectedConditions.visibilityOfElementLocated(By.xpath(LOCATORS.FILE_NAME_IN_THE_ROOM_AFTER_UPLOADING.replace("$1", arg0))));
        return $(LOCATORS.FILE_NAME_IN_THE_ROOM_AFTER_UPLOADING.replace("$1", arg0)).isPresent();
    }

    public void clickOnTheRightControlHamburgerOnTheMessage(String arg0) {
        waitABit(1000);
//        withTimeoutOf(20, TimeUnit.SECONDS).waitFor(ExpectedConditions.visibilityOfElementLocated(By.xpath(LOCATORS.RIGHT_CONTROL_HAMBURGER_ON_THE_MESSAGE.replace("$1", arg0))));
        evaluateJavascript("arguments[0].click();", $(LOCATORS.RIGHT_CONTROL_HAMBURGER_ON_THE_MESSAGE.replace("$1", arg0)));
//        withTimeoutOf(10, TimeUnit.SECONDS).waitFor(ExpectedConditions.visibilityOfElementLocated(By.xpath(LOCATORS.RIGHT_CONTROL_HAMBURGER_ON_THE_MESSAGE.replace("$1", arg0))));
//        JavascriptExecutor js = (JavascriptExecutor) getDriver();
//        js.executeScript("arguments[0].click();", findBy(LOCATORS.RIGHT_CONTROL_HAMBURGER_ON_THE_MESSAGE.replace("$1", arg0)));
    }

    public boolean messageMenuForTheFileIsDisplayed(String arg0) {
        withTimeoutOf(15, TimeUnit.SECONDS).waitFor(ExpectedConditions.visibilityOfElementLocated(By.xpath(LOCATORS.MESSAGE_MENU_FOR_FILE.replace("$1", arg0))));
        return $(LOCATORS.MESSAGE_MENU_FOR_FILE.replace("$1", arg0)).isPresent();
    }

    public void clickOnAPinToConversationLinkOnTheFileInTheMessageMenu(String arg0) {
        withTimeoutOf(20, TimeUnit.SECONDS).waitFor(ExpectedConditions.visibilityOfElementLocated(By.xpath(LOCATORS.PIN_TO_CONVERSATION_LINK_FOR_FILE.replace("$1", arg0))));
        evaluateJavascript("arguments[0].click();", $(LOCATORS.PIN_TO_CONVERSATION_LINK_FOR_FILE.replace("$1", arg0)));
    }

    public boolean theFileIsDisplayedInsideTheUnpinMessagePopUp(String arg0) {
        withTimeoutOf(15, TimeUnit.SECONDS).waitFor(ExpectedConditions.visibilityOfElementLocated(By.xpath(LOCATORS.FILE_NAME_INSIDE_THE_UNPIN_MESSAGE_POPUP.replace("$1", arg0))));
        return $(LOCATORS.FILE_NAME_INSIDE_THE_UNPIN_MESSAGE_POPUP.replace("$1", arg0)).isPresent();
    }

    public boolean pinnedSignIsDisplayedNearTheFile(String arg0) {
        withTimeoutOf(20, TimeUnit.SECONDS).waitFor(ExpectedConditions.visibilityOfElementLocated(By.xpath(LOCATORS.PINNED_SIGN_NEAR_A_FILE.replace("$1", arg0))));
        return $(LOCATORS.PINNED_SIGN_NEAR_A_FILE.replace("$1", arg0)).isPresent();
    }

    public boolean theFileIsDisplayedInThePinnedMessagesBlock(String arg0) {
        withTimeoutOf(20, TimeUnit.SECONDS).waitFor(ExpectedConditions.visibilityOfElementLocated(By.xpath(LOCATORS.FILE_NAME_IN_THE_PINNED_ITEMS.replace("$1", arg0))));
        return $(LOCATORS.FILE_NAME_IN_THE_PINNED_ITEMS.replace("$1", arg0)).isPresent();
    }

    public void scrollDownToFile(String arg0) {
        withTimeoutOf(20, TimeUnit.SECONDS).waitFor(ExpectedConditions.visibilityOfElementLocated(By.xpath(LOCATORS.FILE_NAME_IN_THE_ROOM_AFTER_UPLOADING.replace("$1", arg0))));
        ((JavascriptExecutor) getDriver()).executeScript("arguments[0].scrollIntoView(true);", findBy(LOCATORS.FILE_NAME_IN_THE_ROOM_AFTER_UPLOADING.replace("$1", arg0)));
        Actions actions = new Actions(getDriver());
        actions.moveToElement(findBy(LOCATORS.FILE_NAME_IN_THE_ROOM_AFTER_UPLOADING.replace("$1", arg0))).build().perform();
        }

    public void scrollDownToMessage(String arg0) {
        withTimeoutOf(20, TimeUnit.SECONDS).waitFor(ExpectedConditions.visibilityOfElementLocated(By.xpath(LOCATORS.THE_SENT_MESSAGE1_INSIDE_THE_ROOM.replace("$1", arg0))));
//        ((JavascriptExecutor) getDriver()).executeScript("arguments[0].scrollIntoView(true);", findBy(LOCATORS.THE_SENT_MESSAGE_INSIDE_THE_ROOM.replace("$1", arg0)));
        Actions actions = new Actions(getDriver());
        actions.moveToElement(findBy(LOCATORS.THE_SENT_MESSAGE1_INSIDE_THE_ROOM.replace("$1", arg0))).build().perform();
    }

    public void clickOnTheDownloadButtonUnderFileInThePinnedMessagesBlock(String arg0) {
        withTimeoutOf(20, TimeUnit.SECONDS).waitFor(ExpectedConditions.visibilityOfElementLocated(By.xpath(LOCATORS.DOWNLOAD_LINK_ON_A_FILE_IN_THE_RIGHT_PANEL.replace("$1", arg0))));
        evaluateJavascript("arguments[0].click();", $(LOCATORS.DOWNLOAD_LINK_ON_A_FILE_IN_THE_RIGHT_PANEL.replace("$1", arg0)));
    }

    public void navigateOnMessageBlock(String arg0) {
        Actions actions = new Actions(getDriver());
        actions.moveToElement(findBy(LOCATORS.MESSAGE_BLOCK_IN_THE_PINNED_ITEMS.replace("$1", arg0))).build().perform();
    }

    public void navigateOnFileBlock(String arg0) {
        Actions actions = new Actions(getDriver());
        actions.moveToElement(findBy(LOCATORS.FILE_BLOCK_IN_THE_PINNED_ITEMS.replace("$1", arg0))).build().perform();
    }

    public void clickOnAUnpinFromConversationLinkOnTheFileInTheMessageMenu(String arg0) {
        withTimeoutOf(20, TimeUnit.SECONDS).waitFor(ExpectedConditions.visibilityOfElementLocated(By.xpath(LOCATORS.PIN_TO_CONVERSATION_LINK_FOR_FILE.replace("$1", arg0))));
        evaluateJavascript("arguments[0].click();", $(LOCATORS.PIN_TO_CONVERSATION_LINK_FOR_FILE.replace("$1", arg0)));
    }

    public void clickOnTheUnpinButton() {
        withTimeoutOf(20, TimeUnit.SECONDS).waitFor(ExpectedConditions.visibilityOfElementLocated(By.xpath(LOCATORS.UNPIN_BUTTON)));
        evaluateJavascript("arguments[0].click();", $(LOCATORS.UNPIN_BUTTON));
    }

    public boolean pinnedSignIsnTDisplayedNearTheFile(String arg0) {
        try {
                System.out.println("wait that documents are invisible");
                withTimeoutOf(3, TimeUnit.SECONDS).waitFor(ExpectedConditions.invisibilityOfElementLocated(By.xpath(LOCATORS.PINNED_SIGN_NEAR_A_FILE.replace("$1", arg0))));
                System.out.println("Element is invisible");
            } catch (Exception e) {
                System.out.println("Element isn`t invisible");
            }
            try {
                System.out.println("check that documents are presented in the DOM");
                withTimeoutOf(1, TimeUnit.SECONDS).waitFor(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath(LOCATORS.PINNED_SIGN_NEAR_A_FILE.replace("$1", arg0))));
                System.out.println("documents are presented in the DOM");
                System.out.println("check that documents are visibility");
                withTimeoutOf(1, TimeUnit.SECONDS).waitFor(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(LOCATORS.PINNED_SIGN_NEAR_A_FILE.replace("$1", arg0))));
                System.out.println("documents are visibility");
                return false;
            } catch (Exception e) {
                return true;
            }
    }

    public boolean theFileIsDisplayedInsideThePinMessagePopUp(String arg0) {
        withTimeoutOf(15, TimeUnit.SECONDS).waitFor(ExpectedConditions.visibilityOfElementLocated(By.xpath(LOCATORS.FILE_NAME_INSIDE_THE_PIN_MESSAGE_POPUP.replace("$1", arg0))));
        return $(LOCATORS.FILE_NAME_INSIDE_THE_PIN_MESSAGE_POPUP.replace("$1", arg0)).isPresent();
    }

    public boolean unpinLinkIsDisplayedOnTheInTheRightPanel(String arg0) {
        withTimeoutOf(15, TimeUnit.SECONDS).waitFor(ExpectedConditions.visibilityOfElementLocated(By.xpath(LOCATORS.UNPIN_LINK_ON_A_MESSAGE_IN_THE_RIGHT_PANEL.replace("$1", arg0))));
        return $(LOCATORS.UNPIN_LINK_ON_A_MESSAGE_IN_THE_RIGHT_PANEL.replace("$1", arg0)).isPresent();
    }

    public void clickOnTheUnpinLinkOnTheInTheRightPanel(String arg0) {
        withTimeoutOf(20, TimeUnit.SECONDS).waitFor(ExpectedConditions.visibilityOfElementLocated(By.xpath(LOCATORS.UNPIN_LINK_ON_A_MESSAGE_IN_THE_RIGHT_PANEL.replace("$1", arg0))));
        evaluateJavascript("arguments[0].click();", $(LOCATORS.UNPIN_LINK_ON_A_MESSAGE_IN_THE_RIGHT_PANEL.replace("$1", arg0)));
    }

    public boolean pinnedSignIsnTDisplayedNearTheMessage(String arg0) {
        waitABit(1000);
        try {
            System.out.println("wait that documents are invisible");
            withTimeoutOf(6, TimeUnit.SECONDS).waitFor(ExpectedConditions.invisibilityOfElementLocated(By.xpath(LOCATORS.PINNED_SIGN_NEAR_A_MESSAGE.replace("$1", arg0))));
            System.out.println("Element is invisible");
        } catch (Exception e) {
            System.out.println("Element isn`t invisible");
        }
        try {
            System.out.println("check that documents are presented in the DOM");
            withTimeoutOf(1, TimeUnit.SECONDS).waitFor(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath(LOCATORS.PINNED_SIGN_NEAR_A_MESSAGE.replace("$1", arg0))));
            System.out.println("documents are presented in the DOM");
            System.out.println("check that documents are visibility");
            withTimeoutOf(1, TimeUnit.SECONDS).waitFor(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(LOCATORS.PINNED_SIGN_NEAR_A_MESSAGE.replace("$1", arg0))));
            System.out.println("documents are visibility");
            return false;
        } catch (Exception e) {
            return true;
        }
    }

    public boolean theMessageIsDisplayedInsideTheUnpinMessagePopUp(String arg0) {
        withTimeoutOf(15, TimeUnit.SECONDS).waitFor(ExpectedConditions.visibilityOfElementLocated(By.xpath(LOCATORS.MESSAGE_NAME_INSIDE_THE_UNPIN_MESSAGE_POPUP.replace("$1", arg0))));
        return $(LOCATORS.MESSAGE_NAME_INSIDE_THE_UNPIN_MESSAGE_POPUP.replace("$1", arg0)).isVisible();
    }

    public void clickOnTheFile(String arg0) {
        waitABit(2000);
//        withTimeoutOf(20, TimeUnit.SECONDS).waitFor(ExpectedConditions.visibilityOfElementLocated(By.xpath(LOCATORS.RIGHT_CONTROL_HAMBURGER_BUTTON_ON_THE_FILE.replace("$1", arg0))));
        evaluateJavascript("arguments[0].click();", $(LOCATORS.RIGHT_CONTROL_HAMBURGER_BUTTON_ON_THE_FILE.replace("$1", arg0)));
    }

    public void navigateOnThePinnedFile(String arg0) {
        waitABit(2000);
//        withTimeoutOf(20, TimeUnit.SECONDS).waitFor(ExpectedConditions.visibilityOfElementLocated(By.xpath(LOCATORS.PINNED_SIGN_NEAR_A_FILE.replace("$1", arg0))));
        Actions actions = new Actions(getDriver());
        actions.moveToElement(findBy(LOCATORS.PINNED_SIGN_NEAR_A_FILE.replace("$1", arg0))).build().perform();
        getDriver().findElements(By.xpath("//div[@class='chat-container active']//span[contains(text(),'maxresdefault_pin.jpg')]//ancestor::div[@class='message-main-container']//i[contains(text(),'more_vert')]"));
    }

    public boolean underTitleThereIsCounterDisplayed(String arg0, String arg1) {
        withTimeoutOf(60, TimeUnit.SECONDS).waitFor(ExpectedConditions.visibilityOfElementLocated(By.xpath(LOCATORS.COUNTER_UNDER_ITEMS_IN_THE_RIGHT_PANEL.replace("$1", arg0).replace("$2", arg1))));
        return $(LOCATORS.COUNTER_UNDER_ITEMS_IN_THE_RIGHT_PANEL.replace("$1", arg0).replace("$2", arg1)).isPresent();
    }

    public void clickOnAStarSignOnTheMessage(String arg0) {
        withTimeoutOf(20, TimeUnit.SECONDS).waitFor(ExpectedConditions.visibilityOfElementLocated(By.xpath(LOCATORS.HIDE_STAR_SIGN_NEAR_A_MESSAGE.replace("$1", arg0))));
        evaluateJavascript("arguments[0].click();", $(LOCATORS.HIDE_STAR_SIGN_NEAR_A_MESSAGE.replace("$1", arg0)));
    }

    public boolean starSignIsDisplayedNearTheMessage(String arg0) {
        withTimeoutOf(15, TimeUnit.SECONDS).waitFor(ExpectedConditions.visibilityOfElementLocated(By.xpath(LOCATORS.STAR_SIGN_NEAR_A_MESSAGE.replace("$1", arg0))));
        return $(LOCATORS.STAR_SIGN_NEAR_A_MESSAGE.replace("$1", arg0)).isPresent();
    }

    public void clickOnTheStarButtonOfDirect(String arg0) {
        withTimeoutOf(20, TimeUnit.SECONDS).waitFor(ExpectedConditions.visibilityOfElementLocated(By.xpath(LOCATORS.STARRED_ITEMS_BUTTON_IN_THE_RIGHT_PANEL.replace("$1", arg0))));
        evaluateJavascript("arguments[0].click();", $(LOCATORS.STARRED_ITEMS_BUTTON_IN_THE_RIGHT_PANEL.replace("$1", arg0)));
    }

    public boolean theMessageIsDisplayedInTheStarredMessagesBlock(String arg0) {
        withTimeoutOf(15, TimeUnit.SECONDS).waitFor(ExpectedConditions.visibilityOfElementLocated(By.xpath(LOCATORS.MESSAGE_IN_THE_STARRED_ITEMS.replace("$1", arg0))));
        return $(LOCATORS.MESSAGE_IN_THE_STARRED_ITEMS.replace("$1", arg0)).isPresent();
    }

    public void navigateOnMessageBlockInTheStarredMessageBlock(String arg0) {
        waitABit(3000);
        Actions actions = new Actions(getDriver());
        actions.moveToElement(findBy(LOCATORS.MESSAGE_BLOCK_IN_THE_STARRED_ITEMS.replace("$1", arg0))).build().perform();
    }

    public boolean openLinkIsDisplayedOnTheInTheRightPanelOnTheStarredMessageBlock(String arg0) {
        withTimeoutOf(15, TimeUnit.SECONDS).waitFor(ExpectedConditions.visibilityOfElementLocated(By.xpath(LOCATORS.OPEN_LINK_ON_A_MESSAGE_IN_THE_RIGHT_PANEL_ON_THE_STARRED_BLOCK.replace("$1", arg0))));
        return $(LOCATORS.OPEN_LINK_ON_A_MESSAGE_IN_THE_RIGHT_PANEL_ON_THE_STARRED_BLOCK.replace("$1", arg0)).isPresent();
    }

    public void clickOnTheOpenLinkOnTheInTheRightPanelOnTheStarredMessageBlock(String arg0) {
        withTimeoutOf(20, TimeUnit.SECONDS).waitFor(ExpectedConditions.visibilityOfElementLocated(By.xpath(LOCATORS.OPEN_LINK_ON_A_MESSAGE_IN_THE_RIGHT_PANEL_ON_THE_STARRED_BLOCK.replace("$1", arg0))));
        evaluateJavascript("arguments[0].click();", $(LOCATORS.OPEN_LINK_ON_A_MESSAGE_IN_THE_RIGHT_PANEL_ON_THE_STARRED_BLOCK.replace("$1", arg0)));
        waitABit(1000);
    }

    public boolean highlightIsDisplayedOnTheStarredMessage(String arg0) {
        return $(LOCATORS.STARRED_HIGHLIGHTED_MESSAGE_IN_THE_CENTRAL_CHAT_WINDOW.replace("$1", arg0)).isPresent();

//
// withTimeoutOf(20, TimeUnit.SECONDS).waitFor(ExpectedConditions.presenceOfElementLocated(By.xpath(LOCATORS.STARRED_HIGHLIGHTED_MESSAGE_IN_THE_CENTRAL_CHAT_WINDOW.replace("$1", arg0))));
//return getDriver().findElement(By.className("message highlight first is-stared-parent")).isDisplayed();
//       if($(LOCATORS.STARRED_HIGHLIGHTED_MESSAGE_IN_THE_CENTRAL_CHAT_WINDOW.replace("$1", arg0)).isPresent())
//            return true;
//        else {
//            evaluateJavascript("arguments[0].click();", $(LOCATORS.OPEN_LINK_ON_A_MESSAGE_IN_THE_RIGHT_PANEL_ON_THE_STARRED_BLOCK.replace("$1", arg0)));
//             return $(LOCATORS.STARRED_HIGHLIGHTED_MESSAGE_IN_THE_CENTRAL_CHAT_WINDOW.replace("$1", arg0)).isPresent();
//        }
    }

    public void clickOnAStarSignOnTheFile(String arg0) {
        withTimeoutOf(20, TimeUnit.SECONDS).waitFor(ExpectedConditions.visibilityOfElementLocated(By.xpath(LOCATORS.STAR_SIGN_NEAR_A_FILE.replace("$1", arg0))));
        evaluateJavascript("arguments[0].click();", $(LOCATORS.STAR_SIGN_NEAR_A_FILE.replace("$1", arg0)));
    }

    public boolean starSignIsDisplayedNearTheFile(String arg0) {
        waitABit(500);
//        withTimeoutOf(20, TimeUnit.SECONDS).waitFor(ExpectedConditions.visibilityOfElementLocated(By.xpath(LOCATORS.STAR_SIGN_NEAR_A_FILE.replace("$1", arg0))));
        return $(LOCATORS.STAR_SIGN_NEAR_A_FILE.replace("$1", arg0)).isPresent();
    }

    public boolean theFileIsDisplayedInTheStarredMessagesBlock(String arg0) {
        withTimeoutOf(20, TimeUnit.SECONDS).waitFor(ExpectedConditions.visibilityOfElementLocated(By.xpath(LOCATORS.FILE_IN_THE_STARRED_ITEMS.replace("$1", arg0))));
        return $(LOCATORS.FILE_IN_THE_STARRED_ITEMS.replace("$1", arg0)).isPresent();
    }

    public void navigateOnFileBlockInTheStarredMessagesBlock(String arg0) {
        Actions actions = new Actions(getDriver());
        actions.moveToElement(findBy(LOCATORS.FILE_BLOCK_IN_THE_STARRED_ITEMS.replace("$1", arg0))).build().perform();
    }

    public void clickOnTheDownloadButtonUnderFileInTheStarredMessagesBlock(String arg0) {
        withTimeoutOf(20, TimeUnit.SECONDS).waitFor(ExpectedConditions.visibilityOfElementLocated(By.xpath(LOCATORS.DOWNLOAD_LINK_ON_A_FILE_IN_THE_RIGHT_PANEL_ON_THE_STARRED_ITEMS.replace("$1", arg0))));
        evaluateJavascript("arguments[0].click();", $(LOCATORS.DOWNLOAD_LINK_ON_A_FILE_IN_THE_RIGHT_PANEL_ON_THE_STARRED_ITEMS.replace("$1", arg0)));
    }

    public boolean editedMarkIsDisplayedOnTheSnippet(String arg0) {
        withTimeoutOf(20, TimeUnit.SECONDS).waitFor(ExpectedConditions.visibilityOfElementLocated(By.xpath(LOCATORS.EDITED_MARK_ON_THE_SNIPPET.replace("$1", arg0))));
        return $(LOCATORS.EDITED_MARK_ON_THE_SNIPPET.replace("$1", arg0)).isPresent();
    }

    public boolean theRoomNameTitleInTheTopIsDisplayed(String arg0) {
        withTimeoutOf(20, TimeUnit.SECONDS).waitFor(ExpectedConditions.visibilityOfElementLocated(By.xpath(LOCATORS.ROOM_NAME_TITLE_IN_THE_TOP_OF_A_ROOM.replace("$1", arg0))));
        return $(LOCATORS.ROOM_NAME_TITLE_IN_THE_TOP_OF_A_ROOM.replace("$1", arg0)).isPresent();
    }

    public boolean theDescriptionInTheTopIsDisplayed(String arg0) {
        withTimeoutOf(20, TimeUnit.SECONDS).waitFor(ExpectedConditions.visibilityOfElementLocated(By.xpath(LOCATORS.DESCRIPTION_TITLE_IN_THE_TOP.replace("$1", arg0))));
        return $(LOCATORS.DESCRIPTION_TITLE_IN_THE_TOP.replace("$1", arg0)).isPresent();
    }

    public boolean starSignIsnTDisplayedNearTheMessage(String arg0) {
        withTimeoutOf(20, TimeUnit.SECONDS).waitFor(ExpectedConditions.visibilityOfElementLocated(By.xpath(LOCATORS.HIDE_STAR_SIGN_NEAR_A_MESSAGE.replace("$1", arg0))));
        return $(LOCATORS.HIDE_STAR_SIGN_NEAR_A_MESSAGE.replace("$1", arg0)).isPresent();
//        waitABit(1000);
//        try {
//            System.out.println("wait that documents are invisible");
//            withTimeoutOf(6, TimeUnit.SECONDS).waitFor(ExpectedConditions.invisibilityOfElementLocated(By.xpath(LOCATORS.STAR_SIGN_NEAR_A_MESSAGE.replace("$1", arg0))));
//            System.out.println("Element is invisible");
//        } catch (Exception e) {
//            System.out.println("Element isn`t invisible");
//        }
//        try {
//            System.out.println("check that documents are presented in the DOM");
//            withTimeoutOf(1, TimeUnit.SECONDS).waitFor(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath(LOCATORS.STAR_SIGN_NEAR_A_MESSAGE.replace("$1", arg0))));
//            System.out.println("documents are presented in the DOM");
//            System.out.println("check that documents are visibility");
//            withTimeoutOf(1, TimeUnit.SECONDS).waitFor(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(LOCATORS.STAR_SIGN_NEAR_A_MESSAGE.replace("$1", arg0))));
//            System.out.println("documents are visibility");
//            return false;
//        } catch (Exception e) {
//            return true;
//        }
    }

    public boolean starSignIsnTDisplayedNearTheFile(String arg0) {
        withTimeoutOf(20, TimeUnit.SECONDS).waitFor(ExpectedConditions.visibilityOfElementLocated(By.xpath(LOCATORS.HIDE_STAR_SIGN_NEAR_A_FILE.replace("$1", arg0))));
        return $(LOCATORS.HIDE_STAR_SIGN_NEAR_A_FILE.replace("$1", arg0)).isPresent();


//        waitABit(500);
//        try {
//            System.out.println("wait that documents are invisible");
//            withTimeoutOf(6, TimeUnit.SECONDS).waitFor(ExpectedConditions.invisibilityOfElementLocated(By.xpath(LOCATORS.HIDE_STAR_SIGN_NEAR_A_FILE.replace("$1", arg0))));
//            System.out.println("Element is invisible");
//        } catch (Exception e) {
//            System.out.println("Element isn`t invisible");
//        }
//        try {
//            System.out.println("check that documents are presented in the DOM");
//            withTimeoutOf(1, TimeUnit.SECONDS).waitFor(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath(LOCATORS.HIDE_STAR_SIGN_NEAR_A_FILE.replace("$1", arg0))));
//            System.out.println("documents are presented in the DOM");
//            System.out.println("check that documents are visibility");
//            withTimeoutOf(1, TimeUnit.SECONDS).waitFor(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(LOCATORS.HIDE_STAR_SIGN_NEAR_A_FILE.replace("$1", arg0))));
//            System.out.println("documents are visibility");
//            return false;
//        } catch (Exception e) {
//            return true;
//        }
    }

    public boolean theStickerButtonIsDisplayed() {
        withTimeoutOf(20, TimeUnit.SECONDS).waitFor(ExpectedConditions.visibilityOfElementLocated(By.xpath(LOCATORS.STICKER_BUTTON)));
        return $(LOCATORS.STICKER_BUTTON).isPresent();
    }

    public void clickOnTheStickerButton() {
        withTimeoutOf(20, TimeUnit.SECONDS).waitFor(ExpectedConditions.visibilityOfElementLocated(By.xpath(LOCATORS.STICKER_BUTTON)));
        evaluateJavascript("arguments[0].click();", $(LOCATORS.STICKER_BUTTON));
    }

    public boolean theStickerSearchInputInsideOpenedPopupIsDisplayed() {
        withTimeoutOf(20, TimeUnit.SECONDS).waitFor(ExpectedConditions.visibilityOfElementLocated(By.xpath(LOCATORS.STICKER_SEARCH_INPUT)));
        return $(LOCATORS.STICKER_SEARCH_INPUT).isPresent();
    }

    public void clickOnTheManageStickersButton() {
        withTimeoutOf(20, TimeUnit.SECONDS).waitFor(ExpectedConditions.visibilityOfElementLocated(By.xpath(LOCATORS.MANAGE_STICKERS_BUTTON)));
        evaluateJavascript("arguments[0].click();", $(LOCATORS.MANAGE_STICKERS_BUTTON));
    }

    public boolean addStickersTitleInPopupIsDisplayed() {
        withTimeoutOf(20, TimeUnit.SECONDS).waitFor(ExpectedConditions.visibilityOfElementLocated(By.xpath(LOCATORS.ADD_STICKERS_TITLE)));
        return $(LOCATORS.ADD_STICKERS_TITLE).isPresent();
    }

    public void clickOnTheCreatePackButton() {
        withTimeoutOf(20, TimeUnit.SECONDS).waitFor(ExpectedConditions.visibilityOfElementLocated(By.xpath(LOCATORS.CREATE_PACK_BUTTON)));
        evaluateJavascript("arguments[0].click();", $(LOCATORS.CREATE_PACK_BUTTON));
    }

    public void clickOnTheRoomHeaderInTheLeftPanel() {
        waitABit(2000);
//        withTimeoutOf(20, TimeUnit.SECONDS).waitFor(ExpectedConditions.visibilityOfElementLocated(By.xpath(LOCATORS.ROOM_HEADER_LINK)));
        evaluateJavascript("arguments[0].click();", $(LOCATORS.ROOM_HEADER_LINK));
    }

    public boolean modalIsDisplayed(String arg0) {
        withTimeoutOf(10, TimeUnit.SECONDS).waitFor(ExpectedConditions.presenceOfElementLocated(By.xpath(LOCATORS.MODAL_TYPE.replace("$1", arg0))));
        return $(LOCATORS.MODAL_TYPE.replace("$1", arg0)).isPresent();
    }

    public boolean theIsDisplayedInTheListOfUsers(String arg0) {
        withTimeoutOf(10, TimeUnit.SECONDS).waitFor(ExpectedConditions.presenceOfElementLocated(By.xpath(LOCATORS.USER_NAME_IN_THE_USERS_LIST.replace("$1", arg0))));
        return $(LOCATORS.USER_NAME_IN_THE_USERS_LIST.replace("$1", arg0)).isPresent();
    }

    public void clickTheNameInTheListOfUsers(String arg0) {
        withTimeoutOf(10, TimeUnit.SECONDS).waitFor(ExpectedConditions.visibilityOfElementLocated(By.xpath(LOCATORS.USER_NAME_IN_THE_USERS_LIST.replace("$1", arg0))));
        evaluateJavascript("arguments[0].click();", $(LOCATORS.USER_NAME_IN_THE_USERS_LIST.replace("$1", arg0)));
    }

    public void clearDataInTheInputRoomNameField(String arg0) {
        waitABit(500);
        $(LOCATORS.ROOM_NAME_INPUT_FIELD_ACTIVE.replace("$1", arg0)).clear();
    }

    public boolean inputDescriptionFieldWithIsDisplayed(String arg0) {
        withTimeoutOf(15, TimeUnit.SECONDS).waitFor(ExpectedConditions.visibilityOfElementLocated(By.xpath(LOCATORS.DESCRIPTION_INPUT_FIELD.replace("$1", arg0))));
        return $(LOCATORS.DESCRIPTION_INPUT_FIELD.replace("$1", arg0)).isPresent();
    }

    public void clearDataInTheInputDescriptionFieldWith(String arg0) {
        $(LOCATORS.DESCRIPTION_INPUT_FIELD.replace("$1", arg0)).clear();
        waitABit(3000);
    }

    public boolean messageIsEdited(String arg0) {
        withTimeoutOf(10, TimeUnit.SECONDS).waitFor(ExpectedConditions.presenceOfElementLocated(By.xpath(LOCATORS.THE_EDITED_MESSAGE_INSIDE_THE_ROOM.replace("$1", arg0))));
        return $(LOCATORS.THE_EDITED_MESSAGE_INSIDE_THE_ROOM.replace("$1", arg0)).isPresent();
    }

    public void enterInThePhoneNumberInputField(String arg0) {
        $(LOCATORS.PHONE_NUMBER_INPUT_FIELD).sendKeys(arg0);
        waitABit(5000);
    }

    public void clickOnTheFormatsOfPhonesNumberMenu(String arg0) {
        Select dropdown = new Select($(LOCATORS.FORMATS_OF_PHONES_NUMBERS_MENU));
        dropdown.selectByValue(arg0);
//        dropdown.select
    }

    public boolean isDisplayedInThePhoneNumberInputField(String arg0) {
        withTimeoutOf(15, TimeUnit.SECONDS).waitFor(ExpectedConditions.visibilityOfElementLocated(By.xpath(LOCATORS.PHONE_NUMBER_INPUT_FIELD_WITH_COUNTRY_CODE.replace("$1", arg0))));
        return $(LOCATORS.PHONE_NUMBER_INPUT_FIELD_WITH_COUNTRY_CODE.replace("$1", arg0)).isPresent();
    }

    public void clickOnTheSaveChangesButton() {
        withTimeoutOf(20, TimeUnit.SECONDS).waitFor(ExpectedConditions.visibilityOfElementLocated(By.xpath(LOCATORS.SAVE_CHANGES_BUTTON)));
        evaluateJavascript("arguments[0].click();", $(LOCATORS.SAVE_CHANGES_BUTTON));
    }

    public boolean thePhoneNumberInputFieldIsCorrect(String arg0) {
        withTimeoutOf(15, TimeUnit.SECONDS).waitFor(ExpectedConditions.visibilityOfElementLocated(By.xpath(LOCATORS.PHONE_NUMBER_INPUT_FIELD_WITH_COUNTRY_CODE.replace("$1", arg0))));
        return $(LOCATORS.PHONE_NUMBER_INPUT_FIELD_WITH_COUNTRY_CODE.replace("$1", arg0)).isPresent();
    }

    public void clearDataInThePhoneNumberInputField() {
        waitABit(500);
        $(LOCATORS.PHONE_NUMBER_INPUT_FIELD).clear();
    }

    public void clickOnTheInputMessageField() {
        withTimeoutOf(20, TimeUnit.SECONDS).waitFor(ExpectedConditions.visibilityOfElementLocated(By.xpath(LOCATORS.INPUT_MESSAGE_FIELD_WITHOUT_ARG)));
        evaluateJavascript("arguments[0].click();", $(LOCATORS.INPUT_MESSAGE_FIELD_WITHOUT_ARG));
    }
}


