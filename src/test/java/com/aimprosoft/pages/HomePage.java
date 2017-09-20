package com.aimprosoft.pages;

import net.thucydides.core.annotations.DefaultUrl;
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
}
