package com.pmishra.bddtest;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.jupiter.api.Assertions;

public class FizzBuzzStepdefs {

    private FizzBuzz fizzBuzz;
    private String result;

    @Given("^Create a FizzBuzz game play$")
    public void createAFizzBuzzGamePlay() {
        fizzBuzz = new FizzBuzz();
    }

    @When("^I play with number (\\d+)$")
    public void iPlayWithNumber(int num) {
        result = fizzBuzz.play(num);
    }

    @Then("^The result is \"([^\"]*)\"$")
    public void theResultIs(String resultString) {
        Assertions.assertEquals(result, resultString);
    }
}
