Feature: testing home page

  Background:
    Given open signin page
    When click on Standard tab
    And filled fields valid data
    When click on Login button
#    Then home page is opened
    Then "Scottie33" user name is displayed
#    Then "o.ivankovckyi" user name is displayed

#  Scenario: 2.001 Check that public "room1" room is created
#    When click on plus link
#    Then room title in popup is displayed
#    When enter "room1" in the "Name" input field
##    When choose public room checkbox
#    When enter "a.lugovskiy" in the Invite members field
#    When click on Add Room title
#    When enter "testdescription" in the "Description" textarea field
#    When click on Add button
#    Then the "Room room1 created" toast is displayed
#    Then the "Room room1 created" toast is closed
#    Then the "room1" room is created
#
#  Scenario: 2.002 Check that public "room1" renamed to "Testroomname1"
#    When click on "room1" room in the left panel
#    Then the "room1" title is displayed in the header
#    When click on the settings button of "room1" room
#    Then room settings is displayed on the "room1" name
#    Then input room name field on the "room1" is displayed
#    When clear data in the input room name field
#    When enter "Testroomname1" in the input room name field
#    When click on Save changes button under the input room name field
#    Then the "Testroomname1" title is displayed in the header
#    Then the "Testroomname1" room is created
#
#  Scenario: 2.003 Check that in public "Testroomname1" room changed description
#    When click on "Testroomname1" room in the left panel
#    Then the "Testroomname1" title is displayed in the header
#    When click on the settings button of "Testroomname1" room
#    Then room settings is displayed on the "Testroomname1" name
#    Then input description field is displayed
#    When clear data in the input description field
#    When enter "new description111" in the input description field
#    When click on Save changes button under the input room name field
#    Then the "new description111" description is displayed in the header
#
#  Scenario: 2.004 Check that public "Testroomname1" room is deleted
#    When click on "Testroomname1" room in the left panel
#    Then the "Testroomname1" title is displayed in the header
#    When click on the settings button of "Testroomname1" room
#    Then room settings is displayed on the "Testroomname1" name
#    Then Delete room link is displayed
#    When click on the Delete room link
#    Then "Testroomname1" delete room pop-up is displayed
#    When click on the Delete button
#    Then the "Testroomname1" room is deleted
#
#  Scenario: 2.005 Check that direct message to a.shevchenko is created
#    When click on the Direct Messages link
#    Then direct rooms pop-up is displayed
#    When enter "a.shevchenko" in the input search field
#    Then "a.shevchenko" is displayed in the list of users
#    When click on the "a.shevchenko" name in the list of users
#    Then "a.shevchenko" user name is displayed in the left panel
#    Then "a.shevchenko" user name is displayed in the header
#
#  Scenario: 2.006 Check that message to a.shevchenko is sent
#    When click on the "a.shevchenko" user name in the left panel
#    Then "a.shevchenko" user name is displayed in the header
#    When enter "test message" in the input message field
#    When click on Enter button
#    Then "test message" message is created
#
#  Scenario: 2.007 Check that "test message" message to a.shevchenko is edited
#    When click on the "a.shevchenko" user name in the left panel
#    Then "a.shevchenko" user name is displayed in the header
#    Then "test message" message is displayed
#    When click on the right control hamburger on the "test message" message
#    Then message menu is displayed
#    When click on the "Edit Message" link in the message menu
#    When clear data in the input message field
#    When enter "edited note" in the input message field
#    When click on Enter button
#    Then "edited note" message is created
#    Then "edited Today at" action is displayed
#
#  Scenario: 2.008 Check that "edited note" message to a.shevchenko is deleted
#    When click on the "a.shevchenko" user name in the left panel
#    Then "a.shevchenko" user name is displayed in the header
#    Then "edited note" message is displayed
#    When click on the right control hamburger on the "edited note" message
#    Then message menu is displayed
#    When click on the Delete Message link in the message menu
#    Then Delete Message title in the opened pop-up is displayed
#    When click on the Delete button in the opened pop-up
#    Then "edited note" message is deleted
#
#  Scenario: 2.009 Check that user a.shevchenko is deleted in the left panel (in the direct messages)
#    When click on the delete sign near "a.shevchenko" user in the left panel
#    Then "a.shevchenko" user is deleted in the left panel

  Scenario: 2.010 Check that image is uploaded to room
    When click on plus link
    Then room title in popup is displayed
    When enter "room1" in the "Name" input field
#    When choose public room checkbox
#    When enter "superadmin" in the Invite members field
    When enter "a.shevchenko" in the Invite members field
    When enter "testdescription" in the "Description" textarea field
    When click on Add button
    Then the "room1" room is created
    When click on "room1" room in the left panel
    Then the "room1" title is displayed in the header
    When Upload file many times
   | count              | 1                                                                              |
   | file               | /var/lib/jenkins/workspace/Chat_AIM/src/test/resources/Files/maxresdefault.jpg |
   | title_name         | Upload file                                                                    |
   | expected_file_name | maxresdefault.jpg                                                              |
    Then "maxresdefault.jpg" file is displayed in the room

  Scenario: 2.011 Check that txt file is downloaded
    When click on "room1" room in the left panel
    Then the "room1" title is displayed in the header
    When Upload file many times
   | count              | 1                                                                              |
   | file               | /var/lib/jenkins/workspace/Chat_AIM/src/test/resources/Files/maxresdefault.txt |
   | title_name         | Upload file                                                                    |
   | expected_file_name | maxresdefault.txt                                                              |
    Then "maxresdefault.txt" file is displayed in the room
    When click on the Download button under "maxresdefault.txt" file
    Then the file is downloaded on the local machine

  Scenario: 2.012 Check that public "room1" is added to Favorites to the left panel after clicking on the favorite button in the header
    When click on "room1" room in the left panel
    Then the "room1" title is displayed in the header
    When click on the favorite room button
    Then the "room1" is displayed in the Favorites on the left panel

  Scenario: 2.013 Check that public "room1" is deleted from Favorites in the left panel after clicking on the unfavorite button in the header
    When click on "room1" room in the left panel
    Then the "room1" title is displayed in the header
    When click on the unfavorite room button
    Then the "room1" is deleted in the Favorites on the left panel
    Then the "room1" room returns to the Rooms on the left panel

