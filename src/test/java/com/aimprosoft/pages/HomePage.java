package com.aimprosoft.pages;

import net.serenitybdd.core.Serenity;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.interactions.Actions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.aimprosoft.LOCATORS;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.concurrent.TimeUnit;

@DefaultUrl("https://chat-stage.aimprosoft.com/index.html")

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
        withTimeoutOf(15, TimeUnit.SECONDS).waitFor(ExpectedConditions.visibilityOfElementLocated(By.xpath(LOCATORS.INPUT_FIELD_WITH_LABEL.replace("$1", arg1))));
        Actions actions = new Actions(getDriver());
        actions.moveToElement(find(By.xpath(LOCATORS.INPUT_FIELD_WITH_LABEL.replace("$1", arg1))));
        actions.click();
        actions.sendKeys(arg0);
        actions.build().perform();
        Serenity.getCurrentSession().put(arg1, arg0);
    }

    public void choosePublicRoomCheckbox() {
        $(LOCATORS.PUBLIC_ROOM_TYPE_CHECKBOX).click();
        Serenity.getCurrentSession().put("Public Room", true);
    }

    public void enterInTheInviteMembersField(String superadmin) {
        $(LOCATORS.INVITE_MEMBERS_INPUT_FIELD).sendKeys(superadmin);
    }

    public void enterInTheTextareaField(String arg0, String arg1) {
        withTimeoutOf(15, TimeUnit.SECONDS).waitFor(ExpectedConditions.visibilityOfElementLocated(By.xpath(LOCATORS.TEXTAREA_FIELD_WITH_LABEL.replace("$1", arg1))));
        Actions actions = new Actions(getDriver());
        actions.moveToElement(find(By.xpath(LOCATORS.TEXTAREA_FIELD_WITH_LABEL.replace("$1", arg1))));
        actions.click();
        actions.sendKeys(arg0);
        actions.build().perform();
        Serenity.getCurrentSession().put(arg1, arg0);
    }

    public void clickOnOKButton() {
        $(LOCATORS.OK_BUTTON).click();
    }

    public boolean theRoomIsCreated(String arg0) {
        withTimeoutOf(15, TimeUnit.SECONDS).waitFor(ExpectedConditions.visibilityOfElementLocated(By.xpath(LOCATORS.ROOM_NAME_IN_THE_LEFT_PANEL.replace("$1", arg0))));
        return $(LOCATORS.ROOM_NAME_IN_THE_LEFT_PANEL.replace("$1", arg0)).isPresent();
    }

    public void clickOnRoomInTheLeftPanel(String arg0) {
        $(LOCATORS.ROOM_NAME_IN_THE_LEFT_PANEL.replace("$1", arg0)).click();
    }

    public boolean theTitleIsDisplayedInTheHeader(String arg0) {
        withTimeoutOf(15, TimeUnit.SECONDS).waitFor(ExpectedConditions.visibilityOfElementLocated(By.xpath(LOCATORS.ROOM_TITLE_NAME_IN_THE_HEADER.replace("$1", arg0))));
        return $(LOCATORS.ROOM_TITLE_NAME_IN_THE_HEADER.replace("$1", arg0)).isPresent();
    }

    public void clickOnTheAboutChannelButtonOfRoom(String arg0) {
//        withTimeoutOf(15, TimeUnit.SECONDS).waitFor(ExpectedConditions.visibilityOfElementLocated(By.xpath(LOCATORS.ROOM_NAME_IN_THE_LEFT_PANEL.replace("$1", arg0))));
        $(LOCATORS.ABOUT_CHANNEL_BUTTON.replace("$1", arg0)).click();
    }
}
