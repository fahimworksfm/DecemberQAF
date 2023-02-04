@google
Feature: Google Search

Scenario Outline: Simple search

Given I am on the google homepage
When I enter search "<testData>"
And I click on google search button
Then I receive related search results

Examples:
|testData         |
|Quality Assurance|
|Software Testing |





