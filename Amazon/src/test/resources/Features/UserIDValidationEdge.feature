#Author: madhuravi.kaja@gmail.com
@Edge
Feature: To validate whether user is able to enter valid email id or Mobile number and continue in the amazon Login Page  in edge Browser

  Scenario Outline: Successful Login with Valid User ID
  
    Given User Launch Edge browser
     When User Opens "<URL>"
      And User enters "<USERID>"
      And Click on Continue button
     Then Sign In Page "<TITLE>" should be validated
      And Close the browser
  
    Examples: 
      | URL                                                                                                                                                                                                                                                                                                                                                                                                          | USERID                   | TITLE    | 
      | https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_ya_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0& | madhuravi.kaja@gmail.com | Password | 
      | https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_ya_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0& | 7708966427               | Password | 
  
  Scenario Outline: Validate Amazon Logo
  
    Given User Launch Edge browser
     When User Opens "<URL>"
      And User clicks Amazon Logo link and validated "<page>"
      And Close the browser
  
    Examples: 
      | URL                                                                                                                                                                                                                                                                                                                                                                                                          | page                                                                                               | 
      | https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_ya_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0& | Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in | 
  
  Scenario Outline: Validate Help Link2
  
    Given User Launch Edge browser
     When User Opens "<URL>"
      And User clicks HelpLink2
     When User validated  "<page1>"
      And Close the browser
  
    Examples: 
      | URL                                                                                                                                                                                                                                                                                                                                                                                                          | page1                          | 
      | https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_ya_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0& | Help - Amazon Customer Service | 
  
