@f3

Feature: The user in the sample app page 

Background: The user enters invalid data

Scenario: the user enters invalid data in the vehicle page

When the user enters invalid data in the vehicle data
And  the user enters invalid data in the insurant data
And  the user enters invalid data in the product data
And  the user tries to go to price page
Then the system shows error

Scenario: user enters the invalid data in vehicle page

When user enters invalid data in vehicle page
And  user enters invalid data in insurant page
And  user enters invalid data in product page
And  user can go to the price page
Then system shows the error page





