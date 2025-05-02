@googleTest
Feature: Google Test

  @googleTest01
  Scenario: Test
    Given User goes to "googleHomePage" page
    And User gets the title of the page
    And User clicks on Google Accept Cookies button
    Then User validates the title "expectedGoogleTitle"
    Then User closes the Driver


  Scenario: Google Item Search Test
    Given User goes to "googleHomePage" page
    And User clicks on Google Accept Cookies button
    And User searchs "iPhone 16 Max Pro"
    Then User closes the Driver

  Scenario Outline: Google Item Search Test Scenario Outline
    Given User goes to "googleHomePage" page
    And User clicks on Google Accept Cookies button
    And User searchs "<searchItems>"
    Then User closes the Driver
    Examples:Search Items
      | searchItems       |
      | iPhone 16 Pro Max |
      | Seiko King Purple |
      | Apple M1 MacBook  |