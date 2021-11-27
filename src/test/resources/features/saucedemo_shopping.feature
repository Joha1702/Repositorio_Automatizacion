#Author: leidymoreno17@gmail.com

Feature: Shopping
  As a web user
  I want to Shopping in to the suacedemo	website
  to get the products

Background:
Given that leidy want to access to saucedemo website
Given she login to the page

 Scenario Outline: Buy in to the saucedemo website
  	When she make the process to buy the <products>
  	Then she should see the message THANK FOR YOUR ORDER in the screen
  	
  Examples:
  |products                |
  |Sauce Labs Backpack     |
  |Sauce Labs Bike Light   |
  |Sauce Labs Bolt T-Shirt |
  |Sauce Labs Fleece Jacket|
  |Sauce Labs Onesie       |
