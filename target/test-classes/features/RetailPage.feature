@Regression
Feature: Retail Page Website

Background:
Given User is on Retail website
And User click on MyAccount
When User click on Login
And User Enter username 'ibrahimkhil@tek.com' and Password 'ibrahimkhil'
And User Click on Login button
Then User should be logged in to MyAccount dashboard


Scenario: Register as an Affiliate user with Cheque Payment Method
When User Click on Register for an Affiliate Account Link
And User fill affiliate form with below information
|company| website|taxID|paymentMethod|payeeName|
|AriaLtd|www.AriaLtd.com|NY-6754123|Cheque|TekName|
And User check on About us check box
And User click on Continue button 
Then User should see a success message

Scenario: Edit your affiliate information from Cheque payment menthod to Bank Transfer 
When User click on Edit your affiliate information link
And user click on Bank Transfer radio button
And user fill Bank information with below information
|bankName|abaNumber|SwiftCode|accountName|accountNumber|
|Ltd     |256666   |1234     |     aria  |   462000    |
And user click on Continue button After Bank Information
Then User should see a success message After Affiliate Information Edit

Scenario: Edit your account information
When User click on Edit your account information link
And User modify below information
|firstName|lastName|email|telephone|
|Essa|ibr|essaibr@yahoo.com|292-323-8098|
And User click on continue button After Account information Edit
Then User see a message 'Success:Your account has been successfully updated'

