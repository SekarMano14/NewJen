Feature: To validate the facebook application

  Scenario Outline: To validate the login functionality with credientials
    Given The user in Fb page
    When The user has to fill "<username>" and "<password>"
    And The user has to click the login button
    Then The user navigate to coreesponding page

    Examples: 
      | username | password |
      | manoj    |     4567 |
      | Raj      |     4567 |
      | Ram      |     4567 |

  Scenario: To validate the registration Functionality
    Given The user in Fb page
    When The has to fill all details to the fileds
    Then The user successfully registred the facebook application
