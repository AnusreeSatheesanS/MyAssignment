Feature: Login to LeafTaps Application with valid data
Scenario: Login with positive value
Given Launch the browser and Load the URL 
When Enter the username as 'DemoSalesManager'
And Enter the password as 'crmsfa'
And Click on Login button
Then Verify the login is successful


Scenario: Login with Negative value
Given Launch the browser and Load the URL 
When Enter the username as 'DemoSalesManager'
And Enter the password as 'crmsfa'
And Click on Login button
But Verify the login is not successful