Feature: Login function testing
Description: Password must be 6 characters
Background: Common steps

Scenario: As an automation practice user, I can successfully login with valid credentials.

Given: Open browser and send URL
When login with valid credentials
Then Check login was success 