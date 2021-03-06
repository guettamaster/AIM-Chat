Feature: testing home page

  Background:
    Given open signin page
#    When click on Standard tab
    And filled fields valid data
    When click on Login button
#    Then home page is opened
    Then "guettamaster" user name is displayed
#    Then "o.ivankovckyi" user name is displayed

  Scenario: 2.001 Check that public `room1` room is created
    When click on the room header in the left panel
    Then "Add Room" modal is displayed
#    When click on plus link
#    Then room title in popup is displayed
    When enter "room1" in the "Name" input field
#    When choose public room checkbox
    When enter "a.legeza" in the Invite members field
    Then the "a.legeza" is displayed in the list of users
    When click the "a.legeza" name in the list of users
    When click on Add Room title
    When enter "testdescription" in the "Description" textarea field
    When click on Add button
    Then the "Room room1 created" toast is displayed
    Then the "Room room1 created" toast is closed
    Then the "room1" room is created
    Then the "room1" room name title in the top is displayed

  Scenario: 2.002 Check that public `room1` renamed to `Testroomname1`
    When click on "room1" room in the left panel
    Then the "room1" title is displayed in the header
    When click on the settings button of "room1" room
    Then room settings is displayed on the "room1" name
    Then input room name field on the "room1" is displayed
    When clear data in the input "room1" room name field
    When enter "Testroomname1" in the input room name field
    When click on Save changes button under the input room name field
    Then the "Testroomname1" title is displayed in the header
    Then the "Testroomname1" room is created
    Then the "Testroomname1" room name title in the top is displayed

  Scenario: 2.003 Check that in public `Testroomname1` room changed description
    When click on "Testroomname1" room in the left panel
    Then the "Testroomname1" title is displayed in the header
    When click on the settings button of "Testroomname1" room
    Then room settings is displayed on the "Testroomname1" name
    Then input description field with "testdescription" is displayed
    When clear data in the input description field with "testdescription"
    When enter "new description111" in the input description field
    When click on Save changes button under the input room name field
    Then the "new description111" description is displayed in the header
    Then the "new description111" description in the top is displayed

  Scenario: 2.004 Check that public `Testroomname1` room is deleted
    When click on "Testroomname1" room in the left panel
    Then the "Testroomname1" title is displayed in the header
    When click on the settings button of "Testroomname1" room
    Then room settings is displayed on the "Testroomname1" name
    Then Delete room link is displayed
    When click on the Delete room link
    Then "Testroomname1" delete room pop-up is displayed
    When click on the Delete button
    Then the "Testroomname1" room is deleted

  Scenario: 2.005 Check that direct message to a.shevchenko is created
    When click on the Direct Messages link
    Then direct rooms pop-up is displayed
    When enter "a.shevchenko" in the input search field
    Then "a.shevchenko" is displayed in the list of users
    When click on the "a.shevchenko" name in the list of users
    Then "a.shevchenko" user name is displayed in the left panel
    Then "a.shevchenko" user name is displayed in the header

  Scenario: 2.006 Check that message to a.shevchenko is sent
    When click on the "a.shevchenko" user name in the left panel
    Then "a.shevchenko" user name is displayed in the header
    When enter "test message" in the input message field
    When click on Enter button
    Then "test message" message is created

  Scenario: 2.007 Check that `test message` message to a.shevchenko is edited
    When click on the "a.shevchenko" user name in the left panel
    Then "a.shevchenko" user name is displayed in the header
    Then "test message" message is displayed
    When scroll down to "test message" message
    When click on the right control hamburger on the "test message" message
    Then message menu is displayed
    When click on the "Edit Message" link in the message menu
    When click on the input message field
    When clear data in the input message field
    When enter "edited note" in the input message field
    When click on Enter button
    Then "edited note" message is edited
    Then "Edited" action is displayed

  Scenario: 2.008 Check that `edited note` message to a.shevchenko is deleted
    When click on the "a.shevchenko" user name in the left panel
    Then "a.shevchenko" user name is displayed in the header
    Then "edited note" message is displayed
    When scroll down to "edited note" message
    When click on the right control hamburger on the "edited note" message
    Then message menu is displayed
    When click on the Delete Message link in the message menu
    Then Delete Message title in the opened pop-up is displayed
    When click on the Delete button in the opened pop-up
    Then "edited note" message is deleted

  Scenario: 2.009 Check that user a.shevchenko is deleted in the left panel (in the direct messages)
    When click on the delete sign near "a.shevchenko" user in the left panel
    Then "a.shevchenko" user is deleted in the left panel