#  Scenario: 2.014 Check that image is uploaded to room
#    When click on plus link
#    Then room title in popup is displayed
#    When enter "room1" in the "Name" input field
# #    When choose public room checkbox
# #    When enter "superadmin" in the Invite members field
#    When enter "r.konivec" in the Invite members field
#    When click on user name
#    When click on room title in popup
#    When enter "testdescription" in the "Description" textarea field
#    When click on Add button
#    Then the "room1" room is created
#    When click on "room1" room in the left panel
#    Then the "room1" title is displayed in the header
#    When Upload file many times
#   | count              | 100000                                                                                        |
#   | file               | /var/lib/jenkins/workspace/Chat_AIM/src/test/resources/Files/michael-jordan_wallpaper_005.jpg |
#   | title_name         | Upload file                                                                                   |
#   | expected_file_name | michael-jordan_wallpaper_005.jpg                                                              |

  Scenario: 2.015 Check that fields in the user profile has changed
    When click on "Scottie33" user name
    Then the user menu with actions is displayed
    When click on the Profile link
    Then the Profile page is displayed
    When enter "test name" in the "First Name:" input field
    When enter "test last name" in the "Last Name:" input field
    When enter "0501234567" in the "Phone number:" input field
    When enter "test skype" in the "Skype:" input field
    When enter "test subject" in the "What I do:" input field
    When enter "test room" in the "Where I am:" input field
    Then the "First Name:" input field is correct
    Then the "Last Name:" input field is correct
    Then the "Phone number:" input field is correct
    Then the "Skype:" input field is correct
    Then the "What I do:" input field is correct
    Then the "Where I am:" input field is correct
    When Upload avatar to the Profile page
   | count              | 1                                                                              |
   | file               | /var/lib/jenkins/workspace/Chat_AIM/src/test/resources/Files/maxresdefault.jpg |
    Then the Profile page is displayed
    When click on the Save button on the Profile page
    When clear data in the "First Name:" input field
    When enter "name" in the "First Name:" input field
    When clear data in the "Last Name:" input field
    When enter "last_name" in the "Last Name:" input field
    When clear data in the "Phone number:" input field
    When enter "77777" in the "Phone number:" input field
    When clear data in the "Skype:" input field
    When enter "skypeacc" in the "Skype:" input field
    When clear data in the "What I do:" input field
    When enter "testing" in the "What I do:" input field
    When clear data in the "Where I am:" input field
    When enter "room209" in the "Where I am:" input field
    When Upload avatar to the Profile page
   | count              | 1                                                                                             |
   | file               | /var/lib/jenkins/workspace/Chat_AIM/src/test/resources/Files/michael-jordan_wallpaper_005.jpg |
    Then the Profile page is displayed
    When click on the Save button on the Profile page
    Then Profile successfully updated message is displayed
    When click on the arrow back
    Then "name last_name" user name is displayed in the left panel after updating profile
    When click on "admin" user name
    Then the user menu with actions is displayed
    When click on the Profile link
    Then the Profile page is displayed
    Then the "First Name:" input field is correct
    Then the "Last Name:" input field is correct
    Then the "Phone number:" input field is correct
    Then the "Skype:" input field is correct
    Then the "What I do:" input field is correct
    Then the "Where I am:" input field is correct

  Scenario: 2.016 Check that draft sign is displayed in the left panel if we have an unsent message in the input field
    When click on the Direct Messages link
    Then direct rooms pop-up is displayed
    When enter "a.shevchenko" in the input search field
    Then "a.shevchenko" is displayed in the list of users
    When click on the "a.shevchenko" name in the list of users
    Then "a.shevchenko" user name is displayed in the left panel
    Then "a.shevchenko" user name is displayed in the header
    When enter "test message" in the input message field
    When click on "General" room in the left panel
    Then the draft sign is displayed near "a.shevchenko" user name in the left panel

  Scenario: 2.017 Check that mentions panel is displayed after entering "@username" in the input field inside a room
    When click on "General" room in the left panel
    Then the "General" title is displayed in the header
    When enter "@" in the input search field inside a room
    Then "People" title name of a panel with list is displayed

  Scenario: 2.018 Check that rooms panel is displayed after entering "@roomname" in the input field inside a room
    When click on "General" room in the left panel
    Then the "General" title is displayed in the header
    When enter "#" in the input search field inside a room
    Then "Rooms" title name of a panel with list is displayed

  Scenario: 2.019 Check that emojies panel is displayed after entering "::re" in the input field inside a room
    When click on "General" room in the left panel
    Then the "General" title is displayed in the header
    When enter "::re" in the input search field inside a room
    Then "Emojies" title name of a panel with list is displayed

  Scenario: 2.020 Check that snippet is downloaded
    When click on "General" room in the left panel
    Then the "General" title is displayed in the header
    When check the appearance of the snippet button




