Feature: testing home page

  Scenario: 2.001 Check that "test room" is created
    Given open signin page
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
#    When click on Save button
#    When click on Document Library link
#    Then the "333file" document node is created
#    When click on "333file" document name title
#    Then the "333file" document is opened
#    Then the "333file" title field is correct