#
  Scenario: 2.010 Check that image is uploaded to room
    When click on the room header in the left panel
    Then "Add Room" modal is displayed
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
   | count              | 1                                                                                     |
   | file               | /home/ivankovskiy-pc/IdeaProjects/AIM-Chat/src/test/resources/Files/maxresdefault.jpg |
   | title_name         | Upload file                                                                           |
   | expected_file_name | maxresdefault.jpg                                                                     |
    Then "maxresdefault.jpg" file is displayed in the room

  Scenario: 2.011 Check that txt file is downloaded
    When click on "room1" room in the left panel
    Then the "room1" title is displayed in the header
    When Upload file many times
   | count              | 1                                                                                     |
   | file               | /home/ivankovskiy-pc/IdeaProjects/AIM-Chat/src/test/resources/Files/maxresdefault.txt |
   | title_name         | Upload file                                                                           |
   | expected_file_name | maxresdefault.txt                                                                     |
    Then "maxresdefault.txt" file is displayed in the room
    When click on the Download button under "maxresdefault.txt" file
    Then the "maxresdefault.txt" file is downloaded on the local machine

  Scenario: 2.012 Check that public `room1` is added to Favorites to the left panel after clicking on the favorite button in the header
    When click on "room1" room in the left panel
    Then the "room1" title is displayed in the header
    When click on the favorite room button
    Then the "room1" is displayed in the Favorites on the left panel

  Scenario: 2.013 Check that public `room1` is deleted from Favorites in the left panel after clicking on the unfavorite button in the header
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
##    When enter "r.konivec" in the Invite members field
##    When click on user name
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
    When click on "guettamaster" user name
    Then the user menu with actions is displayed
    When click on the Profile link
    Then the Profile page is displayed
#    When upload "maxresdefault.jpg" avatar to the Profile page
    When Upload avatar to the Profile page
      | count              | 1                                                                                     |
      | file               | /home/ivankovskiy-pc/IdeaProjects/AIM-Chat/src/test/resources/Files/maxresdefault.jpg |
    Then the Profile page is displayed
#    When enter "test name" in the "First Name" input field
#    When enter "last name" in the "Last Name" input field
#    When enter "QA" in the "Job position" input field
#    When enter "214" in the "Office location" input field
#    When click on the "UA" Formats of phones number menu
#    Then "+380" is displayed in the Phone number input field
#    When enter "501234567" in the Phone number input field
#    When enter "test" in the "Skype" input field
#    When click on the Save Changes button
#    Then the "First Name" input field is correct
#    Then the "Last Name" input field is correct
#    Then the "Job position" input field is correct
#    Then the "Office location" input field is correct
#    Then the "+380501234567" Phone number input field is correct
#    Then the "Skype" input field is correct
    When clear data in the "First Name" input field
    When enter "name" in the "First Name" input field
    When clear data in the "Last Name" input field
    When enter "lastname" in the "Last Name" input field
    When clear data in the "Job position" input field
    When enter "PM" in the "Job position" input field
    When clear data in the "Office location" input field
    When enter "209" in the "Office location" input field
    When click on the "RU" Formats of phones number menu
    When clear data in the Phone number input field
    Then "+7" is displayed in the Phone number input field
    When clear data in the Phone number input field
    When enter "74951231234" in the Phone number input field
    When clear data in the "Skype" input field
    When enter "skypeacc" in the "Skype" input field
