
Feature: Vehicle
Scenario: User Enters Vehicle Data

Background: the user in the autombile_vehicle page

When user enters valid "<make>"and valid "<engineperformance>" and valid "<dateofmanufacture>" and valid "<numberofseats>" and valid "<fuel>" and valid "<listprice>" and "<licenseplatenumber>" and valid "<annualmileage>"
Then user able to click next.

Scenario: the user in the extent insurant data

When user enters valid "<firstname>" and "<lastname>"and "<dateofbirth>" and "<country>" and "<zipcode>" and "<occupation>" and "<hobbies>"
Then user clicks the next page

Scenario: the user in the product page

When the user enters valid "<startdate>" and "<insuranceSum>" and "<mentRating>" and "<damage>" and "<option>" and "<courtesy>"
Then user able to click the next page

Scenario: the user in the select price option

When the user selects a price option
Then the user allowed to click the next page

@f2

Scenario: the user in the send quote option

When the user enters valid send quote
Then the user gets a confirmation mail









