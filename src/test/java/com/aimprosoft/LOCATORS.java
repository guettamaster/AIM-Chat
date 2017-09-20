package com.aimprosoft;

public interface LOCATORS {

//TODO======================================================SignInPage========================================================

String EMAIL_FIELD = "//div[@id='name-control']/input[@name='login']";
String PASSWORD_FIELD = "//div[@id='name-control']/input[@name='password']";
String SIGNINBUTTON = "//button[.='Sign In']";

//TODO======================================================HomePage==========================================================

String AIMPROSOFT_LOGO = "//span[@class='logo']";
String USER_NAME_IN_THE_LEFT_PANEL = "//p[@class='username'][contains(text(),'$1')]";

}
