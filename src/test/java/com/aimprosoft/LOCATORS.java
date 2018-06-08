package com.aimprosoft;

public interface LOCATORS {

//TODO======================================================SignInPage========================================================

String EMAIL_FIELD = "//input[@class='form-control'][@placeholder='Login']";
String EMAIL_FIELD_PROD_LDAP = "//div[@class='tab-pane active fade in']//input[@placeholder='Login']";
String PASSWORD_FIELD = "//input[@class='form-control'][@placeholder='Password']";
String SIGNINBUTTON = "//button[.='Sign In']";
String LDAP_SIGNINBUTTON = "//button[.='LDAP Sign In']";
String STANDARD_TAB = "//button[contains(text(),'standard')]";

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
String ROOM_NAME_IN_THE_LEFT_PANEL = "//li[@role='presentation']//a[@class='room-link']//span[contains(text(), '$1')]";
String ROOM_TITLE_NAME_IN_THE_HEADER = "//div[@class='channel-name room-public'][contains(text(),'$1')]";
String SETTINGS_BUTTON_IN_THE_RIGHT_PANEL = "//div[@class='channel-name room-public'][contains(text(),'$1')]//ancestor::div[@class='file-drop-target']//i[@title='Settings']";
String CHANNEL_DETAILS_LINK = "//div[@class='chat-container active']//div[@class='channel-name room-public'][contains(text(),'$1')]//ancestor::div[@class='b-chat-top with-panel']//div[@class='layout-content']//span[contains(text(),'Channel Details:')]";
String ROOM_NAME_IN_THE_SETTINGS_BLOCK_IN_THE_RIGHT_BUTTON = "//div[@class='chat-container active']//div[@class='b-tab-content']//div[@class='field-value']/input[@value='$1']//ancestor::div[@class='b-tab-content']//span[@class='text'][contains(text(),'Room settings')]";
String EDIT_ROOM_NAME_LINK = "(//span[@class='edit-description-link']/a[contains(text(),'Edit')]//ancestor::div[@class='change-room-name']//span[@class='edit-description-link']/a[contains(text(),'Edit')])[1]";
String ROOM_NAME_INPUT_FIELD = "(//div[@class='field-value']/input[@class='form-control'])[$1]";
String ROOM_NAME_INPUT_FIELD_ACTIVE = "(//div[@class='field-value']/input[@class='form-control'][@value='$1'])[2]";
String SAVE_CHANGES_BUTTON_BELOW_THE_ROOM_NAME_INPUT_FIELD = "//div[@class='button-group']/button[@class='btn btn-success done-button'][contains(text(),'Save changes')]";
String EDIT_DESCRIPTION_LINK = "(//div[@class='channel-name room-public'][contains(text(),'$1')]//ancestor::div[@class='chat-container active']//span[@class='edit-description-link']/a[contains(text(),'Edit')])[2]";
String DESCRIPTION_INPUT_FIELD = "//div[@class='chat-container active']//textarea[@name='description']";
String DONE_BUTTON = "//div[@class='chat-container active']//button[.='Done']";
String DESCRIPTION_TITLE_IN_THE_CHANNEL_DETAILS_BLOCK = "//div[@class='description-text']/span[@class='LinkifyPlus'][contains(text(),'$1')]";
String DESCRIPTION_TITLE_IN_THE_HEADER = "//ul[@class='b-chat-header-text nav navbar-nav']//span[@class='description'][contains(text(),'$1')]";
String WHEEL_LINK_IN_THE_HEADER = "//a[@class='dropdown-toggle']/i[@class='glyphicon glyphicon-cog']";
String DELETE_ROOM_LINK = "//div[@class='chat-container active']//span[@class='delete-room one-user'][.='Delete Room']";
String DELETE_ROOM_TITLE_IN_THE_DELETE_ROOM_POPUP = "//span[@class='room-to-delete'][contains(text(),'$1')]";
String DELETE_BUTTON = "//button[.='Delete']";
String DIRECT_MESSAGES_LINK = "//h2[@class='channel-header']/a[contains(text(),'Direct')]";
String DIRECT_ROOMS_TITLE_IN_THE_DIRECT_ROOMS_POPUP = "//h4[.='Start Direct']";
String SEARCH_INPUT_FIELD_IN_THE_DIRECT_ROOMS_POPUP = "//div[@class='modal-header']//input[@class='form-control shadowed'][@placeholder='Search room']";
String USER_NAME_IN_THE_USERS_LIST_FROM_THE_DIRECT_ROOMS_POPUP = "//span[@class='room-item']//span[@class='username-text'][contains(text(),'$1')]";
String USER_NAME_IN_THE_LEFT_PANEL = "//li[@role='presentation']//a[@class='room-link']//span[contains(text(), '$1')]";
String USER_NAME_IN_THE_HEADER = "//div[@class='channel-name room-direct'][contains(text(),'$1')]";
String INPUT_MESSAGE_FIELD = "//div[@class='chat-container active']//textarea[@id='input-text-field'][@placeholder='Type message here']";
String THE_SENT_MESSAGE_INSIDE_THE_ROOM = "//div[@class='chat-container active']//span[@class='LinkifyPlus'][contains(text(),'$1')]";
String RIGHT_CONTROL_HAMBURGER_ON_THE_MESSAGE = "//div[@class='backlight']//span[@class='LinkifyPlus'][contains(text(), '$1')]//ancestor::div[@class='chat-container active']//span[@id='right-control-hamburger']";
String MESSAGE_MENU = "//div[@class='chat-container active']//ul[@id='message-menu-menu'][@aria-labelledby='message-menu']";
String EDIT_MESSAGE_LINK_IN_THE_MESSAGE_MENU = "//div[@class='chat-container active']//a[@role='menuitem'][contains(text(), '$1')]";
String COMMENT_UNDER_MESSAGE = "//div[@class='chat-container active']//div[@class='was-edited'][contains(text(), '$1')]";
String DELETE_MESSAGE_LINK_IN_THE_MESSAGE_MENU = "//div[@class='chat-container active']//a[@role='menuitem']//span[@class='text-danger'][.='Delete Message']";
String DELETE_MESSAGE_TITLE_IN_THE_DELETE_MESSAGE_POPUP = "//div[@class='modal-header']/h4[@class='modal-title'][.='Delete Message']";
String DELETE_THIS_MESSAGE_BUTTON = "//button[.='Delete']";
String DELETE_SIGN_NEAR_USER_NAME_IN_THE_LEFT_PANEL = "//a[@class='room-link']/span[contains(text(),'$1')]//ancestor::li//a[@class='remove-button']/i[contains(text(),'remove_circle')]";
String CLIP_BUTTON = "//div[@class='chat-container active']//div[@class='button-input']/i[contains(text(),'attach_file')]";
String UPLOAD_BUTTON = "//div[@class='chat-container active']//label[@class='uploadFile']/i[contains(@class,'material-icons md-24 md')]";
String UPLOAD_FILE_TITLE_IN_THE_UPLOAD_POPUP = "//h4[@class='modal-title'][.='Upload file']";
//   //tr[descendant::a[contains(text(),'$1')]]//div[@data-field='retailPrice']
String UPLOAD_BUTTON_IN_THE_UPLOAD_POPUP = "//div[@class='modal-footer']/button[@class='btn btn-success'][contains(text(),'Upload')]";
String FILE_NAME_IN_THE_ROOM_AFTER_UPLOADING = "//div[@class='chat-container active']//div[@class='file-name']/span[@class='file-name-text'][contains(text(),'$1')]";
String DOWNLOAD_BUTTON_UNDER_FILE_NAME = "//div[@class='chat-container active']//div[@class='file-name']/span[@class='file-name-text'][contains(text(),'$1')]//ancestor::div[@class='file-container']/div[@class='file-msg-controls']/button/span/a[@title='Download']/i[contains(@class,'material-icons md-24 md-dark')]";
//   ////div[descendant::div[contains(text(),'maxresdefault.txt')] and @class='file-container']//button[@class='btn btn-success file-download']
String FAVORITE_ROOM_BUTTON = "//a[@class='favorite-button']/i[contains(text(), 'star_border')]";
String FAVORITE_ROOM_NAME_IN_THE_LEFT_PANEL = "//div[descendant::h2[contains(text(),'Favorites')] and @class='channel-section']//span[text()='$1']";
String UNFAVORITE_ROOM_BUTTON = "//a[@class='favorite-button']/i[contains(text(), 'star')]";
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
String DRAFT_SIGN_NEAR_USER_NAME = "//span[contains(text(),'$1')]//ancestor::a[@class='room-link']/i[contains(text(),'create')]";
String INPUT_FIELD_INSIDE_A_ROOM = "//div[@class='input-text']/textarea[@id='input-text-field'][@placeholder='Type message here']";
String TITLE_NAME_OF_A_PANEL = "//div[@class='suggestions-header']/span[contains(text(),'$1')]";
String CREATE_SNIPPET_TITLE = "//h4[@class='modal-title'][contains(text(),'Create')]";
String CREATE_SNIPPET_LINK = "//label[@class='createSnippet']";
String TOAST_MESSAGE = "//div[@class='toast toast-success']/div[@class='toast-title'][contains(text(),'$1')]";
String SNIPPET_FILE_NAME_INPUT_FIELD = "//input[@class='snippetName form-control'][@placeholder='Enter file name (without extension)']";
String TEXTAREA_INPUT_FIELD_INSIDE_A_SNIPPET_POPUP = "//div[@id='brace-editor']/textarea[@class='ace_text-input']";
String CREATE_BUTTON_INSIDE_A_SNIPPET_POPUP = "//button[.='Create']";
String SNIPPET_NAME_IN_THE_CHAT = "//div[@class='file-name']/span[@class='file-name-text'][contains(text(),'$1')]";
String EDIT_SNIPPET_LINK = "//div[@class='file-name']/span[contains(text(),'$1')]//ancestor::div[@class='file-container']//i[contains(text(),'edit_mode')]";
String EDIT_SNIPPET_TITLE = "//h4[@class='modal-title'][contains(text(),'Edit')]";
String PROGRAMMING_LANGUAGE_ARROW = "//label[contains(text(),'Programming Language')]/following-sibling::div//i[@class='fa fa-caret-down']";
String THEME_ARROW = "//label[contains(text(),'Theme')]/following-sibling::div//i[@class='fa fa-caret-down']";
String OPTION_FROM_THE_PROGRAMMING_LANGUAGE_DROP_DOWN_LIST = "//ul[@id='snippet-mode-dropdown-menu']/li/a[contains(text(),'$1')]";
String PROGRAMMING_LANGUAGE_DROP_DOWN_LIST = "//label[contains(text(),'Programming Language')]/following-sibling::div//ul[@id='snippet-mode-dropdown-menu']";
String OPTION_IN_THE_PROGRAMMING_LANGUAGE_DROP_DOWN_MENU = "//div[@id='snippet-mode-dropdown']//button[contains(text(),'$1')]";
String THEME_DROP_DOWN_LIST = "//label[contains(text(),'Theme')]/following-sibling::div//ul[@id='snippet-theme-dropdown-menu']";
String OPTION_FROM_THE_THEME_LIST = "//ul[@id='snippet-theme-dropdown-menu']/li/a[contains(text(),'$1')]";
String OPTION_IN_THE_THEME_DROP_DOWN_MENU = "//div[@id='snippet-theme-dropdown']//button[contains(text(),'$1')]";
String SAVE_BUTTON_ON_THE_EDIT_SNIPPET_POPUP = "//button[@class='btn btn-success'][contains(text(),'Save')]";
String PREVIEW_TEXT_IN_A_SNIPPET = "//span[@class='file-name-text'][contains(text(),'$2')]//ancestor::div[@class='bordered-content textfile open']//code[contains(text(),'$1')]";
String RIGHT_CONTROL_HAMBURGER_ON_THE_SNIPPET = "//span[@class='file-name-text'][contains(text(),'$1')]//ancestor::div[@class='message-main-container']//span[@id='right-control-hamburger']";
String SNIPPET_NAVIGATION_BLOCK = "//span[@class='file-name-text'][contains(text(),'$1')]";
String MESSAGE_MENU_FOR_SNIPPET = "//div[descendant::span[@class='file-name-text'][contains(text(),'$1')] and contains(@name,'message')]//ul[@id='message-menu-menu']";
String DELETE_MESSAGE_LINK_FOR_SNIPPET = "//div[descendant::span[@class='file-name-text'][contains(text(),'$1')] and contains(@name,'message')]//span[@class='text-danger']";
String SNIPPET_NAME_INSIDE_THE_DELETE_MESSAGE_POPUP = "//h4[@class='modal-title'][contains(text(),'Delete Message')]//ancestor::div[@class='modal-content']//div[@class='file-message-preview-name'][contains(text(),'$1')]";
String DOWNLOAD_BUTTON_NEAR_SNIPPET_NAME = "//div[@class='file-name']/span[contains(text(),'test_snippet33.pas')]//ancestor::div[@class='file-container']//i[contains(@class,'material-icons md-24 md-dark')][contains(text(),'file_download')]";
String MESSAGE_MENU_FOR_MESSAGE = "//div[descendant::span[@class='LinkifyPlus'][contains(text(),'$1')] and contains(@name,'message')]//ul[@id='message-menu-menu']";
String PIN_TO_CONVERSATION_LINK_FOR_MESSAGE = "//span[@class='LinkifyPlus'][contains(text(),'$1')]//ancestor::div[@class='message-main-container']//div[@id='message-menu']/ul/li[2]";
String MESSAGE_NAME_INSIDE_THE_PIN_MESSAGE_POPUP = "//span[@class='LinkifyPlus'][contains(text(),'$1')]//ancestor::div[@class='modal-content']//h4[contains(text(),'Pin Message')]";
String PIN_BUTTON = "//button[contains(text(),'Pin')]";
String PINNED_SIGN_NEAR_A_MESSAGE = "//span[contains(text(),'$1')]//ancestor::div[@class='message-body']//div[@class='pinned-by']";
String PINNED_ITEMS_BUTTON_IN_THE_RIGHT_PANEL = "//div[@class='channel-name room-direct'][contains(text(),'$1')]//ancestor::div[@class='file-drop-target']//i[@title='Pinned Messages']";
String MESSAGE_IN_THE_PINNED_ITEMS = "//div[@class='chat-container active']//span[contains(text(),'Pinned messages')]//ancestor::div[@class='b-tab-content']//span[@class='LinkifyPlus'][contains(text(),'$1')]";
String OPEN_LINK_ON_A_MESSAGE_IN_THE_RIGHT_PANEL = "//div[@class='chat-container active']//div[@class='layout-content']//a[contains(text(),'Open')]//ancestor::div[@class='pinned-message-item']//span[contains(text(),'$1')]";
String PINNED_HIGHLIGHTED_MESSAGE_IN_THE_CENTRAL_CHAT_WINDOW = "//div[@class='chat-container active']//span[contains(text(),'$1')]//ancestor::div[@class='message was-pinned']";
String RIGHT_CONTROL_HAMBURGER_BUTTON_ON_THE_FILE = "//div[@class='chat-container active']//span[contains(text(),'$1')]//ancestor::div[@class='message-main-container']//i[contains(text(),'more_vert')]";
String MESSAGE_MENU_FOR_FILE = "//span[contains(text(),'$1')]//ancestor::div[@class='message-main-container']//ul[@id='message-menu-menu']";
String PIN_TO_CONVERSATION_LINK_FOR_FILE = "//span[contains(text(),'$1')]//ancestor::div[@class='message-main-container']//div[@id='message-menu']/ul/li[1]";
String FILE_NAME_INSIDE_THE_PIN_MESSAGE_POPUP = "//div[contains(text(),'$1')]//ancestor::div[@class='modal-content']//h4[contains(text(),'Pin Message')]";
String PINNED_SIGN_NEAR_A_FILE = "//span[contains(text(),'$1')]//ancestor::div[contains(@class,'uploaded-file-wrapper')]//div[@class='pinned-by']";
String FILE_NAME_IN_THE_PINNED_ITEMS = "//div[@class='chat-container active']//span[contains(text(),'Pinned messages')]//ancestor::div[@class='b-tab-content']//div[@class='file-name'][contains(text(),'$1')]";
String DOWNLOAD_LINK_ON_A_FILE_IN_THE_RIGHT_PANEL = "//div[@class='pinned-message-item']//div[contains(text(),'$1')]//ancestor::div[@class='chat-container active']//div[@class='layout-content']//a[contains(text(),'Download')]";
String MESSAGE_BLOCK_IN_THE_PINNED_ITEMS = "//div[@class='chat-container active']//div[@class='pinned-message-item']//ancestor::div[@class='pinned-message-item']//span[contains(text(),'$1')]";
String FILE_BLOCK_IN_THE_PINNED_ITEMS = "//div[@class='chat-container active']//div[@class='pinned-message-item']//ancestor::div[@class='pinned-message-item']//div[contains(text(),'$1')]";
String UNPIN_BUTTON = "//button[contains(text(),'Unpin')]";
String FILE_NAME_INSIDE_THE_UNPIN_MESSAGE_POPUP = "//div[contains(text(),'$1')]//ancestor::div[@class='modal-content']//h4[contains(text(),'Unpin Message')]";
String UNPIN_LINK_ON_A_MESSAGE_IN_THE_RIGHT_PANEL = "//div[@class='chat-container active']//div[@class='pinned-message-item']//span[contains(text(),'$1')]//ancestor::div[@class='pinned-message-item']//a[contains(text(),'Unpin')]";
String MESSAGE_NAME_INSIDE_THE_UNPIN_MESSAGE_POPUP = "//span[contains(text(),'$1')]//ancestor::div[@class='modal-content']//h4[contains(text(),'Unpin Message')]";
String COUNTER_UNDER_ITEMS_IN_THE_RIGHT_PANEL = "//i[@title='$1']//ancestor::a[@style='cursor: pointer;']//span[contains(text(),'$2')]";
String HIDE_STAR_SIGN_NEAR_A_MESSAGE = "//span[contains(text(),'$1')]//ancestor::div[@class='message-main-container']//i[contains(text(),'star_border')]";
String STAR_SIGN_NEAR_A_MESSAGE = "//span[contains(text(),'$1')]//ancestor::div[@class='message-main-container']//i[contains(text(),'star')]";
String STARRED_ITEMS_BUTTON_IN_THE_RIGHT_PANEL = "//div[@class='channel-name room-direct'][contains(text(),'$1')]//ancestor::div[@class='file-drop-target']//i[@title='Starred Items']";
String MESSAGE_IN_THE_STARRED_ITEMS = "//div[@class='chat-container active']//span[contains(text(),'Starred messages')]//ancestor::div[@class='b-tab-content']//span[@class='LinkifyPlus'][contains(text(),'$1')]";
String MESSAGE_BLOCK_IN_THE_STARRED_ITEMS = "//div[@class='chat-container active']//div[@class='starred-message-container']//ancestor::li[@class='starred-message']//span[contains(text(),'$1')]";
String OPEN_LINK_ON_A_MESSAGE_IN_THE_RIGHT_PANEL_ON_THE_STARRED_BLOCK = "//div[@class='chat-container active']//div[@class='layout-content']//li[@class='starred-message']//span[contains(text(),'$1')]//ancestor::ul[@class='messages']//span[@class='actions']";
String STARRED_HIGHLIGHTED_MESSAGE_IN_THE_CENTRAL_CHAT_WINDOW = "//div[@class='chat-container active']//span[contains(text(),'$1')]//ancestor::div[@class='message last was-pinned is-stared-parent']";



}