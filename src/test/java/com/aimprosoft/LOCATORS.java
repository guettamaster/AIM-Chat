package com.aimprosoft;

public interface LOCATORS {

//TODO======================================================SignInPage========================================================

String EMAIL_FIELD = "//div[@id='name-control']/input[@name='login']";
String PASSWORD_FIELD = "//div[@id='name-control']/input[@name='password']";
String SIGNINBUTTON = "//button[.='Sign In']";

//TODO======================================================HomePage==========================================================

String AIMPROSOFT_LOGO = "//span[@class='logo']";
String USER_NAME_IN_THE_LEFT_PANEL = "//p[@class='username'][contains(text(),'$1')]";
String PLUS_LINK = "//a[@class='add-room-button']/i[@class='glyphicon glyphicon-plus']";
String ROOM_TITLE_IN_POPUP = "//div[@class='modal-header']/h4[@class='modal-title'][contains(text(),'Add Room')]";

}
