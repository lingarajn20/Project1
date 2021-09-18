Feature: User checking the overall functionality of Adactin Hotel

Scenario: User checking Login Functionality of Adactin Hotel
Given user launched the application
When user enter the valid username in username field
And user enter the valid password in password field
Then click on the Login button and enter next page

Scenario: User entering the details for booking hotel
When user select the location from available list
And user select the hotel from available list
And user select the Room type from available list
And user select the Number of rooms
And clear the check in date
And enter the check in date
Then clear the check Out date
And enter the check Out date
And select the Adult count per room
And select the Child count per room
Then Click the search button

Scenario: User Select the hotel
When User select the checkbox
Then click on the Continue button

Scenario: User entering the personnal details for booking hotel
When user enter the first name
And user enter the last name
And user enter the address
And user enter the Card number
And user select the Card type
Then user enter the expiry month of the card
And user enter the expiry year of the card
And enter the CVV number
Then Click on the Book now button
When User confirms the booking confirmation
Then Logout of the page
