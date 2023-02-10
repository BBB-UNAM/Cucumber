Feature: Comics category
  As a user i want to lear jokes to have a fun momment

  #@ignore
  @testN1
  Scenario: Enter to comics category stating in the home page
    Given The user is in the home page
    When He clicks on the button The little tester comics
    Then The page The little tester comics is displayed

  #@ignore
  @testN2
  Scenario: testing data driven example 1
    Given user is in the home page
    When user enters username as "puto el que lo lea" and password "admin1"
    Then User should be able to see an "invaid credential"

  #@ignore
  @testN3
  Scenario: With this scenario we going to test the function of cucumber tables
    Given I have a table with the below values
           |users|pass   |
           |user1|ap63541|
           |user2|da64648|
           |user3|sdgtgtg|
    When using the data and capturing one "5" integer
    Then end of the test