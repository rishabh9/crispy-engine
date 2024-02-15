Feature: The elevator can be requested
  Scenario: User calls for the elevator to go up
    When the User presses the 'up' button
    Then the elevator arrives at the requested floor
