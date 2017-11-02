Feature: testing home page

  Scenario: 2.001 Check that "testroom" room is created
    Given open signin page
    When click on Standard tab
    And filled fields valid data
    When click on Login button
    Then home page is opened
    Then "admin" user name is displayed
    When click on plus link
    Then room title in popup is displayed
    When enter "testroom" in the "Name" input field
    When choose public room checkbox
    When enter "superadmin" in the Invite members field
    When enter "testdescription" in the "Description" textarea field
    When click on Add button
    Then the "testroom" room is created

  Scenario: 2.002 Check that "testroom" renamed to "Testroomname1"
    Given open signin page
    When click on Standard tab
    And filled fields valid data
    When click on Login button
    Then home page is opened
    Then "admin" user name is displayed
    When click on "testroom" room in the left panel
    Then the "testroom" title is displayed in the header
    When click on the about channel button of "testroom" room
    When click on the "testroom" channel details link
    Then "testroom" name is displayed in the channel details block
    When click on the Edit room name link
    Then input room name field is displayed
    When clear data in the input room name field
    When enter "Testroomname1" in the input room name field
    When click on Save button under the input room name field
    Then the "Testroomname1" title is displayed in the header
    Then "Testroomname1" name is displayed in the channel details block
    Then the "Testroomname1" room is created

  Scenario: 2.003 Check that in "Testroomname1" room changed description
    Given open signin page
    When click on Standard tab
    And filled fields valid data
    When click on Login button
    Then home page is opened
    Then "admin" user name is displayed
    When click on "Testroomname1" room in the left panel
    Then the "Testroomname1" title is displayed in the header
    When click on the about channel button of "Testroomname1" room
    When click on the "Testroomname1" channel details link
    Then "Testroomname1" name is displayed in the channel details block
    When click on the Edit description link in the "Testroomname1" room
    Then input description field is displayed
    When clear data in the input description field
    When enter "new description111" in the input description field
    When click on Done button under the input description field
    Then the "new description111" description is displayed in the channel details block
    Then the "new description111" description is displayed in the header

  Scenario: 2.004 Check that "Test111" room is deleted
    Given open signin page
    When click on Standard tab
    And filled fields valid data
    When click on Login button
    Then home page is opened
    Then "admin" user name is displayed
    When click on "Testroomname1" room in the left panel
    Then the "Testroomname1" title is displayed in the header
    When click on the wheel link
    Then Delete room link is displayed
    When click on the Delete room link
    Then delete room pop-up is displayed
    When click on the Delete button
    Then the "Testroomname1" room is deleted

  Scenario: 2.005 Check that direct message to a.shevchenko is created
    Given open signin page
    When click on Standard tab
    And filled fields valid data
    When click on Login button
    Then home page is opened
    Then "admin" user name is displayed
    When click on the Direct Messages link
    Then direct rooms pop-up is displayed
    When enter "a.shevchenko" in the input search field
    Then "a.shevchenko" is displayed in the list of users
    When click on the "a.shevchenko" name in the list of users
    Then "a.shevchenko" user name is displayed in the left panel
    Then "a.shevchenko" user name is displayed in the header

  Scenario: 2.006 Check that message to a.shevchenko is sent
    Given open signin page
    When click on Standard tab
    And filled fields valid data
    When click on Login button
    Then home page is opened
    Then "admin" user name is displayed
    When click on the "a.shevchenko" user name in the left panel
    Then "a.shevchenko" user name is displayed in the header
    When enter "test message" in the input message field
    When click on Enter button
    Then "test message" message is created

  Scenario: 2.007 Check that "test message" message to a.shevchenko is edited
    Given open signin page
    When click on Standard tab
    And filled fields valid data
    When click on Login button
    Then home page is opened
    Then "admin" user name is displayed
    When click on the "a.shevchenko" user name in the left panel
    Then "a.shevchenko" user name is displayed in the header
    Then "test message" message is displayed
    When click on the right control hamburger on the "test message" message
    Then message menu is displayed
    When click on the "Edit Message" link in the message menu
    When clear data in the input message field
    When enter "edited note" in the input message field
    When click on Enter button
    Then "edited note" message is created
    Then "edited Today at" action is displayed

  Scenario: 2.008 Check that "edited note" message to a.shevchenko is deleted
    Given open signin page
    When click on Standard tab
    And filled fields valid data
    When click on Login button
    Then home page is opened
    Then "admin" user name is displayed
    When click on the "a.shevchenko" user name in the left panel
    Then "a.shevchenko" user name is displayed in the header
    Then "edited note" message is displayed
    When click on the right control hamburger on the "edited note" message
    Then message menu is displayed
    When click on the Delete Message link in the message menu
    Then Delete Message title in the opened pop-up is displayed
    When click on the Delete button in the opened pop-up
    Then "edited note" message is deleted

  Scenario: 2.009 Check that user a.shevchenko is deleted in the left panel (in the direct messages)
    Given open signin page
    When click on Standard tab
    And filled fields valid data
    When click on Login button
    Then home page is opened
    Then "admin" user name is displayed
    When click on the delete sign near "a.shevchenko" user in the left panel
    Then "a.shevchenko" user is deleted in the left panel

  Scenario: 2.010 Check that image is uploaded to room
    Given open signin page
    When click on Standard tab
    And filled fields valid data
    When click on Login button
    Then home page is opened
    Then "admin" user name is displayed
    When click on plus link
    Then room title in popup is displayed
    When enter "testroom" in the "Name" input field
    When choose public room checkbox
    When enter "superadmin" in the Invite members field
    When enter "testdescription" in the "Description" textarea field
    When click on Add button
    Then the "testroom" room is created
    When click on "testroom" room in the left panel
    Then the "testroom" title is displayed in the header
    When click on Clip button
    Then Upload file link is displayed
    When Upload "/var/lib/jenkins/workspace/Chat_AIM/src/test/resources/Files/maxresdefault.jpg" to the form
    Then "Upload file" title is displayed in the pop-up
    When click on Upload button
    Then "maxresdefault.jpg" file is displayed in the room