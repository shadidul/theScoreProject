@mobile @mobile-regression @theScoreAndroid
Feature: Menu feature


  Background:
    Given I am on home page of the Score App

  @playerStatsValidation
  Scenario: Verify Player Stats in Leagues Menu
    When I tap on get started button
    And I tap on Continue button
    Then I tap on NY Knicks button
    When I tap on Continue button
    And I tap on Done button
    Then I tap on Leagues Icon
    And I navigate to NBA section
    And I select the date Mar 15
    When I select the team Miami Heat
    And I get the player Bam Adebayo pts, reb, ast, stl, and blk values from the Matchup Section
    And I get the player Bam Adebayo pts, reb, ast, stl, and blk values from the Stats Section
    Then I verify that the Points, Reb, AST, STL and BLK values under the Match Up Tab matches the values in the Stats Section

