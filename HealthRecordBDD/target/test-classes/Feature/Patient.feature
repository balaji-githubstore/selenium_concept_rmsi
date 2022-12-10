@patient
Feature: Patient
  In order to maintain the patient records 
  As an admin
  I want to add,edit,delete the patient detials in portal

  @addpatient
  Scenario Outline: Verify Add Patient
    Given I have browser with openemr page
    When I enter username as '<username>'
    And I enter password as '<password>'
    And I select language as '<language>'
    And I click on login
    And I click on Patient menu
    And I click on New/Search menu
    And I fill the new patient form
      | firstname | lastname   | dob   | gender   |
      | <fname>   | <lastname> | <dob> | <gender> |
    And I click on create new patient
    And I click on confirm create new patient
    And I store the alert text and handle it
    And I close the happy birthday popup if available
    Then I should get the added patient details as '<expected_patient_name>'
    And I should see alert text contains '<expected_alert_text>'

    Examples: 
      | username | password | language         | fname | lastname | dob        | gender | expected_patient_name                | expected_alert_text |
      | admin    | pass     | English (Indian) | Kim   | K        | 2022-12-10 | Female | Medical Record Dashboard - Kim K     | Tobacco             |
      | admin    | pass     | English (Indian) | John  | Wick     | 2022-12-9  | Female | Medical Record Dashboard - John Wick | Tobacco             |

      
      #will start at 5 PM IST