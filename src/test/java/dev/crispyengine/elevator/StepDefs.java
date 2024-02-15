package dev.crispyengine.elevator;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.springframework.util.Assert;

public class StepDefs {
  @When("^the User presses the 'up' button$")
  public void theUserPressesTheUpButton() {
    Assert.isTrue(false, "Fix this failing test");
  }

  @Then("^the elevator arrives at the requested floor$")
  public void theElevatorArrivesAtTheRequestedFloor() {
    Assert.isTrue(false, "Fix this failing test");
  }
}
