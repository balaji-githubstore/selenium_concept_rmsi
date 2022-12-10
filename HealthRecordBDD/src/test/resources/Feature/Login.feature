@login
Feature: Login
  In order to maintain the health records 
  As a user
  I want to access operemr portal

  @valid @smoke
  Scenario Outline: Verify Valid Login
    Given I have browser with openemr page
    When I enter username as '<username>'
    And I enter password as '<password>'
    And I select language as '<language>'
    And I click on login
    Then I should get access to portal with title as '<expected_title>'

    Examples: 
      | username   | password   | language         | expected_title |
      | admin      | pass       | English (Indian) | OpenEMR        |
      | accountant | accountant | Dutch            | OpenEMR        |

  @invalid
  Scenario: Verify Invalid Login
    Given I have browser with openemr page
    When I enter username as 'john'
    And I enter password as 'john123'
    And I select language as 'English (Indian)'
    And I click on login
    Then I should not get access to portal with error as 'Invalid username or password'