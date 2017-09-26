package com.aimprosoft;

public interface LOCATORS {

//TODO======================================================SignInPage========================================================

String EMAIL_FIELD = "//div[@class='tab-pane active fade in']//input[@placeholder='Email']";
String PASSWORD_FIELD = "//div[@class='tab-pane active fade in']//input[@placeholder='Password']";
String SIGNINBUTTON = "//button[.='Sign In']";
String STANDARD_TAB = "//a[@id='login-type-tab-2']";

//TODO======================================================HomePage==========================================================

String AIMPROSOFT_LOGO = "//span[@class='logo']";
String USER_NAME_IN_THE_LEFT_PANEL = "//p[@class='username'][contains(text(),'$1')]";
String PLUS_LINK = "//a[@class='add-room-button']/i[@class='glyphicon glyphicon-plus']";
String ROOM_TITLE_IN_POPUP = "//div[@class='modal-header']/h4[@class='modal-title'][contains(text(),'Add Room')]";
String INPUT_FIELD_WITH_LABEL = "//div[contains(label,'$1')]//input";
String PUBLIC_ROOM_TYPE_CHECKBOX = "//input[@name='type'][@value='public']";
String INVITE_MEMBERS_INPUT_FIELD = "//div[@class='form-group'][2]/div[@class='dropdown']/div/input[@class='form-control']";
String TEXTAREA_FIELD_WITH_LABEL = "//div[contains(label,'$1')]//textarea";
String OK_BUTTON = "//button[.='OK']";
String ROOM_NAME_IN_THE_LEFT_PANEL = "//a[@class='room-link']/span[@class='ccss'][contains(text(),'$1')]";
String ROOM_TITLE_NAME_IN_THE_HEADER = "//div[@class='channel-name room-public'][contains(text(),'$1')]";
String ABOUT_CHANNEL_BUTTON = "//div[@class='channel-name room-public'][contains(text(),'$1')]//ancestor::div[@class='container']//span[@class='glyphicon glyphicon-info-sign settings-gliph']";
String CHANNEL_DETAILS_LINK = "//div[@class='chat-container active']//div[@class='channel-name room-public'][contains(text(),'$1')]//ancestor::div[@class='b-chat-top with-panel']//div[@class='layout-content']//span[contains(text(),'Channel Details:')]";
String ROOM_NAME_IN_THE_CHANNEL_DETAILS_BLOCK = "//div[@class='change-room-name']//div[contains(text(),'$1')]";








}
