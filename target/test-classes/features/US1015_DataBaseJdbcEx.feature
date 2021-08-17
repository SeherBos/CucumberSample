Feature: User connects to database

@jdbc
  Scenario:TC_22 User reads the records
  Given I connect to Koala Resort Hotel database
  And I get the records of "Price" from "tHOTELROOM"
  And I read the records from "Price" column

  @jdbcVerify
  Scenario:TC_23 User reads the fifth record to verify
    Given I connect to Koala Resort Hotel database
    And I get the records of "Price" column label from "tHOTELROOM"
    Then read and verify that the record of row <5> is matching with "470.0000"