package com.aimprosoft;

public interface LOCATORS {

//TODO======================================================SignInPage========================================================

String EMAIL_FIELD = "//div[@class='tab-pane active fade in']//input[@placeholder='Email']";
String EMAIL_FIELD_PROD_LDAP = "//div[@class='tab-pane active fade in']//input[@placeholder='Login']";
String PASSWORD_FIELD = "//div[@class='tab-pane active fade in']//input[@placeholder='Password']";
String SIGNINBUTTON = "//button[.='Sign In']";
String LDAP_SIGNINBUTTON = "//button[.='LDAP Sign In']";
String STANDARD_TAB = "//a[@id='login-type-tab-2']";

//TODO======================================================HomePage==========================================================

String AIMPROSOFT_LOGO = "//div[@class='team-name'][contains(text(),'Aimprosoft')]";
String THE_CURRENT_AUTHORIZED_USER_NAME_IN_THE_LEFT_PANEL = "//p[@class='username'][contains(text(),'$1')]";
String PLUS_LINK = "//a[@class='add-room-button']/i[contains(@class,\"material-icons 21 md-dark\")]";
String ROOM_TITLE_IN_POPUP = "//div[@class='modal-header']/h4[@class='modal-title'][contains(text(),'Add Room')]";
String INPUT_FIELD_WITH_LABEL = "//div[contains(label,'$1')]//input";
String PUBLIC_ROOM_TYPE_CHECKBOX = "//input[@name='type'][@value='public']";
String INVITE_MEMBERS_INPUT_FIELD = "//input[@class='sc-form-control']";
String TEXTAREA_FIELD_WITH_LABEL = "//div[contains(label,'$1')]//textarea";
String ADD_BUTTON = "//button[.='Add']";
String ROOM_NAME_IN_THE_LEFT_PANEL = "//a[@class='room-link']/span[@class='ccss'][contains(text(),'$1')]";
String ROOM_TITLE_NAME_IN_THE_HEADER = "//div[@class='channel-name room-public'][contains(text(),'$1')]";
String SETTINGS_BUTTON_IN_THE_RIGHT_PANEL = "//div[@class='channel-name room-public'][contains(text(),'$1')]//ancestor::div[@class='b-chat-top']//div[@class='right-control-panel']//i[contains(@class,'material-icons 32 md-dark')][contains(text(),'settings')]";
String CHANNEL_DETAILS_LINK = "//div[@class='chat-container active']//div[@class='channel-name room-public'][contains(text(),'$1')]//ancestor::div[@class='b-chat-top with-panel']//div[@class='layout-content']//span[contains(text(),'Channel Details:')]";
String ROOM_NAME_IN_THE_CHANNEL_DETAILS_BLOCK = "//div[@class='chat-container active']//div[@class='dropdown-panel show-panel']//div[@class='change-room-name']//div[contains(text(),'$1')]";
String EDIT_ROOM_NAME_LINK = "(//span[@class='edit-description-link']/a[contains(text(),'Edit')]//ancestor::div[@class='change-room-name']//span[@class='edit-description-link']/a[contains(text(),'Edit')])[1]";
String ROOM_NAME_INPUT_FIELD = "(//div[@class='field-value']/input[@class='form-control'])[$1]";
String ROOM_NAME_INPUT_FIELD_ACTIVE = "(//div[@class='field-value']/input[@class='form-control'])[1]";
String SAVE_BUTTON_BELOW_THE_ROOM_NAME_INPUT_FIELD = "//div[@class='button-group']/button[@class='btn btn-success done-button'][contains(text(),'Save')]";
String EDIT_DESCRIPTION_LINK = "(//div[@class='channel-name room-public'][contains(text(),'$1')]//ancestor::div[@class='chat-container active']//span[@class='edit-description-link']/a[contains(text(),'Edit')])[2]";
String DESCRIPTION_INPUT_FIELD = "//div[@class='chat-container active']//textarea[@class='form-control']";
String DONE_BUTTON = "//div[@class='chat-container active']//button[.='Done']";
String DESCRIPTION_TITLE_IN_THE_CHANNEL_DETAILS_BLOCK = "//div[@class='description-text']/span[@class='LinkifyPlus'][contains(text(),'$1')]";
String DESCRIPTION_TITLE_IN_THE_HEADER = "//ul[@class='b-chat-header-text nav navbar-nav']//span[@class='description'][contains(text(),'$1')]";
String WHEEL_LINK_IN_THE_HEADER = "//a[@class='dropdown-toggle']/i[@class='glyphicon glyphicon-cog']";
String DELETE_ROOM_LINK = "//ul[@class='dropdown-menu']/li/a[contains(text(),'Delete Room')]";
String DELETE_ROOM_TITLE_IN_THE_DELETE_ROOM_POPUP = "//h4[@class='modal-title'][contains(text(),'Delete Room')]";
String DELETE_BUTTON = "//button[.='Delete']";
String DIRECT_MESSAGES_LINK = "//h2[@class='channel-header']/a[contains(text(),'Direct')]";
String DIRECT_ROOMS_TITLE_IN_THE_DIRECT_ROOMS_POPUP = "//h4[.='Start Direct']";
String SEARCH_INPUT_FIELD_IN_THE_DIRECT_ROOMS_POPUP = "//div[@class='modal-header']//input[@class='form-control shadowed'][@placeholder='Search members']";
String USER_NAME_IN_THE_USERS_LIST_FROM_THE_DIRECT_ROOMS_POPUP = "//span[@class='room-item']/span[@class='username-text'][contains(text(),'$1')]";
String USER_NAME_IN_THE_LEFT_PANEL = "//a[@class='room-link']/span[@class='ccss'][contains(text(),'$1')]";
String USER_NAME_IN_THE_HEADER = "//div[@class='channel-name room-direct'][contains(text(),'$1')]";
String INPUT_MESSAGE_FIELD = "//div[@class='chat-container active']//textarea[@id='input-text-field'][@placeholder='Type message here']";
String THE_SENT_MESSAGE_INSIDE_THE_ROOM = "//div[@class='chat-container active']//span[@class='LinkifyPlus'][contains(text(),'$1')]";
String RIGHT_CONTROL_HAMBURGER_ON_THE_MESSAGE = "//div[@class='backlight']//span[@class='LinkifyPlus'][contains(text(), '$1')]//ancestor::div[@class='chat-container active']//span[@id='right-control-hamburger']";
String MESSAGE_MENU = "//div[@class='chat-container active']//ul[@id='message-menu-menu'][@aria-labelledby='message-menu']";
String EDIT_MESSAGE_LINK_IN_THE_MESSAGE_MENU = "//div[@class='chat-container active']//a[@role='menuitem'][contains(text(), '$1')]";
String COMMENT_UNDER_MESSAGE = "//div[@class='chat-container active']//span[@class='was-edited'][contains(text(), '$1')]";
String DELETE_MESSAGE_LINK_IN_THE_MESSAGE_MENU = "//div[@class='chat-container active']//a[@role='menuitem']//span[@class='text-danger'][.='Delete Message']";
String DELETE_MESSAGE_TITLE_IN_THE_DELETE_MESSAGE_POPUP = "//div[@class='modal-header']/h4[@class='modal-title'][.='Delete Message']";
String DELETE_THIS_MESSAGE_BUTTON = "//button[.='Delete']";
String DELETE_SIGN_NEAR_USER_NAME_IN_THE_LEFT_PANEL = "//a[@class='room-link']/span[@class='ccss'][contains(text(),'$1')]//ancestor::li//a[@class='remove-button']";
String CLIP_BUTTON = "//div[@class='chat-container active']//div[@class='button-input']/i[contains(text(),'attach_file')]";
String UPLOAD_BUTTON = "//div[@class='chat-container active']//label[@class='uploadFile']/i[contains(@class,'material-icons md-24 md')]";
String UPLOAD_FILE_TITLE_IN_THE_UPLOAD_POPUP = "//h4[@class='modal-title'][.='Upload file']";
//   //tr[descendant::a[contains(text(),'$1')]]//div[@data-field='retailPrice']
String UPLOAD_BUTTON_IN_THE_UPLOAD_POPUP = "//div[@class='modal-footer']/button[@class='btn btn-success'][contains(text(),'Upload')]";
String FILE_NAME_IN_THE_ROOM_AFTER_UPLOADING = "//div[@class='chat-container active']//div[@class='file-name']/span[@class='file-name-text'][contains(text(),'$1')]";
String DOWNLOAD_BUTTON_UNDER_FILE_NAME = "//div[@class='chat-container active']//div[@class='file-name']/span[@class='file-name-text'][contains(text(),'$1')]//ancestor::div[@class='file-container']/div[@class='file-msg-controls']/button/span/a[@title='Download']/i[contains(@class,'material-icons md-24 md-dark')]";
//   ////div[descendant::div[contains(text(),'maxresdefault.txt')] and @class='file-container']//button[@class='btn btn-success file-download']
String FAVORITE_ROOM_BUTTON = "//div[@class='chat-container active']//i[@class='favorite-button settings-gliph glyphicon glyphicon-star-empty']";
String FAVORITE_ROOM_NAME_IN_THE_LEFT_PANEL = "//div[descendant::h2[contains(text(),'Favorites')] and @class='channel-section']//span[text()='$1']";
String UNFAVORITE_ROOM_BUTTON = "//div[@class='chat-container active']//i[@class='favorite-button settings-gliph glyphicon glyphicon-star']";
String PUBLIC_ROOM_NAME_IN_THE_LEFT_PANEL = "//div[descendant::a[contains(text(),'Rooms')] and @class='channel-section']//span[text()='$1']";
String USER_FROM_THE_LIST = "//div[@class='modal-body']/div[@class='invite']//div[@class='ue ue-username ue-username-person']";
String PROGRESS_BAR_IN_THE_UPLOAD_POPUP = "//div[@class='progress-bar active progress-bar-striped'][@role='progressbar']";
String USER_PROFILE_LINK = "//div[@class='info']/p[@class='username'][contains(text(),'$1')]";
String USER_MENU_WITH_ACTIONS = "//div[@id='user-menu']/ul[@id='user-menu-menu']";
String PROFILE_LINK_INSIDE_USER_MENU = "//a[@role='menuitem']/span/i[@class='material-icons 24 md-dark '][contains(text(),'person_outline')]";
String PROFILE_TITLE_IN_THE_PROFILE_PAGE = "//div[@class='header-settings-title'][contains(text(),'Profile')]";
String CHANGE_AVATAR_BUTTON = "//label[@for='avatarFile'][contains(text(),'Change avatar')]";
String SAVE_BUTTON_ON_THE_CHANGE_AVATAR_PAGE = "//button[@class='btn, btn-info abtn btn btn-default'][@type='button'][contains(text(),'Save')]";
String SAVE_BUTTON_ON_THE_PROFILE_PAGE = "//button[@class='btn btn-default'][@type='button'][contains(text(),'Save')]";
String STATUS_AFTER_SAVING_FIELDS = "//div[@class='statusSucces'][contains(text(),'Profile successfully updated')]";
String ARROW_BACK = "//i[contains(text(),'arrow_back')]";
String USER_NAME_AFTER_UPDATING_PROFILE = "//div[@class='info']/p[contains(text(),'$1')]";
String DRAFT_SIGN_NEAR_USER_NAME = "//span[@class='ccss'][contains(text(),'$1')]//ancestor::a[@class='room-link']/i[contains(text(),'create')]";
String INPUT_FIELD_INSIDE_A_ROOM = "//div[@class='input-text']/textarea[@id='input-text-field'][@placeholder='Type message here']";
String TITLE_NAME_OF_A_PANEL = "//div[@class='suggestions-header']/span[contains(text(),'$1')]";
String CREATE_SNIPPET_LINK = "//div[@class='chat-container active']//label[@class='createSnippet']/i[contains(@class,'material-icons md-24 md')]";
}