#    When click on the Save Changes button
#    When upload "17.jpg" avatar to the Profile page
    When Upload avatar to the Profile page
      | count              | 1                                                                          |
      | file               | /home/ivankovskiy-pc/IdeaProjects/AIM-Chat/src/test/resources/Files/17.jpg |
    Then the Profile page is displayed
    When click on the Save Changes button
    Then Profile successfully updated message is displayed
    When click on the arrow back
    Then "name lastname" user name is displayed in the left panel after updating profile
    When click on "guettamaster" user name
    Then the user menu with actions is displayed
    When click on the Profile link
    Then the Profile page is displayed
    Then the "First Name" input field is correct
    Then the "Last Name" input field is correct
    Then the "Job position" input field is correct
    Then the "Office location" input field is correct
    Then the "+74951231234" Phone number input field is correct
    Then the "Skype" input field is correct

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

  Scenario: 2.017 Check that mentions panel is displayed after entering `@username` in the input field inside a room
    When click on "room1" room in the left panel
    Then the "room1" title is displayed in the header
    When enter "@" in the input message field
    Then "People" title name of a panel with list is displayed

  Scenario: 2.018 Check that rooms panel is displayed after entering `#roomname` in the input field inside a room
    When click on "room1" room in the left panel
    Then the "room1" title is displayed in the header
    When enter "#" in the input message field
    Then "Rooms" title name of a panel with list is displayed

  Scenario: 2.019 Check that emojies panel is displayed after entering `::re` in the input field inside a room
    When click on "room1" room in the left panel
    Then the "room1" title is displayed in the header
    When enter "::re" in the input message field
    Then "Emojies" title name of a panel with list is displayed

  Scenario: 2.020 Check that snippet is created
    When click on "room1" room in the left panel
    Then the "room1" title is displayed in the header
    When check the appearance of the snippet button
    Then create snippet title inside opened popup is displayed
    When enter "test_snippet20" in the snippet file name field
    When enter "test20" in the textarea field
    When click on the Create button
    Then "test_snippet20.txt" is created

  Scenario: 2.021 Check that snippet is edited
    When click on "room1" room in the left panel
    Then the "room1" title is displayed in the header
    Then "test_snippet20.txt" is displayed
    When click on the edit link on the "test_snippet20.txt"
    Then edit snippet title inside opened popup is displayed
    When clear data in the snippet file name field
    When enter "test_snippet33" in the snippet file name field
    When clear data in the textarea field
    When enter "test33" in the textarea field
    When click on the arrow in the Programming Language dropdown menu
    Then Programming Language drop-down list is opened
    When click "HTML" option from the Programming Language drop-down list
    Then "HTML" option is displayed in the Programming Language dropdown menu
    When click on the arrow in the Theme dropdown menu
    Then Theme drop-down list is opened
    When click "Dawn" option from the Theme drop-down list
    Then "Dawn" option is displayed in the Theme dropdown menu
    When click on the Save button
    Then "test_snippet33.html" is edited
    Then Edited mark is displayed on the "test_snippet33.html" snippet

  Scenario: 2.022 Check that snippet is previewed
    When click on "room1" room in the left panel
    Then the "room1" title is displayed in the header
    Then "test_snippet33.html" is displayed
    When click on the "test_snippet33.html" snippet name
    Then preview "test33" text on the "test_snippet33.html" snippet name is displayed

  Scenario: 2.023 Check that snippet is downloaded
    When click on "room1" room in the left panel
    Then the "room1" title is displayed in the header
    Then "test_snippet33.html" is displayed
    When click on the Download button near the "test_snippet33.html" snippet
    Then the "test_snippet33.html" snippet is downloaded on the local machine

  Scenario: 2.024 Check that snippet is deleted
    When click on "room1" room in the left panel
    Then the "room1" title is displayed in the header
    Then "test_snippet33.html" is displayed
    When navigate on "test_snippet33.html" snippet
    When click on the right control hamburger on the "test_snippet33.html" snippet
    Then message menu is displayed
    When click on the Delete Message link in the message menu
    Then Delete Message title in the opened pop-up is displayed
    When click on the Delete button in the opened pop-up
    Then "test_snippet33.html" message is deleted

  Scenario: 2.025 Check that message is pinned and displayed in the right panel
    When click on the Direct Messages link
    Then direct rooms pop-up is displayed
    When enter "a.shevchenko" in the input search field
    Then "a.shevchenko" is displayed in the list of users
    When click on the "a.shevchenko" name in the list of users
    Then "a.shevchenko" user name is displayed in the left panel
    Then "a.shevchenko" user name is displayed in the header
    When click on the "a.shevchenko" user name in the left panel
    Then "a.shevchenko" user name is displayed in the header
    When enter "test message" in the input message field
    When click on Enter button
    Then "test message" message is created
    When scroll down to "test message" message
    When click on the right control hamburger on the "test message" message
    Then message menu is displayed
    When click on the "Pin to conversation" link in the message menu
    Then the "test message" message is displayed inside the Pin Message pop-up
    When click on the Pin button
    Then pinned sign is displayed near the "test message" message
    When click on the Pin button of "a.shevchenko" direct
    Then the "test message" message is displayed in the Pinned messages block

  Scenario: 2.026 Check that message from pinned is opened
    When click on the "a.shevchenko" user name in the left panel
    Then "a.shevchenko" user name is displayed in the header
    When check the appearance of the snippet button
    Then create snippet title inside opened popup is displayed
    When enter "test_snippet20" in the snippet file name field
    When enter "test20" in the textarea field
    When click on the Create button
    Then "test_snippet20.txt" is created
    When scroll down to "test message" message
    Then pinned sign is displayed near the "test message" message
    When click on the Pin button of "a.shevchenko" direct
    Then the "test message" message is displayed in the Pinned messages block
    When navigate on "test message" message block
    Then open link is displayed on the "test message" in the right panel
    When click on the open link on the "test message" in the right panel
    Then highlight is displayed on the "test message" message

  Scenario: 2.027 Check that message from pinned is downloaded
    When click on the "a.shevchenko" user name in the left panel
    Then "a.shevchenko" user name is displayed in the header
    When Upload file many times
      | count              | 1                                                                          |
      | file               | /home/ivankovskiy-pc/IdeaProjects/AIM-Chat/src/test/resources/Files/17.jpg |
      | title_name         | Upload file                                                                |
      | expected_file_name | 17.jpg                                                                     |
    Then "17.jpg" file is displayed in the direct
