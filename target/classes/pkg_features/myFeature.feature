Feature: Search something in Google page


@Aravinth
Scenario Outline: Have to Search in Google page
Given Open Chrome
Then Navigate to "https://www.google.com"
Then Type "<Search>" in google text box
Then Kill Browser


Examples:
|Search|
|Aravinth Raj|

Scenario Outline: Have to Search Prema in Google page
Given Open Chrome
Then Navigate to "https://www.google.com"
Then Type "<Search>" in google text box

Examples:
|Search|
|Prema|