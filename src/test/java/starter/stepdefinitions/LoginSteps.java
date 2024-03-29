package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.Login;

public class LoginSteps {

    @Steps
    Login login;

    @Given("I set valid API endpoint for login")
    public void setValidAPIEndpoint() {login.setValidAPIEndpoint();}

    @When("I send request to login")
    public void sendValidRequest() {login.sendValidRequest();}

    @Then("I receive status code 200")
    public void receiveStatusCode200() {
        Login.receiveStatusCode200();
    }

    @And("I can login")
    public void receiveValidData() {login.receiveValidData();}

    @When("I send invalid request to login")
    public void sendInvalidRequest() {login.sendInvalidrequest();}

    @Given("I set invalid API endpoint for login")
    public void setInvalidAPIEndpoint() {login.setInvalidAPIEndpoint();}

    @When("I send request to login 1")
    public void sendValidRequest1() {login.sendValidRequest1();}

    @Then("I receive status code 404")
    public void receiveStatusCode404() {
        Login.receiveStatusCode404();
    }

}