#    When navigate on "syd_barrett___bad_hair_day_by_softmachine09.jpg" snippet
    When scroll down to "17.jpg" file
    When click on the right control hamburger on the "17.jpg" file
    Then message menu is displayed
    When click on the "Pin to conversation" link in the message menu
    Then the "17.jpg" file is displayed inside the Pin Message pop-up
    When click on the Pin button
    Then pinned sign is displayed near the "17.jpg" file
    When click on the Pin button of "a.shevchenko" direct
    Then the "17.jpg" file is displayed in the Pinned messages block
    When navigate on "17.jpg" file block
    When click on the Download button under "17.jpg" file in the Pinned messages block
    Then the "17.jpg" file is downloaded on the local machine

  Scenario: 2.028 Check that message from pinned is unpinned
    When click on the "a.shevchenko" user name in the left panel
    Then "a.shevchenko" user name is displayed in the header
    When scroll down to "17.jpg" file
    Then pinned sign is displayed near the "17.jpg" file
    When scroll down to "17.jpg" file
    When navigate on the pinned "17.jpg" file
    When click on the "17.jpg" file
    Then message menu is displayed
    When click on a Unpin from conversation link on the "17.jpg" file in the message menu
    Then the "17.jpg" file is displayed inside the Unpin Message pop-up
    When click on the Unpin button
    Then pinned sign isn't displayed near the "17.jpg" file

  Scenario: 2.029 Check that message from pinned is unpinned from the right panel
    When click on the "a.shevchenko" user name in the left panel
    Then "a.shevchenko" user name is displayed in the header
    When scroll down to "test message" message
    Then pinned sign is displayed near the "test message" message
    When click on the Pin button of "a.shevchenko" direct
    Then the "test message" message is displayed in the Pinned messages block
    When navigate on "test message" message block
    Then unpin link is displayed on the "test message" in the right panel
    When click on the unpin link on the "test message" in the right panel
    Then the "test message" message is displayed inside the Unpin Message pop-up
    When click on the Unpin button
    Then pinned sign isn't displayed near the "test message" message

  Scenario: 2.030 Check counter on a pinned message from the right panel
    When click on the "a.shevchenko" user name in the left panel
    Then "a.shevchenko" user name is displayed in the header
    When enter "qqq test" in the input message field
    When click on Enter button
    Then "qqq test" message is created
    When scroll down to "qqq test" message
    When click on the right control hamburger on the "qqq test" message
    Then message menu for the "qqq test" message is displayed
    When click on a Pin to conversation link on the "qqq test" message in the message menu
    Then the "qqq test" message is displayed inside the Pin Message pop-up
    When click on the Pin button
    Then pinned sign is displayed near the "qqq test" message
    When click on the Pin button of "a.shevchenko" direct
    Then the "qqq test" message is displayed in the Pinned messages block
    Then under "Pinned messages" title there is "1" counter displayed

  Scenario: 2.031 Check that message is starred and displayed in the right panel
    When click on the "a.shevchenko" user name in the left panel
    Then "a.shevchenko" user name is displayed in the header
    When scroll down to "test message" message
    When click on a star sign on the "test message" message
    Then star sign is displayed near the "test message" message
    When click on the Star button of "a.shevchenko" direct
    Then the "test message" message is displayed in the Starred messages block

  Scenario: 2.032 Check that message from starred is opened
    When click on the "a.shevchenko" user name in the left panel
    Then "a.shevchenko" user name is displayed in the header
    When enter "lss message" in the input message field
    When click on Enter button
    Then "lss message" message is created
    When scroll down to "lss message" message
    When click on a star sign on the "lss message" message
    Then star sign is displayed near the "lss message" message
    When click on the Star button of "a.shevchenko" direct
    Then the "lss message" message is displayed in the Starred messages block
    When navigate on "lss message" message block in the Starred message block
    Then open link is displayed on the "lss message" in the right panel on the Starred message block
    When click on the open link on the "lss message" in the right panel on the Starred message block
    Then highlight is displayed on the starred "lss message" message

  Scenario: 2.033 Check that message from starred is downloaded
    When click on the "a.shevchenko" user name in the left panel
    Then "a.shevchenko" user name is displayed in the header
    When Upload file many times
      | count              | 1                                                                                  |
      | file               | /var/lib/jenkins/workspace/AIM-Chat/src/test/resources/Files/77.jpg                |
      | title_name         | Upload file                                                                        |
      | expected_file_name | 77.jpg                                                                             |
    Then "77.jpg" file is displayed in the direct
    When scroll down to "77.jpg" file
    When click on a star sign on the "77.jpg" file
    Then star sign is displayed near the "77.jpg" file
    When click on the Star button of "a.shevchenko" direct
    Then the "77.jpg" file is displayed in the Starred messages block
    When navigate on "77.jpg" file block in the Starred messages block
    When click on the Download button under "77.jpg" file in the Starred messages block
    Then the "77.jpg" file is downloaded on the local machine

  Scenario: 2.034 Check that message from starred is unstarred
    When click on the "a.shevchenko" user name in the left panel
    Then "a.shevchenko" user name is displayed in the header
    When scroll down to "lss message" message
    Then star sign is displayed near the "lss message" message
    When click on a star sign on the "lss message" message
    Then star sign isn't displayed near the "lss message" message

  Scenario: 2.035 Check counter on a starred message from the right panel
    When click on the "a.shevchenko" user name in the left panel
    Then "a.shevchenko" user name is displayed in the header
    Then "77.jpg" file is displayed in the direct
    When scroll down to "77.jpg" file
    Then star sign is displayed near the "77.jpg" file
    When click on a star sign on the "77.jpg" file
    Then star sign isn't displayed near the "77.jpg" file
    When scroll down to "test message" message
    Then star sign is displayed near the "test message" message
    When click on a star sign on the "test message" message
    Then star sign isn't displayed near the "test message" message
    When scroll down to "lss message" message
    When click on a star sign on the "lss message" message
    Then star sign is displayed near the "lss message" message
    When click on the Star button of "a.shevchenko" direct
    Then the "lss message" message is displayed in the Starred messages block
    Then under "Starred messages" title there is "1" counter displayed

  Scenario: 2.036 Check that collection of stickers is created
    Then the "General" title is displayed in the header
    When check the appearance of the sticker button
    Then the sticker search input inside opened popup is displayed
    When click on the manage stickers button
    Then add stickers title in popup is displayed
    When click on the create pack button
    Then create new collection title in popup is displayed

