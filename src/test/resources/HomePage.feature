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
    When enter "testroom" in the "Room Name" input field
    When choose public room checkbox
    When enter "superadmin" in the Invite members field
    When enter "testdescription" in the "Description" textarea field
    When click on OK button
    Then the "testroom" room is created

  Scenario: 2.002 Check that "testroom" renamed to "Test111"
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
    When enter "Test111" in the input room name field
    When click on Save button under the input room name field
    Then the "Test111" title is displayed in the header
    Then "Test111" name is displayed in the channel details block
    Then the "Test111" room is created

  Scenario: 2.003 Check that in "Test111" room changed description
    Given open signin page
    When click on Standard tab
    And filled fields valid data
    When click on Login button
    Then home page is opened
    Then "admin" user name is displayed
    When click on "Test111" room in the left panel
    Then the "Test111" title is displayed in the header
    When click on the about channel button of "Test111" room
    When click on the "Test111" channel details link
    Then "Test111" name is displayed in the channel details block
    When click on the Edit description link in the "Test111" room
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
    When click on "Test111" room in the left panel
    Then the "Test111" title is displayed in the header
    When click on the wheel link
    Then Delete room link is displayed
    When click on the Delete room link
    Then delete room pop-up is displayed
    When click on the Yes delete this room button
    Then the "Test111" room is deleted

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