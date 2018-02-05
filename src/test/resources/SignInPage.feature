Feature: testing signin page

  Scenario: 1.001 Check that "Home" page is opened
    Given open signin page
    When click on Standard tab
    And filled fields valid data
    When click on Login button
#    Then home page is opened
    Then "Scottie33" user name is displayed
#    Then "o.ivankovckyi" user name is displayed