Feature: Create Lead in Leaftaps application
Scenario Outline: Create Lead with multiple data
Given Launch the browser and Load the URL
When Enter the username as 'DemoSalesManager'
And Enter the password as 'crmsfa'
And Click on Login button
Then Verify the login is successful
When Click on crmsfa button
And Click on Lead button
And Click on Create Lead Button
And Enter the companyName as <companyName>
And Enter the firstName as <firstName>
And Enter the lastName as <lastName>
And Click on CreateLead Button
Then Verify Lead is created
Examples: 
|companyName|firstName|lastName|
|'Testleaf'|'Dilip'|'Kumar'|
|'Testleaf'|'Bhuvanesh'|'Kumar'|

    