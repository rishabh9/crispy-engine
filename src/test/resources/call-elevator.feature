Feature: The elevator can be requested
  As a User,
  I want to call for the elevator,
  So that I can travel to the requested floor.
  Scenario: User calls for the elevator to go up
    When the User presses the 'up' button
    Then the elevator arrives at the requested floor
