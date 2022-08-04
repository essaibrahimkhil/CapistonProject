@Regression
Feature: Desktops Tab items

  Background: 
    Given User is on Retail website
    When User click on Desktops tab
    And User click on show all deskptops

  Scenario: User Verify all items are present in Desktops tab
    Then User should see all items are present in Desktop page

  Scenario: User add HP LP 3065 from Desktops tab to the cart
    And User click ADD TO CART option on HP LP3065 item
    And User select quantity
    And User add to Cart button
   

  Scenario: User add Canon EOS 5D from Desktops tab to the cart
    And User click ADD TO CART option on Canon EOS 5D item
    And User select Red color from dropdown
    And User select quantity '1'
    And User click add to cart button
    Then User see a Message 'Success: You have added Canon EOS 5D Camera to your shopping cart!'

  Scenario: User add a review to Canon EOS 5D item in Desktops tab
    And User click on Canon EOS 5D item
    And User click on write a review link
    And user fill the review information with below information
      | Yourname | YourReview                                       | Rating |
      | essa     | it is an excellent product, I liked it very much |      4 |
    And User click on Continue Button
    Then User should see a message with 'Thank you for your review.it has been submitted to the webmaster for approval.'
