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
