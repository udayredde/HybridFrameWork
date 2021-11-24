Feature:Automation Practice Create Account  //gherkin language

  #happy path scenario
  @smoke
  Scenario Outline: Verify User is on Authentication Page
    Given Is User on the Home page
    When User select signIn
    Then User should be on Authentication page
    When User Provides Email id as <email>
    Then User Submit Create Account
    And User should be on Account Creation Page
    Examples:
    |email|
    | udayredde453@gmail.com |
  @smoke
  Scenario Outline: Verify User is on Authentication Page
    Given Is User on the Home page
    When User select signIn
    Then User should be on Authentication page
    When User Provides Email id as <email>
    Then User Submit Create Account
    And User should be on Account Creation Page
    Examples:
    |email|
    | udayredde453@gmail.com |

