Feature: testing signin page

  Scenario: 1.001 Check that "Home" page is opened
    Given open signin page
    When click on Standard tab
    And filled fields valid data
    When click on Login button
    Then home page is opened
    Then "admin" user name is displayed
    Then xxx