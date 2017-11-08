package com.aimprosoft;

public interface LOCATORS {

//TODO======================================================SignInPage========================================================

String EMAIL_FIELD = "//div[@class='tab-pane active fade in']//input[@placeholder='Email']";
String PASSWORD_FIELD = "//div[@class='tab-pane active fade in']//input[@placeholder='Password']";
String SIGNINBUTTON = "//button[.='Sign In']";
String STANDARD_TAB = "//a[@id='login-type-tab-2']";

//TODO======================================================HomePage==========================================================

String AIMPROSOFT_LOGO = "//span[@class='logo']";
String THE_CURRENT_AUTHORIZED_USER_NAME_IN_THE_LEFT_PANEL = "//p[@class='username'][contains(text(),'$1')]";
String PLUS_LINK = "//a[@class='add-room-button']/i[@class='glyphicon glyphicon-plus']";
String ROOM_TITLE_IN_POPUP = "//div[@class='modal-header']/h4[@class='modal-title'][contains(text(),'Add Room')]";
String INPUT_FIELD_WITH_LABEL = "//div[contains(label,'$1')]//input";
String PUBLIC_ROOM_TYPE_CHECKBOX = "//input[@name='type'][@value='public']";
String INVITE_MEMBERS_INPUT_FIELD = "//input[@class='sc-form-control']";
String TEXTAREA_FIELD_WITH_LABEL = "//div[contains(label,'$1')]//textarea";
String ADD_BUTTON = "//button[.='Add']";
String ROOM_NAME_IN_THE_LEFT_PANEL = "//a[@class='room-link']/span[@class='ccss'][contains(text(),'$1')]";
String ROOM_TITLE_NAME_IN_THE_HEADER = "//div[@class='channel-name room-public'][contains(text(),'$1')]";
String ABOUT_CHANNEL_BUTTON = "//div[@class='channel-name room-public'][contains(text(),'$1')]//ancestor::div[@class='container']//span[@class='glyphicon glyphicon-info-sign settings-gliph']";
String CHANNEL_DETAILS_LINK = "//div[@class='chat-container active']//div[@class='channel-name room-public'][contains(text(),'$1')]//ancestor::div[@class='b-chat-top with-panel']//div[@class='layout-content']//span[contains(text(),'Channel Details:')]";
String ROOM_NAME_IN_THE_CHANNEL_DETAILS_BLOCK = "//div[@class='dropdown-panel show-panel']//div[@class='change-room-name']//div[contains(text(),'$1')]";
String EDIT_ROOM_NAME_LINK = "//span[@class='edit-description-link']/a[contains(text(),'Edit')]//ancestor::div[@class='change-room-name']//span[@class='edit-description-link']/a[contains(text(),'Edit')]";
String ROOM_NAME_INPUT_FIELD = "(//div[@class='field-value']/input[@class='form-control'])[$1]";
String ROOM_NAME_INPUT_FIELD_ACTIVE = "(//div[@class='field-value']/input[@class='form-control'])[1]";
String SAVE_BUTTON_BELOW_THE_ROOM_NAME_INPUT_FIELD = "//div[@class='button-group']/button[@class='btn btn-success done-button'][contains(text(),'Save')]";
String EDIT_DESCRIPTION_LINK = "(//div[@class='channel-name room-public'][contains(text(),'test')]//ancestor::div[@class='chat-container active']//span[@class='edit-description-link']/a[contains(text(),'Edit')])[2]";
String DESCRIPTION_INPUT_FIELD = "//div[@class='chat-container active']//textarea[@class='form-control']";
String DONE_BUTTON = "//div[@class='chat-container active']//button[.='Done']";
String DESCRIPTION_TITLE_IN_THE_CHANNEL_DETAILS_BLOCK = "//div[@class='description-text']/span[@class='LinkifyPlus'][contains(text(),'$1')]";
String DESCRIPTION_TITLE_IN_THE_HEADER = "//ul[@class='b-chat-header-text nav navbar-nav']//span[@class='description'][contains(text(),'$1')]";
String WHEEL_LINK_IN_THE_HEADER = "//a[@class='dropdown-toggle']/i[@class='glyphicon glyphicon-cog']";
String DELETE_ROOM_LINK = "//ul[@class='dropdown-menu']/li/a[contains(text(),'Delete Room')]";
String DELETE_ROOM_TITLE_IN_THE_DELETE_ROOM_POPUP = "//h4[@class='modal-title'][contains(text(),'Delete Room #')]";
String DELETE_BUTTON = "//button[.='Delete']";
String DIRECT_MESSAGES_LINK = "//h2[@class='channel-header']/a[contains(text(),'Direct Messages')]";
String DIRECT_ROOMS_TITLE_IN_THE_DIRECT_ROOMS_POPUP = "//h4[.='Direct rooms']";
String SEARCH_INPUT_FIELD_IN_THE_DIRECT_ROOMS_POPUP = "//div[@class='modal-header']//input[@class='form-control'][@placeholder='search']";
String USER_NAME_IN_THE_USERS_LIST_FROM_THE_DIRECT_ROOMS_POPUP = "//span[@class='username-item']/span[@class='username-text'][contains(text(),'$1')]";
String USER_NAME_IN_THE_LEFT_PANEL = "//a[@class='room-link']/span[@class='ccss'][contains(text(),'$1')]";
String USER_NAME_IN_THE_HEADER = "//div[@class='channel-name room-direct'][contains(text(),'$1')]";
String INPUT_MESSAGE_FIELD = "//div[@class='chat-container active']//textarea[@id='input-text-field'][@placeholder='Type message here']";
String THE_SENT_MESSAGE_INSIDE_THE_ROOM = "//div[@class='chat-container active']//span[@class='LinkifyPlus'][contains(text(),'$1')]";
String RIGHT_CONTROL_HAMBURGER_ON_THE_MESSAGE = "//div[@class='backlight']//span[@class='LinkifyPlus'][contains(text(), '$1')]//ancestor::div[@class='chat-container active']//span[@id='right-control-hamburger']";
String MESSAGE_MENU = "//div[@class='chat-container active']//ul[@id='message-menu-menu'][@aria-labelledby='message-menu']";
String EDIT_MESSAGE_LINK_IN_THE_MESSAGE_MENU = "//div[@class='chat-container active']//a[@role='menuitem'][contains(text(), '$1')]";
String COMMENT_UNDER_MESSAGE = "//div[@class='chat-container active']//span[@class='was-edited'][contains(text(), '$1')]";
String DELETE_MESSAGE_LINK_IN_THE_MESSAGE_MENU = "//div[@class='chat-container active']//a[@role='menuitem']//span[@class='glyphicon glyphicon-remove-sign']";
String DELETE_MESSAGE_TITLE_IN_THE_DELETE_MESSAGE_POPUP = "//div[@class='modal-header']/h4[@class='modal-title'][.='Delete Message']";
String DELETE_THIS_MESSAGE_BUTTON = "//button[.='Delete']";
String DELETE_SIGN_NEAR_USER_NAME_IN_THE_LEFT_PANEL = "//a[@class='room-link']/span[@class='ccss'][contains(text(),'$1')]//ancestor::li//i[@class='glyphicon glyphicon-remove-circle']";
String CLIP_BUTTON = "//div[@class='chat-container active']//div[@class='button-input']/i[contains(text(),'attach_file')]";
String UPLOAD_BUTTON = "//div[@class='chat-container active']//span[@class='glyphicon glyphicon-upload']";
String UPLOAD_FILE_TITLE_IN_THE_UPLOAD_POPUP = "//h4[@class='modal-title'][.='Upload file']";
//   //tr[descendant::a[contains(text(),'$1')]]//div[@data-field='retailPrice']
String UPLOAD_BUTTON_IN_THE_UPLOAD_POPUP = "//div[@class='modal-footer']/button[@class='btn btn-success'][.='Upload']";
String FILE_NAME_IN_THE_ROOM_AFTER_UPLOADING = "//div[@class='chat-container active']//div[@class='file-name'][contains(text(),'$1')]";
String DOWNLOAD_BUTTON_UNDER_FILE_NAME = "//div[@class='chat-container active']//div[@class='file-name'][contains(text(),'$1')]//following-sibling::button[@class='btn btn-success file-download'][contains(text(),'Download')]";
String FAVORITE_ROOM_BUTTON = "//div[@class='chat-container active']//i[@class='favorite-button settings-gliph glyphicon glyphicon-star-empty']";


}
