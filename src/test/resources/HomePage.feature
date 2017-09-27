Feature: testing home page

  Scenario: 2.001 Check that "testroom" is created
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



